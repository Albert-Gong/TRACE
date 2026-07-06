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
def f_gold ( a , b , mod ) :
    res = 0 ;
    a = a % mod ;
    while ( b ) :
        if ( b & 1 ) :
            res = ( res + a ) % mod ;
        a = ( 2 * a ) % mod ;
        b >>= 1 ;
    return res ;


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 98
        b_full = 93
        mod_full = 4
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 98
        b_gold = 93
        mod_gold = 4
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=13 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=13 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1000000000206013839
        b_full = 1000000000473478109
        mod_full = 1000000613
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 1000000000206013839
        b_gold = 1000000000473478109
        mod_gold = 1000000613
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2023 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2023 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 1000000002085337264
        b_full = 6764607530781369041
        mod_full = 1000002667
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 1000000002085337264
        b_gold = 6764607530781369041
        mod_gold = 1000002667
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1003 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9223372036854775803
        b_full = 9223372036854775807
        mod_full = 9999999881
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 9223372036854775803
        b_gold = 9223372036854775807
        mod_gold = 9999999881
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2013 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2013 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 99
        b_full = 91
        mod_full = 3
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 99
        b_gold = 91
        mod_gold = 3
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=12 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=12 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9223372036854154456
        b_full = 9223372036854578497
        mod_full = 9999999881
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 9223372036854154456
        b_gold = 9223372036854578497
        mod_gold = 9999999881
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3021 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3021 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 951903
        b_full = 958628
        mod_full = 999991
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 951903
        b_gold = 958628
        mod_gold = 999991
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=31 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=31 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -999999993559070108
        b_full = 1152921504606846975
        mod_full = 1073741823
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = -999999993559070108
        b_gold = 1152921504606846975
        mod_gold = 1073741823
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2004 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 94935788
        b_full = 98485856
        mod_full = 99580621
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 94935788
        b_gold = 98485856
        mod_gold = 99580621
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=8 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=8 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 97161
        b_full = 94692
        mod_full = 98052
        output_1 = F_FULL(a_full, b_full, mod_full)
        a_gold = 97161
        b_gold = 94692
        mod_gold = 98052
        output_2 = f_gold(a_gold, b_gold, mod_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=29 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=29 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
