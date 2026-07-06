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
def f_gold ( a , b , c , x1 , y1 ) :
    temp = - 2 * ( a * x1 + b * y1 + c ) / ( a * a + b * b )
    x = temp * a + x1
    y = temp * b + y1
    return ( x , y )


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        a_full = 7.685294791154656e-11
        b_full = 1.5518831437446743e-11
        c_full = -179448228589.8955
        x1_full = -672742135.7835337
        y1_full = 6.720574615508209e-11
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = 7.685294791154656e-11
        b_gold = 1.5518831437446743e-11
        c_gold = -179448228589.8955
        x1_gold = -672742135.7835337
        y1_gold = 6.720574615508209e-11
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4008 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9742003792016808.0
        b_full = -9562282633189108.0
        c_full = 2822274077835048.0
        x1_full = 9185754256994664.0
        y1_full = -9956161961640628.0
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = 9742003792016808.0
        b_gold = -9562282633189108.0
        c_gold = 2822274077835048.0
        x1_gold = 9185754256994664.0
        y1_gold = -9956161961640628.0
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4002 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -2.3846646296930322e-05
        b_full = 4074846.684110374
        c_full = -6042885.994576682
        x1_full = 9181702.847571846
        y1_full = -6931666.215060255
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = -2.3846646296930322e-05
        b_gold = 4074846.684110374
        c_gold = -6042885.994576682
        x1_gold = 9181702.847571846
        y1_gold = -6931666.215060255
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1005 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1005 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 61644647327.05544
        b_full = -43406187867.91716
        c_full = -5.140529090096354e-11
        x1_full = 51263013967.09892
        y1_full = -85501007635.30347
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = 61644647327.05544
        b_gold = -43406187867.91716
        c_gold = -5.140529090096354e-11
        x1_gold = 51263013967.09892
        y1_gold = -85501007635.30347
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3006 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -1.8944631510519866e-11
        b_full = -9.142550464112893e-11
        c_full = -9029348307.576582
        x1_full = -36580279.883318305
        y1_full = -3.849888940504505e-11
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = -1.8944631510519866e-11
        b_gold = -9.142550464112893e-11
        c_gold = -9029348307.576582
        x1_gold = -36580279.883318305
        y1_gold = -3.849888940504505e-11
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2004 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 6317166.752742633
        b_full = -8.025867196366796e-07
        c_full = -77079043.68687221
        x1_full = 1000000.0
        y1_full = -1000000.0
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = 6317166.752742633
        b_gold = -8.025867196366796e-07
        c_gold = -77079043.68687221
        x1_gold = 1000000.0
        y1_gold = -1000000.0
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=38 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=38 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9.597814261715304e-15
        b_full = 724572410.0918382
        c_full = 505698.38539595064
        x1_full = -379066624.5166763
        y1_full = -465096554.2651004
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = 9.597814261715304e-15
        b_gold = 724572410.0918382
        c_gold = 505698.38539595064
        x1_gold = -379066624.5166763
        y1_gold = -465096554.2651004
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=44 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=44 | error {e}')


    try:
        total_test_case_num += 1
        a_full = -6.163710127618262e-07
        b_full = -100.0
        c_full = -99.43354555441161
        x1_full = 2.3466744283929586
        y1_full = -0.5559758479603638
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = -6.163710127618262e-07
        b_gold = -100.0
        c_gold = -99.43354555441161
        x1_gold = 2.3466744283929586
        y1_gold = -0.5559758479603638
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 478476.0974605188
        b_full = 32201.45062067802
        c_full = -7.467092143017232e-08
        x1_full = 26923.706814737874
        y1_full = -646459.1122254354
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = 478476.0974605188
        b_gold = 32201.45062067802
        c_gold = -7.467092143017232e-08
        x1_gold = 26923.706814737874
        y1_gold = -646459.1122254354
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=6 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=6 | error {e}')


    try:
        total_test_case_num += 1
        a_full = 9999999999.27882
        b_full = -9999999999.428091
        c_full = 7028846294.313654
        x1_full = 9999999999.533726
        y1_full = -9999999999.59726
        output_1 = F_FULL(a_full, b_full, c_full, x1_full, y1_full)
        a_gold = 9999999999.27882
        b_gold = -9999999999.428091
        c_gold = 7028846294.313654
        x1_gold = 9999999999.533726
        y1_gold = -9999999999.59726
        output_2 = f_gold(a_gold, b_gold, c_gold, x1_gold, y1_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=10 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=10 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
