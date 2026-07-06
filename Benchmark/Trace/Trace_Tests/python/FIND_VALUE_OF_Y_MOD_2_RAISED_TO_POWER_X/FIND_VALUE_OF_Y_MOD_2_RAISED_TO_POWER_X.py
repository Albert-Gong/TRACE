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
def f_gold ( y , x ) :
    return ( y % pow ( 2 , x ) )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        y_full = 8876791269280414142
        x_full = 63
        output_1 = F_FULL(y_full, x_full)
        y_gold = 8876791269280414142
        x_gold = 63
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1005 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 9034209626714855812
        x_full = 63
        output_1 = F_FULL(y_full, x_full)
        y_gold = 9034209626714855812
        x_gold = 63
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4004 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 910177866140909
        x_full = 63
        output_1 = F_FULL(y_full, x_full)
        y_gold = 910177866140909
        x_gold = 63
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1009 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 907355537855569
        x_full = 62
        output_1 = F_FULL(y_full, x_full)
        y_gold = 907355537855569
        x_gold = 62
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1008 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 9223372015297165911
        x_full = 63
        output_1 = F_FULL(y_full, x_full)
        y_gold = 9223372015297165911
        x_gold = 63
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1015 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 20084059676846795
        x_full = 63
        output_1 = F_FULL(y_full, x_full)
        y_gold = 20084059676846795
        x_gold = 63
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 92233720368547758
        x_full = 63
        output_1 = F_FULL(y_full, x_full)
        y_gold = 92233720368547758
        x_gold = 63
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4001 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 9010804937663010435
        x_full = 64
        output_1 = F_FULL(y_full, x_full)
        y_gold = 9010804937663010435
        x_gold = 64
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4005 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 12354796953995871
        x_full = 65
        output_1 = F_FULL(y_full, x_full)
        y_gold = 12354796953995871
        x_gold = 65
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4010 | error {e}')


    try:
        total_test_case_num += 1
        y_full = 81797332857431250
        x_full = 63
        output_1 = F_FULL(y_full, x_full)
        y_gold = 81797332857431250
        x_gold = 63
        output_2 = f_gold(y_gold, x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4018 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4018 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
