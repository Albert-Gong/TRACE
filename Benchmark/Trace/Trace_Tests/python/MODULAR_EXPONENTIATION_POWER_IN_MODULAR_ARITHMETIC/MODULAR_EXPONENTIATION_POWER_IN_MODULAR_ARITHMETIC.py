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
def f_gold ( x , y , p ) :
    res = 1
    x = x % p
    while ( y > 0 ) :
        if ( ( y & 1 ) == 1 ) :
            res = ( res * x ) % p
        y = y >> 1
        x = ( x * x ) % p
    return res


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        x_full = 2147483646
        y_full = 1999999
        p_full = 97
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = 2147483646
        y_gold = 1999999
        p_gold = 97
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3014 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3014 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2147483647
        y_full = 1000000
        p_full = 2147483647
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = 2147483647
        y_gold = 1000000
        p_gold = 2147483647
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=18 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=18 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -2147483647
        y_full = 500000
        p_full = 2
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = -2147483647
        y_gold = 500000
        p_gold = 2
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4007 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2147483647
        y_full = 2147483199
        p_full = 2147483647
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = 2147483647
        y_gold = 2147483199
        p_gold = 2147483647
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4016 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4016 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -2147483647
        y_full = 500000
        p_full = 3
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = -2147483647
        y_gold = 500000
        p_gold = 3
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4006 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2147483647
        y_full = 2147483542
        p_full = 2147483647
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = 2147483647
        y_gold = 2147483542
        p_gold = 2147483647
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4017 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4017 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -2147483647
        y_full = 1048576
        p_full = 2147483647
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = -2147483647
        y_gold = 1048576
        p_gold = 2147483647
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3007 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2147483647
        y_full = 2147482803
        p_full = 2147483647
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = 2147483647
        y_gold = 2147482803
        p_gold = 2147483647
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4015 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -2147483648
        y_full = 1715791374
        p_full = 2147483647
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = -2147483648
        y_gold = 1715791374
        p_gold = 2147483647
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2001 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 10000
        y_full = 9999
        p_full = 9971
        output_1 = F_FULL(x_full, y_full, p_full)
        x_gold = 10000
        y_gold = 9999
        p_gold = 9971
        output_2 = f_gold(x_gold, y_gold, p_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=13 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=13 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
