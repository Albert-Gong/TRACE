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
  int res = 0;
  for ( int x = 0;
  x * x < n;
  x ++ ) for ( int y = 0;
  x * x + y * y < n;
  y ++ ) res ++;
  return res;
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
            int n_full_3006 = 20000000 ;
            auto output_1_3006 = F_FULL(n_full_3006);
            int n_gold_3006 = 20000000 ;
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
            int n_full_3019 = 15999961 ;
            auto output_1_3019 = F_FULL(n_full_3019);
            int n_gold_3019 = 15999961 ;
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
            int n_full_1006 = 15000000 ;
            auto output_1_1006 = F_FULL(n_full_1006);
            int n_gold_1006 = 15000000 ;
            auto output_2_1006 = f_gold(n_gold_1006);
            if (Test::AreEquivalent(output_1_1006, output_2_1006)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1006 output1=" << output_1_1006 << " output2=" << output_2_1006 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1006 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2004 = 9979358 ;
            auto output_1_2004 = F_FULL(n_full_2004);
            int n_gold_2004 = 9979358 ;
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
            int n_full_4000 = 9991921 ;
            auto output_1_4000 = F_FULL(n_full_4000);
            int n_gold_4000 = 9991921 ;
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
            int n_full_3010 = 9992862 ;
            auto output_1_3010 = F_FULL(n_full_3010);
            int n_gold_3010 = 9992862 ;
            auto output_2_3010 = f_gold(n_gold_3010);
            if (Test::AreEquivalent(output_1_3010, output_2_3010)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3010 output1=" << output_1_3010 << " output2=" << output_2_3010 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3010 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_17 = 9999860 ;
            auto output_1_17 = F_FULL(n_full_17);
            int n_gold_17 = 9999860 ;
            auto output_2_17 = f_gold(n_gold_17);
            if (Test::AreEquivalent(output_1_17, output_2_17)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=17 output1=" << output_1_17 << " output2=" << output_2_17 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=17 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3005 = 9978553 ;
            auto output_1_3005 = F_FULL(n_full_3005);
            int n_gold_3005 = 9978553 ;
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
            int n_full_3018 = 9997036 ;
            auto output_1_3018 = F_FULL(n_full_3018);
            int n_gold_3018 = 9997036 ;
            auto output_2_3018 = f_gold(n_gold_3018);
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
            int n_full_2008 = 9560756 ;
            auto output_1_2008 = F_FULL(n_full_2008);
            int n_gold_2008 = 9560756 ;
            auto output_2_2008 = f_gold(n_gold_2008);
            if (Test::AreEquivalent(output_1_2008, output_2_2008)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2008 output1=" << output_1_2008 << " output2=" << output_2_2008 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2008 | error " << e.what() << endl;
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