# Write the declarations here
from collections import *
from typing import *
# TO_FILL_IMPORT

def serialize_list(obj) -> str:
    list_str = ["["]
    for item in obj:
        list_str.append(serialize_obj(item))
        list_str.append(",")
    list_str[-1] = "]"
    return "".join(list_str)


def serialize_dict(obj) -> str:
    m = OrderedDict(sorted(obj.items()))
    dict_str = ["{"]
    for key, value in m.items():
        dict_str.append(serialize_obj(key))
        dict_str.append(":")
        dict_str.append(serialize_obj(value))
        dict_str.append(",")
    dict_str[-1] = "}"
    return "".join(dict_str)


def serialize_obj(obj) -> str:
    if obj is None:
        return "null"
    if isinstance(obj, int) or isinstance(obj, float):
        return "{0:.8f}".format(obj)
    if isinstance(obj, str):
        return '"' + obj + '"'
    if isinstance(obj, bool):
        return str(obj)
    if isinstance(obj, list) or isinstance(obj, tuple):
        return serialize_list(obj)
    if isinstance(obj, dict):
        return serialize_dict(obj)
    
    raise Exception("Unrecognized Type!")


def are_equivalent(o1, o2) -> bool:
    print(serialize_obj(o1)+" "+serialize_obj(o2))
    return serialize_obj(o1) == serialize_obj(o2)


# TO_FILL_FUNC



# TO_FILL_GOLD
def f_gold ( n , m ) :
    return ( m * n * ( n + 1 ) * ( m + 1 ) ) // 4


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = 215
        m_full = 214
        output_1 = F_FULL(n_full, m_full)
        n_gold = 215
        m_gold = 214
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3006 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 215
        m_full = 208
        output_1 = F_FULL(n_full, m_full)
        n_gold = 215
        m_gold = 208
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2010 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 213
        m_full = 213
        output_1 = F_FULL(n_full, m_full)
        n_gold = 213
        m_gold = 213
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4012 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 212
        m_full = 212
        output_1 = F_FULL(n_full, m_full)
        n_gold = 212
        m_gold = 212
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4002 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 214
        m_full = 213
        output_1 = F_FULL(n_full, m_full)
        n_gold = 214
        m_gold = 213
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4007 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 213
        m_full = 214
        output_1 = F_FULL(n_full, m_full)
        n_gold = 213
        m_gold = 214
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4011 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 95
        m_full = 95
        output_1 = F_FULL(n_full, m_full)
        n_gold = 95
        m_gold = 95
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=12 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=12 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 99
        m_full = 99
        output_1 = F_FULL(n_full, m_full)
        n_gold = 99
        m_gold = 99
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=27 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=27 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 214
        m_full = 212
        output_1 = F_FULL(n_full, m_full)
        n_gold = 214
        m_gold = 212
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1004 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 214
        m_full = 210
        output_1 = F_FULL(n_full, m_full)
        n_gold = 214
        m_gold = 210
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4023 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4023 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
