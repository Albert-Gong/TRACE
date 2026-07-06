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
int f_gold ( int x ) {
  int dp [ x + 1 ];
  dp [ 0 ] = dp [ 1 ] = 1;
  for ( int i = 2;
  i <= x;
  i ++ ) dp [ i ] = dp [ i - 1 ] + ( i - 1 ) * dp [ i - 2 ];
  return dp [ x ];
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
            int x_full_1002 = 2000000 ;
            auto output_1_1002 = F_FULL(x_full_1002);
            int x_gold_1002 = 2000000 ;
            auto output_2_1002 = f_gold(x_gold_1002);
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
            int x_full_4002 = 1000000 ;
            auto output_1_4002 = F_FULL(x_full_4002);
            int x_gold_4002 = 1000000 ;
            auto output_2_4002 = f_gold(x_gold_4002);
            if (Test::AreEquivalent(output_1_4002, output_2_4002)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4002 output1=" << output_1_4002 << " output2=" << output_2_4002 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4002 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int x_full_2002 = 1000000 ;
            auto output_1_2002 = F_FULL(x_full_2002);
            int x_gold_2002 = 1000000 ;
            auto output_2_2002 = f_gold(x_gold_2002);
            if (Test::AreEquivalent(output_1_2002, output_2_2002)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2002 output1=" << output_1_2002 << " output2=" << output_2_2002 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2002 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int x_full_4000 = 100000 ;
            auto output_1_4000 = F_FULL(x_full_4000);
            int x_gold_4000 = 100000 ;
            auto output_2_4000 = f_gold(x_gold_4000);
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
            int x_full_4003 = 200000 ;
            auto output_1_4003 = F_FULL(x_full_4003);
            int x_gold_4003 = 200000 ;
            auto output_2_4003 = f_gold(x_gold_4003);
            if (Test::AreEquivalent(output_1_4003, output_2_4003)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4003 output1=" << output_1_4003 << " output2=" << output_2_4003 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4003 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int x_full_4001 = 5000 ;
            auto output_1_4001 = F_FULL(x_full_4001);
            int x_gold_4001 = 5000 ;
            auto output_2_4001 = f_gold(x_gold_4001);
            if (Test::AreEquivalent(output_1_4001, output_2_4001)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4001 output1=" << output_1_4001 << " output2=" << output_2_4001 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4001 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int x_full_5 = 9999 ;
            auto output_1_5 = F_FULL(x_full_5);
            int x_gold_5 = 9999 ;
            auto output_2_5 = f_gold(x_gold_5);
            if (Test::AreEquivalent(output_1_5, output_2_5)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=5 output1=" << output_1_5 << " output2=" << output_2_5 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=5 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int x_full_1001 = 100000 ;
            auto output_1_1001 = F_FULL(x_full_1001);
            int x_gold_1001 = 100000 ;
            auto output_2_1001 = f_gold(x_gold_1001);
            if (Test::AreEquivalent(output_1_1001, output_2_1001)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1001 output1=" << output_1_1001 << " output2=" << output_2_1001 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1001 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int x_full_1000 = 1000000 ;
            auto output_1_1000 = F_FULL(x_full_1000);
            int x_gold_1000 = 1000000 ;
            auto output_2_1000 = f_gold(x_gold_1000);
            if (Test::AreEquivalent(output_1_1000, output_2_1000)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1000 output1=" << output_1_1000 << " output2=" << output_2_1000 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1000 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int x_full_4 = 100000 ;
            auto output_1_4 = F_FULL(x_full_4);
            int x_gold_4 = 100000 ;
            auto output_2_4 = f_gold(x_gold_4);
            if (Test::AreEquivalent(output_1_4, output_2_4)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4 output1=" << output_1_4 << " output2=" << output_2_4 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4 | error " << e.what() << endl;
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