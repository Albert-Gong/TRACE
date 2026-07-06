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
  int count [ n + 1 ];
  count [ 0 ] = 0;
  for ( int i = 1;
  i <= n;
  i ++ ) {
    if ( i > m ) count [ i ] = count [ i - 1 ] + count [ i - m ];
    else if ( i < m ) count [ i ] = 1;
    else count [ i ] = 2;
  }
  return count [ n ];
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
            int n_full_4023 = 1001195 ;
            int m_full_4023 = 500450 ;
            auto output_1_4023 = F_FULL(n_full_4023, m_full_4023);
            int n_gold_4023 = 1001195 ;
            int m_gold_4023 = 500450 ;
            auto output_2_4023 = f_gold(n_gold_4023, m_gold_4023);
            if (Test::AreEquivalent(output_1_4023, output_2_4023)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4023 output1=" << output_1_4023 << " output2=" << output_2_4023 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4023 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_1003 = 1004752 ;
            int m_full_1003 = 501874 ;
            auto output_1_1003 = F_FULL(n_full_1003, m_full_1003);
            int n_gold_1003 = 1004752 ;
            int m_gold_1003 = 501874 ;
            auto output_2_1003 = f_gold(n_gold_1003, m_gold_1003);
            if (Test::AreEquivalent(output_1_1003, output_2_1003)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1003 output1=" << output_1_1003 << " output2=" << output_2_1003 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1003 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_1004 = 1004010 ;
            int m_full_1004 = 502459 ;
            auto output_1_1004 = F_FULL(n_full_1004, m_full_1004);
            int n_gold_1004 = 1004010 ;
            int m_gold_1004 = 502459 ;
            auto output_2_1004 = f_gold(n_gold_1004, m_gold_1004);
            if (Test::AreEquivalent(output_1_1004, output_2_1004)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1004 output1=" << output_1_1004 << " output2=" << output_2_1004 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1004 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2016 = 1000047 ;
            int m_full_2016 = 500383 ;
            auto output_1_2016 = F_FULL(n_full_2016, m_full_2016);
            int n_gold_2016 = 1000047 ;
            int m_gold_2016 = 500383 ;
            auto output_2_2016 = f_gold(n_gold_2016, m_gold_2016);
            if (Test::AreEquivalent(output_1_2016, output_2_2016)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2016 output1=" << output_1_2016 << " output2=" << output_2_2016 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2016 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2015 = 1001335 ;
            int m_full_2015 = 500832 ;
            auto output_1_2015 = F_FULL(n_full_2015, m_full_2015);
            int n_gold_2015 = 1001335 ;
            int m_gold_2015 = 500832 ;
            auto output_2_2015 = f_gold(n_gold_2015, m_gold_2015);
            if (Test::AreEquivalent(output_1_2015, output_2_2015)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2015 output1=" << output_1_2015 << " output2=" << output_2_2015 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2015 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4012 = 999995 ;
            int m_full_4012 = 499979 ;
            auto output_1_4012 = F_FULL(n_full_4012, m_full_4012);
            int n_gold_4012 = 999995 ;
            int m_gold_4012 = 499979 ;
            auto output_2_4012 = f_gold(n_gold_4012, m_gold_4012);
            if (Test::AreEquivalent(output_1_4012, output_2_4012)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4012 output1=" << output_1_4012 << " output2=" << output_2_4012 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4012 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3018 = 1002137 ;
            int m_full_3018 = 498775 ;
            auto output_1_3018 = F_FULL(n_full_3018, m_full_3018);
            int n_gold_3018 = 1002137 ;
            int m_gold_3018 = 498775 ;
            auto output_2_3018 = f_gold(n_gold_3018, m_gold_3018);
            if (Test::AreEquivalent(output_1_3018, output_2_3018)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3018 output1=" << output_1_3018 << " output2=" << output_2_3018 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3018 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3008 = 1004699 ;
            int m_full_3008 = 501675 ;
            auto output_1_3008 = F_FULL(n_full_3008, m_full_3008);
            int n_gold_3008 = 1004699 ;
            int m_gold_3008 = 501675 ;
            auto output_2_3008 = f_gold(n_gold_3008, m_gold_3008);
            if (Test::AreEquivalent(output_1_3008, output_2_3008)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3008 output1=" << output_1_3008 << " output2=" << output_2_3008 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3008 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3023 = 1000524 ;
            int m_full_3023 = 500597 ;
            auto output_1_3023 = F_FULL(n_full_3023, m_full_3023);
            int n_gold_3023 = 1000524 ;
            int m_gold_3023 = 500597 ;
            auto output_2_3023 = f_gold(n_gold_3023, m_gold_3023);
            if (Test::AreEquivalent(output_1_3023, output_2_3023)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3023 output1=" << output_1_3023 << " output2=" << output_2_3023 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3023 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3000 = 921682 ;
            int m_full_3000 = 452736 ;
            auto output_1_3000 = F_FULL(n_full_3000, m_full_3000);
            int n_gold_3000 = 921682 ;
            int m_gold_3000 = 452736 ;
            auto output_2_3000 = f_gold(n_gold_3000, m_gold_3000);
            if (Test::AreEquivalent(output_1_3000, output_2_3000)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3000 output1=" << output_1_3000 << " output2=" << output_2_3000 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3000 | error " << e.what() << endl;
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