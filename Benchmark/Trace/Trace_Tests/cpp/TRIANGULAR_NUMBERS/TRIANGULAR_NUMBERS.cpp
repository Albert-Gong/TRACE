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
bool f_gold ( int num ) {
  if ( num < 0 ) return false;
  int sum = 0;
  for ( int n = 1;
  sum <= num;
  n ++ ) {
    sum = sum + n;
    if ( sum == num ) return true;
  }
  return false;
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
            int num_full_13 = 2147483608 ;
            auto output_1_13 = F_FULL(num_full_13);
            int num_gold_13 = 2147483608 ;
            auto output_2_13 = f_gold(num_gold_13);
            if (Test::AreEquivalent(output_1_13, output_2_13)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=13 output1=" << output_1_13 << " output2=" << output_2_13 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=13 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_2019 = 100005207 ;
            auto output_1_2019 = F_FULL(num_full_2019);
            int num_gold_2019 = 100005207 ;
            auto output_2_2019 = f_gold(num_gold_2019);
            if (Test::AreEquivalent(output_1_2019, output_2_2019)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2019 output1=" << output_1_2019 << " output2=" << output_2_2019 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2019 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_1003 = 2147450814 ;
            auto output_1_1003 = F_FULL(num_full_1003);
            int num_gold_1003 = 2147450814 ;
            auto output_2_1003 = f_gold(num_gold_1003);
            if (Test::AreEquivalent(output_1_1003, output_2_1003)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1003 output1=" << output_1_1003 << " output2=" << output_2_1003 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1003 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_19 = 10001631 ;
            auto output_1_19 = F_FULL(num_full_19);
            int num_gold_19 = 10001631 ;
            auto output_2_19 = f_gold(num_gold_19);
            if (Test::AreEquivalent(output_1_19, output_2_19)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=19 output1=" << output_1_19 << " output2=" << output_2_19 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=19 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_2 = 50004999 ;
            auto output_1_2 = F_FULL(num_full_2);
            int num_gold_2 = 50004999 ;
            auto output_2_2 = f_gold(num_gold_2);
            if (Test::AreEquivalent(output_1_2, output_2_2)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2 output1=" << output_1_2 << " output2=" << output_2_2 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_11 = 50005001 ;
            auto output_1_11 = F_FULL(num_full_11);
            int num_gold_11 = 50005001 ;
            auto output_2_11 = f_gold(num_gold_11);
            if (Test::AreEquivalent(output_1_11, output_2_11)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=11 output1=" << output_1_11 << " output2=" << output_2_11 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=11 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_2018 = 100005161 ;
            auto output_1_2018 = F_FULL(num_full_2018);
            int num_gold_2018 = 100005161 ;
            auto output_2_2018 = f_gold(num_gold_2018);
            if (Test::AreEquivalent(output_1_2018, output_2_2018)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2018 output1=" << output_1_2018 << " output2=" << output_2_2018 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2018 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_14 = 2147483566 ;
            auto output_1_14 = F_FULL(num_full_14);
            int num_gold_14 = 2147483566 ;
            auto output_2_14 = f_gold(num_gold_14);
            if (Test::AreEquivalent(output_1_14, output_2_14)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=14 output1=" << output_1_14 << " output2=" << output_2_14 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=14 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_8 = 5078 ;
            auto output_1_8 = F_FULL(num_full_8);
            int num_gold_8 = 5078 ;
            auto output_2_8 = f_gold(num_gold_8);
            if (Test::AreEquivalent(output_1_8, output_2_8)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=8 output1=" << output_1_8 << " output2=" << output_2_8 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=8 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int num_full_1015 = 10001705 ;
            auto output_1_1015 = F_FULL(num_full_1015);
            int num_gold_1015 = 10001705 ;
            auto output_2_1015 = f_gold(num_gold_1015);
            if (Test::AreEquivalent(output_1_1015, output_2_1015)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1015 output1=" << output_1_1015 << " output2=" << output_2_1015 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1015 | error " << e.what() << endl;
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