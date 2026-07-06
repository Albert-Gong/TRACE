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
def f_gold ( x1 , y1 , x2 , y2 , r1 , r2 ) :
    distSq = ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 )
    radSumSq = ( r1 + r2 ) * ( r1 + r2 )
    if ( distSq == radSumSq ) :
        return 1
    elif ( distSq > radSumSq ) :
        return - 1
    else :
        return 0


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        x1_full = 2138169063
        y1_full = -2138094001
        x2_full = 1999999972
        y2_full = -1999999906
        r1_full = 1999999917
        r2_full = 1999999926
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = 2138169063
        y1_gold = -2138094001
        x2_gold = 1999999972
        y2_gold = -1999999906
        r1_gold = 1999999917
        r2_gold = 1999999926
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2000 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 2065518896
        y1_full = -2030498228
        x2_full = 1999999982
        y2_full = -1999999964
        r1_full = 1999999981
        r2_full = 1999999929
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = 2065518896
        y1_gold = -2030498228
        x2_gold = 1999999982
        y2_gold = -1999999964
        r1_gold = 1999999981
        r2_gold = 1999999929
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2001 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = -100
        y1_full = -100
        x2_full = -100
        y2_full = 100
        r1_full = 95
        r2_full = 93
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = -100
        y1_gold = -100
        x2_gold = -100
        y2_gold = 100
        r1_gold = 95
        r2_gold = 93
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=13 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=13 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 2147483647
        y1_full = -2147483648
        x2_full = -2147483647
        y2_full = 0
        r1_full = 1073741824
        r2_full = 1073741823
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = 2147483647
        y1_gold = -2147483648
        x2_gold = -2147483647
        y2_gold = 0
        r1_gold = 1073741824
        r2_gold = 1073741823
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3015 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 2147483094
        y1_full = -2147483559
        x2_full = 2147482501
        y2_full = -2147482198
        r1_full = 1226582117
        r2_full = 1450316828
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = 2147483094
        y1_gold = -2147483559
        x2_gold = 2147482501
        y2_gold = -2147482198
        r1_gold = 1226582117
        r2_gold = 1450316828
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4011 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = -100000000
        y1_full = 100000000
        x2_full = 100000000
        y2_full = -100000000
        r1_full = 100000000
        r2_full = 100000001
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = -100000000
        y1_gold = 100000000
        x2_gold = 100000000
        y2_gold = -100000000
        r1_gold = 100000000
        r2_gold = 100000001
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1017 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1017 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 1624
        y1_full = 9597
        x2_full = 5095
        y2_full = 1165
        r1_full = 9993
        r2_full = 9991
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = 1624
        y1_gold = 9597
        x2_gold = 5095
        y2_gold = 1165
        r1_gold = 9993
        r2_gold = 9991
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=16 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=16 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 2147483647
        y1_full = 0
        x2_full = -2147483647
        y2_full = 2147483647
        r1_full = 0
        r2_full = 0
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = 2147483647
        y1_gold = 0
        x2_gold = -2147483647
        y2_gold = 2147483647
        r1_gold = 0
        r2_gold = 0
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3001 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = -2147483647
        y1_full = -2147483647
        x2_full = 0
        y2_full = 2147483647
        r1_full = 1
        r2_full = 1
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = -2147483647
        y1_gold = -2147483647
        x2_gold = 0
        y2_gold = 2147483647
        r1_gold = 1
        r2_gold = 1
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4013 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4013 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 3793
        y1_full = -8132
        x2_full = 7817
        y2_full = 246
        r1_full = 9023
        r2_full = 9229
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full, r1_full, r2_full)
        x1_gold = 3793
        y1_gold = -8132
        x2_gold = 7817
        y2_gold = 246
        r1_gold = 9023
        r2_gold = 9229
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold, r1_gold, r2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=5 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=5 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
