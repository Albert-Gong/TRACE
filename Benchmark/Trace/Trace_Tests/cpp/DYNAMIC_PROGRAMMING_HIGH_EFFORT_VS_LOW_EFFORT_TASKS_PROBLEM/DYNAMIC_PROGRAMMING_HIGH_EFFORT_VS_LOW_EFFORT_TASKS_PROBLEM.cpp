#include <iostream>
#include <cstdlib>
#include <string>
#include <vector>
#include <fstream>
#include <iomanip>
#include <bits/stdc++.h>
// TO_FILL_IMPORT


using namespace std;



//TO_FILL_FUNC


//TO_FILL_GOLD
int f_gold ( int high [ ], int low [ ], int n ) {
  if ( n <= 0 ) return 0;
  return max ( high [ n - 1 ] + f_gold ( high, low, ( n - 2 ) ), low [ n - 1 ] + f_gold ( high, low, ( n - 1 ) ) );
}



class Test {
private:
  template <typename T> static string serialize_obj_(T obj) {
      if constexpr (is_same_v<T, int> ||
        is_same_v<T, long> ||
        is_same_v<T, long long> ||
        is_same_v<T, unsigned int> ||
        is_same_v<T, unsigned long> ||
        is_same_v<T, unsigned long long>) {
      return to_string(obj);
      }

    if constexpr (is_same_v<T, double> || is_same_v<T, float>) {
      return to_string((double)obj);
    }
    if constexpr (is_same_v<T, char>) {
      return "'" + string(1, (char)obj) + "'";
    }
    if constexpr (is_same_v<T, bool>) {
      return (bool)obj ? "true" : "false";
    }
    if constexpr (is_same_v<T, string>) {
      return "\"" + (string)obj + "\"";
    }
    throw std::runtime_error("Error: Invalid Type");
  }

  template <typename T> static string serialize_obj_(vector<T> obj) {
    return serialize_list_(obj);
  }

  template <typename K, typename V>
  static string serialize_obj_(map<K, V> obj) {
    return serialize_dict_(obj);
  }

  template <typename K, typename V>
  static string serialize_obj_(unordered_map<K, V> obj) {
    return serialize_dict_(obj);
  }

  template <typename T> static string serialize_list_(vector<T> obj) {
    string list_str = "[";
    if constexpr (std::is_same<T, bool>::value) {
      for (auto item : obj) {
      list_str += serialize_obj_((bool)item);
      list_str += ",";
      }
    }
    else{
    for (auto &item : obj) {
      list_str += serialize_obj_(item);
      list_str += ",";
    }
    }
    list_str[list_str.length() - 1] = ']';
    return list_str;
  }

  template <typename K, typename V>
  static string serialize_dict_(map<K, V> obj) {
    string dict_str = "{";
    for (auto &[key, value] : obj) {
      dict_str += serialize_obj_(key);
      dict_str += ":";
      dict_str += serialize_obj_(value);
      dict_str += ",";
    }
    dict_str[dict_str.length() - 1] = '}';
    return dict_str;
  }

  template <typename K, typename V>
  static string serialize_dict_(unordered_map<K, V> obj) {
    auto m = map<K, V>();
    for (auto &[key, value] : obj) {
      m[key] = value;
    }
    return serialize_dict_(m);
  }

public:
  template <typename T1, typename T2> static bool AreEquivalent(T1 o1, T2 o2) {
    cout << serialize_obj_(o1) << " " << serialize_obj_(o2) << endl;
    return serialize_obj_(o1) == serialize_obj_(o2);
  }





public:

  static void Start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int high_full_3006[30] = {65, 27, 87, 36, 71, 97, 12, 76, 90, 78, 36, 82, 62, 53, 21, 61, 99, 39, 13, 2, 9, 3, 25, 85, 79, 34, 84, 88, 97, 10} ;
            int low_full_3006[30] = {40, 75, 70, 66, 11, 82, 88, 67, 55, 60, 72, 66, 72, 71, 58, 59, 4, 60, 14, 63, 72, 69, 29, 50, 42, 56, 62, 77, 68, 58} ;
            int n_full_3006 = 30 ;
            auto output_1_3006 = F_FULL(high_full_3006, low_full_3006, n_full_3006);
            int high_gold_3006[30] = {65, 27, 87, 36, 71, 97, 12, 76, 90, 78, 36, 82, 62, 53, 21, 61, 99, 39, 13, 2, 9, 3, 25, 85, 79, 34, 84, 88, 97, 10} ;
            int low_gold_3006[30] = {40, 75, 70, 66, 11, 82, 88, 67, 55, 60, 72, 66, 72, 71, 58, 59, 4, 60, 14, 63, 72, 69, 29, 50, 42, 56, 62, 77, 68, 58} ;
            int n_gold_3006 = 30 ;
            auto output_2_3006 = f_gold(high_gold_3006, low_gold_3006, n_gold_3006);
            if (Test::AreEquivalent(output_1_3006, output_2_3006)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3006 output1=" << output_1_3006 << " output2=" << output_2_3006 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3006 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_3005[30] = {56, 46, 79, 75, 35, 84, 56, 99, 50, 28, 3, 54, 2, 77, 44, 90, 70, 25, 11, 51, 8, 33, 55, 81, 19, 61, 49, 20, 10, 3} ;
            int low_full_3005[30] = {96, 81, 24, 79, 14, 94, 40, 82, 63, 62, 25, 80, 26, 72, 92, 62, 12, 71, 8, 73, 74, 70, 59, 50, 85, 78, 35, 65, 64, 57} ;
            int n_full_3005 = 30 ;
            auto output_1_3005 = F_FULL(high_full_3005, low_full_3005, n_full_3005);
            int high_gold_3005[30] = {56, 46, 79, 75, 35, 84, 56, 99, 50, 28, 3, 54, 2, 77, 44, 90, 70, 25, 11, 51, 8, 33, 55, 81, 19, 61, 49, 20, 10, 3} ;
            int low_gold_3005[30] = {96, 81, 24, 79, 14, 94, 40, 82, 63, 62, 25, 80, 26, 72, 92, 62, 12, 71, 8, 73, 74, 70, 59, 50, 85, 78, 35, 65, 64, 57} ;
            int n_gold_3005 = 30 ;
            auto output_2_3005 = f_gold(high_gold_3005, low_gold_3005, n_gold_3005);
            if (Test::AreEquivalent(output_1_3005, output_2_3005)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3005 output1=" << output_1_3005 << " output2=" << output_2_3005 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3005 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_3004[30] = {12, 60, 6, 32, 28, 7, 96, 14, 61, 61, 11, 8, 95, 94, 56, 79, 37, 68, 18, 75, 27, 65, 23, 21, 58, 24, 77, 85, 74, 29} ;
            int low_full_3004[30] = {19, 87, 13, 62, 82, 72, 14, 57, 58, 91, 60, 84, 73, 87, 17, 97, 83, 67, 78, 71, 83, 90, 99, 65, 6, 97, 14, 89, 38, 62} ;
            int n_full_3004 = 30 ;
            auto output_1_3004 = F_FULL(high_full_3004, low_full_3004, n_full_3004);
            int high_gold_3004[30] = {12, 60, 6, 32, 28, 7, 96, 14, 61, 61, 11, 8, 95, 94, 56, 79, 37, 68, 18, 75, 27, 65, 23, 21, 58, 24, 77, 85, 74, 29} ;
            int low_gold_3004[30] = {19, 87, 13, 62, 82, 72, 14, 57, 58, 91, 60, 84, 73, 87, 17, 97, 83, 67, 78, 71, 83, 90, 99, 65, 6, 97, 14, 89, 38, 62} ;
            int n_gold_3004 = 30 ;
            auto output_2_3004 = f_gold(high_gold_3004, low_gold_3004, n_gold_3004);
            if (Test::AreEquivalent(output_1_3004, output_2_3004)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3004 output1=" << output_1_3004 << " output2=" << output_2_3004 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3004 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_4018[25] = {0, 100, 100, 0, 0, 100, 100, 0, 100, 100, 100, 0, 0, 0, 100, 0, 100, 0, 0, 100, 100, 100, 0, 0, 100} ;
            int low_full_4018[25] = {100, 0, 0, 100, 100, 0, 0, 100, 100, 100, 100, 100, 0, 100, 0, 100, 100, 100, 100, 0, 100, 100, 0, 100, 0} ;
            int n_full_4018 = 25 ;
            auto output_1_4018 = F_FULL(high_full_4018, low_full_4018, n_full_4018);
            int high_gold_4018[25] = {0, 100, 100, 0, 0, 100, 100, 0, 100, 100, 100, 0, 0, 0, 100, 0, 100, 0, 0, 100, 100, 100, 0, 0, 100} ;
            int low_gold_4018[25] = {100, 0, 0, 100, 100, 0, 0, 100, 100, 100, 100, 100, 0, 100, 0, 100, 100, 100, 100, 0, 100, 100, 0, 100, 0} ;
            int n_gold_4018 = 25 ;
            auto output_2_4018 = f_gold(high_gold_4018, low_gold_4018, n_gold_4018);
            if (Test::AreEquivalent(output_1_4018, output_2_4018)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4018 output1=" << output_1_4018 << " output2=" << output_2_4018 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4018 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_4011[25] = {96, 8, 96, 7, 98, 6, 96, 6, 91, 1, 92, 0, 93, 4, 93, 0, 92, 9, 94, 0, 92, 8, 99, 9, 97} ;
            int low_full_4011[25] = {5, 94, 4, 94, 5, 92, 2, 100, 6, 90, 2, 99, 2, 100, 4, 90, 3, 100, 1, 91, 7, 98, 5, 91, 5} ;
            int n_full_4011 = 25 ;
            auto output_1_4011 = F_FULL(high_full_4011, low_full_4011, n_full_4011);
            int high_gold_4011[25] = {96, 8, 96, 7, 98, 6, 96, 6, 91, 1, 92, 0, 93, 4, 93, 0, 92, 9, 94, 0, 92, 8, 99, 9, 97} ;
            int low_gold_4011[25] = {5, 94, 4, 94, 5, 92, 2, 100, 6, 90, 2, 99, 2, 100, 4, 90, 3, 100, 1, 91, 7, 98, 5, 91, 5} ;
            int n_gold_4011 = 25 ;
            auto output_2_4011 = f_gold(high_gold_4011, low_gold_4011, n_gold_4011);
            if (Test::AreEquivalent(output_1_4011, output_2_4011)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4011 output1=" << output_1_4011 << " output2=" << output_2_4011 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4011 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_4016[25] = {0, 100, 0, 100, 100, 0, 0, 0, 100, 100, 100, 100, 0, 100, 100, 0, 100, 0, 0, 100, 100, 0, 0, 0, 0} ;
            int low_full_4016[25] = {100, 100, 100, 0, 100, 100, 100, 0, 100, 0, 0, 0, 100, 0, 100, 0, 0, 100, 0, 0, 0, 100, 0, 0, 100} ;
            int n_full_4016 = 25 ;
            auto output_1_4016 = F_FULL(high_full_4016, low_full_4016, n_full_4016);
            int high_gold_4016[25] = {0, 100, 0, 100, 100, 0, 0, 0, 100, 100, 100, 100, 0, 100, 100, 0, 100, 0, 0, 100, 100, 0, 0, 0, 0} ;
            int low_gold_4016[25] = {100, 100, 100, 0, 100, 100, 100, 0, 100, 0, 0, 0, 100, 0, 100, 0, 0, 100, 0, 0, 0, 100, 0, 0, 100} ;
            int n_gold_4016 = 25 ;
            auto output_2_4016 = f_gold(high_gold_4016, low_gold_4016, n_gold_4016);
            if (Test::AreEquivalent(output_1_4016, output_2_4016)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4016 output1=" << output_1_4016 << " output2=" << output_2_4016 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4016 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_4000[25] = {100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100} ;
            int low_full_4000[25] = {1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1} ;
            int n_full_4000 = 25 ;
            auto output_1_4000 = F_FULL(high_full_4000, low_full_4000, n_full_4000);
            int high_gold_4000[25] = {100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100} ;
            int low_gold_4000[25] = {1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1, 100, 1} ;
            int n_gold_4000 = 25 ;
            auto output_2_4000 = f_gold(high_gold_4000, low_gold_4000, n_gold_4000);
            if (Test::AreEquivalent(output_1_4000, output_2_4000)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4000 output1=" << output_1_4000 << " output2=" << output_2_4000 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4000 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_4010[25] = {96, 5, 98, 8, 96, 2, 90, 5, 97, 8, 95, 5, 95, 9, 99, 3, 99, 6, 99, 6, 97, 3, 94, 8, 94} ;
            int low_full_4010[25] = {0, 98, 3, 100, 6, 100, 7, 94, 9, 98, 10, 98, 2, 97, 2, 98, 0, 91, 10, 94, 10, 97, 5, 100, 10} ;
            int n_full_4010 = 25 ;
            auto output_1_4010 = F_FULL(high_full_4010, low_full_4010, n_full_4010);
            int high_gold_4010[25] = {96, 5, 98, 8, 96, 2, 90, 5, 97, 8, 95, 5, 95, 9, 99, 3, 99, 6, 99, 6, 97, 3, 94, 8, 94} ;
            int low_gold_4010[25] = {0, 98, 3, 100, 6, 100, 7, 94, 9, 98, 10, 98, 2, 97, 2, 98, 0, 91, 10, 94, 10, 97, 5, 100, 10} ;
            int n_gold_4010 = 25 ;
            auto output_2_4010 = f_gold(high_gold_4010, low_gold_4010, n_gold_4010);
            if (Test::AreEquivalent(output_1_4010, output_2_4010)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4010 output1=" << output_1_4010 << " output2=" << output_2_4010 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4010 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_4017[25] = {100, 100, 100, 0, 100, 100, 0, 0, 100, 0, 100, 0, 100, 0, 100, 0, 0, 100, 100, 0, 100, 100, 100, 0, 100} ;
            int low_full_4017[25] = {0, 100, 0, 100, 100, 0, 100, 100, 100, 100, 0, 0, 0, 100, 100, 100, 0, 0, 0, 0, 100, 100, 100, 0, 100} ;
            int n_full_4017 = 25 ;
            auto output_1_4017 = F_FULL(high_full_4017, low_full_4017, n_full_4017);
            int high_gold_4017[25] = {100, 100, 100, 0, 100, 100, 0, 0, 100, 0, 100, 0, 100, 0, 100, 0, 0, 100, 100, 0, 100, 100, 100, 0, 100} ;
            int low_gold_4017[25] = {0, 100, 0, 100, 100, 0, 100, 100, 100, 100, 0, 0, 0, 100, 100, 100, 0, 0, 0, 0, 100, 100, 100, 0, 100} ;
            int n_gold_4017 = 25 ;
            auto output_2_4017 = f_gold(high_gold_4017, low_gold_4017, n_gold_4017);
            if (Test::AreEquivalent(output_1_4017, output_2_4017)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4017 output1=" << output_1_4017 << " output2=" << output_2_4017 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4017 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int high_full_4012[25] = {91, 8, 92, 1, 90, 1, 96, 10, 96, 7, 91, 7, 95, 6, 93, 4, 96, 2, 92, 7, 92, 2, 99, 5, 97} ;
            int low_full_4012[25] = {9, 93, 1, 94, 0, 100, 10, 92, 4, 94, 9, 91, 1, 95, 7, 93, 8, 95, 9, 91, 1, 99, 4, 91, 9} ;
            int n_full_4012 = 25 ;
            auto output_1_4012 = F_FULL(high_full_4012, low_full_4012, n_full_4012);
            int high_gold_4012[25] = {91, 8, 92, 1, 90, 1, 96, 10, 96, 7, 91, 7, 95, 6, 93, 4, 96, 2, 92, 7, 92, 2, 99, 5, 97} ;
            int low_gold_4012[25] = {9, 93, 1, 94, 0, 100, 10, 92, 4, 94, 9, 91, 1, 95, 7, 93, 8, 95, 9, 91, 1, 99, 4, 91, 9} ;
            int n_gold_4012 = 25 ;
            auto output_2_4012 = f_gold(high_gold_4012, low_gold_4012, n_gold_4012);
            if (Test::AreEquivalent(output_1_4012, output_2_4012)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4012 output1=" << output_1_4012 << " output2=" << output_2_4012 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4012 | error " << e.what() << endl;
        }



    std::cout << "|OUTPUT| total " << total_test_case_num
    << " | passed " << pass_test_case_num
    << " | exception " << exception_test_case_num << std::endl;

  }
};

int main() {
  Test::Start();
  return 0;
}