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
def f_gold ( x , y ) :
    if ( x == 1 ) :
        return ( y == 1 )
    pow = 1
    while ( pow < y ) :
        pow = pow * x
    return ( pow == y )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        x_full = 94
        y_full = 2000000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 94
        y_gold = 2000000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4002 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 90466
        y_full = 1000000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 90466
        y_gold = 1000000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4015 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 96220
        y_full = 1000000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 96220
        y_gold = 1000000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4016 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4016 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 9901
        y_full = 2000000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 9901
        y_gold = 2000000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4011 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 79
        y_full = 1000000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 79
        y_gold = 1000000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3013 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3013 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 9991
        y_full = 100000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 9991
        y_gold = 100000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3017 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3017 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 86
        y_full = 1000000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 86
        y_gold = 1000000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3014 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3014 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 9973
        y_full = 2000000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 9973
        y_gold = 2000000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3004 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2466
        y_full = 2000000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 2466
        y_gold = 2000000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3006 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 9999
        y_full = 100000000
        output_1 = F_FULL(x_full, y_full)
        x_gold = 9999
        y_gold = 100000000
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=15 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=15 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
