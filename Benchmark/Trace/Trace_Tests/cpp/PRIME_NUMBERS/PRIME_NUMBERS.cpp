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
bool f_gold ( int n ) {
  if ( n <= 1 ) return false;
  for ( int i = 2;
  i < n;
  i ++ ) if ( n % i == 0 ) return false;
  return true;
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
            int n_full_2011 = 9999991 ;
            auto output_1_2011 = F_FULL(n_full_2011);
            int n_gold_2011 = 9999991 ;
            auto output_2_2011 = f_gold(n_gold_2011);
            if (Test::AreEquivalent(output_1_2011, output_2_2011)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2011 output1=" << output_1_2011 << " output2=" << output_2_2011 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2011 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_8 = 10000019 ;
            auto output_1_8 = F_FULL(n_full_8);
            int n_gold_8 = 10000019 ;
            auto output_2_8 = f_gold(n_gold_8);
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
            int n_full_15 = 999983 ;
            auto output_1_15 = F_FULL(n_full_15);
            int n_gold_15 = 999983 ;
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
            int n_full_4 = 999961 ;
            auto output_1_4 = F_FULL(n_full_4);
            int n_gold_4 = 999961 ;
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
            int n_full_2004 = 5184000 ;
            auto output_1_2004 = F_FULL(n_full_2004);
            int n_gold_2004 = 5184000 ;
            auto output_2_2004 = f_gold(n_gold_2004);
            if (Test::AreEquivalent(output_1_2004, output_2_2004)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2004 output1=" << output_1_2004 << " output2=" << output_2_2004 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2004 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3002 = 4361214 ;
            auto output_1_3002 = F_FULL(n_full_3002);
            int n_gold_3002 = 4361214 ;
            auto output_2_3002 = f_gold(n_gold_3002);
            if (Test::AreEquivalent(output_1_3002, output_2_3002)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3002 output1=" << output_1_3002 << " output2=" << output_2_3002 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3002 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3009 = 15958357 ;
            auto output_1_3009 = F_FULL(n_full_3009);
            int n_gold_3009 = 15958357 ;
            auto output_2_3009 = f_gold(n_gold_3009);
            if (Test::AreEquivalent(output_1_3009, output_2_3009)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3009 output1=" << output_1_3009 << " output2=" << output_2_3009 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3009 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_0 = 97 ;
            auto output_1_0 = F_FULL(n_full_0);
            int n_gold_0 = 97 ;
            auto output_2_0 = f_gold(n_gold_0);
            if (Test::AreEquivalent(output_1_0, output_2_0)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=0 output1=" << output_1_0 << " output2=" << output_2_0 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=0 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_9 = 99 ;
            auto output_1_9 = F_FULL(n_full_9);
            int n_gold_9 = 99 ;
            auto output_2_9 = f_gold(n_gold_9);
            if (Test::AreEquivalent(output_1_9, output_2_9)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=9 output1=" << output_1_9 << " output2=" << output_2_9 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=9 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4018 = 1014295103 ;
            auto output_1_4018 = F_FULL(n_full_4018);
            int n_gold_4018 = 1014295103 ;
            auto output_2_4018 = f_gold(n_gold_4018);
            if (Test::AreEquivalent(output_1_4018, output_2_4018)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4018 output1=" << output_1_4018 << " output2=" << output_2_4018 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4018 | error " << e.what() << endl;
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