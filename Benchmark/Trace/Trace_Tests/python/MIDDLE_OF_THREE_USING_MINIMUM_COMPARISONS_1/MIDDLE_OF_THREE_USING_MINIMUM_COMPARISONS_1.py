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
    if a > b :
        if ( b > c ) :
            return b
        elif ( a > c ) :
            return c
        else :
            return a
    else :
        if ( a > c ) :
            return a
        elif ( b > c ) :
            return c
        else :
            return b


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 2147482648
        b_full = -2147483648
        c_full = -100
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 2147482648
        b_gold = -2147483648
        c_gold = -100
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1011 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 99999
        b_full = 99998
        c_full = 0
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 99999
        b_gold = 99998
        c_gold = 0
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=15 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=15 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2134456597
        b_full = -2147128350
        c_full = -5678
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 2134456597
        b_gold = -2147128350
        c_gold = -5678
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=18 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=18 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2137521676
        b_full = -1297618852
        c_full = 1203998180
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 2137521676
        b_gold = -1297618852
        c_gold = 1203998180
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2000 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -2073960627
        b_full = 2045725610
        c_full = 157528
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -2073960627
        b_gold = 2045725610
        c_gold = 157528
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
        a_full = 1000000000
        b_full = 999999999
        c_full = 999999998
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 1000000000
        b_gold = 999999999
        c_gold = 999999998
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1021 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1021 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 57899
        b_full = 23501
        c_full = 73459
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 57899
        b_gold = 23501
        c_gold = 73459
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=24 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=24 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 67562
        b_full = -15615
        c_full = -54779
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 67562
        b_gold = -15615
        c_gold = -54779
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=23 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=23 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2049866057
        b_full = -2027712655
        c_full = -1
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 2049866057
        b_gold = -2027712655
        c_gold = -1
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1014 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1014 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1000000000
        b_full = -1000000000
        c_full = 500000
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 1000000000
        b_gold = -1000000000
        c_gold = 500000
        output_2 = f_gold(a_gold, b_gold, c_gold)
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
