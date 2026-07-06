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
def f_gold ( a , b , mod ) :
    res = 0
    a = a % mod
    while ( b > 0 ) :
        if ( b % 2 == 1 ) :
            res = ( res + a ) % mod
        a = ( a * 2 ) % mod
        b //= 2
    return res % mod


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 9996106819
        b_full = 9991369851
        mod_full = 9999999967
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 9996106819
        b_gold = 9991369851
        mod_gold = 9999999967
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1011 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 8603409405338999020
        b_full = 7274858501405794072
        mod_full = 2305843009213693951
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 8603409405338999020
        b_gold = 7274858501405794072
        mod_gold = 2305843009213693951
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1006 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9995424077
        b_full = 9993694901
        mod_full = 9999999967
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 9995424077
        b_gold = 9993694901
        mod_gold = 9999999967
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1009 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 446712504
        b_full = -30857390
        mod_full = 480910156
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 446712504
        b_gold = -30857390
        mod_gold = 480910156
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 90168603
        b_full = 95672129
        mod_full = 99999989
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 90168603
        b_gold = 95672129
        mod_gold = 99999989
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=32 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=32 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 91
        b_full = 93
        mod_full = 97
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 91
        b_gold = 93
        mod_gold = 97
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=15 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=15 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9918804309
        b_full = 9790363393
        mod_full = 99999989
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 9918804309
        b_gold = 9790363393
        mod_gold = 99999989
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1012 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 955576
        b_full = 976602
        mod_full = 999997
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 955576
        b_gold = 976602
        mod_gold = 999997
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=8 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=8 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 94
        b_full = 95
        mod_full = 97
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 94
        b_gold = 95
        mod_gold = 97
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=26 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=26 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1039638670
        b_full = 550690479
        mod_full = 1073741823
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 1039638670
        b_gold = 550690479
        mod_gold = 1073741823
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3016 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3016 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
