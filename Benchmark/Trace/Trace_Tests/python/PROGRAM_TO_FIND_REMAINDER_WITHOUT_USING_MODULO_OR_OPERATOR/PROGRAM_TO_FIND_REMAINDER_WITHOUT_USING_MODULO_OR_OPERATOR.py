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
def f_gold ( num , divisor ) :
    return ( num - divisor * ( num // divisor ) )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        num_full = -1740208979
        divisor_full = -7
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = -1740208979
        divisor_gold = -7
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2003 | error {e}')


    try:
        total_test_case_num += 1
        num_full = 999999990
        divisor_full = 999999993
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = 999999990
        divisor_gold = 999999993
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=10 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=10 | error {e}')


    try:
        total_test_case_num += 1
        num_full = 96
        divisor_full = 1
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = 96
        divisor_gold = 1
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=27 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=27 | error {e}')


    try:
        total_test_case_num += 1
        num_full = -95
        divisor_full = -1
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = -95
        divisor_gold = -1
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        num_full = -2147480645
        divisor_full = -1073741824
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = -2147480645
        divisor_gold = -1073741824
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4005 | error {e}')


    try:
        total_test_case_num += 1
        num_full = -1514128625
        divisor_full = -1644503399
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = -1514128625
        divisor_gold = -1644503399
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3001 | error {e}')


    try:
        total_test_case_num += 1
        num_full = 2147426054
        divisor_full = 2088176268
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = 2147426054
        divisor_gold = 2088176268
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1005 | error {e}')


    try:
        total_test_case_num += 1
        num_full = 0
        divisor_full = 7
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = 0
        divisor_gold = 7
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2004 | error {e}')


    try:
        total_test_case_num += 1
        num_full = -1073741823
        divisor_full = -1048576
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = -1073741823
        divisor_gold = -1048576
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2012 | error {e}')


    try:
        total_test_case_num += 1
        num_full = 1782645573
        divisor_full = 5
        output_1 = F_FULL(num_full, divisor_full)
        num_gold = 1782645573
        divisor_gold = 5
        output_2 = f_gold(num_gold, divisor_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3013 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3013 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
