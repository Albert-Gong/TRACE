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
def f_gold ( n , d ) :
    return ( n & ( d - 1 ) )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = 2069971518
        d_full = 1073741824
        output_1 = F_FULL(n_full, d_full)
        n_gold = 2069971518
        d_gold = 1073741824
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4012 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483619
        d_full = 536870912
        output_1 = F_FULL(n_full, d_full)
        n_gold = 2147483619
        d_gold = 536870912
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1010 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483519
        d_full = 1073741834
        output_1 = F_FULL(n_full, d_full)
        n_gold = 2147483519
        d_gold = 1073741834
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1017 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1017 | error {e}')


    try:
        total_test_case_num += 1
        n_full = -2147483552
        d_full = 64
        output_1 = F_FULL(n_full, d_full)
        n_gold = -2147483552
        d_gold = 64
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 10000000
        d_full = 8388608
        output_1 = F_FULL(n_full, d_full)
        n_gold = 10000000
        d_gold = 8388608
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=28 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=28 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 99260
        d_full = 32768
        output_1 = F_FULL(n_full, d_full)
        n_gold = 99260
        d_gold = 32768
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=16 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=16 | error {e}')


    try:
        total_test_case_num += 1
        n_full = -2147483437
        d_full = 536870912
        output_1 = F_FULL(n_full, d_full)
        n_gold = -2147483437
        d_gold = 536870912
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4022 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4022 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 98398613
        d_full = 268435456
        output_1 = F_FULL(n_full, d_full)
        n_gold = 98398613
        d_gold = 268435456
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=30 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=30 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 100
        d_full = 64
        output_1 = F_FULL(n_full, d_full)
        n_gold = 100
        d_gold = 64
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=15 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=15 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483032
        d_full = 33554432
        output_1 = F_FULL(n_full, d_full)
        n_gold = 2147483032
        d_gold = 33554432
        output_2 = f_gold(n_gold, d_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1009 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
