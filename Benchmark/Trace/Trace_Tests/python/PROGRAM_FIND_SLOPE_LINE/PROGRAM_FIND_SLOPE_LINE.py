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
def f_gold ( x1 , y1 , x2 , y2 ) :
    return ( float ) ( y2 - y1 ) / ( x2 - x1 )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        x1_full = 3.0900687134707903e+37
        y1_full = 1.0829336251013693e+37
        x2_full = 1.5284814896570398e+37
        y2_full = 5.737310675072494e+37
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = 3.0900687134707903e+37
        y1_gold = 1.0829336251013693e+37
        x2_gold = 1.5284814896570398e+37
        y2_gold = 5.737310675072494e+37
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2016 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2016 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 5.531393233980346e+37
        y1_full = 2.324903829907704e+37
        x2_full = 3.685713789099103e+37
        y2_full = -1.4708132780547008e+37
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = 5.531393233980346e+37
        y1_gold = 2.324903829907704e+37
        x2_gold = 3.685713789099103e+37
        y2_gold = -1.4708132780547008e+37
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4005 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 1.8696439163622355e+38
        y1_full = 8.757262088561975e-39
        x2_full = 1.969971609043752e+38
        y2_full = -1.525303064221259e+38
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = 1.8696439163622355e+38
        y1_gold = 8.757262088561975e-39
        x2_gold = 1.969971609043752e+38
        y2_gold = -1.525303064221259e+38
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1012 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1012 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 7.119979391011372e+37
        y1_full = 4.355754790183045e+37
        x2_full = 8.722028684112312e+37
        y2_full = -8.21917248171363e+37
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = 7.119979391011372e+37
        y1_gold = 4.355754790183045e+37
        x2_gold = 8.722028684112312e+37
        y2_gold = -8.21917248171363e+37
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2017 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2017 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 1.1685621204219505e+38
        y1_full = 8.312269954450696e-39
        x2_full = 1.87605038524397e+38
        y2_full = -1.4992018488217996e+38
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = 1.1685621204219505e+38
        y1_gold = 8.312269954450696e-39
        x2_gold = 1.87605038524397e+38
        y2_gold = -1.4992018488217996e+38
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1013 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1013 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 6470059807.500873
        y1_full = 8.578013395014025e+18
        x2_full = 4044924777.865667
        y2_full = -1.9379742464866191e+18
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = 6470059807.500873
        y1_gold = 8.578013395014025e+18
        x2_gold = 4044924777.865667
        y2_gold = -1.9379742464866191e+18
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4026 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4026 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = 3037885798.2031193
        y1_full = 3015151725.9881706
        x2_full = -3211914941.0724955
        y2_full = -92336400.96300316
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = 3037885798.2031193
        y1_gold = 3015151725.9881706
        x2_gold = -3211914941.0724955
        y2_gold = -92336400.96300316
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=42 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=42 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = -6.4281999144723e+18
        y1_full = -2.8180705706937324e-10
        x2_full = -7.855950553978227e+18
        y2_full = 7.014057335765333e+20
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = -6.4281999144723e+18
        y1_gold = -2.8180705706937324e-10
        x2_gold = -7.855950553978227e+18
        y2_gold = 7.014057335765333e+20
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2023 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2023 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = -8.284887626035843e+36
        y1_full = 9.123201549886568e+29
        x2_full = 8.134394986079135e+37
        y2_full = -8.759661410187233e+37
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = -8.284887626035843e+36
        y1_gold = 9.123201549886568e+29
        x2_gold = 8.134394986079135e+37
        y2_gold = -8.759661410187233e+37
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4014 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4014 | error {e}')


    try:
        total_test_case_num += 1
        x1_full = -5.8952534273874405e+37
        y1_full = -7.769307649324183e+37
        x2_full = 4.765078399979127e+37
        y2_full = -4.791187943910625e+36
        output_1 = F_FULL(x1_full, y1_full, x2_full, y2_full)
        x1_gold = -5.8952534273874405e+37
        y1_gold = -7.769307649324183e+37
        x2_gold = 4.765078399979127e+37
        y2_gold = -4.791187943910625e+36
        output_2 = f_gold(x1_gold, y1_gold, x2_gold, y2_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1010 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1010 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
