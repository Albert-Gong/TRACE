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
    if a == 0 :
        return b
    return f_gold ( b % a , a )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 524287
        b_full = 963571
        output_1 = F_FULL(a_full, b_full)
        a_gold = 524287
        b_gold = 963571
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4002 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 999979
        b_full = 959889
        output_1 = F_FULL(a_full, b_full)
        a_gold = 999979
        b_gold = 959889
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1010 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1073741824
        b_full = 1073741825
        output_1 = F_FULL(a_full, b_full)
        a_gold = 1073741824
        b_gold = 1073741825
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2012 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 999999893
        b_full = 999970584
        output_1 = F_FULL(a_full, b_full)
        a_gold = 999999893
        b_gold = 999970584
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4008 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 999979
        b_full = 992427
        output_1 = F_FULL(a_full, b_full)
        a_gold = 999979
        b_gold = 992427
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1009 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2147483647
        b_full = 2147483646
        output_1 = F_FULL(a_full, b_full)
        a_gold = 2147483647
        b_gold = 2147483646
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=7 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=7 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9769
        b_full = -9469
        output_1 = F_FULL(a_full, b_full)
        a_gold = 9769
        b_gold = -9469
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2178309
        b_full = 832040
        output_1 = F_FULL(a_full, b_full)
        a_gold = 2178309
        b_gold = 832040
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4004 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 100000000
        b_full = 99999999
        output_1 = F_FULL(a_full, b_full)
        a_gold = 100000000
        b_gold = 99999999
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=5 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=5 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 134217728
        b_full = 33554433
        output_1 = F_FULL(a_full, b_full)
        a_gold = 134217728
        b_gold = 33554433
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2003 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
