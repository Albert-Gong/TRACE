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
int f_gold ( int n, int k ) {
  int eggFloor [ n + 1 ] [ k + 1 ];
  int res;
  int i, j, x;
  for ( i = 1;
  i <= n;
  i ++ ) {
    eggFloor [ i ] [ 1 ] = 1;
    eggFloor [ i ] [ 0 ] = 0;
  }
  for ( j = 1;
  j <= k;
  j ++ ) eggFloor [ 1 ] [ j ] = j;
  for ( i = 2;
  i <= n;
  i ++ ) {
    for ( j = 2;
    j <= k;
    j ++ ) {
      eggFloor [ i ] [ j ] = INT_MAX;
      for ( x = 1;
      x <= j;
      x ++ ) {
        res = 1 + max ( eggFloor [ i - 1 ] [ x - 1 ], eggFloor [ i ] [ j - x ] );
        if ( res < eggFloor [ i ] [ j ] ) eggFloor [ i ] [ j ] = res;
      }
    }
  }
  return eggFloor [ n ] [ k ];
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
            int n_full_14 = 50 ;
            int k_full_14 = 5000 ;
            auto output_1_14 = F_FULL(n_full_14, k_full_14);
            int n_gold_14 = 50 ;
            int k_gold_14 = 5000 ;
            auto output_2_14 = f_gold(n_gold_14, k_gold_14);
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
            int n_full_2000 = 50 ;
            int k_full_2000 = 5000 ;
            auto output_1_2000 = F_FULL(n_full_2000, k_full_2000);
            int n_gold_2000 = 50 ;
            int k_gold_2000 = 5000 ;
            auto output_2_2000 = f_gold(n_gold_2000, k_gold_2000);
            if (Test::AreEquivalent(output_1_2000, output_2_2000)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2000 output1=" << output_1_2000 << " output2=" << output_2_2000 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2000 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4002 = 24 ;
            int k_full_4002 = 4481 ;
            auto output_1_4002 = F_FULL(n_full_4002, k_full_4002);
            int n_gold_4002 = 24 ;
            int k_gold_4002 = 4481 ;
            auto output_2_4002 = f_gold(n_gold_4002, k_gold_4002);
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
            int n_full_8 = 20 ;
            int k_full_8 = 5000 ;
            auto output_1_8 = F_FULL(n_full_8, k_full_8);
            int n_gold_8 = 20 ;
            int k_gold_8 = 5000 ;
            auto output_2_8 = f_gold(n_gold_8, k_gold_8);
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
            int n_full_4001 = 19 ;
            int k_full_4001 = 4308 ;
            auto output_1_4001 = F_FULL(n_full_4001, k_full_4001);
            int n_gold_4001 = 19 ;
            int k_gold_4001 = 4308 ;
            auto output_2_4001 = f_gold(n_gold_4001, k_gold_4001);
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
            int n_full_7 = 100 ;
            int k_full_7 = 1000 ;
            auto output_1_7 = F_FULL(n_full_7, k_full_7);
            int n_gold_7 = 100 ;
            int k_gold_7 = 1000 ;
            auto output_2_7 = f_gold(n_gold_7, k_gold_7);
            if (Test::AreEquivalent(output_1_7, output_2_7)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=7 output1=" << output_1_7 << " output2=" << output_2_7 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=7 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2 = 50 ;
            int k_full_2 = 633 ;
            auto output_1_2 = F_FULL(n_full_2, k_full_2);
            int n_gold_2 = 50 ;
            int k_gold_2 = 633 ;
            auto output_2_2 = f_gold(n_gold_2, k_gold_2);
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
            int n_full_4 = 18 ;
            int k_full_4 = 964 ;
            auto output_1_4 = F_FULL(n_full_4, k_full_4);
            int n_gold_4 = 18 ;
            int k_gold_4 = 964 ;
            auto output_2_4 = f_gold(n_gold_4, k_gold_4);
            if (Test::AreEquivalent(output_1_4, output_2_4)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4 output1=" << output_1_4 << " output2=" << output_2_4 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_5 = 20 ;
            int k_full_5 = 923 ;
            auto output_1_5 = F_FULL(n_full_5, k_full_5);
            int n_gold_5 = 20 ;
            int k_gold_5 = 923 ;
            auto output_2_5 = f_gold(n_gold_5, k_gold_5);
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
            int n_full_6 = 15 ;
            int k_full_6 = 997 ;
            auto output_1_6 = F_FULL(n_full_6, k_full_6);
            int n_gold_6 = 15 ;
            int k_gold_6 = 997 ;
            auto output_2_6 = f_gold(n_gold_6, k_gold_6);
            if (Test::AreEquivalent(output_1_6, output_2_6)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=6 output1=" << output_1_6 << " output2=" << output_2_6 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=6 | error " << e.what() << endl;
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