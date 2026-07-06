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
  int dp [ n + 1 ];
  dp [ 0 ] = 0, dp [ 1 ] = 1;
  for ( int i = 2;
  i <= n;
  i ++ ) dp [ i ] = max ( dp [ i / 2 ] + dp [ i / 3 ] + dp [ i / 4 ], i );
  return dp [ n ];
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
            int n_full_2001 = 1984260 ;
            auto output_1_2001 = F_FULL(n_full_2001);
            int n_gold_2001 = 1984260 ;
            auto output_2_2001 = f_gold(n_gold_2001);
            if (Test::AreEquivalent(output_1_2001, output_2_2001)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2001 output1=" << output_1_2001 << " output2=" << output_2_2001 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2001 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_1016 = 1892199 ;
            auto output_1_1016 = F_FULL(n_full_1016);
            int n_gold_1016 = 1892199 ;
            auto output_2_1016 = f_gold(n_gold_1016);
            if (Test::AreEquivalent(output_1_1016, output_2_1016)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1016 output1=" << output_1_1016 << " output2=" << output_2_1016 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1016 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4009 = 1938686 ;
            auto output_1_4009 = F_FULL(n_full_4009);
            int n_gold_4009 = 1938686 ;
            auto output_2_4009 = f_gold(n_gold_4009);
            if (Test::AreEquivalent(output_1_4009, output_2_4009)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4009 output1=" << output_1_4009 << " output2=" << output_2_4009 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4009 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4020 = 1973999 ;
            auto output_1_4020 = F_FULL(n_full_4020);
            int n_gold_4020 = 1973999 ;
            auto output_2_4020 = f_gold(n_gold_4020);
            if (Test::AreEquivalent(output_1_4020, output_2_4020)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4020 output1=" << output_1_4020 << " output2=" << output_2_4020 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4020 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4007 = 1976710 ;
            auto output_1_4007 = F_FULL(n_full_4007);
            int n_gold_4007 = 1976710 ;
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
            int n_full_4005 = 1981062 ;
            auto output_1_4005 = F_FULL(n_full_4005);
            int n_gold_4005 = 1981062 ;
            auto output_2_4005 = f_gold(n_gold_4005);
            if (Test::AreEquivalent(output_1_4005, output_2_4005)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4005 output1=" << output_1_4005 << " output2=" << output_2_4005 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4005 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4008 = 1977486 ;
            auto output_1_4008 = F_FULL(n_full_4008);
            int n_gold_4008 = 1977486 ;
            auto output_2_4008 = f_gold(n_gold_4008);
            if (Test::AreEquivalent(output_1_4008, output_2_4008)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4008 output1=" << output_1_4008 << " output2=" << output_2_4008 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4008 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4011 = 1998957 ;
            auto output_1_4011 = F_FULL(n_full_4011);
            int n_gold_4011 = 1998957 ;
            auto output_2_4011 = f_gold(n_gold_4011);
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
            int n_full_4006 = 1904538 ;
            auto output_1_4006 = F_FULL(n_full_4006);
            int n_gold_4006 = 1904538 ;
            auto output_2_4006 = f_gold(n_gold_4006);
            if (Test::AreEquivalent(output_1_4006, output_2_4006)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4006 output1=" << output_1_4006 << " output2=" << output_2_4006 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4006 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4012 = 1954794 ;
            auto output_1_4012 = F_FULL(n_full_4012);
            int n_gold_4012 = 1954794 ;
            auto output_2_4012 = f_gold(n_gold_4012);
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