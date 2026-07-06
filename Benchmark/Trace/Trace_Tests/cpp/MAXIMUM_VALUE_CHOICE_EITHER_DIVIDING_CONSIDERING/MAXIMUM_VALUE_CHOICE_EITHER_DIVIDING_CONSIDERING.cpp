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
  int res [ n + 1 ];
  res [ 0 ] = 0;
  res [ 1 ] = 1;
  for ( int i = 2;
  i <= n;
  i ++ ) res [ i ] = max ( i, ( res [ i / 2 ] + res [ i / 3 ] + res [ i / 4 ] + res [ i / 5 ] ) );
  return res [ n ];
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
            int n_full_4013 = 1300000 ;
            auto output_1_4013 = F_FULL(n_full_4013);
            int n_gold_4013 = 1300000 ;
            auto output_2_4013 = f_gold(n_gold_4013);
            if (Test::AreEquivalent(output_1_4013, output_2_4013)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4013 output1=" << output_1_4013 << " output2=" << output_2_4013 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4013 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3015 = 1500000 ;
            auto output_1_3015 = F_FULL(n_full_3015);
            int n_gold_3015 = 1500000 ;
            auto output_2_3015 = f_gold(n_gold_3015);
            if (Test::AreEquivalent(output_1_3015, output_2_3015)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3015 output1=" << output_1_3015 << " output2=" << output_2_3015 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3015 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2003 = 998410 ;
            auto output_1_2003 = F_FULL(n_full_2003);
            int n_gold_2003 = 998410 ;
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
            int n_full_4010 = 1127899 ;
            auto output_1_4010 = F_FULL(n_full_4010);
            int n_gold_4010 = 1127899 ;
            auto output_2_4010 = f_gold(n_gold_4010);
            if (Test::AreEquivalent(output_1_4010, output_2_4010)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4010 output1=" << output_1_4010 << " output2=" << output_2_4010 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4010 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4003 = 1315121 ;
            auto output_1_4003 = F_FULL(n_full_4003);
            int n_gold_4003 = 1315121 ;
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
            int n_full_3020 = 1250000 ;
            auto output_1_3020 = F_FULL(n_full_3020);
            int n_gold_3020 = 1250000 ;
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
            int n_full_4020 = 1481215 ;
            auto output_1_4020 = F_FULL(n_full_4020);
            int n_gold_4020 = 1481215 ;
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
            int n_full_3013 = 961451 ;
            auto output_1_3013 = F_FULL(n_full_3013);
            int n_gold_3013 = 961451 ;
            auto output_2_3013 = f_gold(n_gold_3013);
            if (Test::AreEquivalent(output_1_3013, output_2_3013)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3013 output1=" << output_1_3013 << " output2=" << output_2_3013 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3013 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3008 = 1077459 ;
            auto output_1_3008 = F_FULL(n_full_3008);
            int n_gold_3008 = 1077459 ;
            auto output_2_3008 = f_gold(n_gold_3008);
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
            int n_full_4019 = 1003341 ;
            auto output_1_4019 = F_FULL(n_full_4019);
            int n_gold_4019 = 1003341 ;
            auto output_2_4019 = f_gold(n_gold_4019);
            if (Test::AreEquivalent(output_1_4019, output_2_4019)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4019 output1=" << output_1_4019 << " output2=" << output_2_4019 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4019 | error " << e.what() << endl;
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