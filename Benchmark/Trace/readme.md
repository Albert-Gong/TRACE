# TRACE Benchmark

TRACE (**T**ranslation **R**untime **A**nalysis for **C**ode **E**fficiency) is a benchmark for evaluating the execution efficiency of LLM-based code translation, beyond conventional correctness-based assessments.

## Contents

- **`tasks.jsonl`** — 1,000 efficiency-critical code translation tasks across 6 translation directions (C++ <-> Java <-> Python).
- **`Trace_Tests/`** — Stress test suites organized by target language (`python/`, `java/`, `cpp/`). Each task directory contains a test script and multiple test input subdirectories.
- **`Ref_Translation/`** — Reference translations from 28 LLMs, organized by model and translation direction.

## Format

Each line in `tasks.jsonl` is a JSON object:

```json
{
  "sample_id": "ADD_1_TO_A_GIVEN_NUMBER",
  "src_lang": "cpp",
  "tgt_lang": "java",
  "source_code": "int addOne ( int x ) { ... }",
  "target_code": "static int addOne ( int x ) { ... }"
}
```

Each model's reference translations are stored as `Ref_Translation/m.{model_name}/{src}_to_{tgt}/p_{src}_to_{tgt}.jsonl`, with format:

```json
{
  "sample_id": "ADD_1_TO_A_GIVEN_NUMBER",
  "{tgt_lang}": ["<import_code>\n--IMPORT_SPLIT--\n<method_code>"]
}
```

## Task Distribution

| Direction       | Count |
|-----------------|-------|
| cpp_to_java     | 250   |
| cpp_to_python   | 141   |
| java_to_cpp     | 127   |
| java_to_python  | 148   |
| python_to_cpp   | 98    |
| python_to_java  | 236   |
| **Total**       | **1,000** |

## Stress Tests

Stress tests are designed to expose computational performance differences between translations. For each task, up to 10 stress test cases are provided. The test suites include:

- **Python**: `{task_name}/{task_name}.py` with embedded serialization and comparison logic
- **Java**: `{task_name}/MAIN.java` with `test_*/param_idx_*.txt` input files
- **C++**: `{task_name}/{task_name}.cpp` with embedded gold function and test logic

Test scripts use `TO_FILL_FUNC` / `F_FULL` placeholders for injecting translated code during evaluation.

## Selection Criteria

Tasks are selected from Transcoder-Test (568 tasks) through an efficiency-oriented filtering pipeline. Only tasks that meaningfully differentiate runtime efficiency across LLM-generated translations are retained. See the paper for details on the selection methodology.
