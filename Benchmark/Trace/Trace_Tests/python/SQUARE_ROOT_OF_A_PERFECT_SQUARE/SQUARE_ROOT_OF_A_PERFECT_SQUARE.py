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
def f_gold ( n ) :
    x = n
    y = 1
    e = 0.000001
    while ( x - y > e ) :
        x = ( x + y ) / 2
        y = n / x
    return x


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = 73623533.47226638
        output_1 = F_FULL(n_full)
        n_gold = 73623533.47226638
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4003 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 385225887424.73615
        output_1 = F_FULL(n_full)
        n_gold = 385225887424.73615
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4010 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 9.41454059722178e+34
        output_1 = F_FULL(n_full)
        n_gold = 9.41454059722178e+34
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=12 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=12 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 9999.92631405965
        output_1 = F_FULL(n_full)
        n_gold = 9999.92631405965
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=20 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=20 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2.826834633801813e+34
        output_1 = F_FULL(n_full)
        n_gold = 2.826834633801813e+34
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=14 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=14 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 9.869604401089358
        output_1 = F_FULL(n_full)
        n_gold = 9.869604401089358
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4006 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 99.837657301199
        output_1 = F_FULL(n_full)
        n_gold = 99.837657301199
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 99008.57102534463
        output_1 = F_FULL(n_full)
        n_gold = 99008.57102534463
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=5 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=5 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 9999999999.092085
        output_1 = F_FULL(n_full)
        n_gold = 9999999999.092085
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=25 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=25 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 871098319636.9991
        output_1 = F_FULL(n_full)
        n_gold = 871098319636.9991
        output_2 = f_gold(n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
