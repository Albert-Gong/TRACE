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
int f_gold ( int m, int n ) {
  long long factorCount [ n + 1 ];
  bool prime [ n + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) {
    factorCount [ i ] = 0;
    prime [ i ] = true;
  }
  for ( int i = 2;
  i <= n;
  i ++ ) {
    if ( prime [ i ] == true ) {
      factorCount [ i ] = 1;
      for ( int j = i * 2;
      j <= n;
      j += i ) {
        factorCount [ j ] ++;
        prime [ j ] = false;
      }
    }
  }
  int max = factorCount [ m ];
  int num = m;
  for ( int i = m;
  i <= n;
  i ++ ) {
    if ( factorCount [ i ] > max ) {
      max = factorCount [ i ];
      num = i;
    }
  }
  return num;
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
            int m_full_4005 = 258 ;
            int n_full_4005 = 925321 ;
            auto output_1_4005 = F_FULL(m_full_4005, n_full_4005);
            int m_gold_4005 = 258 ;
            int n_gold_4005 = 925321 ;
            auto output_2_4005 = f_gold(m_gold_4005, n_gold_4005);
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
            int m_full_4000 = 19453 ;
            int n_full_4000 = 893882 ;
            auto output_1_4000 = F_FULL(m_full_4000, n_full_4000);
            int m_gold_4000 = 19453 ;
            int n_gold_4000 = 893882 ;
            auto output_2_4000 = f_gold(m_gold_4000, n_gold_4000);
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
            int m_full_22 = 3080 ;
            int n_full_22 = 880168 ;
            auto output_1_22 = F_FULL(m_full_22, n_full_22);
            int m_gold_22 = 3080 ;
            int n_gold_22 = 880168 ;
            auto output_2_22 = f_gold(m_gold_22, n_gold_22);
            if (Test::AreEquivalent(output_1_22, output_2_22)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=22 output1=" << output_1_22 << " output2=" << output_2_22 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=22 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_1008 = 799 ;
            int n_full_1008 = 845115 ;
            auto output_1_1008 = F_FULL(m_full_1008, n_full_1008);
            int m_gold_1008 = 799 ;
            int n_gold_1008 = 845115 ;
            auto output_2_1008 = f_gold(m_gold_1008, n_gold_1008);
            if (Test::AreEquivalent(output_1_1008, output_2_1008)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1008 output1=" << output_1_1008 << " output2=" << output_2_1008 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1008 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_3006 = 839 ;
            int n_full_3006 = 909713 ;
            auto output_1_3006 = F_FULL(m_full_3006, n_full_3006);
            int m_gold_3006 = 839 ;
            int n_gold_3006 = 909713 ;
            auto output_2_3006 = f_gold(m_gold_3006, n_gold_3006);
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
            int m_full_2000 = 3800 ;
            int n_full_2000 = 920392 ;
            auto output_1_2000 = F_FULL(m_full_2000, n_full_2000);
            int m_gold_2000 = 3800 ;
            int n_gold_2000 = 920392 ;
            auto output_2_2000 = f_gold(m_gold_2000, n_gold_2000);
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
            int m_full_21 = 9504 ;
            int n_full_21 = 839824 ;
            auto output_1_21 = F_FULL(m_full_21, n_full_21);
            int m_gold_21 = 9504 ;
            int n_gold_21 = 839824 ;
            auto output_2_21 = f_gold(m_gold_21, n_gold_21);
            if (Test::AreEquivalent(output_1_21, output_2_21)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=21 output1=" << output_1_21 << " output2=" << output_2_21 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=21 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_1007 = 963 ;
            int n_full_1007 = 734221 ;
            auto output_1_1007 = F_FULL(m_full_1007, n_full_1007);
            int m_gold_1007 = 963 ;
            int n_gold_1007 = 734221 ;
            auto output_2_1007 = f_gold(m_gold_1007, n_gold_1007);
            if (Test::AreEquivalent(output_1_1007, output_2_1007)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=1007 output1=" << output_1_1007 << " output2=" << output_2_1007 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=1007 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int m_full_3003 = 14130 ;
            int n_full_3003 = 791977 ;
            auto output_1_3003 = F_FULL(m_full_3003, n_full_3003);
            int m_gold_3003 = 14130 ;
            int n_gold_3003 = 791977 ;
            auto output_2_3003 = f_gold(m_gold_3003, n_gold_3003);
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
            int m_full_3005 = 13147 ;
            int n_full_3005 = 729656 ;
            auto output_1_3005 = F_FULL(m_full_3005, n_full_3005);
            int m_gold_3005 = 13147 ;
            int n_gold_3005 = 729656 ;
            auto output_2_3005 = f_gold(m_gold_3005, n_gold_3005);
            if (Test::AreEquivalent(output_1_3005, output_2_3005)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3005 output1=" << output_1_3005 << " output2=" << output_2_3005 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3005 | error " << e.what() << endl;
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