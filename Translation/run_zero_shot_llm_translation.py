import sys
sys.path.extend(['..', '../..'])
import numpy as np
import re,os,time
import json
import jsonlines
import argparse
from multiprocessing import Process
from Utils.common_util import *
import subprocess

STYSTEM_PROMPT = "You are a code translation expert proficient in C++, Java, and Python."

TRRANSLATION_PROMPT_ZERO_SHOT = '''
### Task Description
Given the {src_lang} code:
```{src_lang}
{src_code}
```
Please translate the above {src_lang} code to {tgt_lang} code.

### Output Format
Wrap your output in a Markdown code block using ``` backticks, and end your response with <|END|>, e.g.:
```{tgt_lang}
...
```
<|END|>
'''.strip()

def zero_shot_translation_prompt(src_lang=None, tgt_lang=None, src_code=None):
    return [
        {"role": "system", "content": STYSTEM_PROMPT},
        {"role": "user", "content": TRRANSLATION_PROMPT_ZERO_SHOT.format(src_lang=src_lang, tgt_lang=tgt_lang, src_code=src_code)}]

def run_translation(
    pid=None,
    multithread_num=None,
    data_path=None,
    src_lang=None,
    tgt_lang=None,
    model_name=None,
    temperature=None,
    sample_num=None,
    output_dir=None,
    start_index=None,
    end_index=None,
):

    dataset = read_jsonl(data_path)[start_index:end_index]
    pid_start, pid_end, = get_pid_range(pid=pid, total_samples=len(dataset), multithread_num=multithread_num)

    logger = get_logger(logger_name=f"logger-{pid}", dump_file=f"{output_dir}/logs/{pid}.log")
    output_tmp_dir = f"{output_dir}/tmp_output"
    os.makedirs(output_tmp_dir, exist_ok=True)
    tmp_output_fp = f"{output_tmp_dir}/{pid}.jsonl"
    fw = jsonlines.open(tmp_output_fp, "a")

    for index, item in enumerate(dataset):
        if index < pid_start or index >= pid_end:
            continue
        sample_id = item['sample_id']
        logger.info(f"sample_id {sample_id}")

        prompt = zero_shot_translation_prompt(src_lang, tgt_lang, item[src_lang])

        time_cost = -999
        token_usage = None
        candidates = []
        response, error, time_cost, token_usage = get_openai_response(
            api_key="",
            base_url="",
            model_name=model_name,
            history_messages=prompt,
            max_token=4096,
            temperature=temperature,
            n=sample_num,
        )
        candidates += [{"generation": i['message']['content']} for i in response['choices']]
        answer_str = "\n\n****************************************\n\n".join([i['message']['content'] for i in response['choices']])
        logger.info(f"LLM Prompt\n{prompt[1]['content']}\nLLM Response:\n{response}\nLLM Answer:\n{answer_str}\n\n")

        fw.write({"sample_id": sample_id, "generation": candidates, "error": error, "time_cost": time_cost, "token_usage": token_usage})
    fw.close()


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--multithread", type=int, default=50)
    parser.add_argument("--model_name", type=str, default='Qwen/Qwen2.5-Coder-7B')
    parser.add_argument("--src_lang", type=str, default="python")
    parser.add_argument("--tgt_lang", type=str, default="java")
    parser.add_argument("--sample_num", type=int, default=1)
    parser.add_argument("--start_index", type=int, default=0)
    parser.add_argument("--end_index", type=int, default=999)
    parser.add_argument("--temperature", type=float, help="", default=0.0)
    parser.add_argument("--dataset_fp", type=str, default="")
    parser.add_argument("--output_dir", type=str, default="")
    args = parser.parse_args()

    args.dataset_fp = f"{PROJECT_ROOT_PATH}/Benchmark/Transcoder-Test/gold.jsonl"

    processes = []
    arg_list = []
    task_run = None
    args.output_dir = f"{PROJECT_ROOT_PATH}/Output_Translation/m.{args.model_name}/{args.src_lang}_to_{args.tgt_lang}"
    assert args.output_dir.startswith(f"{PROJECT_ROOT_PATH}/"), "check output_dir"
    os.makedirs(args.output_dir, exist_ok=True)
    DELETE_DIR_CONTENT(args.output_dir)
    arg_list = [[pid, args.multithread, args.dataset_fp, args.src_lang, args.tgt_lang, args.model_name, args.temperature, args.sample_num, args.output_dir, args.start_index, args.end_index]
                for pid in range(args.multithread)]
    task_run = run_translation

    for pid in range(args.multithread):
        p = Process(
            target=task_run,
            args=arg_list[pid],
            )
        p.start()
        processes.append(p)
    for p in processes:
        p.join()

    all_data = []
    for pid in range(args.multithread):
        data = read_jsonl(f"{args.output_dir}/tmp_output/{pid}.jsonl")
        all_data.append(data)
    with open(args.output_dir + f"/{args.src_lang}_to_{args.tgt_lang}.jsonl", "w") as fw:
        for data in all_data:
            for line in data:
                fw.write(json.dumps(line) + "\n")
    print("Done")
