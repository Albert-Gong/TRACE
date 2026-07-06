import sys
sys.path.extend(['..', '../..'])
import json
from multiprocessing import Process
import os
import re
import argparse
import jsonlines
import numpy as np
from Utils.common_util import *
import shutil
import copy

def create_correctness_testscript(translations=None, lang=None, n_pass=None, output_dir=None):
    template_testscript_dir=f"Benchmark/Transcoder-Test/testscript/{lang}"
    save_dir = f"{output_dir}/testscripts"
    cnt = 0
    processor = GET_PROCESSOR(lang=lang)
    for index, item in enumerate(translations):
        if item['sample_id'] not in [x.split(".")[0] for x in os.listdir(template_testscript_dir)]:
            continue
        cnt += 1
        fp = template_testscript_dir + f"/{item['sample_id']}.{LANG_TO_SUFFIX[lang]}"
        import_code = ""
        transl_code = ""
        code_item = item[lang][n_pass] if isinstance(item[lang], list) else item[lang]
        if "--IMPORT_SPLIT--" in code_item:
            import_code, transl_code = code_item.split("--IMPORT_SPLIT--")
        else:
            transl_code = code_item
        try:
            func_name = processor.get_function_name(processor.tokenize_code(transl_code))
        except:
            func_name = transl_code[:transl_code.index("(")].split()[-1].strip() if "(" in transl_code else ""

        script_code = copy.deepcopy(open(fp, 'r').read())
        script_code = script_code.replace("#TOFILL", transl_code).replace("f_filled", func_name).replace("//TOFILL", transl_code)

        if len(import_code.strip()):
            lines = script_code.splitlines(keepends=True)
            inserted = False
            for idx, line in enumerate(lines):
                if line.strip() == "":
                    lines.insert(idx + 1, import_code.rstrip() + "\n")
                    inserted = True
                    break
            if not inserted:
                lines.insert(0, import_code.rstrip() + "\n")
            script_code = "".join(lines)

        os.makedirs(f"{save_dir}/{item['sample_id']}", exist_ok=True)
        open(f"{save_dir}/{item['sample_id']}/{item['sample_id']}.{LANG_TO_SUFFIX[lang]}", "w").write(script_code)
    return cnt

def create_efficiency_testscript(correct_translation_map=None, lang=None, n_pass=None, test_dir=None):
    test_sample_ids = os.listdir(test_dir)
    processor = GET_PROCESSOR(lang=lang)

    for item in correct_translation_map:
        sample_id = item['sample_id']
        if sample_id not in test_sample_ids:
            continue

        code_item = item[lang][n_pass] if isinstance(item[lang], list) else item[lang]
        import_code = ""
        transl_code = ""
        if "--IMPORT_SPLIT--" in code_item:
            import_code, transl_code = code_item.split("--IMPORT_SPLIT--")
        else:
            transl_code = code_item

        func_name = processor.get_function_name(processor.tokenize_code(transl_code))
        test_fp = "./"
        test_code=""
        if lang == 'python':
            test_fp = os.path.join(test_dir, sample_id, sample_id + ".py")
            shutil.copy(test_fp, f"{test_fp}.bak")
            test_code = open(test_fp, 'r').read()
            test_code = test_code.replace("# TO_FILL_FUNC\n", "# TO_FILL_FUNC\n" + transl_code)
            test_code = test_code.replace("F_FULL", func_name + " ")

        if lang == 'cpp':
            test_fp = os.path.join(test_dir, sample_id, sample_id + ".cpp")
            shutil.copy(test_fp, f"{test_fp}.bak")
            test_code = open(test_fp, 'r').read()
            test_code = test_code.replace("//TO_FILL_FUNC\n", "//TO_FILL_FUNC\n" + transl_code)
            test_code = test_code.replace("F_FULL", func_name + " ")

        if lang == 'java':
            test_fp = os.path.join(test_dir, sample_id, "MAIN.java")
            shutil.copy(test_fp, f"{test_fp}.bak")
            test_code = open(test_fp, 'r').read()
            test_code = test_code.replace("//TO_FILL_FUNC\n", "//TO_FILL_FUNC\n" + transl_code)
            test_code = test_code.replace("F_FULL", func_name + " ")

        if len(import_code.strip()):
            lines = test_code.splitlines(keepends=True)
            inserted = False
            for idx, line in enumerate(lines):
                if line.strip() == "":
                    lines.insert(idx + 1, import_code.rstrip() + "\n")
                    inserted = True
                    break
            if not inserted:
                lines.insert(0, import_code.rstrip() + "\n")
            test_code = "".join(lines)

        open(test_fp, 'w').write(test_code)

def evaluate_correctness(
    pid=-1,
    sample_idx=None,
    sample_id=None,
    src_lang=None,
    tgt_lang=None,
    working_dir=None):

    logger = get_logger(logger_name=f"logger-{sample_idx}", dump_file=f"{working_dir}/logs/{sample_id}.log")

    os.makedirs(f"{working_dir}/tmp_output", exist_ok=True)
    tmp_fw = jsonlines.open( f"{working_dir}/tmp_output/{sample_id}.jsonl", "w")

    test_path = f"{working_dir}/testscripts/{sample_id}"
    exec_details = {
        "test_result": 0.0,
        "exec_flag": False,
        "error_type": "ERROR",
        "error_details": "",
        "runtime_details": "",
    }

    cmd=""
    perf_cmd=""
    if tgt_lang == 'cpp':
        cmd = f"g++ -O2 {test_path}/{sample_id}.cpp -o {test_path}/{sample_id} && {test_path}/{sample_id}"
        perf_cmd = f"{test_path}/{sample_id}"
    elif tgt_lang == 'java':
        class_path_cmd = ""
        jvm_opts = ""
        cmd = f"cd {test_path} && javac {class_path_cmd} {sample_id}.java && java {jvm_opts} {class_path_cmd} {sample_id}"
        perf_cmd = f"cd {test_path} && java {jvm_opts} {class_path_cmd} {sample_id}"
    elif tgt_lang == 'python':
        cmd = f"python {test_path}/{sample_id}.py"
        perf_cmd = f"python {test_path}/{sample_id}.py"

    exec_flag, stdout, stderr = exec_cmd(cmd=cmd, timeout=180.0)

    if exec_flag is False:
        error_type = "TIMEOUT" if "TIMEOUT" in str(stderr) else "ERROR"
        exec_details['error_type'] = error_type
        exec_details['error_details'] = str(stderr)[:500]
    else:
        output_results = re.findall(r"#Results:\s?\d+,\s?\d+\n?", stdout.strip())
        if len(output_results) == 0:
            exec_details['error_details'] = str(stdout)[:500] + str(stderr)[:500]
        else:
            exec_cmd(cmd=perf_cmd, timeout=180.0)
            stat = measure_stat_of_cmd(cmd=perf_cmd, timeout=180.0, repeat=5, cpu_id=pid, logger=logger)
            act, tal = output_results[0].replace("#Results:", "").split(",")
            exec_details['test_result'] = int(act) / int(tal)
            exec_details['exec_flag'] = True
            exec_details['error_type'] = "PASS"
            exec_details['runtime_details'] = {
                    "instructions": stat['instructions'],
                    "elapsed_time": stat['elapsed_time'],
                    "elapsed_time_std": stat['elapsed_time_std'],
                    "memory": stat['memory']
            }
    logger.info(f"correctness | sample_id {sample_id}\nexec_details {json.dumps(exec_details, indent=2)}\ncommmand {cmd}\n\n")
    tmp_fw.write({"sample_id": sample_id, "exec_details": exec_details})
    tmp_fw.close()

def evaluate_efficiency(
    pid=-1,
    sample_idx: int = -1,
    sample_id : str = "",
    src_lang : str = "",
    tgt_lang : str = "",
    working_dir : str = "",
    testscript_dir : str = "",
    ):

    logger = get_logger(logger_name=f"logger-{sample_idx}", dump_file=f"{working_dir}/logs/{sample_id}.log")

    os.makedirs(working_dir + "/tmp_output", exist_ok=True)
    tmp_fw = jsonlines.open(working_dir + f"/tmp_output/{sample_id}.jsonl", "w")

    exec_details = {}
    test_id_dir = os.path.join(testscript_dir, sample_id)

    perf_cmd = ""
    cmd=""
    if tgt_lang == 'cpp':
        test_file_path = os.path.join(test_id_dir, f"{sample_id}.cpp")
        cmd = f"g++ -w -O2 {test_file_path} -o {test_id_dir}/{sample_id} && {test_id_dir}/{sample_id}"
        perf_cmd = f"{test_id_dir}/{sample_id}"
    elif tgt_lang == 'java':
        test_file_path = os.path.join(test_id_dir, "MAIN.java")
        class_path_cmd = ""
        jvm_opts = ""
        cmd = f"cd {test_id_dir} && javac -nowarn {class_path_cmd} MAIN.java && java {jvm_opts} {class_path_cmd} MAIN"
        perf_cmd = f"cd {test_id_dir} && java {jvm_opts} {class_path_cmd} MAIN"
    elif tgt_lang == 'python':
        test_file_path = os.path.join(test_id_dir, f"{sample_id}.py")
        cmd = f"python -W ignore {test_file_path}"
        perf_cmd = cmd

    exec_details = {}
    exec_flag, stdout, stderr = exec_cmd(cmd=cmd, timeout=180.0 * 2)
    repeat_times = 5
    if not exec_flag:
        exec_details = {
            "test_result": 0.0,
            "exec_flag": exec_flag,
            "error": "TIMEOUT" if "TIMEOUT" in stderr else "ERROR",
            "error_details": stderr[:200],
            "runtime_details": None
        }

    else:
        stat = measure_stat_of_cmd(cmd=perf_cmd, timeout=180.0 * 2, repeat=repeat_times, cpu_id=pid, logger=logger)
        score = 0.0
        error = ""
        try:
            output = stat['stdout'].split("|OUTPUT|")[-1]
            total = int(output.split("total")[1].split("|")[0].strip())
            passed = int(output.split("passed")[1].split("|")[0].strip())
            score = passed / total
        except Exception as e:
            error = str(e)

        exec_details = {
            "test_result": score,
            "exec_flag": stat['flag'],
            "error": "TIMEOUT" if "TIMEOUT" in stat['stderr'] else "",
            "error_output": error[:500],
            "runtime_details": {
                "instructions": stat['instructions'],
                "elapsed_time": stat['elapsed_time'],
                "elapsed_time_std": stat['elapsed_time_std'],
                "memory": stat['memory']
            },
        }
    logger.info(f"efficiency | sample_id {sample_id}\nexec_details {json.dumps(exec_details, indent=2)}\ncommmand {cmd}\n\n")
    tmp_fw.write({"sample_id": sample_id, "exec_details": exec_details})
    tmp_fw.close()

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--multithread", type=int, default=None)
    parser.add_argument("--src_lang", type=str, default=None)
    parser.add_argument("--tgt_lang", type=str, default=None)
    parser.add_argument("--model_name", type=str, default=None)
    parser.add_argument("--eval_correctness", type=int, default=False)
    parser.add_argument("--eval_efficiency", type=int, default=False)
    parser.add_argument("--translation_fp", type=str, default=None)
    parser.add_argument("--efficiency_testscript_dir", type=str, default=None)
    parser.add_argument("--output_dir", type=str, default="../Output_Evaluation")
    parser.add_argument("--n_pass", type=int, default=0)
    args = parser.parse_args()


    logger = get_logger(logger_name=f"logger-main")
    for arg in vars(args):
        logger.info(f"{arg:<25}: {getattr(args, arg)}")

    translations = read_jsonl(args.translation_fp)
    logger.info(f"Read {len(translations)} translations...")

    testable_sample_ids = [x.split(".")[0] for x in os.listdir(f"{PROJECT_ROOT_PATH}/Benchmark/Transcoder-Test/testscript/{args.tgt_lang}")]
    translations = [x for x in translations if x['sample_id'] in testable_sample_ids]
    logger.info(f"Total {len(translations)} testable translations...")

    '''
    correctness evaluation
    '''
    if args.eval_correctness:
        correctness_output_dir = f"{args.output_dir}/pass_{args.n_pass}/correctness_evaluation/{args.model_name}/{args.src_lang}_to_{args.tgt_lang}"
        os.makedirs(correctness_output_dir, exist_ok=True)
        logger.info(f"Correctness output dir: {correctness_output_dir}")
        DELETE_DIR_CONTENT(correctness_output_dir)
        testable_cnt = create_correctness_testscript(translations, args.tgt_lang, args.n_pass, correctness_output_dir)
        logger.info(f"Created {testable_cnt} correctness testscripts...")

        logger.info("correctness evaluation ========================================================================================\n")
        testable_sample_ids = os.listdir(os.path.join(correctness_output_dir, "testscripts"))

        for i in range(0, len(testable_sample_ids), args.multithread):
            batch = testable_sample_ids[i : i + args.multithread]
            procs = []
            for j, sid in enumerate(batch):
                idx = i + j
                p = Process(
                    target=evaluate_correctness,
                    args=(j, idx, sid, args.src_lang, args.tgt_lang, correctness_output_dir)
                )
                p.start()
                procs.append(p)
            for p in procs:
                p.join()

        all_data = []
        for sample_id in testable_sample_ids:
            fp = os.path.join(correctness_output_dir, "tmp_output", f"{sample_id}.jsonl")
            if os.path.exists(fp):
                all_data += read_jsonl(fp)

        # sort all_data
        all_data = sorted(all_data, key=lambda x: x["sample_id"])
        logger.info("\ncorrectness summary\n========================================================================================\n")
        logger.info(f"total num:      {len(all_data)}")
        logger.info(f"correct num:    {np.sum([x['exec_details']['test_result'] == 1.0 for x in all_data])}")
        logger.info(f"average CA:     {np.mean([x['exec_details']['test_result'] for x in all_data]):.6f}")

        with open(correctness_output_dir + "/correctness.jsonl", "w") as f:
            for item in all_data:
                f.write(json.dumps(item) + "\n")

        correct_translation_ids = [x['sample_id'] for x in all_data if x['exec_details']['test_result'] == 1.0]
        correct_translations : list = [x for x in translations if x['sample_id'] in correct_translation_ids]


    logger.info("\n\n\n")

    if args.eval_efficiency:
        efficiency_output_dir = f"{args.output_dir}/pass_{args.n_pass}/efficiency_evaluation/{args.model_name}/{args.src_lang}_to_{args.tgt_lang}"
        os.makedirs(efficiency_output_dir, exist_ok=True)
        DELETE_DIR_CONTENT(efficiency_output_dir)

        run_testscript_dir = f"{efficiency_output_dir}/testscripts"
        os.makedirs(run_testscript_dir, exist_ok=True)
        DELETE_DIR_CONTENT(run_testscript_dir)
        shutil.copytree(args.efficiency_testscript_dir, run_testscript_dir, dirs_exist_ok=True)

        logger.info("Create efficiency testsuites...")
        create_efficiency_testscript(correct_translations, args.tgt_lang, args.n_pass, run_testscript_dir)
        testable_and_correct_and_has_efficiency_test_sample_ids = set([x['sample_id'] for x in correct_translations]) & set(os.listdir(run_testscript_dir))
        logger.info(f"correct and efficiency-testable {len(testable_and_correct_and_has_efficiency_test_sample_ids)}")

        logger.info("\nefficiency evaluation\n========================================================================================\n")
        testable_and_correct_and_has_efficiency_test_sample_ids = list(testable_and_correct_and_has_efficiency_test_sample_ids)
        for i in range(0, len(testable_and_correct_and_has_efficiency_test_sample_ids), args.multithread):
            batch = testable_and_correct_and_has_efficiency_test_sample_ids[i : i + args.multithread]
            procs = []
            for j, sid in enumerate(batch):
                idx = i + j
                p = Process(
                    target=evaluate_efficiency,
                    args=(j, idx, sid, args.src_lang, args.tgt_lang, efficiency_output_dir, run_testscript_dir)
                )
                p.start()
                procs.append(p)
            for p in procs:
                p.join()

        all_data = []
        for sample_id in testable_and_correct_and_has_efficiency_test_sample_ids:
            fp = os.path.join(efficiency_output_dir, "tmp_output", f"{sample_id}.jsonl")
            if os.path.exists(fp):
                all_data += read_jsonl(fp)

        all_data = sorted(all_data, key=lambda x: x["sample_id"])
        with open(efficiency_output_dir + "/efficiency.jsonl", "w") as f:
            for item in all_data:
                f.write(json.dumps(item) + "\n")
    logger.info("DONE")
