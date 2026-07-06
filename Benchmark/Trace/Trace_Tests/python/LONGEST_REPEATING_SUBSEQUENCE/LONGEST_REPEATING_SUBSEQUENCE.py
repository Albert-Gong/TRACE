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
def f_gold ( str ) :
    n = len ( str )
    dp = [ [ 0 ] * ( n + 1 ) ] * ( n + 1 )
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , n + 1 ) :
            if ( str [ i - 1 ] == str [ j - 1 ] and i != j ) :
                dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ]
            else :
                dp [ i ] [ j ] = max ( dp [ i ] [ j - 1 ] , dp [ i - 1 ] [ j ] )
    return dp [ n ] [ n ]


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        str_full = 'ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababfjhLjwLFrJKEB5scFSCxhNtgBGKfrlqdkkAOg2r2sRo07R42iUxxxxxxxxxx'
        output_1 = F_FULL(str_full)
        str_gold = 'ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababfjhLjwLFrJKEB5scFSCxhNtgBGKfrlqdkkAOg2r2sRo07R42iUxxxxxxxxxx'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2022 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2022 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababDbvugruCfB19WvKPBUFmgzxVlBqWyBzEOZiCa3cHIEt39NfIC2xxxxxxxxxx'
        output_1 = F_FULL(str_full)
        str_gold = 'ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababDbvugruCfB19WvKPBUFmgzxVlBqWyBzEOZiCa3cHIEt39NfIC2xxxxxxxxxx'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2023 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2023 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzcabcabcabcabcabcabcabcabcabcabedfedfedfedfedfedfedfedfedfedfgihgihgihgihgihgihgihgihgihgihjkljkljkljkljkljkljkljkljkljklnomnomnomnomnomnomnomnomnomnompqrpqrpqrpqrpqrpqrpqrpqrpqrpqrsutsutsutsutsutsutsutsutsutsutxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwzyzyzyzyzyzyzyzyzyzy'
        output_1 = F_FULL(str_full)
        str_gold = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzcabcabcabcabcabcabcabcabcabcabedfedfedfedfedfedfedfedfedfedfgihgihgihgihgihgihgihgihgihgihjkljkljkljkljkljkljkljkljkljklnomnomnomnomnomnomnomnomnomnompqrpqrpqrpqrpqrpqrpqrpqrpqrpqrsutsutsutsutsutsutsutsutsutsutxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwzyzyzyzyzyzyzyzyzyzy'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4008 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4008 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'xyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyza'
        output_1 = F_FULL(str_full)
        str_gold = 'xyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyza'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3015 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3015 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456EBF52CA641D3AFCB36124D5ECD614E53AB2F3B62'
        output_1 = F_FULL(str_full)
        str_gold = 'ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456EBF52CA641D3AFCB36124D5ECD614E53AB2F3B62'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4014 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4014 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh12345678123456781234567812345678123456781234567812345678123456781234567812345678ABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxfbacehgdfbacehgdfbacehgdfbacehgdfbacehgd7164853271648532716485327164853271648532GFAHEBDCGFAHEBDCGFAHEBDCGFAHEBDCGFAHEBDCoklnmpjioklnmpjioklnmpjioklnmpjioklnmpjirwtvxqusrwtvxqusrwtvxqusrwtvxqusrwtvxqus'
        output_1 = F_FULL(str_full)
        str_gold = 'abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh12345678123456781234567812345678123456781234567812345678123456781234567812345678ABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxfbacehgdfbacehgdfbacehgdfbacehgdfbacehgd7164853271648532716485327164853271648532GFAHEBDCGFAHEBDCGFAHEBDCGFAHEBDCGFAHEBDCoklnmpjioklnmpjioklnmpjioklnmpjioklnmpjirwtvxqusrwtvxqusrwtvxqusrwtvxqusrwtvxqus'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2003 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2003 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighighighighighighighighighighighi123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123456456456456456456456456456456456456456456456456456456456456456456456456456456456456456456789789789789789789789789789789789789789789789789789789789789789789789789789789789789789789cabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgih321321321321321321321321321321321321321321321321321321321321564564564564564564564564564564564564564564564564564564564564789789789789789789789789789789789789789789789789789789789789'
        output_1 = F_FULL(str_full)
        str_gold = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighighighighighighighighighighighi123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123456456456456456456456456456456456456456456456456456456456456456456456456456456456456456456789789789789789789789789789789789789789789789789789789789789789789789789789789789789789789cabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgih321321321321321321321321321321321321321321321321321321321321564564564564564564564564564564564564564564564564564564564564789789789789789789789789789789789789789789789789789789789789'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4019 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4019 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighighighighighighighighighighighi123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123456456456456456456456456456456456456456456456456456456456456456456456456456456456456456456789789789789789789789789789789789789789789789789789789789789789789789789789789789789789789bcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcaefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihg132132132132132132132132132132132132132132132132132132132132654654654654654654654654654654654654654654654654654654654654798798798798798798798798798798798798798798798798798798798798'
        output_1 = F_FULL(str_full)
        str_gold = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighighighighighighighighighighighi123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123456456456456456456456456456456456456456456456456456456456456456456456456456456456456456456789789789789789789789789789789789789789789789789789789789789789789789789789789789789789789bcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcaefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihg132132132132132132132132132132132132132132132132132132132132654654654654654654654654654654654654654654654654654654654654798798798798798798798798798798798798798798798798798798798798'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4020 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4020 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzcbacbacbacbacbacbacbacbacbacbadefdefdefdefdefdefdefdefdefdefhgihgihgihgihgihgihgihgihgihgijlkjlkjlkjlkjlkjlkjlkjlkjlkjlkonmonmonmonmonmonmonmonmonmonmpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrtustustustustustustustustustusxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwzyzyzyzyzyzyzyzyzyzy'
        output_1 = F_FULL(str_full)
        str_gold = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzcbacbacbacbacbacbacbacbacbacbadefdefdefdefdefdefdefdefdefdefhgihgihgihgihgihgihgihgihgihgijlkjlkjlkjlkjlkjlkjlkjlkjlkjlkonmonmonmonmonmonmonmonmonmonmpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrtustustustustustustustustustusxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwzyzyzyzyzyzyzyzyzyzy'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4006 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4006 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzabcabcabcabcabcabcabcabcabcabcdfedfedfedfedfedfedfedfedfedfeighighighighighighighighighighljkljkljkljkljkljkljkljkljkljkmnomnomnomnomnomnomnomnomnomnorqprqprqprqprqprqprqprqprqprqptustustustustustustustustustusxwvxwvxwvxwvxwvxwvxwvxwvxwvxwvzyzyzyzyzyzyzyzyzyzy'
        output_1 = F_FULL(str_full)
        str_gold = 'abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzabcabcabcabcabcabcabcabcabcabcdfedfedfedfedfedfedfedfedfedfeighighighighighighighighighighljkljkljkljkljkljkljkljkljkljkmnomnomnomnomnomnomnomnomnomnorqprqprqprqprqprqprqprqprqprqptustustustustustustustustustusxwvxwvxwvxwvxwvxwvxwvxwvxwvxwvzyzyzyzyzyzyzyzyzyzy'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4007 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
