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
def f_gold ( n , k ) :
    if ( k <= 0 ) :
        return n
    return ( n & ~ ( 1 << ( k - 1 ) ) )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = 9678280
        k_full = 31
        output_1 = F_FULL(n_full, k_full)
        n_gold = 9678280
        k_gold = 31
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=16 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=16 | error {e}')


    try:
        total_test_case_num += 1
        n_full = -493424895
        k_full = 23
        output_1 = F_FULL(n_full, k_full)
        n_gold = -493424895
        k_gold = 23
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1003 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483647
        k_full = 0
        output_1 = F_FULL(n_full, k_full)
        n_gold = 2147483647
        k_gold = 0
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2004 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 10000
        k_full = 19
        output_1 = F_FULL(n_full, k_full)
        n_gold = 10000
        k_gold = 19
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=25 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=25 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1431655765
        k_full = 32
        output_1 = F_FULL(n_full, k_full)
        n_gold = 1431655765
        k_gold = 32
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3000 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1390684951
        k_full = 1
        output_1 = F_FULL(n_full, k_full)
        n_gold = 1390684951
        k_gold = 1
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1009 | error {e}')


    try:
        total_test_case_num += 1
        n_full = -198363991
        k_full = 0
        output_1 = F_FULL(n_full, k_full)
        n_gold = -198363991
        k_gold = 0
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2020 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2020 | error {e}')


    try:
        total_test_case_num += 1
        n_full = -2147483077
        k_full = 31
        output_1 = F_FULL(n_full, k_full)
        n_gold = -2147483077
        k_gold = 31
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3005 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1073741823
        k_full = 31
        output_1 = F_FULL(n_full, k_full)
        n_gold = 1073741823
        k_gold = 31
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4016 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4016 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 665318
        k_full = 21
        output_1 = F_FULL(n_full, k_full)
        n_gold = 665318
        k_gold = 21
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=28 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=28 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
