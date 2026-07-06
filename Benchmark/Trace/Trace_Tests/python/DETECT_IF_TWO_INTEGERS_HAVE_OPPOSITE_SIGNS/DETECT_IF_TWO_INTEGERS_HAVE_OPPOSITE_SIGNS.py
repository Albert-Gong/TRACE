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
    return ( ( x ^ y ) < 0 )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        x_full = 2096137744
        y_full = -1961436016
        output_1 = F_FULL(x_full, y_full)
        x_gold = 2096137744
        y_gold = -1961436016
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1009 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -1492426913
        y_full = 1598788669
        output_1 = F_FULL(x_full, y_full)
        x_gold = -1492426913
        y_gold = 1598788669
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1001 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 92
        y_full = -41
        output_1 = F_FULL(x_full, y_full)
        x_gold = 92
        y_gold = -41
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=21 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=21 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -1716919631
        y_full = 1556685507
        output_1 = F_FULL(x_full, y_full)
        x_gold = -1716919631
        y_gold = 1556685507
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1002 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2147482669
        y_full = -2147483435
        output_1 = F_FULL(x_full, y_full)
        x_gold = 2147482669
        y_gold = -2147483435
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1012 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 1073741824
        y_full = -1073741824
        output_1 = F_FULL(x_full, y_full)
        x_gold = 1073741824
        y_gold = -1073741824
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
        x_full = 1380776516
        y_full = -1317866956
        output_1 = F_FULL(x_full, y_full)
        x_gold = 1380776516
        y_gold = -1317866956
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2004 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2147483647
        y_full = -2147483648
        output_1 = F_FULL(x_full, y_full)
        x_gold = 2147483647
        y_gold = -2147483648
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2006 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -9919
        y_full = 9918
        output_1 = F_FULL(x_full, y_full)
        x_gold = -9919
        y_gold = 9918
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=13 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=13 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 1073741823
        y_full = -1073741824
        output_1 = F_FULL(x_full, y_full)
        x_gold = 1073741823
        y_gold = -1073741824
        output_2 = f_gold(x_gold, y_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2008 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
