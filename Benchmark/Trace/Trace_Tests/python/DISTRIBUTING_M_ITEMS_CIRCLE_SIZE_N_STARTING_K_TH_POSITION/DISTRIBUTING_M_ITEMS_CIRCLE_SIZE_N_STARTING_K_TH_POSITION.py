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
def f_gold ( n , m , k ) :
    if ( m <= n - k + 1 ) :
        return m + k - 1
    m = m - ( n - k + 1 )
    if ( m % n == 0 ) :
        return n
    else :
        return m % n


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = 19191468
        m_full = 68863347
        k_full = 85693583
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 19191468
        m_gold = 68863347
        k_gold = 85693583
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3002 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 909310
        m_full = 1022956
        k_full = 911215
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 909310
        m_gold = 1022956
        k_gold = 911215
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1024 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1024 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 948957804
        m_full = 1864995703
        k_full = 935330228
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 948957804
        m_gold = 1864995703
        k_gold = 935330228
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2020 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2020 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 92392278
        m_full = 82882865
        k_full = 94788698
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 92392278
        m_gold = 82882865
        k_gold = 94788698
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1007 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 92169994
        m_full = 117791748
        k_full = 92510581
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 92169994
        m_gold = 117791748
        k_gold = 92510581
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1008 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 1000000000
        m_full = 999992384
        k_full = 999995465
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 1000000000
        m_gold = 999992384
        k_gold = 999995465
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=23 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=23 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 984414
        m_full = 1119959
        k_full = 47
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 984414
        m_gold = 1119959
        k_gold = 47
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3023 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3023 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 953757
        m_full = 906732
        k_full = 982361
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 953757
        m_gold = 906732
        k_gold = 982361
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 100
        m_full = 91
        k_full = 98
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 100
        m_gold = 91
        k_gold = 98
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=15 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=15 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 99539
        m_full = 581399
        k_full = 99185
        output_1 = F_FULL(n_full, m_full, k_full)
        n_gold = 99539
        m_gold = 581399
        k_gold = 99185
        output_2 = f_gold(n_gold, m_gold, k_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2006 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
