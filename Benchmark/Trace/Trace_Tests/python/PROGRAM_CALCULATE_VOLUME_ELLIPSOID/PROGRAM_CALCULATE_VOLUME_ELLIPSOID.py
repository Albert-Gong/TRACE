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
def f_gold(r1, r2, r3):
    pi = 3.14
    return 1.33 * pi * r1 * r2 * r3


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        r1_full = 8.957924740738363e+30
        r2_full = 5.923620148350508e-29
        r3_full = -1.0808817837075799e+30
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 8.957924740738363e+30
        r2_gold = 5.923620148350508e-29
        r3_gold = -1.0808817837075799e+30
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4003 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 1.1749274685275178e+37
        r2_full = 8.615007044364092e-39
        r3_full = -2.1249629766435952e+30
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 1.1749274685275178e+37
        r2_gold = 8.615007044364092e-39
        r3_gold = -2.1249629766435952e+30
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2008 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 5.9446144862995754e-09
        r2_full = -7.260877485878768e+18
        r3_full = 4.874183658435854e+18
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 5.9446144862995754e-09
        r2_gold = -7.260877485878768e+18
        r3_gold = 4.874183658435854e+18
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4011 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4011 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 7.790235611313629e+30
        r2_full = 3.6992046834927626e-30
        r3_full = 98701768015.10739
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 7.790235611313629e+30
        r2_gold = 3.6992046834927626e-30
        r3_gold = 98701768015.10739
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1003 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 9014632634.776688
        r2_full = -9490263666.77976
        r3_full = 4.376523630075393e-05
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 9014632634.776688
        r2_gold = -9490263666.77976
        r3_gold = 4.376523630075393e-05
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=41 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=41 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 4.685629867727473e+18
        r2_full = -9.311275646048085e-10
        r3_full = -8.676475026178107e+18
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 4.685629867727473e+18
        r2_gold = -9.311275646048085e-10
        r3_gold = -8.676475026178107e+18
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3020 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3020 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 2.6782874390475096e+16
        r2_full = -3.736356274234843e-09
        r3_full = -1.3354383235102688e+16
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 2.6782874390475096e+16
        r2_gold = -3.736356274234843e-09
        r3_gold = -1.3354383235102688e+16
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2018 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2018 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 3.2675614796213457e+19
        r2_full = 3.665879800728433e-11
        r3_full = 904717.8990926854
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 3.2675614796213457e+19
        r2_gold = 3.665879800728433e-11
        r3_gold = 904717.8990926854
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=12 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=12 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 9444385579.06666
        r2_full = -9910856990.323572
        r3_full = 4.2331996905089524e-05
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 9444385579.06666
        r2_gold = -9910856990.323572
        r3_gold = 4.2331996905089524e-05
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=40 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=40 | error {e}')


    try:
        total_test_case_num += 1
        r1_full = 7.268880052269592e+21
        r2_full = 1.3801417172350505e-19
        r3_full = -6.007381249355851e+21
        output_1 = F_FULL(r1_full, r2_full, r3_full)
        r1_gold = 7.268880052269592e+21
        r2_gold = 1.3801417172350505e-19
        r3_gold = -6.007381249355851e+21
        output_2 = f_gold(r1_gold, r2_gold, r3_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3026 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3026 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
