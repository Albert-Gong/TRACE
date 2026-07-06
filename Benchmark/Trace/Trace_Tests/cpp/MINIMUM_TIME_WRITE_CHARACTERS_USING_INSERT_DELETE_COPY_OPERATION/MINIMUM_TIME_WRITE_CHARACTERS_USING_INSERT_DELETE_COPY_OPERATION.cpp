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
int f_gold ( int N, int insert, int remove, int copy ) {
  if ( N == 0 ) return 0;
  if ( N == 1 ) return insert;
  int dp [ N + 1 ];
  memset ( dp, 0, sizeof ( dp ) );
  for ( int i = 1;
  i <= N;
  i ++ ) {
    if ( i % 2 == 0 ) dp [ i ] = min ( dp [ i - 1 ] + insert, dp [ i / 2 ] + copy );
    else dp [ i ] = min ( dp [ i - 1 ] + insert, dp [ ( i + 1 ) / 2 ] + copy + remove );
  }
  return dp [ N ];
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
            int N_full_4011 = 1534735 ;
            int insert_full_4011 = 40 ;
            int remove_full_4011 = 675442 ;
            int copy_full_4011 = 4 ;
            auto output_1_4011 = F_FULL(N_full_4011, insert_full_4011, remove_full_4011, copy_full_4011);
            int N_gold_4011 = 1534735 ;
            int insert_gold_4011 = 40 ;
            int remove_gold_4011 = 675442 ;
            int copy_gold_4011 = 4 ;
            auto output_2_4011 = f_gold(N_gold_4011, insert_gold_4011, remove_gold_4011, copy_gold_4011);
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
            int N_full_4002 = 1461933 ;
            int insert_full_4002 = 36 ;
            int remove_full_4002 = 474708 ;
            int copy_full_4002 = 3 ;
            auto output_1_4002 = F_FULL(N_full_4002, insert_full_4002, remove_full_4002, copy_full_4002);
            int N_gold_4002 = 1461933 ;
            int insert_gold_4002 = 36 ;
            int remove_gold_4002 = 474708 ;
            int copy_gold_4002 = 3 ;
            auto output_2_4002 = f_gold(N_gold_4002, insert_gold_4002, remove_gold_4002, copy_gold_4002);
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
            int N_full_4024 = 966001 ;
            int insert_full_4024 = 691854 ;
            int remove_full_4024 = 4277 ;
            int copy_full_4024 = 74 ;
            auto output_1_4024 = F_FULL(N_full_4024, insert_full_4024, remove_full_4024, copy_full_4024);
            int N_gold_4024 = 966001 ;
            int insert_gold_4024 = 691854 ;
            int remove_gold_4024 = 4277 ;
            int copy_gold_4024 = 74 ;
            auto output_2_4024 = f_gold(N_gold_4024, insert_gold_4024, remove_gold_4024, copy_gold_4024);
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
            int N_full_4009 = 1984375 ;
            int insert_full_4009 = 41 ;
            int remove_full_4009 = 467757 ;
            int copy_full_4009 = 2 ;
            auto output_1_4009 = F_FULL(N_full_4009, insert_full_4009, remove_full_4009, copy_full_4009);
            int N_gold_4009 = 1984375 ;
            int insert_gold_4009 = 41 ;
            int remove_gold_4009 = 467757 ;
            int copy_gold_4009 = 2 ;
            auto output_2_4009 = f_gold(N_gold_4009, insert_gold_4009, remove_gold_4009, copy_gold_4009);
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
            int N_full_4010 = 1897061 ;
            int insert_full_4010 = 25 ;
            int remove_full_4010 = 483587 ;
            int copy_full_4010 = 1 ;
            auto output_1_4010 = F_FULL(N_full_4010, insert_full_4010, remove_full_4010, copy_full_4010);
            int N_gold_4010 = 1897061 ;
            int insert_gold_4010 = 25 ;
            int remove_gold_4010 = 483587 ;
            int copy_gold_4010 = 1 ;
            auto output_2_4010 = f_gold(N_gold_4010, insert_gold_4010, remove_gold_4010, copy_gold_4010);
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
            int N_full_1009 = 1426019 ;
            int insert_full_1009 = 3 ;
            int remove_full_1009 = 139847 ;
            int copy_full_1009 = 497 ;
            auto output_1_1009 = F_FULL(N_full_1009, insert_full_1009, remove_full_1009, copy_full_1009);
            int N_gold_1009 = 1426019 ;
            int insert_gold_1009 = 3 ;
            int remove_gold_1009 = 139847 ;
            int copy_gold_1009 = 497 ;
            auto output_2_1009 = f_gold(N_gold_1009, insert_gold_1009, remove_gold_1009, copy_gold_1009);
            if (Test::AreEquivalent(output_1_1009, output_2_1009)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1009 output1=" << output_1_1009 << " output2=" << output_2_1009 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1009 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int N_full_1004 = 994523 ;
            int insert_full_1004 = 14 ;
            int remove_full_1004 = 842 ;
            int copy_full_1004 = 438 ;
            auto output_1_1004 = F_FULL(N_full_1004, insert_full_1004, remove_full_1004, copy_full_1004);
            int N_gold_1004 = 994523 ;
            int insert_gold_1004 = 14 ;
            int remove_gold_1004 = 842 ;
            int copy_gold_1004 = 438 ;
            auto output_2_1004 = f_gold(N_gold_1004, insert_gold_1004, remove_gold_1004, copy_gold_1004);
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
            int N_full_4000 = 1373482 ;
            int insert_full_4000 = 26 ;
            int remove_full_4000 = 421475 ;
            int copy_full_4000 = 9 ;
            auto output_1_4000 = F_FULL(N_full_4000, insert_full_4000, remove_full_4000, copy_full_4000);
            int N_gold_4000 = 1373482 ;
            int insert_gold_4000 = 26 ;
            int remove_gold_4000 = 421475 ;
            int copy_gold_4000 = 9 ;
            auto output_2_4000 = f_gold(N_gold_4000, insert_gold_4000, remove_gold_4000, copy_gold_4000);
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
            int N_full_3009 = 1446329 ;
            int insert_full_3009 = 5 ;
            int remove_full_3009 = 393535 ;
            int copy_full_3009 = 79 ;
            auto output_1_3009 = F_FULL(N_full_3009, insert_full_3009, remove_full_3009, copy_full_3009);
            int N_gold_3009 = 1446329 ;
            int insert_gold_3009 = 5 ;
            int remove_gold_3009 = 393535 ;
            int copy_gold_3009 = 79 ;
            auto output_2_3009 = f_gold(N_gold_3009, insert_gold_3009, remove_gold_3009, copy_gold_3009);
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
            int N_full_4003 = 973960 ;
            int insert_full_4003 = 5 ;
            int remove_full_4003 = 53629 ;
            int copy_full_4003 = 1142 ;
            auto output_1_4003 = F_FULL(N_full_4003, insert_full_4003, remove_full_4003, copy_full_4003);
            int N_gold_4003 = 973960 ;
            int insert_gold_4003 = 5 ;
            int remove_gold_4003 = 53629 ;
            int copy_gold_4003 = 1142 ;
            auto output_2_4003 = f_gold(N_gold_4003, insert_gold_4003, remove_gold_4003, copy_gold_4003);
            if (Test::AreEquivalent(output_1_4003, output_2_4003)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4003 output1=" << output_1_4003 << " output2=" << output_2_4003 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4003 | error " << e.what() << endl;
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