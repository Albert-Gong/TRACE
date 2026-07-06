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
double f_gold ( double a, double b ) {
  double mod;
  if ( a < 0 ) mod = - a;
  else mod = a;
  if ( b < 0 ) b = - b;
  while ( mod >= b ) mod = mod - b;
  if ( a < 0 ) return - mod;
  return mod;
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
            double a_full_37 = (double) 342326.9767164772 ;
            double b_full_37 = (double) 0.16826367672615156 ;
            auto output_1_37 = F_FULL(a_full_37, b_full_37);
            double a_gold_37 = (double) 342326.9767164772 ;
            double b_gold_37 = (double) 0.16826367672615156 ;
            auto output_2_37 = f_gold(a_gold_37, b_gold_37);
            if (Test::AreEquivalent(output_1_37, output_2_37)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=37 output1=" << output_1_37 << " output2=" << output_2_37 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=37 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            double a_full_36 = (double) 348824.3341735753 ;
            double b_full_36 = (double) 0.15124660500882886 ;
            auto output_1_36 = F_FULL(a_full_36, b_full_36);
            double a_gold_36 = (double) 348824.3341735753 ;
            double b_gold_36 = (double) 0.15124660500882886 ;
            auto output_2_36 = f_gold(a_gold_36, b_gold_36);
            if (Test::AreEquivalent(output_1_36, output_2_36)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=36 output1=" << output_1_36 << " output2=" << output_2_36 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=36 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            double a_full_33 = (double) 99999.70144437911 ;
            double b_full_33 = (double) 0.3310441921599605 ;
            auto output_1_33 = F_FULL(a_full_33, b_full_33);
            double a_gold_33 = (double) 99999.70144437911 ;
            double b_gold_33 = (double) 0.3310441921599605 ;
            auto output_2_33 = f_gold(a_gold_33, b_gold_33);
            if (Test::AreEquivalent(output_1_33, output_2_33)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=33 output1=" << output_1_33 << " output2=" << output_2_33 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=33 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            double a_full_16 = (double) 99.91753873912891 ;
            double b_full_16 = (double) 0.0034478963351692498 ;
            auto output_1_16 = F_FULL(a_full_16, b_full_16);
            double a_gold_16 = (double) 99.91753873912891 ;
            double b_gold_16 = (double) 0.0034478963351692498 ;
            auto output_2_16 = f_gold(a_gold_16, b_gold_16);
            if (Test::AreEquivalent(output_1_16, output_2_16)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=16 output1=" << output_1_16 << " output2=" << output_2_16 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=16 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            double a_full_17 = (double) 99.9030982813703 ;
            double b_full_17 = (double) 0.0032469721494508366 ;
            auto output_1_17 = F_FULL(a_full_17, b_full_17);
            double a_gold_17 = (double) 99.9030982813703 ;
            double b_gold_17 = (double) 0.0032469721494508366 ;
            auto output_2_17 = f_gold(a_gold_17, b_gold_17);
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
            double a_full_34 = (double) 99999.83825699353 ;
            double b_full_34 = (double) 0.6703394342239135 ;
            auto output_1_34 = F_FULL(a_full_34, b_full_34);
            double a_gold_34 = (double) 99999.83825699353 ;
            double b_gold_34 = (double) 0.6703394342239135 ;
            auto output_2_34 = f_gold(a_gold_34, b_gold_34);
            if (Test::AreEquivalent(output_1_34, output_2_34)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=34 output1=" << output_1_34 << " output2=" << output_2_34 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=34 | error " << e.what() << endl;
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