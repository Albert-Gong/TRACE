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
  int count [ m ] [ n ];
  for ( int i = 0;
  i < m;
  i ++ ) count [ i ] [ 0 ] = 1;
  for ( int j = 0;
  j < n;
  j ++ ) count [ 0 ] [ j ] = 1;
  for ( int i = 1;
  i < m;
  i ++ ) {
    for ( int j = 1;
    j < n;
    j ++ ) count [ i ] [ j ] = count [ i - 1 ] [ j ] + count [ i ] [ j - 1 ];
  }
  return count [ m - 1 ] [ n - 1 ];
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
            int m_full_4007 = 95 ;
            int n_full_4007 = 97 ;
            auto output_1_4007 = F_FULL(m_full_4007, n_full_4007);
            int m_gold_4007 = 95 ;
            int n_gold_4007 = 97 ;
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


        try {
            total_test_case_num++;
            int m_full_2008 = 834 ;
            int n_full_2008 = 864 ;
            auto output_1_2008 = F_FULL(m_full_2008, n_full_2008);
            int m_gold_2008 = 834 ;
            int n_gold_2008 = 864 ;
            auto output_2_2008 = f_gold(m_gold_2008, n_gold_2008);
            if (Test::AreEquivalent(output_1_2008, output_2_2008)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2008 output1=" << output_1_2008 << " output2=" << output_2_2008 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2008 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_2005 = 92 ;
            int n_full_2005 = 96 ;
            auto output_1_2005 = F_FULL(m_full_2005, n_full_2005);
            int m_gold_2005 = 92 ;
            int n_gold_2005 = 96 ;
            auto output_2_2005 = f_gold(m_gold_2005, n_gold_2005);
            if (Test::AreEquivalent(output_1_2005, output_2_2005)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2005 output1=" << output_1_2005 << " output2=" << output_2_2005 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2005 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_2013 = 93 ;
            int n_full_2013 = 96 ;
            auto output_1_2013 = F_FULL(m_full_2013, n_full_2013);
            int m_gold_2013 = 93 ;
            int n_gold_2013 = 96 ;
            auto output_2_2013 = f_gold(m_gold_2013, n_gold_2013);
            if (Test::AreEquivalent(output_1_2013, output_2_2013)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2013 output1=" << output_1_2013 << " output2=" << output_2_2013 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2013 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_1014 = 1201 ;
            int n_full_1014 = 1265 ;
            auto output_1_1014 = F_FULL(m_full_1014, n_full_1014);
            int m_gold_1014 = 1201 ;
            int n_gold_1014 = 1265 ;
            auto output_2_1014 = f_gold(m_gold_1014, n_gold_1014);
            if (Test::AreEquivalent(output_1_1014, output_2_1014)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1014 output1=" << output_1_1014 << " output2=" << output_2_1014 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1014 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_4011 = 1157 ;
            int n_full_4011 = 1136 ;
            auto output_1_4011 = F_FULL(m_full_4011, n_full_4011);
            int m_gold_4011 = 1157 ;
            int n_gold_4011 = 1136 ;
            auto output_2_4011 = f_gold(m_gold_4011, n_gold_4011);
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
            int m_full_13 = 1302 ;
            int n_full_13 = 1118 ;
            auto output_1_13 = F_FULL(m_full_13, n_full_13);
            int m_gold_13 = 1302 ;
            int n_gold_13 = 1118 ;
            auto output_2_13 = f_gold(m_gold_13, n_gold_13);
            if (Test::AreEquivalent(output_1_13, output_2_13)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=13 output1=" << output_1_13 << " output2=" << output_2_13 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=13 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_0 = 90 ;
            int n_full_0 = 98 ;
            auto output_1_0 = F_FULL(m_full_0, n_full_0);
            int m_gold_0 = 90 ;
            int n_gold_0 = 98 ;
            auto output_2_0 = f_gold(m_gold_0, n_gold_0);
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
            int m_full_3001 = 99 ;
            int n_full_3001 = 92 ;
            auto output_1_3001 = F_FULL(m_full_3001, n_full_3001);
            int m_gold_3001 = 99 ;
            int n_gold_3001 = 92 ;
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
            int m_full_1010 = 95 ;
            int n_full_1010 = 99 ;
            auto output_1_1010 = F_FULL(m_full_1010, n_full_1010);
            int m_gold_1010 = 95 ;
            int n_gold_1010 = 99 ;
            auto output_2_1010 = f_gold(m_gold_1010, n_gold_1010);
            if (Test::AreEquivalent(output_1_1010, output_2_1010)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1010 output1=" << output_1_1010 << " output2=" << output_2_1010 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1010 | error " << e.what() << endl;
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