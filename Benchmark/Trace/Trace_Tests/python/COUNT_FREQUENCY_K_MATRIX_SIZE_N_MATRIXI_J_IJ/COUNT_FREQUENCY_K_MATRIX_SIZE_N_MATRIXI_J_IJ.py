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
    if ( n + 1 >= k ) :
        return ( k - 1 )
    else :
        return ( 2 * n + 1 - k )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = 1920370359
        k_full = 1518555838
        output_1 = F_FULL(n_full, k_full)
        n_gold = 1920370359
        k_gold = 1518555838
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 96
        k_full = 100
        output_1 = F_FULL(n_full, k_full)
        n_gold = 96
        k_gold = 100
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 993041
        k_full = 916436
        output_1 = F_FULL(n_full, k_full)
        n_gold = 993041
        k_gold = 916436
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=28 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=28 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 9992
        k_full = 9992
        output_1 = F_FULL(n_full, k_full)
        n_gold = 9992
        k_gold = 9992
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2042038515
        k_full = 2124401202
        output_1 = F_FULL(n_full, k_full)
        n_gold = 2042038515
        k_gold = 2124401202
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4015 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2067939876
        k_full = 2126027977
        output_1 = F_FULL(n_full, k_full)
        n_gold = 2067939876
        k_gold = 2126027977
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2011 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 99
        k_full = 99
        output_1 = F_FULL(n_full, k_full)
        n_gold = 99
        k_gold = 99
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 999999999
        k_full = 1000000001
        output_1 = F_FULL(n_full, k_full)
        n_gold = 999999999
        k_gold = 1000000001
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=6 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=6 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2071460171
        k_full = 2024460037
        output_1 = F_FULL(n_full, k_full)
        n_gold = 2071460171
        k_gold = 2024460037
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1010 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 46792821
        k_full = 82386082
        output_1 = F_FULL(n_full, k_full)
        n_gold = 46792821
        k_gold = 82386082
        output_2 = f_gold(n_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4020 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4020 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
