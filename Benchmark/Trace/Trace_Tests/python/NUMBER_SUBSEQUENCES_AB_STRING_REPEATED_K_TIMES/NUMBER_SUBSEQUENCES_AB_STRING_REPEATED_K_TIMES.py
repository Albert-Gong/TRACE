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
def f_gold ( s , K ) :
    n = len ( s )
    c1 = 0
    c2 = 0
    C = 0
    for i in range ( n ) :
        if s [ i ] == 'a' :
            c1 += 1
        if s [ i ] == 'b' :
            c2 += 1
            C += c1
    return C * K + int ( K * ( K - 1 ) / 2 ) * c1 * c2


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        s_full = 'aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbb'
        K_full = 99
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbb'
        K_gold = 99
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4004 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4004 | error {e}')


    try:
        total_test_case_num += 1
        s_full = 'abababababababababababababababababababababababababababababababababababababababababababababababababab'
        K_full = 1000
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'abababababababababababababababababababababababababababababababababababababababababababababababababab'
        K_gold = 1000
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2000 | error {e}')


    try:
        total_test_case_num += 1
        s_full = 'aabbbbbabbbababbaabaabaabbbbbbaaababbabbabbbabbbababbabbbbabbaabbabaabababbbabbbaabbaabaababaaababba'
        K_full = 100
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'aabbbbbabbbababbaabaabaabbbbbbaaababbabbabbbabbbababbabbbbabbaabbabaabababbbabbbaabbaabaababaaababba'
        K_gold = 100
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=19 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=19 | error {e}')


    try:
        total_test_case_num += 1
        s_full = 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb'
        K_full = 100
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb'
        K_gold = 100
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        s_full = 'xxxxbaxyzxazyzybzyzbbzxxyyazyxaxyzzybyyyazaxxxybayabxazbbyyzzyzabxxzzaxzbzxzzyyyxybayyzaayaabzxyayxb'
        K_full = 100
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'xxxxbaxyzxazyzybzyzbbzxxyyazyxaxyzzybyyyazaxxxybayabxazbbyyzzyzabxxzzaxzbzxzzyyyxybayyzaayaabzxyayxb'
        K_gold = 100
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=12 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=12 | error {e}')


    try:
        total_test_case_num += 1
        s_full = 'xyxbxbyaxayyaxyaaaxzyzbaabzyzxbxzzxybzbbyyyxyxbbyzbxyyxyayxbxbxbxzbxyxbyxybyxazyybbbybaxbbayxxzzbaxz'
        K_full = 100
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'xyxbxbyaxayyaxyaaaxzyzbaabzyzxbxzzxybzbbyyyxyxbbyzbxyyxyayxbxbxbxzbxyxbyxybyxazyybbbybaxbbayxxzzbaxz'
        K_gold = 100
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=13 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=13 | error {e}')


    try:
        total_test_case_num += 1
        s_full = 'bbbbbaabbbabbaababaaabbaaaaaaabaabbabaababaaaaabaabbbbabbaabaaabbbaaabbababbbbabbbabaaaaabbbbaabbbbb'
        K_full = 100
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'bbbbbaabbbabbaababaaabbaaaaaaabaabbabaababaaaaabaabbbbabbaabaaabbbaaabbababbbbabbbabaaaaabbbbaabbbbb'
        K_gold = 100
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=18 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=18 | error {e}')


    try:
        total_test_case_num += 1
        s_full = 'ayaabxyzbxbbabbxzyyaabazxbabxbxyazzybxzazzaxxyxaxybzayxzaxzxbbaxbazbzaxyyyaxaxaabaybyyyzzyybaayyaaxy'
        K_full = 100
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'ayaabxyzbxbbabbxzyyaabazxbabxbxyazzybxzazzaxxyxaxybzayxzaxzxbbaxbazbzaxyyyaxaxaabaybyyyzzyybaayyaaxy'
        K_gold = 100
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=11 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=11 | error {e}')


    try:
        total_test_case_num += 1
        s_full = 'ababaababaabaaabbbbbabaabababbbaababaaabbbabbbaaabaaabbbbbbbbaabaaababbbbaaabbbbbababaaaabbbaabaabaa'
        K_full = 100
        output_1 = F_FULL(s_full, K_full)
        s_gold = 'ababaababaabaaabbbbbabaabababbbaababaaabbbabbbaaabaaabbbbbbbbaabaaababbbbaaabbbbbababaaaabbbaabaabaa'
        K_gold = 100
        output_2 = f_gold(s_gold, K_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=17 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=17 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
