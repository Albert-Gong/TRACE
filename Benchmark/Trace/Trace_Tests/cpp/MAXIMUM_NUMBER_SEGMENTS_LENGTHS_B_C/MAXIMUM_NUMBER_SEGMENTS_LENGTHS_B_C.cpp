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
int f_gold ( int n, int a, int b, int c ) {
  int dp [ n + 1 ];
  memset ( dp, - 1, sizeof ( dp ) );
  dp [ 0 ] = 0;
  for ( int i = 0;
  i < n;
  i ++ ) {
    if ( dp [ i ] != - 1 ) {
      if ( i + a <= n ) dp [ i + a ] = max ( dp [ i ] + 1, dp [ i + a ] );
      if ( i + b <= n ) dp [ i + b ] = max ( dp [ i ] + 1, dp [ i + b ] );
      if ( i + c <= n ) dp [ i + c ] = max ( dp [ i ] + 1, dp [ i + c ] );
    }
  }
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
            int n_full_1016 = 1000000 ;
            int a_full_1016 = 147 ;
            int b_full_1016 = 276 ;
            int c_full_1016 = 709 ;
            auto output_1_1016 = F_FULL(n_full_1016, a_full_1016, b_full_1016, c_full_1016);
            int n_gold_1016 = 1000000 ;
            int a_gold_1016 = 147 ;
            int b_gold_1016 = 276 ;
            int c_gold_1016 = 709 ;
            auto output_2_1016 = f_gold(n_gold_1016, a_gold_1016, b_gold_1016, c_gold_1016);
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
            int n_full_3006 = 999999 ;
            int a_full_3006 = 2 ;
            int b_full_3006 = 109 ;
            int c_full_3006 = 509 ;
            auto output_1_3006 = F_FULL(n_full_3006, a_full_3006, b_full_3006, c_full_3006);
            int n_gold_3006 = 999999 ;
            int a_gold_3006 = 2 ;
            int b_gold_3006 = 109 ;
            int c_gold_3006 = 509 ;
            auto output_2_3006 = f_gold(n_gold_3006, a_gold_3006, b_gold_3006, c_gold_3006);
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
            int n_full_2000 = 999999 ;
            int a_full_2000 = 13 ;
            int b_full_2000 = 87 ;
            int c_full_2000 = 856 ;
            auto output_1_2000 = F_FULL(n_full_2000, a_full_2000, b_full_2000, c_full_2000);
            int n_gold_2000 = 999999 ;
            int a_gold_2000 = 13 ;
            int b_gold_2000 = 87 ;
            int c_gold_2000 = 856 ;
            auto output_2_2000 = f_gold(n_gold_2000, a_gold_2000, b_gold_2000, c_gold_2000);
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
            int n_full_20 = 1000000 ;
            int a_full_20 = 45 ;
            int b_full_20 = 148 ;
            int c_full_20 = 245 ;
            auto output_1_20 = F_FULL(n_full_20, a_full_20, b_full_20, c_full_20);
            int n_gold_20 = 1000000 ;
            int a_gold_20 = 45 ;
            int b_gold_20 = 148 ;
            int c_gold_20 = 245 ;
            auto output_2_20 = f_gold(n_gold_20, a_gold_20, b_gold_20, c_gold_20);
            if (Test::AreEquivalent(output_1_20, output_2_20)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=20 output1=" << output_1_20 << " output2=" << output_2_20 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=20 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3001 = 999995 ;
            int a_full_3001 = 5 ;
            int b_full_3001 = 317 ;
            int c_full_3001 = 1009 ;
            auto output_1_3001 = F_FULL(n_full_3001, a_full_3001, b_full_3001, c_full_3001);
            int n_gold_3001 = 999995 ;
            int a_gold_3001 = 5 ;
            int b_gold_3001 = 317 ;
            int c_gold_3001 = 1009 ;
            auto output_2_3001 = f_gold(n_gold_3001, a_gold_3001, b_gold_3001, c_gold_3001);
            if (Test::AreEquivalent(output_1_3001, output_2_3001)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3001 output1=" << output_1_3001 << " output2=" << output_2_3001 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3001 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_1005 = 999999 ;
            int a_full_1005 = 3 ;
            int b_full_1005 = 456 ;
            int c_full_1005 = 965 ;
            auto output_1_1005 = F_FULL(n_full_1005, a_full_1005, b_full_1005, c_full_1005);
            int n_gold_1005 = 999999 ;
            int a_gold_1005 = 3 ;
            int b_gold_1005 = 456 ;
            int c_gold_1005 = 965 ;
            auto output_2_1005 = f_gold(n_gold_1005, a_gold_1005, b_gold_1005, c_gold_1005);
            if (Test::AreEquivalent(output_1_1005, output_2_1005)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1005 output1=" << output_1_1005 << " output2=" << output_2_1005 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1005 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4021 = 999999 ;
            int a_full_4021 = 5 ;
            int b_full_4021 = 200 ;
            int c_full_4021 = 1001 ;
            auto output_1_4021 = F_FULL(n_full_4021, a_full_4021, b_full_4021, c_full_4021);
            int n_gold_4021 = 999999 ;
            int a_gold_4021 = 5 ;
            int b_gold_4021 = 200 ;
            int c_gold_4021 = 1001 ;
            auto output_2_4021 = f_gold(n_gold_4021, a_gold_4021, b_gold_4021, c_gold_4021);
            if (Test::AreEquivalent(output_1_4021, output_2_4021)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4021 output1=" << output_1_4021 << " output2=" << output_2_4021 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4021 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4005 = 999999 ;
            int a_full_4005 = 3 ;
            int b_full_4005 = 100 ;
            int c_full_4005 = 1001 ;
            auto output_1_4005 = F_FULL(n_full_4005, a_full_4005, b_full_4005, c_full_4005);
            int n_gold_4005 = 999999 ;
            int a_gold_4005 = 3 ;
            int b_gold_4005 = 100 ;
            int c_gold_4005 = 1001 ;
            auto output_2_4005 = f_gold(n_gold_4005, a_gold_4005, b_gold_4005, c_gold_4005);
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
            int n_full_4018 = 999997 ;
            int a_full_4018 = 2 ;
            int b_full_4018 = 426 ;
            int c_full_4018 = 837 ;
            auto output_1_4018 = F_FULL(n_full_4018, a_full_4018, b_full_4018, c_full_4018);
            int n_gold_4018 = 999997 ;
            int a_gold_4018 = 2 ;
            int b_gold_4018 = 426 ;
            int c_gold_4018 = 837 ;
            auto output_2_4018 = f_gold(n_gold_4018, a_gold_4018, b_gold_4018, c_gold_4018);
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
            int n_full_2001 = 999999 ;
            int a_full_2001 = 6 ;
            int b_full_2001 = 119 ;
            int c_full_2001 = 893 ;
            auto output_1_2001 = F_FULL(n_full_2001, a_full_2001, b_full_2001, c_full_2001);
            int n_gold_2001 = 999999 ;
            int a_gold_2001 = 6 ;
            int b_gold_2001 = 119 ;
            int c_gold_2001 = 893 ;
            auto output_2_2001 = f_gold(n_gold_2001, a_gold_2001, b_gold_2001, c_gold_2001);
            if (Test::AreEquivalent(output_1_2001, output_2_2001)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2001 output1=" << output_1_2001 << " output2=" << output_2_2001 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2001 | error " << e.what() << endl;
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