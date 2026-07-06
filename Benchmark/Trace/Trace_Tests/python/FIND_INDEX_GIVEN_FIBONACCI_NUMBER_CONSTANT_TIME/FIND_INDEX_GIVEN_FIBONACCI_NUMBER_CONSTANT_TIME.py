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
    if ( n <= 1 ) :
        return n
    a = 0
    b = 1
    c = 1
    res = 1
    while ( c < n ) :
        c = a + b
        res = res + 1
        a = b
        b = c
    return res


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = 9999
        output_1 = F_FULL(n_full)
        n_gold = 9999
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=19 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=19 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1836310193
        output_1 = F_FULL(n_full)
        n_gold = 1836310193
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2002 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1803511511
        output_1 = F_FULL(n_full)
        n_gold = 1803511511
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4007 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1821723932
        output_1 = F_FULL(n_full)
        n_gold = 1821723932
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1014 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1014 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 10000
        output_1 = F_FULL(n_full)
        n_gold = 10000
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1836311201
        output_1 = F_FULL(n_full)
        n_gold = 1836311201
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3002 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1836309968
        output_1 = F_FULL(n_full)
        n_gold = 1836309968
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3014 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3014 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 100
        output_1 = F_FULL(n_full)
        n_gold = 100
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 9518
        output_1 = F_FULL(n_full)
        n_gold = 9518
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=8 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=8 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1836309472
        output_1 = F_FULL(n_full)
        n_gold = 1836309472
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2015 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
