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
def f_gold ( n , m ) :
    return n if ( n == m ) else 1


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        n_full = -2147483648
        m_full = 2147483647
        output_1 = F_FULL(n_full, m_full)
        n_gold = -2147483648
        m_gold = 2147483647
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4009 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4009 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2072733890
        m_full = 2145394708
        output_1 = F_FULL(n_full, m_full)
        n_gold = 2072733890
        m_gold = 2145394708
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1001 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2118272997
        m_full = 642959952
        output_1 = F_FULL(n_full, m_full)
        n_gold = 2118272997
        m_gold = 642959952
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1011 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2127784968
        m_full = 2067381524
        output_1 = F_FULL(n_full, m_full)
        n_gold = 2127784968
        m_gold = 2067381524
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1000 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2115304215
        m_full = -1153887515
        output_1 = F_FULL(n_full, m_full)
        n_gold = 2115304215
        m_gold = -1153887515
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1012 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2110275328
        m_full = 1675592153
        output_1 = F_FULL(n_full, m_full)
        n_gold = 2110275328
        m_gold = 1675592153
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2003 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2115206610
        m_full = -2124159091
        output_1 = F_FULL(n_full, m_full)
        n_gold = 2115206610
        m_gold = -2124159091
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4000 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 2130715127
        m_full = -2146046061
        output_1 = F_FULL(n_full, m_full)
        n_gold = 2130715127
        m_gold = -2146046061
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4002 | error {e}')


    try:
        total_test_case_num += 1
        n_full = 0
        m_full = 38
        output_1 = F_FULL(n_full, m_full)
        n_gold = 0
        m_gold = 38
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1 | error {e}')


    try:
        total_test_case_num += 1
        n_full = -2147483636
        m_full = -2147483615
        output_1 = F_FULL(n_full, m_full)
        n_gold = -2147483636
        m_gold = -2147483615
        output_2 = f_gold(n_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3002 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
