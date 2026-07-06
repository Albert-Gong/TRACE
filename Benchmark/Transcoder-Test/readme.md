# Transcoder-Test

Transcoder-Test is a widely used, open-source benchmark for code translation, originally released by [Roziere et al. (2020)](https://arxiv.org/abs/2006.03511).

## Contents

- **`gold.jsonl`** — 568 code translation tasks, each containing parallel implementations in C++, Java, and Python.
- **`testscript/`** — Default functional test scripts organized by language (`python/`, `java/`, `cpp/`). Each script verifies correctness by comparing the output of a translated function against the gold reference.

## Format

Each line in `gold.jsonl` is a JSON object:

```json
{
  "sample_id": "ADD_1_TO_A_GIVEN_NUMBER",
  "cpp": "int addOne ( int x ) { ... }",
  "java": "static int addOne ( int x ) { ... }",
  "python": "def addOne ( x ) : ..."
}
```
