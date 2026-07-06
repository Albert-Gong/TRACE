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
string f_gold ( string str ) {
  int n = str . length ( );
  int dp [ n + 1 ] [ n + 1 ];
  for ( int i = 0;
  i <= n;
  i ++ ) for ( int j = 0;
  j <= n;
  j ++ ) dp [ i ] [ j ] = 0;
  for ( int i = 1;
  i <= n;
  i ++ ) for ( int j = 1;
  j <= n;
  j ++ ) if ( str [ i - 1 ] == str [ j - 1 ] && i != j ) dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ];
  else dp [ i ] [ j ] = max ( dp [ i ] [ j - 1 ], dp [ i - 1 ] [ j ] );
  string res = "";
  int i = n, j = n;
  while ( i > 0 && j > 0 ) {
    if ( dp [ i ] [ j ] == dp [ i - 1 ] [ j - 1 ] + 1 ) {
      res = res + str [ i - 1 ];
      i --;
      j --;
    }
    else if ( dp [ i ] [ j ] == dp [ i - 1 ] [ j ] ) i --;
    else j --;
  }
  reverse ( res . begin ( ), res . end ( ) );
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
            std::string str_full_4015 = "pdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNKWi374lc2Mf1OsOeyyC9MbTQNiDFs1eZuBbizd87uPhFI9F2gBewnBT5d91tB5UMwGr2g5ACij3AtYBt3cVa3bYEEkqVSHVbr498OAZxN95ggZOKc3qFW07IE6TV8SnVr5EStS1apaBhc50MGFJBEtNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpKWi374lc2Mf1OsOeyyC9MbTQNiDFs1eZuBbizd87uPhFI9F2gBewnBT5d91tB5UMwGr2g5ACij3AtYBt3cVa3bYEEkqVSHVbr498OAZxN95ggZOKc3qFW07IE6TV8SnVr5EStS1apaBhc50MGFJBEt" ;
            auto output_1_4015 = F_FULL(str_full_4015);
            std::string str_gold_4015 = "pdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNpdxevavrzoNDHOFIHGULozrvavexdpLUGHIFOHDNKWi374lc2Mf1OsOeyyC9MbTQNiDFs1eZuBbizd87uPhFI9F2gBewnBT5d91tB5UMwGr2g5ACij3AtYBt3cVa3bYEEkqVSHVbr498OAZxN95ggZOKc3qFW07IE6TV8SnVr5EStS1apaBhc50MGFJBEtNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpNDHOFIHGULpdxevavrzoLUGHIFOHDNozrvavexdpKWi374lc2Mf1OsOeyyC9MbTQNiDFs1eZuBbizd87uPhFI9F2gBewnBT5d91tB5UMwGr2g5ACij3AtYBt3cVa3bYEEkqVSHVbr498OAZxN95ggZOKc3qFW07IE6TV8SnVr5EStS1apaBhc50MGFJBEt" ;
            auto output_2_4015 = f_gold(str_gold_4015);
            if (Test::AreEquivalent(output_1_4015, output_2_4015)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4015 output1=" << output_1_4015 << " output2=" << output_2_4015 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4015 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_4016 = "jwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJE2iqWnB9ao3KRqqZVAt9zQz80b1Ooej2Cvuual4L31gDRYi4sY9bH4FFdVsOuXs6uDBhq9y90Qu0ABFJqdnhVAtKoUC86rAuNDThD4oapLky5ygQmna81CqVCNBEjr11SZssTwS2fdIgdBmnfzFw1UWEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwj2iqWnB9ao3KRqqZVAt9zQz80b1Ooej2Cvuual4L31gDRYi4sY9bH4FFdVsOuXs6uDBhq9y90Qu0ABFJqdnhVAtKoUC86rAuNDThD4oapLky5ygQmna81CqVCNBEjr11SZssTwS2fdIgdBmnfzFw1UW" ;
            auto output_1_4016 = F_FULL(str_full_4016);
            std::string str_gold_4016 = "jwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJEjwbdzzdfpmEJOEGWLBZImpfdzzdbwjIZBLWGEOJE2iqWnB9ao3KRqqZVAt9zQz80b1Ooej2Cvuual4L31gDRYi4sY9bH4FFdVsOuXs6uDBhq9y90Qu0ABFJqdnhVAtKoUC86rAuNDThD4oapLky5ygQmna81CqVCNBEjr11SZssTwS2fdIgdBmnfzFw1UWEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwjEJOEGWLBZIjwbdzzdfpmIZBLWGEOJEmpfdzzdbwj2iqWnB9ao3KRqqZVAt9zQz80b1Ooej2Cvuual4L31gDRYi4sY9bH4FFdVsOuXs6uDBhq9y90Qu0ABFJqdnhVAtKoUC86rAuNDThD4oapLky5ygQmna81CqVCNBEjr11SZssTwS2fdIgdBmnfzFw1UW" ;
            auto output_2_4016 = f_gold(str_gold_4016);
            if (Test::AreEquivalent(output_1_4016, output_2_4016)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4016 output1=" << output_1_4016 << " output2=" << output_2_4016 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4016 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_3008 = "puygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCSH4QpFufhfs7qYFw1ne9qgrQQHtBDbP0zoAuJZHaUQ5tcT9fbDtULeV7acKzc1Oc48oe47PHoUXdRYXJgIWaHKLN6HsptE7WBrIBCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygr" ;
            auto output_1_3008 = F_FULL(str_full_3008);
            std::string str_gold_3008 = "puygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCpuygrjobpwgknqgCHEULTMIDPKRXDEgqnkgwpbojrgyupEDXRKPDIMTLUEHCSH4QpFufhfs7qYFw1ne9qgrQQHtBDbP0zoAuJZHaUQ5tcT9fbDtULeV7acKzc1Oc48oe47PHoUXdRYXJgIWaHKLN6HsptE7WBrIBCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygrjobpwgknqgEDXRKPDIMTLUEHCgqnkgwpbojrgyupCHEULTMIDPKRXDEpuygr" ;
            auto output_2_3008 = f_gold(str_gold_3008);
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
            std::string str_full_4017 = "ntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZG8eWdx1Ul9QJrOY0TuiIyhaw6TLShXQhdSQIJ9AWGnwz33YKtBeWpP1Kg88pIw9tw8RFwVc2iGd8GTte0agf4nTeQTnnJzCtTqVebVaZs7f1epsCxXmDr9yXznPkvk6RPcd3cKPz3iAQ1Mthsz5lV85GZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtn8eWdx1Ul9QJrOY0TuiIyhaw6TLShXQhdSQIJ9AWGnwz33YKtBeWpP1Kg88pIw9tw8RFwVc2iGd8GTte0agf4nTeQTnnJzCtTqVebVaZs7f1epsCxXmDr9yXznPkvk6RPcd3cKPz3iAQ1Mthsz5lV85" ;
            auto output_1_4017 = F_FULL(str_full_4017);
            std::string str_gold_4017 = "ntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZGntbbqwkzplGZLHMCWTEElpzkwqbbtnEETWCMHLZG8eWdx1Ul9QJrOY0TuiIyhaw6TLShXQhdSQIJ9AWGnwz33YKtBeWpP1Kg88pIw9tw8RFwVc2iGd8GTte0agf4nTeQTnnJzCtTqVebVaZs7f1epsCxXmDr9yXznPkvk6RPcd3cKPz3iAQ1Mthsz5lV85GZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtnGZLHMCWTEEntbbqwkzplEETWCMHLZGlpzkwqbbtn8eWdx1Ul9QJrOY0TuiIyhaw6TLShXQhdSQIJ9AWGnwz33YKtBeWpP1Kg88pIw9tw8RFwVc2iGd8GTte0agf4nTeQTnnJzCtTqVebVaZs7f1epsCxXmDr9yXznPkvk6RPcd3cKPz3iAQ1Mthsz5lV85" ;
            auto output_2_4017 = f_gold(str_gold_4017);
            if (Test::AreEquivalent(output_1_4017, output_2_4017)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4017 output1=" << output_1_4017 << " output2=" << output_2_4017 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4017 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_4022 = "bchGfiajbfHcgbgdgavgkfaafgHjhgtpbggXbfcGhj2bjgfbLYbabej5ccNaacctHbivfccdfigfcg5aacaTgbigjHggcbdeijhffedHWjde5acgfafh4eIakC7bGechhfejfiUCfVgdcRgaxxdeb7NjadcagdQdERdavgfccVdhyeEYcdjdgcMbcibjbyEfh7cevfeecdMVdjhiaajODiRb4edehafbgjZPxgfH3fhMffcjdcafzYVcjX4ceVbcfjjfR6ffqfheTed1BdlecWcadfd5P7ccgfmy4dafbdgg4gdifGwebgbcwedRWdcdiaaidcghbdfveigifzeDcifeeijaecbgbPb4dfcmidbiax7LbaeaFdAbdsfs4gecdc3ebf9fGMg1MgfieNaffehNxXadgajkftva6pcafb4bIKLdjMgdeaCcfeafhqMfb0eggdwphenqcaIdfhfacf1exbjlCgbsfgbfhbjaceafNgfggacfdgcFpec1L3fncafdePdbhRSaadpgbidefcmegdf8tQfagjb4mAbdbtbeaePLhdg3gdc9COBgaehaRcIefAvdTSncjclLejf6hggdgcJ2abgdafbfcf7pbfb5FfogefjaLPWggehdhtnagwjgcchvibbjhcjGgbjj3e3a7PybffYeidefCyubh2zwejbgcibedjYgTUeygKVbgdaqdbgtcgfahiacfWde3bfjW5bduKd9gIgc3vfbcfjbKgd5DhaePdcbceDbeaha6gcicbebdbfgqdbg0catgb0jdfi6ajal9hdTgGhf5efgiaeSUaafbdPbxMbcaejXPMhdfbjaimdyAgbNeiGeabe6dfYdgdd0RePtdbjehbeAbehddcFPuc0aeH7cgdjafmehgf2iUjfcRWbcNfabfbgfciffnbWgI3f0MeccbagccVkTCivc3gbygcgg5eccyE5fljRyaebchaddjdabfcgUccbdwykhggdfauad" ;
            auto output_1_4022 = F_FULL(str_full_4022);
            std::string str_gold_4022 = "bchGfiajbfHcgbgdgavgkfaafgHjhgtpbggXbfcGhj2bjgfbLYbabej5ccNaacctHbivfccdfigfcg5aacaTgbigjHggcbdeijhffedHWjde5acgfafh4eIakC7bGechhfejfiUCfVgdcRgaxxdeb7NjadcagdQdERdavgfccVdhyeEYcdjdgcMbcibjbyEfh7cevfeecdMVdjhiaajODiRb4edehafbgjZPxgfH3fhMffcjdcafzYVcjX4ceVbcfjjfR6ffqfheTed1BdlecWcadfd5P7ccgfmy4dafbdgg4gdifGwebgbcwedRWdcdiaaidcghbdfveigifzeDcifeeijaecbgbPb4dfcmidbiax7LbaeaFdAbdsfs4gecdc3ebf9fGMg1MgfieNaffehNxXadgajkftva6pcafb4bIKLdjMgdeaCcfeafhqMfb0eggdwphenqcaIdfhfacf1exbjlCgbsfgbfhbjaceafNgfggacfdgcFpec1L3fncafdePdbhRSaadpgbidefcmegdf8tQfagjb4mAbdbtbeaePLhdg3gdc9COBgaehaRcIefAvdTSncjclLejf6hggdgcJ2abgdafbfcf7pbfb5FfogefjaLPWggehdhtnagwjgcchvibbjhcjGgbjj3e3a7PybffYeidefCyubh2zwejbgcibedjYgTUeygKVbgdaqdbgtcgfahiacfWde3bfjW5bduKd9gIgc3vfbcfjbKgd5DhaePdcbceDbeaha6gcicbebdbfgqdbg0catgb0jdfi6ajal9hdTgGhf5efgiaeSUaafbdPbxMbcaejXPMhdfbjaimdyAgbNeiGeabe6dfYdgdd0RePtdbjehbeAbehddcFPuc0aeH7cgdjafmehgf2iUjfcRWbcNfabfbgfciffnbWgI3f0MeccbagccVkTCivc3gbygcgg5eccyE5fljRyaebchaddjdabfcgUccbdwykhggdfauad" ;
            auto output_2_4022 = f_gold(str_gold_4022);
            if (Test::AreEquivalent(output_1_4022, output_2_4022)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=4022 output1=" << output_1_4022 << " output2=" << output_2_4022 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=4022 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_4010 = "dyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqydqjCRt1T98orUxIkAyKEGtAOSJ7y3AG9Yxb3mlSJho0NTY8toezUFMtKFUhjsOcba2oDoECjpn5MymtWcA0U2rSHp5cXRG6eEyL0VNubKpTkV5AaJLlcPgU4nYA77J0vESpQixiHudDR7VuD77Whn4r9bNQNPNENWpO9i0Jm9xuRsaSQmmRDzu29UeiRacgl8bCBAudlBdyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqydqjCRt1T98orUxIkAyKEGtAOSJ7y3AG9Yxb3mlSJho0NTY8toezUFMtKFUhjsOcba2oDoECjpn5MymtWcA0U2rSHp5cXRG6eEyL0VNubKpTkV5AaJLlcPgU4nYA77J0vESpQixiHudDR7VuD77Whn4r9bNQNPNENWpO9i0Jm9xuRsaSQmmRDzu29UeiRacgl8bCBAudlB" ;
            auto output_1_4010 = F_FULL(str_full_4010);
            std::string str_gold_4010 = "dyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqydqjCRt1T98orUxIkAyKEGtAOSJ7y3AG9Yxb3mlSJho0NTY8toezUFMtKFUhjsOcba2oDoECjpn5MymtWcA0U2rSHp5cXRG6eEyL0VNubKpTkV5AaJLlcPgU4nYA77J0vESpQixiHudDR7VuD77Whn4r9bNQNPNENWpO9i0Jm9xuRsaSQmmRDzu29UeiRacgl8bCBAudlBdyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqyddyqgdnreswenjmcvtpzhhzptvcmjnewserndgqydqjCRt1T98orUxIkAyKEGtAOSJ7y3AG9Yxb3mlSJho0NTY8toezUFMtKFUhjsOcba2oDoECjpn5MymtWcA0U2rSHp5cXRG6eEyL0VNubKpTkV5AaJLlcPgU4nYA77J0vESpQixiHudDR7VuD77Whn4r9bNQNPNENWpO9i0Jm9xuRsaSQmmRDzu29UeiRacgl8bCBAudlB" ;
            auto output_2_4010 = f_gold(str_gold_4010);
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
            std::string str_full_3016 = "pr7l1DE6i75EeI0iScelirxtizyVii601ia5L11AMZtMrrrxYPAAl7l2mZ2D2rr5xlEai2DrrZ11ZZczl7xY1ictJ5lAqE2ry7MDrRri7A2rrs2xMrtVxxMxQfM26ZSE6L11Z6EittSt2rSYtZircrlZAHyMirQ7Mpr2aEA2ErEE12lcl2r066aAZE7B2iS21M7DELelMrLrJff1aIaH6zI2ApiRr7AAri7DQED20rc2Dl217qiT5fRy7Er0Vr6iPZrcIlVHHrEAMtZrMilrrZRS2A7MimcirAr7E7A22iclc0D2lHry60r7Q2MLEY6ll6B11cS226SqRF2027A61Y1lJ1D2cc1yA2aEY6EcI2HFScIJqr1i2DAZp21a2Er11rH2R77IrT72D626f2cMxVP0fx5B7MPDMmAAZq02errmxr21teRA22DMZSl2JtAicMHtDs6a2IZI7YF62MiD72cIArAHrE2ixrDMciri21lEETIi1pM2tDirFr2JArfy2DMYiH1rrDrl2Zl7zr2QraA22rirrMAric2lriS6I6ZrDpD2DHp2p6DiD0zs2QZZqE6p75cJrl1M6erY211MlR2cZZlcM0ZASEARDYr6Li15ZArcy1rz2xAE2Hc2FL52ZPrr1RcJrty2FJIDLABr6i222IMt07RqEPQisrTlSDMy2HZ7crYPE0A0VJrArMrt7yiE5DE6JErZMrZMafyiEl5Rp2McT5qyS1zyLcAa1HTAxYIxEA62c1r2B2tZ5DlBsciZ1aDcrAD27EARF2yi2rE6A6xxM5mi7Mp67M1rDM6AFRx51lAsxZEccH1DDiltTAfI71Yr6E2iSYH26lR722Ji6112c2plZl20a51EA1rlrcrr2Zi2Al2i6cRicMlq6Zippi7BBDRtDcaMTDMB0lilrx6xi7y71ME7P6PMYiEJit2l12DaAr7Aiy7SrQEreirAp6621MA2ViEr2MiE06AZ2lacJ7AttyzMEFIc" ;
            auto output_1_3016 = F_FULL(str_full_3016);
            std::string str_gold_3016 = "pr7l1DE6i75EeI0iScelirxtizyVii601ia5L11AMZtMrrrxYPAAl7l2mZ2D2rr5xlEai2DrrZ11ZZczl7xY1ictJ5lAqE2ry7MDrRri7A2rrs2xMrtVxxMxQfM26ZSE6L11Z6EittSt2rSYtZircrlZAHyMirQ7Mpr2aEA2ErEE12lcl2r066aAZE7B2iS21M7DELelMrLrJff1aIaH6zI2ApiRr7AAri7DQED20rc2Dl217qiT5fRy7Er0Vr6iPZrcIlVHHrEAMtZrMilrrZRS2A7MimcirAr7E7A22iclc0D2lHry60r7Q2MLEY6ll6B11cS226SqRF2027A61Y1lJ1D2cc1yA2aEY6EcI2HFScIJqr1i2DAZp21a2Er11rH2R77IrT72D626f2cMxVP0fx5B7MPDMmAAZq02errmxr21teRA22DMZSl2JtAicMHtDs6a2IZI7YF62MiD72cIArAHrE2ixrDMciri21lEETIi1pM2tDirFr2JArfy2DMYiH1rrDrl2Zl7zr2QraA22rirrMAric2lriS6I6ZrDpD2DHp2p6DiD0zs2QZZqE6p75cJrl1M6erY211MlR2cZZlcM0ZASEARDYr6Li15ZArcy1rz2xAE2Hc2FL52ZPrr1RcJrty2FJIDLABr6i222IMt07RqEPQisrTlSDMy2HZ7crYPE0A0VJrArMrt7yiE5DE6JErZMrZMafyiEl5Rp2McT5qyS1zyLcAa1HTAxYIxEA62c1r2B2tZ5DlBsciZ1aDcrAD27EARF2yi2rE6A6xxM5mi7Mp67M1rDM6AFRx51lAsxZEccH1DDiltTAfI71Yr6E2iSYH26lR722Ji6112c2plZl20a51EA1rlrcrr2Zi2Al2i6cRicMlq6Zippi7BBDRtDcaMTDMB0lilrx6xi7y71ME7P6PMYiEJit2l12DaAr7Aiy7SrQEreirAp6621MA2ViEr2MiE06AZ2lacJ7AttyzMEFIc" ;
            auto output_2_3016 = f_gold(str_gold_3016);
            if (Test::AreEquivalent(output_1_3016, output_2_3016)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3016 output1=" << output_1_3016 << " output2=" << output_2_3016 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3016 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_2013 = "bewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnbewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnbewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnbewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnbewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnobcrmmutrmaksltzgvlafaonegeqagscqndnhjoobcklmgxndjdawuvevxgomflwugprlecztsaqblgxiygrritjfrmgaxecdfqgndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebobcrmmutrmaksltzgvlafaonegeqagscqndnhjoobcklmgxndjdawuvevxgomflwugprlecztsaqblgxiygrritjfrmgaxecdfqg" ;
            auto output_1_2013 = F_FULL(str_full_2013);
            std::string str_gold_2013 = "bewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnbewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnbewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnbewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnbewlsywpmrvmlitjtpuqndlgypwndlmrtvzvzjcuquptjtilmvrmpwyslwebucjzvzvtrmldnwpygldnobcrmmutrmaksltzgvlafaonegeqagscqndnhjoobcklmgxndjdawuvevxgomflwugprlecztsaqblgxiygrritjfrmgaxecdfqgndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebndlgypwndlmrtvzvzjcubewlsywpmrvmlitjtpuqucjzvzvtrmldnwpygldnquptjtilmvrmpwyslwebobcrmmutrmaksltzgvlafaonegeqagscqndnhjoobcklmgxndjdawuvevxgomflwugprlecztsaqblgxiygrritjfrmgaxecdfqg" ;
            auto output_2_2013 = f_gold(str_gold_2013);
            if (Test::AreEquivalent(output_1_2013, output_2_2013)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2013 output1=" << output_1_2013 << " output2=" << output_2_2013 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2013 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            std::string str_full_3009 = "deceedbaceecdbdedcdebdaaebbecbebeeadbbddaaddecacdabeccccccebcbbaeececeddaeaadbcabbedcdbbecaaabdabedbbbacdabdcaabdcdaaaebdbacdeccebedccaddabaeeccaacdbedeceedbaceecdbdedcdebdaaebbecbebeeadbbddaaddecacdabeccccccebcbbaeececeddaeaadbcabbedcdbbecaaabdabedbbbacdabdcaabdcdaaaebdbacdeccebedccaddabaeeccaacdbeedcbaedcbaedcbaedcbaedcbaedcbaedcbaedcbaedcbaedcbakBuxblUbcgQEbUXRPNxmkBXelvTFiVigcRwYYrtqcKSRXOAOsCtzfAFUSgeXCCHEpSRAQannmUERxfvdPBsViocPkWuxxxYkYFgBabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeebdcaacceeabaddaccdebeccedcabdbeaaadcdbaacdbadcabbbdebadbaaacebbdcdebbacbdaaeaddececeeabbcbeccccccebadcaceddaaddbbdaeebebcebbeaadbedcdedbdceecabdeecedebdcaacceeabaddaccdebeccedcabdbeaaadcdbaacdbadcabbbdebadbaaacebbdcdebbacbdaaeaddececeeabbcbeccccccebadcaceddaaddbbdaeebebcebbeaadbedcdedbdceecabdeeced" ;
            auto output_1_3009 = F_FULL(str_full_3009);
            std::string str_gold_3009 = "deceedbaceecdbdedcdebdaaebbecbebeeadbbddaaddecacdabeccccccebcbbaeececeddaeaadbcabbedcdbbecaaabdabedbbbacdabdcaabdcdaaaebdbacdeccebedccaddabaeeccaacdbedeceedbaceecdbdedcdebdaaebbecbebeeadbbddaaddecacdabeccccccebcbbaeececeddaeaadbcabbedcdbbecaaabdabedbbbacdabdcaabdcdaaaebdbacdeccebedccaddabaeeccaacdbeedcbaedcbaedcbaedcbaedcbaedcbaedcbaedcbaedcbaedcbakBuxblUbcgQEbUXRPNxmkBXelvTFiVigcRwYYrtqcKSRXOAOsCtzfAFUSgeXCCHEpSRAQannmUERxfvdPBsViocPkWuxxxYkYFgBabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeebdcaacceeabaddaccdebeccedcabdbeaaadcdbaacdbadcabbbdebadbaaacebbdcdebbacbdaaeaddececeeabbcbeccccccebadcaceddaaddbbdaeebebcebbeaadbedcdedbdceecabdeecedebdcaacceeabaddaccdebeccedcabdbeaaadcdbaacdbadcabbbdebadbaaacebbdcdebbacbdaaeaddececeeabbcbeccccccebadcaceddaaddbbdaeebebcebbeaadbedcdedbdceecabdeeced" ;
            auto output_2_3009 = f_gold(str_gold_3009);
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
            std::string str_full_3017 = "YBrYi8mLb5SMk5s35omNMbcy88BeoYd3f8Y5Bl5rkLf2R1lkkJodfN5iSoX2o58MLR4iCNk1oI5iio85ML38BfyNNbYNS458MLY4bNML8bSoYfcLM5YMfYYkJfX5cL8815xpJrdfL3SkL8rD3MN8kks88YkmYpBJi8LY345yYMJ55J3898sioklSgM5f482ckbBL85LLSi8xXN9MNMfJkgb85JMNBNBMM88fLbBydvk84f5558D5eYJY5YokM8NLDfJ8pYLi8bJiJb55bMU9bl8NYfk5Yf4gkYombb8YkMYdb58RiSs8nMsN84ylYYfLY51rBkIJkfxLoiY81syM5NX5LNSb33o4B8dm5NoMJ4D8oSYnS8bSIknl3CcJ5YIJyYNBUSLNDiMY8o13iriix3d435s79AfX5Ub6JkN1SM6iiiAC5kB7fi4y8s5o8i88LfJSYxY8SvkLIA586o88YfYiyfkByLi1D8NY93ib8YN8okk4ii5f1MJ5YLe5L78iSibJSk5vBkk8bLN53bYfY5YyBb5JsekfsY8xNMBnnf55iNMN5iYioNgYkBs4kRcM4Y587sJvSbf5L5C95ieiU8MiA8788oko85fbNNN4JYSeiB86M58JYiNi7LCB3LDi8pJ6Mg5D3rIi8N8kiN25Y98f8Y8Y48XkyYbLboYi2ikN5io2bNMNibYMoocRN54RoN8YS1f8Mb8L15bbM4fYMMY384Mipco3Rs3my8MNMixo5giikim8NSk314839yJY5B3BYY55BogRMCNs3L36opAi5ffJr55k88MA5JUMk5fe8Jd3rM1n5bym5kJXMbM5s35iNiMsfJfbb84JUJ5M5o88iLM5LiA53ibUk4oiSM33J84e85g8klLlY3bifY1bkbvyIy5M83LoUYb5Sp58Nv2yJ518CfnvDm5N3gILLl8CL68YMfsL5D5M5N533iYx1k3oY8Bo16N3MLcMoA1Y9N1NN88JIcoB53J8Y6MJ" ;
            auto output_1_3017 = F_FULL(str_full_3017);
            std::string str_gold_3017 = "YBrYi8mLb5SMk5s35omNMbcy88BeoYd3f8Y5Bl5rkLf2R1lkkJodfN5iSoX2o58MLR4iCNk1oI5iio85ML38BfyNNbYNS458MLY4bNML8bSoYfcLM5YMfYYkJfX5cL8815xpJrdfL3SkL8rD3MN8kks88YkmYpBJi8LY345yYMJ55J3898sioklSgM5f482ckbBL85LLSi8xXN9MNMfJkgb85JMNBNBMM88fLbBydvk84f5558D5eYJY5YokM8NLDfJ8pYLi8bJiJb55bMU9bl8NYfk5Yf4gkYombb8YkMYdb58RiSs8nMsN84ylYYfLY51rBkIJkfxLoiY81syM5NX5LNSb33o4B8dm5NoMJ4D8oSYnS8bSIknl3CcJ5YIJyYNBUSLNDiMY8o13iriix3d435s79AfX5Ub6JkN1SM6iiiAC5kB7fi4y8s5o8i88LfJSYxY8SvkLIA586o88YfYiyfkByLi1D8NY93ib8YN8okk4ii5f1MJ5YLe5L78iSibJSk5vBkk8bLN53bYfY5YyBb5JsekfsY8xNMBnnf55iNMN5iYioNgYkBs4kRcM4Y587sJvSbf5L5C95ieiU8MiA8788oko85fbNNN4JYSeiB86M58JYiNi7LCB3LDi8pJ6Mg5D3rIi8N8kiN25Y98f8Y8Y48XkyYbLboYi2ikN5io2bNMNibYMoocRN54RoN8YS1f8Mb8L15bbM4fYMMY384Mipco3Rs3my8MNMixo5giikim8NSk314839yJY5B3BYY55BogRMCNs3L36opAi5ffJr55k88MA5JUMk5fe8Jd3rM1n5bym5kJXMbM5s35iNiMsfJfbb84JUJ5M5o88iLM5LiA53ibUk4oiSM33J84e85g8klLlY3bifY1bkbvyIy5M83LoUYb5Sp58Nv2yJ518CfnvDm5N3gILLl8CL68YMfsL5D5M5N533iYx1k3oY8Bo16N3MLcMoA1Y9N1NN88JIcoB53J8Y6MJ" ;
            auto output_2_3017 = f_gold(str_gold_3017);
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