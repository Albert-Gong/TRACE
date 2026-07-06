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
def f_gold ( seq ) :
    n = len ( seq )
    if ( n >= 9 ) :
        return "-1"
    result = [ None ] * ( n + 1 )
    count = 1
    for i in range ( n + 1 ) :
        if ( i == n or seq [ i ] == 'I' ) :
            for j in range ( i - 1 , - 2 , - 1 ) :
                result [ j + 1 ] = int ( '0' + str ( count ) )
                count += 1
                if ( j >= 0 and seq [ j ] == 'I' ) :
                    break
    return "".join(str(i) for i in result)


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        seq_full = 'IDIDDIID'
        output_1 = F_FULL(seq_full)
        seq_gold = 'IDIDDIID'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=10 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=10 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'DDDDDDII'
        output_1 = F_FULL(seq_full)
        seq_gold = 'DDDDDDII'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1004 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'IDIDIDID'
        output_1 = F_FULL(seq_full)
        seq_gold = 'IDIDIDID'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'DIDIDIDI'
        output_1 = F_FULL(seq_full)
        seq_gold = 'DIDIDIDI'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1002 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'DDDIID'
        output_1 = F_FULL(seq_full)
        seq_gold = 'DDDIID'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4003 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'IIDDDDDI'
        output_1 = F_FULL(seq_full)
        seq_gold = 'IIDDDDDI'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=26 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=26 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'IIDDIDDD'
        output_1 = F_FULL(seq_full)
        seq_gold = 'IIDDIDDD'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=18 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=18 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'DDDDIDDI'
        output_1 = F_FULL(seq_full)
        seq_gold = 'DDDDIDDI'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2009 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'DIDIDIDI'
        output_1 = F_FULL(seq_full)
        seq_gold = 'DIDIDIDI'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3006 | error {e}')


    try:
        total_test_case_num += 1
        seq_full = 'IIDIIDDD'
        output_1 = F_FULL(seq_full)
        seq_gold = 'IIDIIDDD'
        output_2 = f_gold(seq_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3005 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
