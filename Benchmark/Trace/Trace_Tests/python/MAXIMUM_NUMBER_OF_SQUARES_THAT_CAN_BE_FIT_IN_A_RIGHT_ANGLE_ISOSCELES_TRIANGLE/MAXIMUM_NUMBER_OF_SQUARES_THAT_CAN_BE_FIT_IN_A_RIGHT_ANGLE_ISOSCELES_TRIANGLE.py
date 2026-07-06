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
def f_gold ( b , m ) :
    return ( b // m - 1 ) * ( b // m ) // 2


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        b_full = 10000
        m_full = 4786
        output_1 = F_FULL(b_full, m_full)
        b_gold = 10000
        m_gold = 4786
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 100000000
        m_full = 100021
        output_1 = F_FULL(b_full, m_full)
        b_gold = 100000000
        m_gold = 100021
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2011 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 2147483647
        m_full = 1000099
        output_1 = F_FULL(b_full, m_full)
        b_gold = 2147483647
        m_gold = 1000099
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4010 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 2147483647
        m_full = 999983
        output_1 = F_FULL(b_full, m_full)
        b_gold = 2147483647
        m_gold = 999983
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4005 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 9916
        m_full = 54
        output_1 = F_FULL(b_full, m_full)
        b_gold = 9916
        m_gold = 54
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=14 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=14 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 9556
        m_full = 19
        output_1 = F_FULL(b_full, m_full)
        b_gold = 9556
        m_gold = 19
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=13 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=13 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 1000000007
        m_full = 999961
        output_1 = F_FULL(b_full, m_full)
        b_gold = 1000000007
        m_gold = 999961
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3003 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 99999999
        m_full = 99999998
        output_1 = F_FULL(b_full, m_full)
        b_gold = 99999999
        m_gold = 99999998
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=23 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=23 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 2000000000
        m_full = 1000000001
        output_1 = F_FULL(b_full, m_full)
        b_gold = 2000000000
        m_gold = 1000000001
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3000 | error {e}')


    try:
        total_test_case_num += 1
        b_full = 93
        m_full = 2
        output_1 = F_FULL(b_full, m_full)
        b_gold = 93
        m_gold = 2
        output_2 = f_gold(b_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
