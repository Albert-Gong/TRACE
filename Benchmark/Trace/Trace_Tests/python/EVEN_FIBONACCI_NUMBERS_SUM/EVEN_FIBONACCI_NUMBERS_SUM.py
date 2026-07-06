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
def f_gold ( limit ) :
    if ( limit < 2 ) :
        return 0
    ef1 = 0
    ef2 = 2
    sm = ef1 + ef2
    while ( ef2 <= limit ) :
        ef3 = 4 * ef2 + ef1
        if ( ef3 > limit ) :
            break
        ef1 = ef2
        ef2 = ef3
        sm = sm + ef2
    return sm


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        limit_full = 2115205352
        output_1 = F_FULL(limit_full)
        limit_gold = 2115205352
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 9480
        output_1 = F_FULL(limit_full)
        limit_gold = 9480
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=8 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=8 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 2066015780
        output_1 = F_FULL(limit_full)
        limit_gold = 2066015780
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2000 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 1751344010
        output_1 = F_FULL(limit_full)
        limit_gold = 1751344010
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2026 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2026 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 89233073
        output_1 = F_FULL(limit_full)
        limit_gold = 89233073
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1008 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 1432659807
        output_1 = F_FULL(limit_full)
        limit_gold = 1432659807
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4010 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 1541598905
        output_1 = F_FULL(limit_full)
        limit_gold = 1541598905
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2022 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2022 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 1949565446
        output_1 = F_FULL(limit_full)
        limit_gold = 1949565446
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1021 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1021 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 2127668725
        output_1 = F_FULL(limit_full)
        limit_gold = 2127668725
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3015 | error {e}')


    try:
        total_test_case_num += 1
        limit_full = 1505982206
        output_1 = F_FULL(limit_full)
        limit_gold = 1505982206
        output_2 = f_gold(limit_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1023 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1023 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
