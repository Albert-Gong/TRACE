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
int f_gold ( int n ) {
  int * dp = new int [ n + 1 ];
  dp [ 0 ] = 0;
  dp [ 1 ] = 1;
  dp [ 2 ] = 2;
  dp [ 3 ] = 3;
  for ( int i = 4;
  i <= n;
  i ++ ) {
    dp [ i ] = i;
    for ( int x = 1;
    x <= ceil ( sqrt ( i ) );
    x ++ ) {
      int temp = x * x;
      if ( temp > i ) break;
      else dp [ i ] = min ( dp [ i ], 1 + dp [ i - temp ] );
    }
  }
  int res = dp [ n ];
  delete [ ] dp;
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
            int n_full_3004 = 355249 ;
            auto output_1_3004 = F_FULL(n_full_3004);
            int n_gold_3004 = 355249 ;
            auto output_2_3004 = f_gold(n_gold_3004);
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
            int n_full_3003 = 338762 ;
            auto output_1_3003 = F_FULL(n_full_3003);
            int n_gold_3003 = 338762 ;
            auto output_2_3003 = f_gold(n_gold_3003);
            if (Test::AreEquivalent(output_1_3003, output_2_3003)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3003 output1=" << output_1_3003 << " output2=" << output_2_3003 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3003 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3005 = 289505 ;
            auto output_1_3005 = F_FULL(n_full_3005);
            int n_gold_3005 = 289505 ;
            auto output_2_3005 = f_gold(n_gold_3005);
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
            int n_full_3013 = 250083 ;
            auto output_1_3013 = F_FULL(n_full_3013);
            int n_gold_3013 = 250083 ;
            auto output_2_3013 = f_gold(n_gold_3013);
            if (Test::AreEquivalent(output_1_3013, output_2_3013)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3013 output1=" << output_1_3013 << " output2=" << output_2_3013 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3013 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3014 = 250028 ;
            auto output_1_3014 = F_FULL(n_full_3014);
            int n_gold_3014 = 250028 ;
            auto output_2_3014 = f_gold(n_gold_3014);
            if (Test::AreEquivalent(output_1_3014, output_2_3014)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3014 output1=" << output_1_3014 << " output2=" << output_2_3014 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3014 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3007 = 93420 ;
            auto output_1_3007 = F_FULL(n_full_3007);
            int n_gold_3007 = 93420 ;
            auto output_2_3007 = f_gold(n_gold_3007);
            if (Test::AreEquivalent(output_1_3007, output_2_3007)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3007 output1=" << output_1_3007 << " output2=" << output_2_3007 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3007 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4000 = 116827 ;
            auto output_1_4000 = F_FULL(n_full_4000);
            int n_gold_4000 = 116827 ;
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
            int n_full_15 = 95649 ;
            auto output_1_15 = F_FULL(n_full_15);
            int n_gold_15 = 95649 ;
            auto output_2_15 = f_gold(n_gold_15);
            if (Test::AreEquivalent(output_1_15, output_2_15)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=15 output1=" << output_1_15 << " output2=" << output_2_15 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=15 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3012 = 250084 ;
            auto output_1_3012 = F_FULL(n_full_3012);
            int n_gold_3012 = 250084 ;
            auto output_2_3012 = f_gold(n_gold_3012);
            if (Test::AreEquivalent(output_1_3012, output_2_3012)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3012 output1=" << output_1_3012 << " output2=" << output_2_3012 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3012 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_1 = 9999 ;
            auto output_1_1 = F_FULL(n_full_1);
            int n_gold_1 = 9999 ;
            auto output_2_1 = f_gold(n_gold_1);
            if (Test::AreEquivalent(output_1_1, output_2_1)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1 output1=" << output_1_1 << " output2=" << output_2_1 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1 | error " << e.what() << endl;
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