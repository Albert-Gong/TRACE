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
  int table [ n + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) table [ i ] = n - i;
  for ( int i = n;
  i >= 1;
  i -- ) {
    if ( ! ( i % 2 ) ) table [ i / 2 ] = min ( table [ i ] + 1, table [ i / 2 ] );
    if ( ! ( i % 3 ) ) table [ i / 3 ] = min ( table [ i ] + 1, table [ i / 3 ] );
  }
  return table [ 1 ];
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
            int n_full_3006 = 1048576 ;
            auto output_1_3006 = F_FULL(n_full_3006);
            int n_gold_3006 = 1048576 ;
            auto output_2_3006 = f_gold(n_gold_3006);
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
            int n_full_4003 = 999991 ;
            auto output_1_4003 = F_FULL(n_full_4003);
            int n_gold_4003 = 999991 ;
            auto output_2_4003 = f_gold(n_gold_4003);
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
            int n_full_4004 = 999999 ;
            auto output_1_4004 = F_FULL(n_full_4004);
            int n_gold_4004 = 999999 ;
            auto output_2_4004 = f_gold(n_gold_4004);
            if (Test::AreEquivalent(output_1_4004, output_2_4004)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4004 output1=" << output_1_4004 << " output2=" << output_2_4004 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4004 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_1000 = 999936 ;
            auto output_1_1000 = F_FULL(n_full_1000);
            int n_gold_1000 = 999936 ;
            auto output_2_1000 = f_gold(n_gold_1000);
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
            int n_full_3004 = 999997 ;
            auto output_1_3004 = F_FULL(n_full_3004);
            int n_gold_3004 = 999997 ;
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
            int n_full_4 = 1000000 ;
            auto output_1_4 = F_FULL(n_full_4);
            int n_gold_4 = 1000000 ;
            auto output_2_4 = f_gold(n_gold_4);
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
            int n_full_11 = 999983 ;
            auto output_1_11 = F_FULL(n_full_11);
            int n_gold_11 = 999983 ;
            auto output_2_11 = f_gold(n_gold_11);
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
            int n_full_3001 = 999987 ;
            auto output_1_3001 = F_FULL(n_full_3001);
            int n_gold_3001 = 999987 ;
            auto output_2_3001 = f_gold(n_gold_3001);
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
            int n_full_3005 = 1048574 ;
            auto output_1_3005 = F_FULL(n_full_3005);
            int n_gold_3005 = 1048574 ;
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
            int n_full_2005 = 999983 ;
            auto output_1_2005 = F_FULL(n_full_2005);
            int n_gold_2005 = 999983 ;
            auto output_2_2005 = f_gold(n_gold_2005);
            if (Test::AreEquivalent(output_1_2005, output_2_2005)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2005 output1=" << output_1_2005 << " output2=" << output_2_2005 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2005 | error " << e.what() << endl;
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