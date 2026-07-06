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
def f_gold ( x , p1 , p2 , n ) :
    set1 = ( x >> p1 ) & ( ( 1 << n ) - 1 )
    set2 = ( x >> p2 ) & ( ( 1 << n ) - 1 )
    xor = ( set1 ^ set2 )
    xor = ( xor << p1 ) | ( xor << p2 )
    result = x ^ xor
    return result


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        x_full = 1793455749
        p1_full = 0
        p2_full = 12
        n_full = 1
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 1793455749
        p1_gold = 0
        p2_gold = 12
        n_gold = 1
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2007 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 720994154
        p1_full = 11
        p2_full = 17
        n_full = 10
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 720994154
        p1_gold = 11
        p2_gold = 17
        n_gold = 10
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=7 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=7 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2147483647
        p1_full = 0
        p2_full = 16
        n_full = 13
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 2147483647
        p1_gold = 0
        p2_gold = 16
        n_gold = 13
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2019 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2019 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 0
        p1_full = 0
        p2_full = 8
        n_full = 3
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 0
        p1_gold = 0
        p2_gold = 8
        n_gold = 3
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3006 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 1078633361
        p1_full = 8
        p2_full = 13
        n_full = 18
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 1078633361
        p1_gold = 8
        p2_gold = 13
        n_gold = 18
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 0
        p1_full = 31
        p2_full = 6
        n_full = 1
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 0
        p1_gold = 31
        p2_gold = 6
        n_gold = 1
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2021 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2021 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 0
        p1_full = 31
        p2_full = 48
        n_full = 1
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 0
        p1_gold = 31
        p2_gold = 48
        n_gold = 1
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4024 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4024 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 115907
        p1_full = 15
        p2_full = 23
        n_full = 4
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 115907
        p1_gold = 15
        p2_gold = 23
        n_gold = 4
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=23 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=23 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 1431655765
        p1_full = 1
        p2_full = 24
        n_full = 1
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 1431655765
        p1_gold = 1
        p2_gold = 24
        n_gold = 1
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3004 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 0
        p1_full = 31
        p2_full = 2
        n_full = 6
        output_1 = F_FULL(x_full, p1_full, p2_full, n_full)
        x_gold = 0
        p1_gold = 31
        p2_gold = 2
        n_gold = 6
        output_2 = f_gold(x_gold, p1_gold, p2_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4005 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
