import os,re,sys,ast
sys.path.extend([ '..', '../..'])
from Utils.common_util import *
import javalang

def extract_java_method(code: str = "") -> str:
    header = code.split("{", 1)[0]
    if "class" not in header:
        return code
    try:
        cu = javalang.parse.parse(code)
    except Exception as e:
        return  code

    for _, m in cu.filter(javalang.tree.MethodDeclaration):
        if m.name == "main" and "static" in m.modifiers:
            continue
        lines = code.splitlines(keepends=True)
        start = m.position.line - 1
        brace_cnt, first_brace_found = 0, False
        end = start
        for i in range(start, len(lines)):
            for ch in lines[i]:
                if ch == "{":
                    brace_cnt += 1
                    first_brace_found = True
                elif ch == "}":
                    brace_cnt -= 1
                if first_brace_found and brace_cnt == 0:
                    end = i
                    return "".join(lines[start:end + 1]).rstrip()
        break
    return  code

def extract_cpp_method(code:str=""):
    new_lines = []
    for line in code.splitlines():
        if line.lstrip().startswith("int main"):
            break
        new_lines.append(line)

    return "\n".join(new_lines)

def extract_python_method(code:str=None):
    try:
        import_lines = [x for x in code.splitlines() if x.startswith(("import ", "from "))]
        parsed = ast.parse(code)
        func_nodes = [node for node in parsed.body if isinstance(node, ast.FunctionDef)]
        if not func_nodes:
            return ""
        start_line = func_nodes[0].lineno - 1
        end_line = func_nodes[0].end_lineno
        return "\n".join(import_lines) + "\n" + "\n".join(code.splitlines()[start_line:end_line])
    except Exception as e:
        print("AST parse failed:", e)
        return ""

def process_translation(src_lang=None, tgt_lang=None, raw_translations=None):
    processed_translations = []
    for translation in raw_translations:
        sample_id = translation['sample_id']
        if "generation" in translation:
            generations = [x['generation'] for x in translation['generation']]
        else:
            generations = translation[tgt_lang]

        processed_generations = []
        for gen in generations:
            if "<think>" in gen and "</think>" in gen:
                try:
                    gen = gen[gen.index("</think>") + len("</think>"):]
                except:
                    pass
            if "<|END|>" in gen:
                gen = gen.split("<|END|>")[0]
            lines = [x for x in gen.splitlines() if len(x.strip())]
            processed_lines = []
            visit = 0

            import_lines = []
            for line in lines:
                if line.lstrip().startswith(("#include", "# include", "import ", "from ", "using ")):
                    import_lines.append(line)
                    continue
                if line.strip().startswith(("```cpp", "```python", "```java", "```")):
                    visit += 1
                    continue
                if visit == 1:
                    processed_lines.append(line)

            method = ""
            if tgt_lang == "python":
                method = extract_python_method("\n".join(processed_lines))
            if tgt_lang == "java":
                method = extract_java_method("\n".join(processed_lines))
                if len(method) and "static" not in method.splitlines()[0]:
                    method = "static " + method
            if tgt_lang == 'cpp':
                method = extract_cpp_method("\n".join(processed_lines))

            processed_generations.append("\n".join(import_lines) + "\n--IMPORT_SPLIT--\n" + "\n" + method)
        print(f"sample-id\n{sample_id}\nprocessed_generation\n{processed_generations[0]}\n\n")

        processed_translations.append({
            'sample_id': sample_id,
            tgt_lang: processed_generations
        })
    return processed_translations

if __name__ == "__main__":
    import argparse
    parser = argparse.ArgumentParser()
    parser.add_argument("--input_fp", type=str, required=True)
    parser.add_argument("--src_lang", type=str, required=True)
    parser.add_argument("--tgt_lang", type=str, required=True)
    args = parser.parse_args()

    input_fp = args.input_fp
    src_lang = args.src_lang
    tgt_lang = args.tgt_lang

    raw_translations = read_jsonl(input_fp)
    processed_translations = process_translation(src_lang=src_lang, tgt_lang=tgt_lang, raw_translations=raw_translations)

    output_fp = os.path.join(os.path.dirname(input_fp), "p_" + os.path.basename(input_fp))
    print(f"Processing {src_lang} to {tgt_lang}, {len(processed_translations)} translations")
    with open(output_fp, 'w') as f:
        for translation in processed_translations:
            f.write(json.dumps(translation) + "\n")
