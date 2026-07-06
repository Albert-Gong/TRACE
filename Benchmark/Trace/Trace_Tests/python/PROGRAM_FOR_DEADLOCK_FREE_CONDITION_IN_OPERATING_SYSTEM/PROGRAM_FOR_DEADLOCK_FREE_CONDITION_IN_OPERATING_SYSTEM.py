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
def f_gold ( process , need ) :
    minResources = 0
    minResources = process * ( need - 1 ) + 1
    return minResources


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        process_full = 9646478
        need_full = 2
        output_1 = F_FULL(process_full, need_full)
        process_gold = 9646478
        need_gold = 2
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4007 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 1625177715
        need_full = 2
        output_1 = F_FULL(process_full, need_full)
        process_gold = 1625177715
        need_gold = 2
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2020 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2020 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 9209554
        need_full = 2
        output_1 = F_FULL(process_full, need_full)
        process_gold = 9209554
        need_gold = 2
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4006 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 206829476
        need_full = 3
        output_1 = F_FULL(process_full, need_full)
        process_gold = 206829476
        need_gold = 3
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1003 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 201298332
        need_full = 3
        output_1 = F_FULL(process_full, need_full)
        process_gold = 201298332
        need_gold = 3
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1004 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 192757193
        need_full = 4
        output_1 = F_FULL(process_full, need_full)
        process_gold = 192757193
        need_gold = 4
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2015 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 10000
        need_full = 10000
        output_1 = F_FULL(process_full, need_full)
        process_gold = 10000
        need_gold = 10000
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 1916977211
        need_full = 2
        output_1 = F_FULL(process_full, need_full)
        process_gold = 1916977211
        need_gold = 2
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2003 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 114904544
        need_full = 2
        output_1 = F_FULL(process_full, need_full)
        process_gold = 114904544
        need_gold = 2
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4026 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4026 | error {e}')


    try:
        total_test_case_num += 1
        process_full = 1703752529
        need_full = 2
        output_1 = F_FULL(process_full, need_full)
        process_gold = 1703752529
        need_gold = 2
        output_2 = f_gold(process_gold, need_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4011 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
