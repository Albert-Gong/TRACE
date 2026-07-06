# TRACE: Evaluating Execution Efficiency of LLM-Based Code Translation

[[Paper]](https://aclanthology.org/2026.acl-long.140/) | ACL 2026

TRACE is the first benchmark that systematically evaluates the execution efficiency of LLM-translated code. It covers 1,000 efficiency-critical tasks across C++, Java, and Python (6 translation directions), each paired with stress tests that amplify runtime and memory differences between translations. We evaluated 28 LLMs and found that correctness and efficiency are often misaligned — the most correct model is not the most efficient, and 23.5% of correct translations suffer from notable inefficiency.

This repository provides the benchmark data and evaluation framework to reproduce our results or test new models.

## Quick Start

```bash
pip install -r requirements.txt
```

The code parsing utilities depend on tree-sitter language processors from [TransCoder](https://github.com/facebookresearch/TransCoder). Build the shared library and set `export TREE_SITTER_SO_PATH=/path/to/tree-sitter-languages.so`. You also need `perf` (Linux), `g++`, and `javac`/`java` for profiling and running test cases. LLM API calls use the OpenAI-compatible interface — configure `api_key` and `base_url` in the translation/generation scripts.

## Repository Structure

```
Benchmark/
├── Transcoder-Test/          # Original 568-task dataset (gold.jsonl + testscript/)
└── Trace/                    # TRACE benchmark
    ├── tasks.jsonl            # 1,000 tasks with src/tgt lang and code
    ├── Trace_Tests/           # Stress test suites ({python,java,cpp}/)
    └── Ref_Translation/       # Reference translations from 28 LLMs

Translation/                  # Code translation scripts
Evaluation/                   # Correctness + efficiency evaluation
Utils/                        # Shared utilities
```

## Evaluate a Model on TRACE

Translate, post-process, then evaluate correctness and efficiency:

```bash
python Translation/run_zero_shot_llm_translation.py \
    --model_name ${model} --src_lang cpp --tgt_lang java

python Translation/process_translation.py \
    --input_fp ${raw_output} --src_lang cpp --tgt_lang java

python Evaluation/evaluation.py \
    --model_name ${model} --src_lang cpp --tgt_lang java \
    --translation_fp ${processed_output} \
    --efficiency_testscript_dir Benchmark/Trace/Trace_Tests/java \
    --eval_correctness 1 --eval_efficiency 1
```

## Citation

```bibtex
@inproceedings{gong2026trace,
  title={Trace: Evaluating execution efficiency of llm-based code translation},
  author={Gong, Zhihao and Sun, Zeyu and Huang, Dong and Liang, Qingyuan and Zhang, Jie M and Hao, Dan},
  booktitle={Proceedings of the 64th Annual Meeting of the Association for Computational Linguistics (Volume 1: Long Papers)},
  pages={3089--3117},
  year={2026}
}
```
