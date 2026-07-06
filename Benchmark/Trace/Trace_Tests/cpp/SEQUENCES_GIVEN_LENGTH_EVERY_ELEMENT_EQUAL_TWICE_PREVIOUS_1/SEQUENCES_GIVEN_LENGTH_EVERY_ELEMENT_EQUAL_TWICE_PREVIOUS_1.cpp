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
int f_gold ( int m, int n ) {
  int T [ m + 1 ] [ n + 1 ];
  for ( int i = 0;
  i < m + 1;
  i ++ ) {
    for ( int j = 0;
    j < n + 1;
    j ++ ) {
      if ( i == 0 || j == 0 ) T [ i ] [ j ] = 0;
      else if ( i < j ) T [ i ] [ j ] = 0;
      else if ( j == 1 ) T [ i ] [ j ] = i;
      else T [ i ] [ j ] = T [ i - 1 ] [ j ] + T [ i / 2 ] [ j - 1 ];
    }
  }
  return T [ m ] [ n ];
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
            int m_full_3002 = 63685 ;
            int n_full_3002 = 30 ;
            auto output_1_3002 = F_FULL(m_full_3002, n_full_3002);
            int m_gold_3002 = 63685 ;
            int n_gold_3002 = 30 ;
            auto output_2_3002 = f_gold(m_gold_3002, n_gold_3002);
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
            int m_full_4 = 65855 ;
            int n_full_4 = 30 ;
            auto output_1_4 = F_FULL(m_full_4, n_full_4);
            int m_gold_4 = 65855 ;
            int n_gold_4 = 30 ;
            auto output_2_4 = f_gold(m_gold_4, n_gold_4);
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
            int m_full_4001 = 32397 ;
            int n_full_4001 = 48 ;
            auto output_1_4001 = F_FULL(m_full_4001, n_full_4001);
            int m_gold_4001 = 32397 ;
            int n_gold_4001 = 48 ;
            auto output_2_4001 = f_gold(m_gold_4001, n_gold_4001);
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
            int m_full_3001 = 63623 ;
            int n_full_3001 = 26 ;
            auto output_1_3001 = F_FULL(m_full_3001, n_full_3001);
            int m_gold_3001 = 63623 ;
            int n_gold_3001 = 26 ;
            auto output_2_3001 = f_gold(m_gold_3001, n_gold_3001);
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
            int m_full_3000 = 60429 ;
            int n_full_3000 = 28 ;
            auto output_1_3000 = F_FULL(m_full_3000, n_full_3000);
            int m_gold_3000 = 60429 ;
            int n_gold_3000 = 28 ;
            auto output_2_3000 = f_gold(m_gold_3000, n_gold_3000);
            if (Test::AreEquivalent(output_1_3000, output_2_3000)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3000 output1=" << output_1_3000 << " output2=" << output_2_3000 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3000 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_4006 = 39491 ;
            int n_full_4006 = 28 ;
            auto output_1_4006 = F_FULL(m_full_4006, n_full_4006);
            int m_gold_4006 = 39491 ;
            int n_gold_4006 = 28 ;
            auto output_2_4006 = f_gold(m_gold_4006, n_gold_4006);
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
            int m_full_4008 = 37073 ;
            int n_full_4008 = 28 ;
            auto output_1_4008 = F_FULL(m_full_4008, n_full_4008);
            int m_gold_4008 = 37073 ;
            int n_gold_4008 = 28 ;
            auto output_2_4008 = f_gold(m_gold_4008, n_gold_4008);
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
            int m_full_5 = 58609 ;
            int n_full_5 = 28 ;
            auto output_1_5 = F_FULL(m_full_5, n_full_5);
            int m_gold_5 = 58609 ;
            int n_gold_5 = 28 ;
            auto output_2_5 = f_gold(m_gold_5, n_gold_5);
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
            int m_full_6 = 65327 ;
            int n_full_6 = 21 ;
            auto output_1_6 = F_FULL(m_full_6, n_full_6);
            int m_gold_6 = 65327 ;
            int n_gold_6 = 21 ;
            auto output_2_6 = f_gold(m_gold_6, n_gold_6);
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
            int m_full_4007 = 36828 ;
            int n_full_4007 = 27 ;
            auto output_1_4007 = F_FULL(m_full_4007, n_full_4007);
            int m_gold_4007 = 36828 ;
            int n_gold_4007 = 27 ;
            auto output_2_4007 = f_gold(m_gold_4007, n_gold_4007);
            if (Test::AreEquivalent(output_1_4007, output_2_4007)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4007 output1=" << output_1_4007 << " output2=" << output_2_4007 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4007 | error " << e.what() << endl;
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