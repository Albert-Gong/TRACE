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
  if ( n == 0 || n == 1 ) return n;
  return max ( ( f_gold ( n / 2 ) + f_gold ( n / 3 ) + f_gold ( n / 4 ) ), n );
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
            int n_full_4005 = 1995599 ;
            auto output_1_4005 = F_FULL(n_full_4005);
            int n_gold_4005 = 1995599 ;
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
            int n_full_4007 = 1991906 ;
            auto output_1_4007 = F_FULL(n_full_4007);
            int n_gold_4007 = 1991906 ;
            auto output_2_4007 = f_gold(n_gold_4007);
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
            int n_full_4004 = 1999993 ;
            auto output_1_4004 = F_FULL(n_full_4004);
            int n_gold_4004 = 1999993 ;
            auto output_2_4004 = f_gold(n_gold_4004);
            if (Test::AreEquivalent(output_1_4004, output_2_4004)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4004 output1=" << output_1_4004 << " output2=" << output_2_4004 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4004 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4008 = 1091218 ;
            auto output_1_4008 = F_FULL(n_full_4008);
            int n_gold_4008 = 1091218 ;
            auto output_2_4008 = f_gold(n_gold_4008);
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
            int n_full_4006 = 1988937 ;
            auto output_1_4006 = F_FULL(n_full_4006);
            int n_gold_4006 = 1988937 ;
            auto output_2_4006 = f_gold(n_gold_4006);
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
            int n_full_2016 = 997088 ;
            auto output_1_2016 = F_FULL(n_full_2016);
            int n_gold_2016 = 997088 ;
            auto output_2_2016 = f_gold(n_gold_2016);
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
            int n_full_4021 = 1292457 ;
            auto output_1_4021 = F_FULL(n_full_4021);
            int n_gold_4021 = 1292457 ;
            auto output_2_4021 = f_gold(n_gold_4021);
            if (Test::AreEquivalent(output_1_4021, output_2_4021)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4021 output1=" << output_1_4021 << " output2=" << output_2_4021 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4021 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_2015 = 999961 ;
            auto output_1_2015 = F_FULL(n_full_2015);
            int n_gold_2015 = 999961 ;
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
            int n_full_2010 = 1048212 ;
            auto output_1_2010 = F_FULL(n_full_2010);
            int n_gold_2010 = 1048212 ;
            auto output_2_2010 = f_gold(n_gold_2010);
            if (Test::AreEquivalent(output_1_2010, output_2_2010)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2010 output1=" << output_1_2010 << " output2=" << output_2_2010 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2010 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3017 = 953727 ;
            auto output_1_3017 = F_FULL(n_full_3017);
            int n_gold_3017 = 953727 ;
            auto output_2_3017 = f_gold(n_gold_3017);
            if (Test::AreEquivalent(output_1_3017, output_2_3017)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3017 output1=" << output_1_3017 << " output2=" << output_2_3017 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3017 | error " << e.what() << endl;
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