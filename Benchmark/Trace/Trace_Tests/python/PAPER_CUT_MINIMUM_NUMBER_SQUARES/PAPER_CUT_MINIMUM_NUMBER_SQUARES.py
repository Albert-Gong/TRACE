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
    result = 0
    rem = 0
    if ( a < b ) :
        a , b = b , a
    while ( b > 0 ) :
        result += int ( a / b )
        rem = int ( a % b )
        a = b
        b = rem
    return result


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 90462
        b_full = 87611
        output_1 = F_FULL(a_full, b_full)
        a_gold = 90462
        b_gold = 87611
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=16 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=16 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 990318408
        b_full = 1328767776
        output_1 = F_FULL(a_full, b_full)
        a_gold = 990318408
        b_gold = 1328767776
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4017 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4017 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2095308702
        b_full = 1415419092
        output_1 = F_FULL(a_full, b_full)
        a_gold = 2095308702
        b_gold = 1415419092
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1000 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 911411
        b_full = 948882
        output_1 = F_FULL(a_full, b_full)
        a_gold = 911411
        b_gold = 948882
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=19 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=19 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 2146897614
        b_full = 1557126589
        output_1 = F_FULL(a_full, b_full)
        a_gold = 2146897614
        b_gold = 1557126589
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
        a_full = 99742
        b_full = 75025
        output_1 = F_FULL(a_full, b_full)
        a_gold = 99742
        b_gold = 75025
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
        a_full = 1766615289
        b_full = 1186819144
        output_1 = F_FULL(a_full, b_full)
        a_gold = 1766615289
        b_gold = 1186819144
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 91690
        b_full = 75025
        output_1 = F_FULL(a_full, b_full)
        a_gold = 91690
        b_gold = 75025
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1757905814
        b_full = 962804704
        output_1 = F_FULL(a_full, b_full)
        a_gold = 1757905814
        b_gold = 962804704
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=11 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=11 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 93
        b_full = 2
        output_1 = F_FULL(a_full, b_full)
        a_gold = 93
        b_gold = 2
        output_2 = f_gold(a_gold, b_gold)
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
