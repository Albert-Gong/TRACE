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
def f_gold ( a , b ) :
    res = 0
    while ( b > 0 ) :
        if ( b & 1 ) :
            res = res + a
        a = a << 1
        b = b >> 1
    return res


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 9717
        b_full = 19403
        output_1 = F_FULL(a_full, b_full)
        a_gold = 9717
        b_gold = 19403
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=33 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=33 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 96
        b_full = 63
        output_1 = F_FULL(a_full, b_full)
        a_gold = 96
        b_gold = 63
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=28 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=28 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 99
        b_full = 99
        output_1 = F_FULL(a_full, b_full)
        a_gold = 99
        b_gold = 99
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=15 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=15 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 92
        b_full = 63
        output_1 = F_FULL(a_full, b_full)
        a_gold = 92
        b_gold = 63
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=29 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=29 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9222
        b_full = 18563
        output_1 = F_FULL(a_full, b_full)
        a_gold = 9222
        b_gold = 18563
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=32 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=32 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 98
        b_full = 63
        output_1 = F_FULL(a_full, b_full)
        a_gold = 98
        b_gold = 63
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=30 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=30 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9047
        b_full = 18251
        output_1 = F_FULL(a_full, b_full)
        a_gold = 9047
        b_gold = 18251
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=31 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=31 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
