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
    if ( y == 0 ) :
        return 0
    if ( y > 0 ) :
        return ( x + f_gold ( x , y - 1 ) )
    if ( y < 0 ) :
        return - f_gold ( x , - y )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        x_full = 96
        y_full = -94
        output_1 = F_FULL(x_full, y_full)
        x_gold = 96
        y_gold = -94
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=29 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=29 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 83298
        y_full = -930
        output_1 = F_FULL(x_full, y_full)
        x_gold = 83298
        y_gold = -930
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4000 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -999287
        y_full = -941
        output_1 = F_FULL(x_full, y_full)
        x_gold = -999287
        y_gold = -941
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4010 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -91678
        y_full = 952
        output_1 = F_FULL(x_full, y_full)
        x_gold = -91678
        y_gold = 952
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4013 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4013 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 7468
        y_full = -964
        output_1 = F_FULL(x_full, y_full)
        x_gold = 7468
        y_gold = -964
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4008 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 97
        y_full = -97
        output_1 = F_FULL(x_full, y_full)
        x_gold = 97
        y_gold = -97
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 83501
        y_full = -950
        output_1 = F_FULL(x_full, y_full)
        x_gold = 83501
        y_gold = -950
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
        x_full = 100
        y_full = -95
        output_1 = F_FULL(x_full, y_full)
        x_gold = 100
        y_gold = -95
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 360414
        y_full = -982
        output_1 = F_FULL(x_full, y_full)
        x_gold = 360414
        y_gold = -982
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -96843
        y_full = 907
        output_1 = F_FULL(x_full, y_full)
        x_gold = -96843
        y_gold = 907
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4015 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
