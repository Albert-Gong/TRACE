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
def f_gold ( n ) :
    i = 1
    the_sum = 0
    while the_sum < n :
        the_sum += i
        if the_sum == n :
            return True
        i += 2
    return False


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = 2147483557
        output_1 = F_FULL(n_full)
        n_gold = 2147483557
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1010 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483600
        output_1 = F_FULL(n_full)
        n_gold = 2147483600
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2009 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483299
        output_1 = F_FULL(n_full)
        n_gold = 2147483299
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483340
        output_1 = F_FULL(n_full)
        n_gold = 2147483340
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1009 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483470
        output_1 = F_FULL(n_full)
        n_gold = 2147483470
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1003 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483177
        output_1 = F_FULL(n_full)
        n_gold = 2147483177
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3004 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483034
        output_1 = F_FULL(n_full)
        n_gold = 2147483034
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4004 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147482996
        output_1 = F_FULL(n_full)
        n_gold = 2147482996
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=11 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=11 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147483509
        output_1 = F_FULL(n_full)
        n_gold = 2147483509
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2012 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2147481829
        output_1 = F_FULL(n_full)
        n_gold = 2147481829
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4016 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4016 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
