import sys
import re
import subprocess
from openai import OpenAI
import time
import json
import os
import signal
import logging
from Utils.preprocessing.lang_processors.java_processor import JavaProcessor
from Utils.preprocessing.lang_processors.python_processor import PythonProcessor
from Utils.preprocessing.lang_processors.cpp_processor import CppProcessor
import psutil
import resource
import builtins

def GET_PROJECT_PATH(project_name='TRACE'):
    current_path = os.path.dirname(os.path.abspath(__file__))
    while current_path:
        if current_path.endswith(project_name):
            return current_path
        current_path = os.path.dirname(current_path)
    return None
PROJECT_ROOT_PATH=GET_PROJECT_PATH()

SINGLE_TEST_TIME_OUT = 180
SINGLE_TEST_MEMORY_LIMIT = 4 * 1024 * 1024 * 1024

LANG_TO_SUFFIX = {
    "python": "py",
    "java": "java",
    "cpp": "cpp",
}
TRANSCODER_DATASET_DIR = f"{GET_PROJECT_PATH()}/Benchmark/Transcoder-Test/gold.jsonl"

original_print = print
def flush_print(*args, **kwargs):
    kwargs.setdefault('flush', True)
    return original_print(*args, **kwargs)
builtins.print = flush_print

def kill_child_processes(sig, frame):
    print("Ctrl-C pressed! Killing all subprocesses...", flush=True)
    parent = psutil.Process(os.getpid())
    children = parent.children(recursive=True)
    for child in children:
        try:
            print(f"Sending SIGTERM to PID={child.pid}", flush=True)
            child.terminate()
        except Exception as e:
            print(f"Failed to terminate PID={child.pid}: {e}", flush=True)
    gone, alive = psutil.wait_procs(children, timeout=1)
    for child in alive:
        try:
            print(f"Forcing SIGKILL to PID={child.pid}", flush=True)
            child.kill()
        except Exception as e:
            print(f"Failed to kill PID={child.pid}: {e}", flush=True)
    os._exit(1)
signal.signal(signal.SIGINT, kill_child_processes)

def limit_memory_and_setsid():
    os.setsid()
    limit_bytes = 4 * 1024 * 1024 * 1024
    resource.setrlimit(resource.RLIMIT_AS, (limit_bytes, limit_bytes))

def exec_cmd(cmd:str, timeout:float=10.0):
    try:
        process = subprocess.Popen(
            cmd,
            shell=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            encoding="utf-8",
            preexec_fn=limit_memory_and_setsid
            )
        try:
            stdout, stderr = process.communicate(timeout=timeout)
            return True, stdout, stderr
        except subprocess.TimeoutExpired:
            os.killpg(os.getpgid(process.pid), signal.SIGKILL)
            return False, "", "TIMEOUT"
    except Exception as e:
        try:
            if process and process.poll() is None:
                os.killpg(os.getpgid(process.pid), signal.SIGKILL)
        except:
            pass
        return False, "", str(e)

def measure_memory_of_cmd(cmd=None, interval=0.05, timeout=10.0):
    mem_samples = []
    peak_rss = 0
    start_time = time.time()
    delayed_cmd = f"bash -c 'sleep 0.01 && {cmd}'"
    process = subprocess.Popen(delayed_cmd,
                               shell=True,
                               preexec_fn=limit_memory_and_setsid,
                               stdout=subprocess.PIPE,
                               stderr=subprocess.PIPE,
                               encoding="utf-8",)
    pid = process.pid
    try:
        while process.poll() is None:
            try:
                p = psutil.Process(pid)
                rss_total = p.memory_info().rss
                for child in p.children(recursive=True):
                    try:
                        rss_total += child.memory_info().rss
                    except (psutil.NoSuchProcess, psutil.AccessDenied):
                        pass

                mem_samples.append(rss_total / (1024 * 1024))
                if rss_total > peak_rss:
                    peak_rss = rss_total
            except (psutil.NoSuchProcess, psutil.AccessDenied):
                break
            time.sleep(interval)
            if time.time() - start_time > timeout:
                os.killpg(os.getpgid(pid), signal.SIGKILL)
                break
    finally:
        if process.poll() is None:
            os.killpg(os.getpgid(pid), signal.SIGTERM)
            time.sleep(0.2)
            if process.poll() is None:
                os.killpg(os.getpgid(pid), signal.SIGKILL)

    return {
        'memory_samples': mem_samples,
        'max_memory_by_step': max(mem_samples) if mem_samples else 0.0,
        'avg_memory_by_step': sum(mem_samples) / len(mem_samples) if mem_samples else 0.0,
        'peak_rss_mb': peak_rss / (1024 * 1024),
    }

def get_freest_cpus(n:int=1):
    cpu_percentages = psutil.cpu_percent(interval=1, percpu=True)
    cpu_indices = list(range(len(cpu_percentages)))
    sorted_cpus = sorted(cpu_indices, key=lambda i: cpu_percentages[i])
    return sorted_cpus[:n]

def measure_stat_of_cmd(cmd:str="", timeout:float=5.0, repeat:int=1, logger=None, cpu_id=None):
    if cpu_id is None:
        cpu_ids = get_freest_cpus(10)[:2]
        cpu_list_str = ",".join(str(i) for i in cpu_ids)
    else:
        cpu_list_str = str(cpu_id + 40) + "," + str(cpu_id + 120)

    if "&&" in cmd:
        cmd_parts = cmd.split("&&")
        perf_cmd = " && ".join(cmd_parts[:-1]) + f" && taskset -c {cpu_list_str} perf stat --repeat={repeat}  {cmd_parts[-1]}"
    else:
        perf_cmd = f"taskset -c {cpu_list_str} perf stat --repeat={repeat} {cmd}"

    mem_stat = measure_memory_of_cmd(cmd=cmd, interval=0.01, timeout=timeout + 1.0)

    flag, stdout, stderr = exec_cmd(perf_cmd, timeout * repeat)
    instructions = None
    elapsed_time = None
    elapsed_time_std=0.0
    if repeat == 1:
        instructions_match = re.search(r'([\d,]+)\s+instructions', stderr)
        instructions = int(instructions_match.group(1).replace(',', '')) if instructions_match else None
        time_match = re.search(r'([\d\.]+)\s+seconds time elapsed', stderr)
        elapsed_time = float(time_match.group(1)) if time_match else -1
    else:
        instructions_match = re.search(r'([\d,]+)\s+instructions', stderr)
        instructions = int(instructions_match.group(1).replace(',', '')) if instructions_match else None
        match = re.search(r'([\d.]+)\s+\+-\s+([\d.]+)\s+seconds time elapsed', stderr)
        if match:
            elapsed_time = float(match.group(1))
            elapsed_time_std = float(match.group(2))

    if logger:
        logger.info(f"Exec Command\n{perf_cmd}\nExec Perf Result\n{stderr}\nExec Mem Result\n{json.dumps(mem_stat, indent=2)}\n\n")

    return {
        "flag": flag,
        "stdout": stdout,
        "stderr": stderr,
        "instructions": instructions,
        "elapsed_time": elapsed_time,
        "elapsed_time_std": elapsed_time_std,
        "memory": mem_stat
    }

def get_pid_range(pid=None, total_samples=None, multithread_num=None):
    base = total_samples // multithread_num
    extra = total_samples % multithread_num
    if pid < extra:
        start = pid * (base + 1)
        end = start + (base + 1)
    else:
        start = pid * base + extra
        end = start + base
    return start, end

def GET_PROCESSOR(lang=None, so_path=None):
    CPP_PROCESSOR = CppProcessor(so_path=os.getenv('TREE_SITTER_SO_PATH'))
    JAVA_PROCESSOR = JavaProcessor(so_path=os.getenv('TREE_SITTER_SO_PATH'))
    PYTHON_PROCESSOR = PythonProcessor(so_path=os.getenv('TREE_SITTER_SO_PATH'))
    if lang == 'cpp':
        return CPP_PROCESSOR
    elif lang == 'java':
        return JAVA_PROCESSOR
    elif lang == 'python':
        return PYTHON_PROCESSOR
    else:
        raise ValueError("Unsupported language")


def get_logger(logger_name='logger', dump_file=None):
    logging.basicConfig(level=logging.INFO,
                        format='%(asctime)s - %(name)s - %(levelname)s - %(message)s',
                        datefmt='%Y-%m-%d %H:%M:%S',)
    logger = logging.getLogger(logger_name)

    if dump_file:
        os.makedirs(os.path.dirname(dump_file), exist_ok=True)
        file_handler = logging.FileHandler(dump_file,  mode='w')
        formatter = logging.Formatter('[%(asctime)s - %(name)s - %(levelname)s] %(message)s', datefmt='%Y-%m-%d %H:%M:%S')
        file_handler.setFormatter(formatter)
        logger.addHandler(file_handler)

    return logger

def read_jsonl(file_path=None):
    data = []
    with open(file_path, 'r') as f:
        for i, line in enumerate(f):
            try:
                data.append(json.loads(line.strip()))
            except json.JSONDecodeError as e:
                print(f"Error {e} | Line {i}: {line.strip()}")
                print(line)
    return data

def write_jsonl(path: str, rows) -> None:
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, 'w', encoding='utf-8') as f:
        for obj in rows:
            f.write(json.dumps(obj, ensure_ascii=False) + "\n")

def DELETE_DIR_CONTENT(directory=None):
    assert directory is not None, "Cannot delete root directory " + directory
    assert directory.strip() != '/', "Cannot delete root directory " + directory
    assert directory.strip() != '', "Cannot delete root directory " + directory
    assert directory.strip() != GET_PROJECT_PATH(), "Cannot delete root directory " + directory
    assert directory.strip().startswith(f"{GET_PROJECT_PATH()}/Output"), "Cannot delete directory outside Output*/ " + directory

    if os.path.exists(directory):
        try:
            for root, dirs, files in os.walk(directory, topdown=False):
                for name in files:
                    os.remove(os.path.join(root, name))
                for name in dirs:
                    os.rmdir(os.path.join(root, name))
        except Exception as e:
            pass

def timeout_handler(signum, frame):
    raise TimeoutError("API request timed out")

def get_openai_response(
    api_key=None,
    base_url=None,
    model_name=None,
    history_messages=None,
    max_token=4096,
    temperature=0.0,
    tools=None,
    n=1):

    client = OpenAI(
        api_key=api_key,
        base_url=base_url)
    trial = 3
    continue_flag = True
    response = None
    error = None
    time_cost = None
    token_usage=None
    while trial >= 0 and continue_flag is True:
        trial = trial - 1
        try:
            signal.signal(signal.SIGALRM, timeout_handler)
            signal.alarm(5)
            start_time = time.time()
            response = client.chat.completions.create(
                model=model_name,
                messages=history_messages,
                max_tokens=max_token,
                temperature=temperature,
                tools=tools,
                stop=["<|END|>"],
                n=n)
            end_time = time.time()
            continue_flag = False
            error = None
            time_cost = end_time - start_time
        except TimeoutError as e:
            error = "TimeoutError"
        except Exception as e:
            error = str(e)
        finally:
            signal.alarm(0)
    try:
        response = response.model_dump_json()
        response = json.loads(response)
        token_usage = response['usage']
    except Exception as e:
        response=str(response)
        error = str(e)
    return response, error, time_cost, token_usage
