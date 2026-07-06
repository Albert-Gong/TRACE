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
    if ( ( a < b and b < c ) or ( c < b and b < a ) ) :
        return b
    if ( ( b < a and a < c ) or ( c < a and a < b ) ) :
        return a
    else :
        return c


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = -9218427
        b_full = 10000000
        c_full = 9429797
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -9218427
        b_gold = 10000000
        c_gold = 9429797
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=31 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=31 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 99903
        b_full = -99961
        c_full = -2
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 99903
        b_gold = -99961
        c_gold = -2
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=27 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=27 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -92
        b_full = -10
        c_full = -62
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -92
        b_gold = -10
        c_gold = -62
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -1547897240
        b_full = 1924585509
        c_full = 63
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -1547897240
        b_gold = 1924585509
        c_gold = 63
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4012 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -91
        b_full = -30
        c_full = 6
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -91
        b_gold = -30
        c_gold = 6
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -10000000
        b_full = 9999999
        c_full = -1
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = -10000000
        b_gold = 9999999
        c_gold = -1
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=8 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=8 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1734845145
        b_full = -1927585812
        c_full = -90
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 1734845145
        b_gold = -1927585812
        c_gold = -90
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3004 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 8375907
        b_full = -6782338
        c_full = -81
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 8375907
        b_gold = -6782338
        c_gold = -81
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3007 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2147483647
        b_full = 2147483647
        c_full = 0
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 2147483647
        b_gold = 2147483647
        c_gold = 0
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3000 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2790349
        b_full = -8281425
        c_full = 63
        output_1 = F_FULL(a_full, b_full, c_full)
        a_gold = 2790349
        b_gold = -8281425
        c_gold = 63
        output_2 = f_gold(a_gold, b_gold, c_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3008 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
