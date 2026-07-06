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
def f_gold ( A , B ) :
    variable = 1
    if ( A == B ) :
        return 1
    elif ( ( B - A ) >= 5 ) :
        return 0
    else :
        for i in range ( A + 1 , B + 1 ) :
            variable = ( variable * ( i % 10 ) ) % 10
        return variable % 10


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        A_full = 7593098496429256393
        B_full = 8460482169851114595
        output_1 = F_FULL(A_full, B_full)
        A_gold = 7593098496429256393
        B_gold = 8460482169851114595
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3004 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 999999999999996118
        B_full = 999999999999990424
        output_1 = F_FULL(A_full, B_full)
        A_gold = 999999999999996118
        B_gold = 999999999999990424
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2005 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 7725676433686699099
        B_full = 2265456357291798086
        output_1 = F_FULL(A_full, B_full)
        A_gold = 7725676433686699099
        B_gold = 2265456357291798086
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2011 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 999999999999992702
        B_full = 999999999999993606
        output_1 = F_FULL(A_full, B_full)
        A_gold = 999999999999992702
        B_gold = 999999999999993606
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1007 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 8009228663009528548
        B_full = 7852630154178210738
        output_1 = F_FULL(A_full, B_full)
        A_gold = 8009228663009528548
        B_gold = 7852630154178210738
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2009 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 9223372036854775671
        B_full = 9223372036854775692
        output_1 = F_FULL(A_full, B_full)
        A_gold = 9223372036854775671
        B_gold = 9223372036854775692
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4020 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4020 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 9223372036854775250
        B_full = 9223372036854775423
        output_1 = F_FULL(A_full, B_full)
        A_gold = 9223372036854775250
        B_gold = 9223372036854775423
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4000 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 999999999999996439
        B_full = 999999999999997523
        output_1 = F_FULL(A_full, B_full)
        A_gold = 999999999999996439
        B_gold = 999999999999997523
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2003 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 999999999999999995
        B_full = 999999999999999997
        output_1 = F_FULL(A_full, B_full)
        A_gold = 999999999999999995
        B_gold = 999999999999999997
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4015 | error {e}')


    try:
        total_test_case_num += 1
        A_full = 999999999999999943
        B_full = 999999999999992405
        output_1 = F_FULL(A_full, B_full)
        A_gold = 999999999999999943
        B_gold = 999999999999992405
        output_2 = f_gold(A_gold, B_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4021 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4021 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
