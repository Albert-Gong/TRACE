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
  int DP [ n + 1 ];
  DP [ 0 ] = 0;
  DP [ 1 ] = 1;
  for ( int i = 2;
  i <= n;
  i ++ ) {
    if ( i % 2 == 0 ) DP [ i ] = DP [ i / 2 ];
    else DP [ i ] = DP [ ( i - 1 ) / 2 ] + DP [ ( i + 1 ) / 2 ];
  }
  return DP [ n ];
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
            int n_full_4005 = 1449538 ;
            auto output_1_4005 = F_FULL(n_full_4005);
            int n_gold_4005 = 1449538 ;
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
            int n_full_3019 = 1128420 ;
            auto output_1_3019 = F_FULL(n_full_3019);
            int n_gold_3019 = 1128420 ;
            auto output_2_3019 = f_gold(n_gold_3019);
            if (Test::AreEquivalent(output_1_3019, output_2_3019)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3019 output1=" << output_1_3019 << " output2=" << output_2_3019 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3019 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2015 = 1979217 ;
            auto output_1_2015 = F_FULL(n_full_2015);
            int n_gold_2015 = 1979217 ;
            auto output_2_2015 = f_gold(n_gold_2015);
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
            int n_full_4024 = 999146 ;
            auto output_1_4024 = F_FULL(n_full_4024);
            int n_gold_4024 = 999146 ;
            auto output_2_4024 = f_gold(n_gold_4024);
            if (Test::AreEquivalent(output_1_4024, output_2_4024)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4024 output1=" << output_1_4024 << " output2=" << output_2_4024 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4024 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_1013 = 964748 ;
            auto output_1_1013 = F_FULL(n_full_1013);
            int n_gold_1013 = 964748 ;
            auto output_2_1013 = f_gold(n_gold_1013);
            if (Test::AreEquivalent(output_1_1013, output_2_1013)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1013 output1=" << output_1_1013 << " output2=" << output_2_1013 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1013 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3020 = 1250597 ;
            auto output_1_3020 = F_FULL(n_full_3020);
            int n_gold_3020 = 1250597 ;
            auto output_2_3020 = f_gold(n_gold_3020);
            if (Test::AreEquivalent(output_1_3020, output_2_3020)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3020 output1=" << output_1_3020 << " output2=" << output_2_3020 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3020 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_11 = 947003 ;
            auto output_1_11 = F_FULL(n_full_11);
            int n_gold_11 = 947003 ;
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
            int n_full_4003 = 1096774 ;
            auto output_1_4003 = F_FULL(n_full_4003);
            int n_gold_4003 = 1096774 ;
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
            int n_full_3001 = 903923 ;
            auto output_1_3001 = F_FULL(n_full_3001);
            int n_gold_3001 = 903923 ;
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
            int n_full_4026 = 998476 ;
            auto output_1_4026 = F_FULL(n_full_4026);
            int n_gold_4026 = 998476 ;
            auto output_2_4026 = f_gold(n_gold_4026);
            if (Test::AreEquivalent(output_1_4026, output_2_4026)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4026 output1=" << output_1_4026 << " output2=" << output_2_4026 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4026 | error " << e.what() << endl;
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