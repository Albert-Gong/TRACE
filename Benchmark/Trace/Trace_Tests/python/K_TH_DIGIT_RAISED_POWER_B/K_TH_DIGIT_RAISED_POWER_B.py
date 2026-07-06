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
def f_gold ( a , b , k ) :
    p = a ** b
    count = 0
    while ( p > 0 and count < k ) :
        rem = p % 10
        count = count + 1
        if ( count == k ) :
            return rem
        p = p // 10
    return 0



def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 21
        b_full = 11
        k_full = 29487
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 21
        b_gold = 11
        k_gold = 29487
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4012 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 35
        b_full = 20
        k_full = 5417
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 35
        b_gold = 20
        k_gold = 5417
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4003 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 32
        b_full = 15
        k_full = 13171
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 32
        b_gold = 15
        k_gold = 13171
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4023 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4023 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 95
        b_full = 14
        k_full = 342
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 95
        b_gold = 14
        k_gold = 342
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3018 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3018 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9955
        b_full = 10
        k_full = 49
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 9955
        b_gold = 10
        k_gold = 49
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 18
        b_full = 11
        k_full = 11476
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 18
        b_gold = 11
        k_gold = 11476
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2011 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 59
        b_full = 15
        k_full = 26205
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 59
        b_gold = 15
        k_gold = 26205
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2024 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2024 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 25
        b_full = 11
        k_full = -68
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 25
        b_gold = 11
        k_gold = -68
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4002 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 14
        b_full = 12
        k_full = 10782
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 14
        b_gold = 12
        k_gold = 10782
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1007 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 35
        b_full = 12
        k_full = -65
        output_1 = F_FULL(a_full, b_full, k_full)
        a_gold = 35
        b_gold = 12
        k_gold = -65
        output_2 = f_gold(a_gold, b_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3014 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3014 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
