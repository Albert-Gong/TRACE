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
def f_gold ( x ) :
    res = 0
    count = 0
    count += 1
    if ( count == 1 ) :
        res = x
    else :
        i = random.randrange ( count )
        if ( i == count - 1 ) :
            res = x
    return res


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        x_full = 10000
        output_1 = F_FULL(x_full)
        x_gold = 10000
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=26 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=26 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -22
        output_1 = F_FULL(x_full)
        x_gold = -22
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=24 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=24 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 9081772078080693284
        output_1 = F_FULL(x_full)
        x_gold = 9081772078080693284
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2006 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 7332855194157312599
        output_1 = F_FULL(x_full)
        x_gold = 7332855194157312599
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2005 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 8788099571201816063
        output_1 = F_FULL(x_full)
        x_gold = 8788099571201816063
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2004 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 41086054
        output_1 = F_FULL(x_full)
        x_gold = 41086054
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=6 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=6 | error {e}')


    try:
        total_test_case_num += 1
        x_full = -58
        output_1 = F_FULL(x_full)
        x_gold = -58
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=25 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=25 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 100000000
        output_1 = F_FULL(x_full)
        x_gold = 100000000
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=27 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=27 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 3263207666457125850
        output_1 = F_FULL(x_full)
        x_gold = 3263207666457125850
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1003 | error {e}')


    try:
        total_test_case_num += 1
        x_full = 2293897314312002322
        output_1 = F_FULL(x_full)
        x_gold = 2293897314312002322
        output_2 = f_gold(x_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3004 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
