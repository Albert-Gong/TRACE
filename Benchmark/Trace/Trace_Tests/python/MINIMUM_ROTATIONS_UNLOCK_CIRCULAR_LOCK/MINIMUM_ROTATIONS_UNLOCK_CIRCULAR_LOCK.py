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
def f_gold ( input , unlock_code ) :
    rotation = 0
    while ( input > 0 or unlock_code > 0 ) :
        input_digit = input % 10
        code_digit = unlock_code % 10
        rotation += min ( abs ( input_digit - code_digit ) , 10 - abs ( input_digit - code_digit ) )
        input = int ( input / 10 )
        unlock_code = int ( unlock_code / 10 )
    return rotation


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        input_full = 90909090
        unlock_code_full = 909090909
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 90909090
        unlock_code_gold = 909090909
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1010 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 999999999
        unlock_code_full = 0
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 999999999
        unlock_code_gold = 0
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2005 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 5430
        unlock_code_full = 8387
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 5430
        unlock_code_gold = 8387
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=14 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=14 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 808080808
        unlock_code_full = 90909090
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 808080808
        unlock_code_gold = 90909090
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4000 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 987654321
        unlock_code_full = 432109876
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 987654321
        unlock_code_gold = 432109876
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3005 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 565656565
        unlock_code_full = 10101010
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 565656565
        unlock_code_gold = 10101010
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3000 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 9999999
        unlock_code_full = 90909900
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 9999999
        unlock_code_gold = 90909900
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1005 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 98881009
        unlock_code_full = 1901081019
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 98881009
        unlock_code_gold = 1901081019
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2002 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 90909090
        unlock_code_full = 909090909
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 90909090
        unlock_code_gold = 909090909
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2003 | error {e}')


    try:
        total_test_case_num += 1
        input_full = 6714
        unlock_code_full = 7573
        output_1 = F_FULL(input_full, unlock_code_full)
        input_gold = 6714
        unlock_code_gold = 7573
        output_2 = f_gold(input_gold, unlock_code_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=12 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=12 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
