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
    N = len ( str )
    cps = [ [ 0 for i in range ( N + 2 ) ] for j in range ( N + 2 ) ]
    for i in range ( N ) :
        cps [ i ] [ i ] = 1
    for L in range ( 2 , N + 1 ) :
        for i in range ( N ) :
            k = L + i - 1
            if ( k < N ) :
                if ( str [ i ] == str [ k ] ) :
                    cps [ i ] [ k ] = ( cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] + 1 )
                else :
                    cps [ i ] [ k ] = ( cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] - cps [ i + 1 ] [ k - 1 ] )
    return cps [ 0 ] [ N - 1 ]


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        str_full = 'cwiewhzggzeasrnzngstsfiaanieflkoggghkxhbsqfkacvopzrhnajtrregedeziazmeavazxwvbbfzfqxhzzfahfoepknilvaj'
        output_1 = F_FULL(str_full)
        str_gold = 'cwiewhzggzeasrnzngstsfiaanieflkoggghkxhbsqfkacvopzrhnajtrregedeziazmeavazxwvbbfzfqxhzzfahfoepknilvaj'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4000 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'jzidkmnzhwmxnjjlewvoywenaanewyovweljjnxmwhznmkdizjjzidkmnzhwmxnjjlewvoywena'
        output_1 = F_FULL(str_full)
        str_gold = 'jzidkmnzhwmxnjjlewvoywenaanewyovweljjnxmwhznmkdizjjzidkmnzhwmxnjjlewvoywena'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2007 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2007 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'sbtxiaybwsvimsapimzabbsudattazxqqubvipbtpehsxtzitoghwgrbhrenagioqjhyfazgiapijdnjvgagtjassaoimcegsift'
        output_1 = F_FULL(str_full)
        str_gold = 'sbtxiaybwsvimsapimzabbsudattazxqqubvipbtpehsxtzitoghwgrbhrenagioqjhyfazgiapijdnjvgagtjassaoimcegsift'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4002 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'zjprlcmdpnrufsnfmzcwcfushvhzbqnwqoddomkzqgmczbheecuckuemszbeenohiayyuuvrkqarodfwwefrazwympgyrbzsxtda'
        output_1 = F_FULL(str_full)
        str_gold = 'zjprlcmdpnrufsnfmzcwcfushvhzbqnwqoddomkzqgmczbheecuckuemszbeenohiayyuuvrkqarodfwwefrazwympgyrbzsxtda'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=1 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=1 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'ogklxhjkvtnlaogeqhtcasffaqpwjqfdrficsjybhcwnuryvcbixjjmsfdpwubroovjlnpkldjvqvukoypysmncflddsffxkgibz'
        output_1 = F_FULL(str_full)
        str_gold = 'ogklxhjkvtnlaogeqhtcasffaqpwjqfdrficsjybhcwnuryvcbixjjmsfdpwubroovjlnpkldjvqvukoypysmncflddsffxkgibz'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3001 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'lpfogjeifhvdnpptjnnbvphffkgphbplhqdqxdufkdbtqxavynbepqdfjquubeilovvfttzmdcuravrlepmkpapvsaksspkiaufe'
        output_1 = F_FULL(str_full)
        str_gold = 'lpfogjeifhvdnpptjnnbvphffkgphbplhqdqxdufkdbtqxavynbepqdfjquubeilovvfttzmdcuravrlepmkpapvsaksspkiaufe'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'pmqecnfuqpioaxrejrtujyfublrinezbcxtutnjuskmtauvrhnzyqrpvmvltarhemqstrmdxgxbiejkcvoaofyjanwczbcyqxfzg'
        output_1 = F_FULL(str_full)
        str_gold = 'pmqecnfuqpioaxrejrtujyfublrinezbcxtutnjuskmtauvrhnzyqrpvmvltarhemqstrmdxgxbiejkcvoaofyjanwczbcyqxfzg'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3002 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3002 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'yaupgtnynunqkpsxyeaoypnsxdnxrvculrysumfxsajdaogxedxlcmvttanqrklpnersllatckjrgeasyawnkrsenraorazcdswu'
        output_1 = F_FULL(str_full)
        str_gold = 'yaupgtnynunqkpsxyeaoypnsxdnxrvculrysumfxsajdaogxedxlcmvttanqrklpnersllatckjrgeasyawnkrsenraorazcdswu'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=4001 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=4001 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'uvvdmflwifkcvbifxrvegtfhzvitpdcxysmnurkqohvbscajgakwgasllszawuihjdoyrpresodcwjgjeadmgwphxwdokesegdps'
        output_1 = F_FULL(str_full)
        str_gold = 'uvvdmflwifkcvbifxrvegtfhzvitpdcxysmnurkqohvbscajgakwgasllszawuihjdoyrpresodcwjgjeadmgwphxwdokesegdps'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=3000 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=3000 | error {e}')


    try:
        total_test_case_num += 1
        str_full = 'gkzadxrtzklnjjvzcynztlerllvcnxeriavtzhjoqxbiqbwmrdbdvrmpknsukxycwapfrvtulkynicwipzbwvuktpmdrbuoexnof'
        output_1 = F_FULL(str_full)
        str_gold = 'gkzadxrtzklnjjvzcynztlerllvcnxeriavtzhjoqxbiqbwmrdbdvrmpknsukxycwapfrvtulkynicwipzbwvuktpmdrbuoexnof'
        output_2 = f_gold(str_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=2 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=2 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
