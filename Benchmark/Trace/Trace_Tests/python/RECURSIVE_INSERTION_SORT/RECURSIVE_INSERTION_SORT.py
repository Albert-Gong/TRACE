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
    if n <= 1 :
        return
    f_gold ( arr , n - 1 )
    last = arr [ n - 1 ]
    j = n - 2
    while ( j >= 0 and arr [ j ] > last ) :
        arr [ j + 1 ] = arr [ j ]
        j = j - 1
    arr [ j + 1 ] = last


def start():
    total_test_case_num = 0
    pass_test_case_num = 0
    exception_test_case_num = 0
    
    
    # TEST_SUITE_FILL
    try:
        total_test_case_num += 1
        arr_full = [64, 85, -39, 36, -39, 77, -33, 81, -58, 94, 31, 34, -92, -20, 83, -66, -39, 47, 6, -33, -2, -45, -100, -32, -9, -73, -22, 52, 7, -11, 96, -1, -61, 81, -70, 96, -7, 93, 64, -76, -81, -41, -7, -36, 35, 100, 42, -59, -22, -22, 45, -12, -90, -88, 8, -38, -41, 33, -27, -57, 76, -98, 1, 73, -24, 73, -96, 64, -72, -55, -51, -44, -92, 4, 50, -68, 86, 60, 65, 28, -33, 68, 39, -46, 50, -5, 14, 9, -42, 17, 47, 63, 39, -54, -21, 6, 79, -70, -5, 64]
        n_full = 100
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [64, 85, -39, 36, -39, 77, -33, 81, -58, 94, 31, 34, -92, -20, 83, -66, -39, 47, 6, -33, -2, -45, -100, -32, -9, -73, -22, 52, 7, -11, 96, -1, -61, 81, -70, 96, -7, 93, 64, -76, -81, -41, -7, -36, 35, 100, 42, -59, -22, -22, 45, -12, -90, -88, 8, -38, -41, 33, -27, -57, 76, -98, 1, 73, -24, 73, -96, 64, -72, -55, -51, -44, -92, 4, 50, -68, 86, 60, 65, 28, -33, 68, 39, -46, 50, -5, 14, 9, -42, 17, 47, 63, 39, -54, -21, 6, 79, -70, -5, 64]
        n_gold = 100
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=13 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=13 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [97, -7, 24, 73, 74, -63, -2, -88, 33, 98, 93, 13, 59, -39, -94, 66, 47, -28, -100, -24, 36, -61, 38, 24, 19, -71, -89, -50, -14, 62, -3, -48, 26, 8, 5, -54, -8, -60, -32, -84, -7, 24, -41, -2, 59, -33, 85, -1, 17, -85, 58, -82, 80, 52, -36, 19, 76, -27, 9, 69, -66, 24, -38, 31, 18, -82, -63, -91, 75, -54, 37, -52, 17, -75, 74, 32, -17, 17, 82, -85, -80, 8, -60, -43, 48, 41, 11, -86, 82, -78, 30, -69, -17, 50, -20, 9, 77, -50, 6, 96]
        n_full = 100
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [97, -7, 24, 73, 74, -63, -2, -88, 33, 98, 93, 13, 59, -39, -94, 66, 47, -28, -100, -24, 36, -61, 38, 24, 19, -71, -89, -50, -14, 62, -3, -48, 26, 8, 5, -54, -8, -60, -32, -84, -7, 24, -41, -2, 59, -33, 85, -1, 17, -85, 58, -82, 80, 52, -36, 19, 76, -27, 9, 69, -66, 24, -38, 31, 18, -82, -63, -91, 75, -54, 37, -52, 17, -75, 74, 32, -17, 17, 82, -85, -80, 8, -60, -43, 48, 41, 11, -86, 82, -78, 30, -69, -17, 50, -20, 9, 77, -50, 6, 96]
        n_gold = 100
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=11 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=11 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [-99, 1, -88, 59, 11, 22, -67, -97, 0, -28, -8, -81, 73, -21, -39, 23, -98, 91, 24, 21, 50, 37, 25, 96, -26, -20, 44, 1, 86, -13, 27, -70, -69, -80, 11, -66, -85, -32, 73, 65, -13, 3, 41, 70, -57, -97, 94, -36, -76, 32, -10, -12, 76, -52, -88, -96, 74, 95, 9, -50, 32, -81, -6, 98, 18, -39, -37, 54, -2, 83, 53, 92, -1, -9, -92, -100, -63, -45, 16, 61, -7, -78, -47, 9, -82, 87, -22, -44, -13, 9, 19, 64, 32, 26, 97, 67, 17, -28, -37, 63]
        n_full = 100
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [-99, 1, -88, 59, 11, 22, -67, -97, 0, -28, -8, -81, 73, -21, -39, 23, -98, 91, 24, 21, 50, 37, 25, 96, -26, -20, 44, 1, 86, -13, 27, -70, -69, -80, 11, -66, -85, -32, 73, 65, -13, 3, 41, 70, -57, -97, 94, -36, -76, 32, -10, -12, 76, -52, -88, -96, 74, 95, 9, -50, 32, -81, -6, 98, 18, -39, -37, 54, -2, 83, 53, 92, -1, -9, -92, -100, -63, -45, 16, 61, -7, -78, -47, 9, -82, 87, -22, -44, -13, 9, 19, 64, 32, 26, 97, 67, 17, -28, -37, 63]
        n_gold = 100
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=12 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=12 | error {e}')


    try:
        total_test_case_num += 1
        arr_full = [100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        n_full = 100
        output_1 = F_FULL(arr_full, n_full)
        arr_gold = [100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        n_gold = 100
        output_2 = f_gold(arr_gold, n_gold)
        if are_equivalent(output_1, output_2):
            pass_test_case_num += 1
        else:
            print(f'|FAIL| test_id=0 output1={output_1} output2={output_2}')
    except Exception as e:
        exception_test_case_num += 1
        print(f'|EXCEPTION| test_id=0 | error {e}')


        
    
    
    print(f"|OUTPUT| total {total_test_case_num} | passed {pass_test_case_num} | exception {exception_test_case_num}")

if __name__ == "__main__":
    start()
