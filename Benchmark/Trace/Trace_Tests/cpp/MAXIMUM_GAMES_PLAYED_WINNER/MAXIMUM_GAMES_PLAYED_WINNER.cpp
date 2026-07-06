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
int f_gold ( int N ) {
  int dp [ N ];
  dp [ 0 ] = 1;
  dp [ 1 ] = 2;
  int i = 2;
  do {
    dp [ i ] = dp [ i - 1 ] + dp [ i - 2 ];
  }
  while ( dp [ i ++ ] <= N );
  return ( i - 2 );
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
            int N_full_2006 = 2000000 ;
            auto output_1_2006 = F_FULL(N_full_2006);
            int N_gold_2006 = 2000000 ;
            auto output_2_2006 = f_gold(N_gold_2006);
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
            int N_full_4001 = 2000000 ;
            auto output_1_4001 = F_FULL(N_full_4001);
            int N_gold_4001 = 2000000 ;
            auto output_2_4001 = f_gold(N_gold_4001);
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
            int N_full_2002 = 1000000 ;
            auto output_1_2002 = F_FULL(N_full_2002);
            int N_gold_2002 = 1000000 ;
            auto output_2_2002 = f_gold(N_gold_2002);
            if (Test::AreEquivalent(output_1_2002, output_2_2002)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2002 output1=" << output_1_2002 << " output2=" << output_2_2002 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2002 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int N_full_3003 = 2000000 ;
            auto output_1_3003 = F_FULL(N_full_3003);
            int N_gold_3003 = 2000000 ;
            auto output_2_3003 = f_gold(N_gold_3003);
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
            int N_full_4002 = 1000000 ;
            auto output_1_4002 = F_FULL(N_full_4002);
            int N_gold_4002 = 1000000 ;
            auto output_2_4002 = f_gold(N_gold_4002);
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
            int N_full_3006 = 1500000 ;
            auto output_1_3006 = F_FULL(N_full_3006);
            int N_gold_3006 = 1500000 ;
            auto output_2_3006 = f_gold(N_gold_3006);
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
            int N_full_3004 = 832041 ;
            auto output_1_3004 = F_FULL(N_full_3004);
            int N_gold_3004 = 832041 ;
            auto output_2_3004 = f_gold(N_gold_3004);
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
            int N_full_3005 = 1000000 ;
            auto output_1_3005 = F_FULL(N_full_3005);
            int N_gold_3005 = 1000000 ;
            auto output_2_3005 = f_gold(N_gold_3005);
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
            int N_full_1000 = 1000000 ;
            auto output_1_1000 = F_FULL(N_full_1000);
            int N_gold_1000 = 1000000 ;
            auto output_2_1000 = f_gold(N_gold_1000);
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
            int N_full_0 = 100 ;
            auto output_1_0 = F_FULL(N_full_0);
            int N_gold_0 = 100 ;
            auto output_2_0 = f_gold(N_gold_0);
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