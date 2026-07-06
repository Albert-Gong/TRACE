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
def f_gold ( h , m ) :
    if ( h < 0 or m < 0 or h > 12 or m > 60 ) :
        print ( 'Wrong input' )
    if ( h == 12 ) :
        h = 0
    if ( m == 60 ) :
        m = 0
    hour_angle = int ( 0.5 * ( h * 60 + m ) )
    minute_angle = int ( 6 * m )
    angle = abs ( hour_angle - minute_angle )
    angle = min ( 360 - angle , angle )
    return angle


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        h_full = 11.997214952036671
        m_full = 59.99106247440689
        output_1 = F_FULL(h_full, m_full)
        h_gold = 11.997214952036671
        m_gold = 59.99106247440689
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=28 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=28 | error {e}')


    try:
        total_test_case_num += 1
        h_full = 11.999999935740405
        m_full = 59.99999998190491
        output_1 = F_FULL(h_full, m_full)
        h_gold = 11.999999935740405
        m_gold = 59.99999998190491
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1003 | error {e}')


    try:
        total_test_case_num += 1
        h_full = -1.0
        m_full = 0.0
        output_1 = F_FULL(h_full, m_full)
        h_gold = -1.0
        m_gold = 0.0
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3 | error {e}')


    try:
        total_test_case_num += 1
        h_full = 11.999999999999
        m_full = 30.999999999999
        output_1 = F_FULL(h_full, m_full)
        h_gold = 11.999999999999
        m_gold = 30.999999999999
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1000 | error {e}')


    try:
        total_test_case_num += 1
        h_full = 11.99999993899401
        m_full = 59.999999935966805
        output_1 = F_FULL(h_full, m_full)
        h_gold = 11.99999993899401
        m_gold = 59.999999935966805
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1005 | error {e}')


    try:
        total_test_case_num += 1
        h_full = 12.0
        m_full = 59.9999
        output_1 = F_FULL(h_full, m_full)
        h_gold = 12.0
        m_gold = 59.9999
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3008 | error {e}')


    try:
        total_test_case_num += 1
        h_full = 11.999999939906074
        m_full = 59.99999964068582
        output_1 = F_FULL(h_full, m_full)
        h_gold = 11.999999939906074
        m_gold = 59.99999964068582
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=32 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=32 | error {e}')


    try:
        total_test_case_num += 1
        h_full = 11.999215828444992
        m_full = 59.999042022784344
        output_1 = F_FULL(h_full, m_full)
        h_gold = 11.999215828444992
        m_gold = 59.999042022784344
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2024 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2024 | error {e}')


    try:
        total_test_case_num += 1
        h_full = 11.995347035207441
        m_full = 59.997731792024275
        output_1 = F_FULL(h_full, m_full)
        h_gold = 11.995347035207441
        m_gold = 59.997731792024275
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3020 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3020 | error {e}')


    try:
        total_test_case_num += 1
        h_full = 0.0001367216433004209
        m_full = 0.0002866828475777118
        output_1 = F_FULL(h_full, m_full)
        h_gold = 0.0001367216433004209
        m_gold = 0.0002866828475777118
        output_2 = f_gold(h_gold, m_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1015 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
