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
    if ( a == 0 ) :
        return b
    if ( b == 0 ) :
        return a
    k = 0
    while ( ( ( a | b ) & 1 ) == 0 ) :
        a = a >> 1
        b = b >> 1
        k = k + 1
    while ( ( a & 1 ) == 0 ) :
        a = a >> 1
    while ( b != 0 ) :
        while ( ( b & 1 ) == 0 ) :
            b = b >> 1
        if ( a > b ) :
            temp = a
            a = b
            b = temp
        b = ( b - a )
    return ( a << k )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 9999923
        b_full = 29999985
        output_1 = F_FULL(a_full, b_full)
        a_gold = 9999923
        b_gold = 29999985
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
        a_full = 982451653
        b_full = 1073741823
        output_1 = F_FULL(a_full, b_full)
        a_gold = 982451653
        b_gold = 1073741823
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4000 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9999921
        b_full = 29999790
        output_1 = F_FULL(a_full, b_full)
        a_gold = 9999921
        b_gold = 29999790
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 999999966
        b_full = 1073741823
        output_1 = F_FULL(a_full, b_full)
        a_gold = 999999966
        b_gold = 1073741823
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=6 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=6 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 982451653
        b_full = 31104000
        output_1 = F_FULL(a_full, b_full)
        a_gold = 982451653
        b_gold = 31104000
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1008 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2147483647
        b_full = 2147483629
        output_1 = F_FULL(a_full, b_full)
        a_gold = 2147483647
        b_gold = 2147483629
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2000 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 99998
        b_full = 99999
        output_1 = F_FULL(a_full, b_full)
        a_gold = 99998
        b_gold = 99999
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 923015
        b_full = 623009
        output_1 = F_FULL(a_full, b_full)
        a_gold = 923015
        b_gold = 623009
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=29 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=29 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1073741824
        b_full = 1073741823
        output_1 = F_FULL(a_full, b_full)
        a_gold = 1073741824
        b_gold = 1073741823
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4001 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 99588
        b_full = 32767
        output_1 = F_FULL(a_full, b_full)
        a_gold = 99588
        b_gold = 32767
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=26 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=26 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
