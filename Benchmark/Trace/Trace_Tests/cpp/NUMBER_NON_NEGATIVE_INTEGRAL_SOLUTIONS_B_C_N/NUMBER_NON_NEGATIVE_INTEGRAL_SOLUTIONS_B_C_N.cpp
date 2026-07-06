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
  int result = 0;
  for ( int i = 0;
  i <= n;
  i ++ ) for ( int j = 0;
  j <= n - i;
  j ++ ) for ( int k = 0;
  k <= ( n - i - j );
  k ++ ) if ( i + j + k == n ) result ++;
  return result;
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
            int n_full_4001 = 300 ;
            auto output_1_4001 = F_FULL(n_full_4001);
            int n_gold_4001 = 300 ;
            auto output_2_4001 = f_gold(n_gold_4001);
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
            int n_full_1001 = 300 ;
            auto output_1_1001 = F_FULL(n_full_1001);
            int n_gold_1001 = 300 ;
            auto output_2_1001 = f_gold(n_gold_1001);
            if (Test::AreEquivalent(output_1_1001, output_2_1001)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1001 output1=" << output_1_1001 << " output2=" << output_2_1001 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1001 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2001 = 300 ;
            auto output_1_2001 = F_FULL(n_full_2001);
            int n_gold_2001 = 300 ;
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
            int n_full_3000 = 300 ;
            auto output_1_3000 = F_FULL(n_full_3000);
            int n_gold_3000 = 300 ;
            auto output_2_3000 = f_gold(n_gold_3000);
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
            int n_full_3003 = 250 ;
            auto output_1_3003 = F_FULL(n_full_3003);
            int n_gold_3003 = 250 ;
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
            int n_full_4000 = 250 ;
            auto output_1_4000 = F_FULL(n_full_4000);
            int n_gold_4000 = 250 ;
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
            int n_full_1000 = 200 ;
            auto output_1_1000 = F_FULL(n_full_1000);
            int n_gold_1000 = 200 ;
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
            int n_full_2003 = 250 ;
            auto output_1_2003 = F_FULL(n_full_2003);
            int n_gold_2003 = 250 ;
            auto output_2_2003 = f_gold(n_gold_2003);
            if (Test::AreEquivalent(output_1_2003, output_2_2003)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2003 output1=" << output_1_2003 << " output2=" << output_2_2003 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2003 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2000 = 200 ;
            auto output_1_2000 = F_FULL(n_full_2000);
            int n_gold_2000 = 200 ;
            auto output_2_2000 = f_gold(n_gold_2000);
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
            int n_full_0 = 100 ;
            auto output_1_0 = F_FULL(n_full_0);
            int n_gold_0 = 100 ;
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



    std::cout << "|OUTPUT| total " << total_test_case_num
    << " | passed " << pass_test_case_num
    << " | exception " << exception_test_case_num << std::endl;

  }
};

int main() {
  Test::Start();
  return 0;
}