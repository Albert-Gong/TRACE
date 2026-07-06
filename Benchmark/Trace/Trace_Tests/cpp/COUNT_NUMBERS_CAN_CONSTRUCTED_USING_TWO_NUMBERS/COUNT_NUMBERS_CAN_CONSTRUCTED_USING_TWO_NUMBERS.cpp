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
int f_gold ( int n, int x, int y ) {
  vector < bool > arr ( n + 1, false );
  if ( x <= n ) arr [ x ] = true;
  if ( y <= n ) arr [ y ] = true;
  int result = 0;
  for ( int i = min ( x, y );
  i <= n;
  i ++ ) {
    if ( arr [ i ] ) {
      if ( i + x <= n ) arr [ i + x ] = true;
      if ( i + y <= n ) arr [ i + y ] = true;
      result ++;
    }
  }
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
            int n_full_4019 = 9999999 ;
            int x_full_4019 = 113 ;
            int y_full_4019 = 149 ;
            auto output_1_4019 = F_FULL(n_full_4019, x_full_4019, y_full_4019);
            int n_gold_4019 = 9999999 ;
            int x_gold_4019 = 113 ;
            int y_gold_4019 = 149 ;
            auto output_2_4019 = f_gold(n_gold_4019, x_gold_4019, y_gold_4019);
            if (Test::AreEquivalent(output_1_4019, output_2_4019)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4019 output1=" << output_1_4019 << " output2=" << output_2_4019 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4019 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4002 = 10000000 ;
            int x_full_4002 = 1031 ;
            int y_full_4002 = 1091 ;
            auto output_1_4002 = F_FULL(n_full_4002, x_full_4002, y_full_4002);
            int n_gold_4002 = 10000000 ;
            int x_gold_4002 = 1031 ;
            int y_gold_4002 = 1091 ;
            auto output_2_4002 = f_gold(n_gold_4002, x_gold_4002, y_gold_4002);
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
            int n_full_4009 = 9999991 ;
            int x_full_4009 = 2 ;
            int y_full_4009 = 31 ;
            auto output_1_4009 = F_FULL(n_full_4009, x_full_4009, y_full_4009);
            int n_gold_4009 = 9999991 ;
            int x_gold_4009 = 2 ;
            int y_gold_4009 = 31 ;
            auto output_2_4009 = f_gold(n_gold_4009, x_gold_4009, y_gold_4009);
            if (Test::AreEquivalent(output_1_4009, output_2_4009)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4009 output1=" << output_1_4009 << " output2=" << output_2_4009 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4009 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_1010 = 10000000 ;
            int x_full_1010 = 3 ;
            int y_full_1010 = 19 ;
            auto output_1_1010 = F_FULL(n_full_1010, x_full_1010, y_full_1010);
            int n_gold_1010 = 10000000 ;
            int x_gold_1010 = 3 ;
            int y_gold_1010 = 19 ;
            auto output_2_1010 = f_gold(n_gold_1010, x_gold_1010, y_gold_1010);
            if (Test::AreEquivalent(output_1_1010, output_2_1010)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1010 output1=" << output_1_1010 << " output2=" << output_2_1010 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1010 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_3010 = 9900000 ;
            int x_full_3010 = 157 ;
            int y_full_3010 = 174 ;
            auto output_1_3010 = F_FULL(n_full_3010, x_full_3010, y_full_3010);
            int n_gold_3010 = 9900000 ;
            int x_gold_3010 = 157 ;
            int y_gold_3010 = 174 ;
            auto output_2_3010 = f_gold(n_gold_3010, x_gold_3010, y_gold_3010);
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
            int n_full_4021 = 9999999 ;
            int x_full_4021 = 113 ;
            int y_full_4021 = 163 ;
            auto output_1_4021 = F_FULL(n_full_4021, x_full_4021, y_full_4021);
            int n_gold_4021 = 9999999 ;
            int x_gold_4021 = 113 ;
            int y_gold_4021 = 163 ;
            auto output_2_4021 = f_gold(n_gold_4021, x_gold_4021, y_gold_4021);
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
            int n_full_3009 = 9999991 ;
            int x_full_3009 = 97 ;
            int y_full_3009 = 113 ;
            auto output_1_3009 = F_FULL(n_full_3009, x_full_3009, y_full_3009);
            int n_gold_3009 = 9999991 ;
            int x_gold_3009 = 97 ;
            int y_gold_3009 = 113 ;
            auto output_2_3009 = f_gold(n_gold_3009, x_gold_3009, y_gold_3009);
            if (Test::AreEquivalent(output_1_3009, output_2_3009)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3009 output1=" << output_1_3009 << " output2=" << output_2_3009 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3009 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int n_full_4008 = 9819148 ;
            int x_full_4008 = 1009 ;
            int y_full_4008 = 1084 ;
            auto output_1_4008 = F_FULL(n_full_4008, x_full_4008, y_full_4008);
            int n_gold_4008 = 9819148 ;
            int x_gold_4008 = 1009 ;
            int y_gold_4008 = 1084 ;
            auto output_2_4008 = f_gold(n_gold_4008, x_gold_4008, y_gold_4008);
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
            int n_full_2016 = 9999999 ;
            int x_full_2016 = 107 ;
            int y_full_2016 = 157 ;
            auto output_1_2016 = F_FULL(n_full_2016, x_full_2016, y_full_2016);
            int n_gold_2016 = 9999999 ;
            int x_gold_2016 = 107 ;
            int y_gold_2016 = 157 ;
            auto output_2_2016 = f_gold(n_gold_2016, x_gold_2016, y_gold_2016);
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
            int n_full_3021 = 10000000 ;
            int x_full_3021 = 991 ;
            int y_full_3021 = 1039 ;
            auto output_1_3021 = F_FULL(n_full_3021, x_full_3021, y_full_3021);
            int n_gold_3021 = 10000000 ;
            int x_gold_3021 = 991 ;
            int y_gold_3021 = 1039 ;
            auto output_2_3021 = f_gold(n_gold_3021, x_gold_3021, y_gold_3021);
            if (Test::AreEquivalent(output_1_3021, output_2_3021)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3021 output1=" << output_1_3021 << " output2=" << output_2_3021 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3021 | error " << e.what() << endl;
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