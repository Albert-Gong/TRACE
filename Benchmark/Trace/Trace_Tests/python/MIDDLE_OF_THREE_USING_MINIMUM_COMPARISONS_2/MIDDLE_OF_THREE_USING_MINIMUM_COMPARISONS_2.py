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
def f_gold ( a , b , c ) :
    x = a - b
    y = b - c
    z = a - c
    if x * y > 0 :
        return b
    elif ( x * z > 0 ) :
        return c
    else :
        return a


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 9668
        b_full = -9642
        c_full = -46
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 9668
        b_gold = -9642
        c_gold = -46
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -2147483644
        b_full = 2147483640
        c_full = -1
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -2147483644
        b_gold = 2147483640
        c_gold = -1
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4002 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -9999999
        b_full = 10000000
        c_full = -10000000
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -9999999
        b_gold = 10000000
        c_gold = -10000000
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=16 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=16 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -2147483602
        b_full = 2147483634
        c_full = 0
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -2147483602
        b_gold = 2147483634
        c_gold = 0
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 50
        b_full = 101
        c_full = 6
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 50
        b_gold = 101
        c_gold = 6
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2145907623
        b_full = 2108173820
        c_full = -2102871163
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 2145907623
        b_gold = 2108173820
        c_gold = -2102871163
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2009 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1000000009
        b_full = -1000000077
        c_full = 999999993
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 1000000009
        b_gold = -1000000077
        c_gold = 999999993
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1025 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1025 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -981021171
        b_full = 939955282
        c_full = -338773184
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -981021171
        b_gold = 939955282
        c_gold = -338773184
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3022 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3022 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -2147483647
        b_full = 2147483647
        c_full = 0
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -2147483647
        b_gold = 2147483647
        c_gold = 0
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2015 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 10000000
        b_full = -10000000
        c_full = 10000001
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 10000000
        b_gold = -10000000
        c_gold = 10000001
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=27 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=27 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
