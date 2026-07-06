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
double f_gold ( int n ) {
  int i = 1;
  double res = 0.0;
  bool sign = true;
  while ( n > 0 ) {
    n --;
    if ( sign ) {
      sign = ! sign;
      res = res + ( double ) ++ i / ++ i;
    }
    else {
      sign = ! sign;
      res = res - ( double ) ++ i / ++ i;
    }
  }
  return res;
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
            int n_full_6 = 9999999 ;
            auto output_1_6 = F_FULL(n_full_6);
            int n_gold_6 = 9999999 ;
            auto output_2_6 = f_gold(n_gold_6);
            if (Test::AreEquivalent(output_1_6, output_2_6)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=6 output1=" << output_1_6 << " output2=" << output_2_6 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=6 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4007 = 10000000 ;
            auto output_1_4007 = F_FULL(n_full_4007);
            int n_gold_4007 = 10000000 ;
            auto output_2_4007 = f_gold(n_gold_4007);
            if (Test::AreEquivalent(output_1_4007, output_2_4007)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4007 output1=" << output_1_4007 << " output2=" << output_2_4007 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4007 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_10 = 10000000 ;
            auto output_1_10 = F_FULL(n_full_10);
            int n_gold_10 = 10000000 ;
            auto output_2_10 = f_gold(n_gold_10);
            if (Test::AreEquivalent(output_1_10, output_2_10)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=10 output1=" << output_1_10 << " output2=" << output_2_10 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=10 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4014 = 7500000 ;
            auto output_1_4014 = F_FULL(n_full_4014);
            int n_gold_4014 = 7500000 ;
            auto output_2_4014 = f_gold(n_gold_4014);
            if (Test::AreEquivalent(output_1_4014, output_2_4014)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4014 output1=" << output_1_4014 << " output2=" << output_2_4014 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4014 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4000 = 5000000 ;
            auto output_1_4000 = F_FULL(n_full_4000);
            int n_gold_4000 = 5000000 ;
            auto output_2_4000 = f_gold(n_gold_4000);
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
            int n_full_4016 = 3017863 ;
            auto output_1_4016 = F_FULL(n_full_4016);
            int n_gold_4016 = 3017863 ;
            auto output_2_4016 = f_gold(n_gold_4016);
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
            int n_full_1002 = 2367763 ;
            auto output_1_1002 = F_FULL(n_full_1002);
            int n_gold_1002 = 2367763 ;
            auto output_2_1002 = f_gold(n_gold_1002);
            if (Test::AreEquivalent(output_1_1002, output_2_1002)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1002 output1=" << output_1_1002 << " output2=" << output_2_1002 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1002 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3024 = 1657733 ;
            auto output_1_3024 = F_FULL(n_full_3024);
            int n_gold_3024 = 1657733 ;
            auto output_2_3024 = f_gold(n_gold_3024);
            if (Test::AreEquivalent(output_1_3024, output_2_3024)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3024 output1=" << output_1_3024 << " output2=" << output_2_3024 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3024 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3019 = 3334429 ;
            auto output_1_3019 = F_FULL(n_full_3019);
            int n_gold_3019 = 3334429 ;
            auto output_2_3019 = f_gold(n_gold_3019);
            if (Test::AreEquivalent(output_1_3019, output_2_3019)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3019 output1=" << output_1_3019 << " output2=" << output_2_3019 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3019 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2003 = 588649 ;
            auto output_1_2003 = F_FULL(n_full_2003);
            int n_gold_2003 = 588649 ;
            auto output_2_2003 = f_gold(n_gold_2003);
            if (Test::AreEquivalent(output_1_2003, output_2_2003)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2003 output1=" << output_1_2003 << " output2=" << output_2_2003 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2003 | error " << e.what() << endl;
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