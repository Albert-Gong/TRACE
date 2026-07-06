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
def f_gold ( arr , n ) :
    for i in range ( n - 1 , 0 , - 1 ) :
        j = random.randint ( 0 , i + 1 )
        arr [ i ] , arr [ j ] = arr [ j ] , arr [ i ]
    return arr


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        arr_full = [325212]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [325212]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2001 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [768264]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [768264]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2002 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [575136]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [575136]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2008 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [100]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [100]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1000 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [-671458]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [-671458]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2004 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [33]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [33]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1002 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [521255]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [521255]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2000 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [745257861481]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [745257861481]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3002 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [975893432106]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [975893432106]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3001 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [99]
        n_full = 1
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [99]
        n_gold = 1
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1001 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
