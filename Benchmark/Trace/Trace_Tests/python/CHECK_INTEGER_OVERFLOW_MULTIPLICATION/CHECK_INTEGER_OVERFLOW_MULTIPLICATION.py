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
    if ( a == 0 or b == 0 ) :
        return False
    result = a * b
    if ( a == ( result // b ) ) :
        return False
    else :
        return True


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = -9999
        b_full = 10000
        output_1 = F_FULL(a_full, b_full)
        a_gold = -9999
        b_gold = 10000
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=10 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=10 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 99999999
        b_full = -99999999
        output_1 = F_FULL(a_full, b_full)
        a_gold = 99999999
        b_gold = -99999999
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=15 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=15 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 5859334316188597562
        b_full = 1
        output_1 = F_FULL(a_full, b_full)
        a_gold = 5859334316188597562
        b_gold = 1
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 3663874269
        b_full = 2147448571
        output_1 = F_FULL(a_full, b_full)
        a_gold = 3663874269
        b_gold = 2147448571
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1005 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 100
        b_full = 100
        output_1 = F_FULL(a_full, b_full)
        a_gold = 100
        b_gold = 100
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=8 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=8 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 4611686018427387903
        b_full = 2
        output_1 = F_FULL(a_full, b_full)
        a_gold = 4611686018427387903
        b_gold = 2
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1009 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -6017773807600572559
        b_full = -1
        output_1 = F_FULL(a_full, b_full)
        a_gold = -6017773807600572559
        b_gold = -1
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4013 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4013 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9999
        b_full = -10000
        output_1 = F_FULL(a_full, b_full)
        a_gold = 9999
        b_gold = -10000
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
        a_full = 9999999
        b_full = 9999999
        output_1 = F_FULL(a_full, b_full)
        a_gold = 9999999
        b_gold = 9999999
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
        a_full = 100
        b_full = -100
        output_1 = F_FULL(a_full, b_full)
        a_gold = 100
        b_gold = -100
        output_2 = f_gold(a_gold, b_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=9 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=9 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
