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
int f_gold ( int n, int m ) {
  int dp [ m + 1 ] [ n + 1 ];
  for ( int i = 0;
  i <= m;
  i ++ ) dp [ i ] [ 0 ] = 1;
  for ( int i = 0;
  i <= m;
  i ++ ) dp [ 0 ] [ i ] = 1;
  for ( int i = 1;
  i <= m;
  i ++ ) for ( int j = 1;
  j <= n;
  j ++ ) dp [ i ] [ j ] = dp [ i - 1 ] [ j ] + dp [ i - 1 ] [ j - 1 ] + dp [ i ] [ j - 1 ];
  return dp [ m ] [ n ];
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
            int n_full_19 = 1356 ;
            int m_full_19 = 1419 ;
            auto output_1_19 = F_FULL(n_full_19, m_full_19);
            int n_gold_19 = 1356 ;
            int m_gold_19 = 1419 ;
            auto output_2_19 = f_gold(n_gold_19, m_gold_19);
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
            int n_full_4002 = 1542 ;
            int m_full_4002 = 1308 ;
            auto output_1_4002 = F_FULL(n_full_4002, m_full_4002);
            int n_gold_4002 = 1542 ;
            int m_gold_4002 = 1308 ;
            auto output_2_4002 = f_gold(n_gold_4002, m_gold_4002);
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
            int n_full_1002 = 1361 ;
            int m_full_1002 = 1333 ;
            auto output_1_1002 = F_FULL(n_full_1002, m_full_1002);
            int n_gold_1002 = 1361 ;
            int m_gold_1002 = 1333 ;
            auto output_2_1002 = f_gold(n_gold_1002, m_gold_1002);
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
            int n_full_20 = 1153 ;
            int m_full_20 = 1345 ;
            auto output_1_20 = F_FULL(n_full_20, m_full_20);
            int n_gold_20 = 1153 ;
            int m_gold_20 = 1345 ;
            auto output_2_20 = f_gold(n_gold_20, m_gold_20);
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
            int n_full_18 = 1056 ;
            int m_full_18 = 1176 ;
            auto output_1_18 = F_FULL(n_full_18, m_full_18);
            int n_gold_18 = 1056 ;
            int m_gold_18 = 1176 ;
            auto output_2_18 = f_gold(n_gold_18, m_gold_18);
            if (Test::AreEquivalent(output_1_18, output_2_18)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=18 output1=" << output_1_18 << " output2=" << output_2_18 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=18 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4000 = 1403 ;
            int m_full_4000 = 1347 ;
            auto output_1_4000 = F_FULL(n_full_4000, m_full_4000);
            int n_gold_4000 = 1403 ;
            int m_gold_4000 = 1347 ;
            auto output_2_4000 = f_gold(n_gold_4000, m_gold_4000);
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
            int n_full_2006 = 989 ;
            int m_full_2006 = 1022 ;
            auto output_1_2006 = F_FULL(n_full_2006, m_full_2006);
            int n_gold_2006 = 989 ;
            int m_gold_2006 = 1022 ;
            auto output_2_2006 = f_gold(n_gold_2006, m_gold_2006);
            if (Test::AreEquivalent(output_1_2006, output_2_2006)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2006 output1=" << output_1_2006 << " output2=" << output_2_2006 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2006 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2 = 1000 ;
            int m_full_2 = 1000 ;
            auto output_1_2 = F_FULL(n_full_2, m_full_2);
            int n_gold_2 = 1000 ;
            int m_gold_2 = 1000 ;
            auto output_2_2 = f_gold(n_gold_2, m_gold_2);
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
            int n_full_4 = 500 ;
            int m_full_4 = 500 ;
            auto output_1_4 = F_FULL(n_full_4, m_full_4);
            int n_gold_4 = 500 ;
            int m_gold_4 = 500 ;
            auto output_2_4 = f_gold(n_gold_4, m_gold_4);
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
            int n_full_0 = 99 ;
            int m_full_0 = 99 ;
            auto output_1_0 = F_FULL(n_full_0, m_full_0);
            int n_gold_0 = 99 ;
            int m_gold_0 = 99 ;
            auto output_2_0 = f_gold(n_gold_0, m_gold_0);
            if (Test::AreEquivalent(output_1_0, output_2_0)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=0 output1=" << output_1_0 << " output2=" << output_2_0 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=0 | error " << e.what() << endl;
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