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
int f_gold ( string str ) {
  int n = str . length ( );
  int dp [ n + 1 ] [ n + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) for ( int j = 0;
  j <= n;
  j ++ ) dp [ i ] [ j ] = 0;
  for ( int i = 1;
  i <= n;
  i ++ ) {
    for ( int j = 1;
    j <= n;
    j ++ ) {
      if ( str [ i - 1 ] == str [ j - 1 ] && i != j ) dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ];
      else dp [ i ] [ j ] = max ( dp [ i ] [ j - 1 ], dp [ i - 1 ] [ j ] );
    }
  }
  return dp [ n ] [ n ];
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
            std::string str_full_2022 = "ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababfjhLjwLFrJKEB5scFSCxhNtgBGKfrlqdkkAOg2r2sRo07R42iUxxxxxxxxxx" ;
            auto output_1_2022 = F_FULL(str_full_2022);
            std::string str_gold_2022 = "ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababfjhLjwLFrJKEB5scFSCxhNtgBGKfrlqdkkAOg2r2sRo07R42iUxxxxxxxxxx" ;
            auto output_2_2022 = f_gold(str_gold_2022);
            if (Test::AreEquivalent(output_1_2022, output_2_2022)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2022 output1=" << output_1_2022 << " output2=" << output_2_2022 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2022 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_2023 = "ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababDbvugruCfB19WvKPBUFmgzxVlBqWyBzEOZiCa3cHIEt39NfIC2xxxxxxxxxx" ;
            auto output_1_2023 = F_FULL(str_full_2023);
            std::string str_gold_2023 = "ababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababDbvugruCfB19WvKPBUFmgzxVlBqWyBzEOZiCa3cHIEt39NfIC2xxxxxxxxxx" ;
            auto output_2_2023 = f_gold(str_gold_2023);
            if (Test::AreEquivalent(output_1_2023, output_2_2023)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2023 output1=" << output_1_2023 << " output2=" << output_2_2023 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2023 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_4008 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzcabcabcabcabcabcabcabcabcabcabedfedfedfedfedfedfedfedfedfedfgihgihgihgihgihgihgihgihgihgihjkljkljkljkljkljkljkljkljkljklnomnomnomnomnomnomnomnomnomnompqrpqrpqrpqrpqrpqrpqrpqrpqrpqrsutsutsutsutsutsutsutsutsutsutxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwzyzyzyzyzyzyzyzyzyzy" ;
            auto output_1_4008 = F_FULL(str_full_4008);
            std::string str_gold_4008 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzcabcabcabcabcabcabcabcabcabcabedfedfedfedfedfedfedfedfedfedfgihgihgihgihgihgihgihgihgihgihjkljkljkljkljkljkljkljkljkljklnomnomnomnomnomnomnomnomnomnompqrpqrpqrpqrpqrpqrpqrpqrpqrpqrsutsutsutsutsutsutsutsutsutsutxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwzyzyzyzyzyzyzyzyzyzy" ;
            auto output_2_4008 = f_gold(str_gold_4008);
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
            std::string str_full_3015 = "xyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyza" ;
            auto output_1_3015 = F_FULL(str_full_3015);
            std::string str_gold_3015 = "xyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyzabcxyza" ;
            auto output_2_3015 = f_gold(str_gold_3015);
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
            std::string str_full_4014 = "ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456EBF52CA641D3AFCB36124D5ECD614E53AB2F3B62" ;
            auto output_1_4014 = F_FULL(str_full_4014);
            std::string str_gold_4014 = "ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456ABCDEF123456EBF52CA641D3AFCB36124D5ECD614E53AB2F3B62" ;
            auto output_2_4014 = f_gold(str_gold_4014);
            if (Test::AreEquivalent(output_1_4014, output_2_4014)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4014 output1=" << output_1_4014 << " output2=" << output_2_4014 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4014 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_2003 = "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh12345678123456781234567812345678123456781234567812345678123456781234567812345678ABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxfbacehgdfbacehgdfbacehgdfbacehgdfbacehgd7164853271648532716485327164853271648532GFAHEBDCGFAHEBDCGFAHEBDCGFAHEBDCGFAHEBDCoklnmpjioklnmpjioklnmpjioklnmpjioklnmpjirwtvxqusrwtvxqusrwtvxqusrwtvxqusrwtvxqus" ;
            auto output_1_2003 = F_FULL(str_full_2003);
            std::string str_gold_2003 = "abcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefghabcdefgh12345678123456781234567812345678123456781234567812345678123456781234567812345678ABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopijklmnopqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxqrstuvwxfbacehgdfbacehgdfbacehgdfbacehgdfbacehgd7164853271648532716485327164853271648532GFAHEBDCGFAHEBDCGFAHEBDCGFAHEBDCGFAHEBDCoklnmpjioklnmpjioklnmpjioklnmpjioklnmpjirwtvxqusrwtvxqusrwtvxqusrwtvxqusrwtvxqus" ;
            auto output_2_2003 = f_gold(str_gold_2003);
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
            std::string str_full_4019 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighighighighighighighighighighighi123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123456456456456456456456456456456456456456456456456456456456456456456456456456456456456456456789789789789789789789789789789789789789789789789789789789789789789789789789789789789789789cabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgih321321321321321321321321321321321321321321321321321321321321564564564564564564564564564564564564564564564564564564564564789789789789789789789789789789789789789789789789789789789789" ;
            auto output_1_4019 = F_FULL(str_full_4019);
            std::string str_gold_4019 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighighighighighighighighighighighi123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123456456456456456456456456456456456456456456456456456456456456456456456456456456456456456456789789789789789789789789789789789789789789789789789789789789789789789789789789789789789789cabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfedfgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgih321321321321321321321321321321321321321321321321321321321321564564564564564564564564564564564564564564564564564564564564789789789789789789789789789789789789789789789789789789789789" ;
            auto output_2_4019 = f_gold(str_gold_4019);
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
            std::string str_full_4020 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighighighighighighighighighighighi123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123456456456456456456456456456456456456456456456456456456456456456456456456456456456456456456789789789789789789789789789789789789789789789789789789789789789789789789789789789789789789bcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcaefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihg132132132132132132132132132132132132132132132132132132132132654654654654654654654654654654654654654654654654654654654654798798798798798798798798798798798798798798798798798798798798" ;
            auto output_1_4020 = F_FULL(str_full_4020);
            std::string str_gold_4020 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighighighighighighighighighighighi123123123123123123123123123123123123123123123123123123123123123123123123123123123123123123456456456456456456456456456456456456456456456456456456456456456456456456456456456456456456789789789789789789789789789789789789789789789789789789789789789789789789789789789789789789bcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcaefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihgihg132132132132132132132132132132132132132132132132132132132132654654654654654654654654654654654654654654654654654654654654798798798798798798798798798798798798798798798798798798798798" ;
            auto output_2_4020 = f_gold(str_gold_4020);
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
            std::string str_full_4006 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzcbacbacbacbacbacbacbacbacbacbadefdefdefdefdefdefdefdefdefdefhgihgihgihgihgihgihgihgihgihgijlkjlkjlkjlkjlkjlkjlkjlkjlkjlkonmonmonmonmonmonmonmonmonmonmpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrtustustustustustustustustustusxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwzyzyzyzyzyzyzyzyzyzy" ;
            auto output_1_4006 = F_FULL(str_full_4006);
            std::string str_gold_4006 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzcbacbacbacbacbacbacbacbacbacbadefdefdefdefdefdefdefdefdefdefhgihgihgihgihgihgihgihgihgihgijlkjlkjlkjlkjlkjlkjlkjlkjlkjlkonmonmonmonmonmonmonmonmonmonmpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrtustustustustustustustustustusxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwzyzyzyzyzyzyzyzyzyzy" ;
            auto output_2_4006 = f_gold(str_gold_4006);
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
            std::string str_full_4007 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzabcabcabcabcabcabcabcabcabcabcdfedfedfedfedfedfedfedfedfedfeighighighighighighighighighighljkljkljkljkljkljkljkljkljkljkmnomnomnomnomnomnomnomnomnomnorqprqprqprqprqprqprqprqprqprqptustustustustustustustustustusxwvxwvxwvxwvxwvxwvxwvxwvxwvxwvzyzyzyzyzyzyzyzyzyzy" ;
            auto output_1_4007 = F_FULL(str_full_4007);
            std::string str_gold_4007 = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefdefghighighighighighighighighighighighighighighighighighighighijkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljkljklmnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnomnopqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrpqrstustustustustustustustustustustustustustustustustustustustuvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxvwxyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzyzabcabcabcabcabcabcabcabcabcabcdfedfedfedfedfedfedfedfedfedfeighighighighighighighighighighljkljkljkljkljkljkljkljkljkljkmnomnomnomnomnomnomnomnomnomnorqprqprqprqprqprqprqprqprqprqptustustustustustustustustustusxwvxwvxwvxwvxwvxwvxwvxwvxwvxwvzyzyzyzyzyzyzyzyzyzy" ;
            auto output_2_4007 = f_gold(str_gold_4007);
            if (Test::AreEquivalent(output_1_4007, output_2_4007)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4007 output1=" << output_1_4007 << " output2=" << output_2_4007 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4007 | error " << e.what() << endl;
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