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
int f_gold ( int k, string s1, string s2 ) {
  int n = s1 . length ( );
  int m = s2 . length ( );
  int lcs [ n + 1 ] [ m + 1 ];
  int cnt [ n + 1 ] [ m + 1 ];
  memset ( lcs, 0, sizeof ( lcs ) );
  memset ( cnt, 0, sizeof ( cnt ) );
  for ( int i = 1;
  i <= n;
  i ++ ) {
    for ( int j = 1;
    j <= m;
    j ++ ) {
      lcs [ i ] [ j ] = max ( lcs [ i - 1 ] [ j ], lcs [ i ] [ j - 1 ] );
      if ( s1 [ i - 1 ] == s2 [ j - 1 ] ) cnt [ i ] [ j ] = cnt [ i - 1 ] [ j - 1 ] + 1;
      if ( cnt [ i ] [ j ] >= k ) {
        for ( int a = k;
        a <= cnt [ i ] [ j ];
        a ++ ) lcs [ i ] [ j ] = max ( lcs [ i ] [ j ], lcs [ i - a ] [ j - a ] + a );
      }
    }
  }
  return lcs [ n ] [ m ];
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
            int k_full_3025 = 967 ;
            std::string s1_full_3025 = "wumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjt" ;
            std::string s2_full_3025 = "hcubhwehbukdpbkedamvmwnvfbw2kblkebwvvhpnpebpolwkkaakbnvbffvbnuuu5wvvvumbpoalvfuemklnbwfvpkohpfebflfm4u1lanwknl0vbwfbbbfflfwwbe2bpzkwvnbbuto1nweaubbnvbnbmvfupdkoef0kkwbfonmmbfkbfwmbvunfpdmn1mdbbfnwaamngvlmodbovdkwlfwfofmeubwxwfbbuwwwowpmbhhffpdadupdnbmwbadlvbmvmvdwwmpfhbwbomfvnkwkdbnldvuefbzbfabvwjfeofbapbuhonkfbfwdevmb0atvpwfnlledawwbulikvfvphnuevwfufp4voudwkhbvabwpupawuahdhoabme4gaxvbkbvnbhbboppdwmnlbdhehb9bwblppwwmfwpkmduhwpumvfwlanvabhdoekp9bfbvhfowawodpelpokpmwkldwffforlvflnmfohlfebbfmfh1mhfhlwnfwbbsbvnbkemkdevwndhbkwbevnelvwbaa8f6abvevfnvbphebamwaul5wbfnfaepwakbvubelnblfwdolndboo5dfbofweblihb4ufvvlddhvvovnwpvnehlbewwhpbpnekabbluwbkheomfhkhvpmhfuvawaumlvhbjwbwuewmvwaobel0kvuwnfvmobvvlvwbblwnbfbbmbvkwvmfbmovvafhfncdbwefe0hakeonlahbbpumbbubbfhavvhwwcaw6ewfmowbt7fvpkykwolpafnbkfbkvpbve1m4adlnorkvuvlnuanpbvwamdvhemfnbuwvfbbhlbmodlnvwekfpffvmvorpvbklwbbwuabbe4oewbamudphopvwuhbw6eefoddfkfawvfwadnvwbebbwbbkpwnfvdbvewvvfkhvabbkvvuuewfmopfwfhbofeuapdbidgrhnhwbnfmlwl2bnbddo8uovfoubpunkknhhab" ;
            auto output_1_3025 = F_FULL(k_full_3025, s1_full_3025, s2_full_3025);
            int k_gold_3025 = 967 ;
            std::string s1_gold_3025 = "wumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjtwumiogdsswdqbtayodjt" ;
            std::string s2_gold_3025 = "hcubhwehbukdpbkedamvmwnvfbw2kblkebwvvhpnpebpolwkkaakbnvbffvbnuuu5wvvvumbpoalvfuemklnbwfvpkohpfebflfm4u1lanwknl0vbwfbbbfflfwwbe2bpzkwvnbbuto1nweaubbnvbnbmvfupdkoef0kkwbfonmmbfkbfwmbvunfpdmn1mdbbfnwaamngvlmodbovdkwlfwfofmeubwxwfbbuwwwowpmbhhffpdadupdnbmwbadlvbmvmvdwwmpfhbwbomfvnkwkdbnldvuefbzbfabvwjfeofbapbuhonkfbfwdevmb0atvpwfnlledawwbulikvfvphnuevwfufp4voudwkhbvabwpupawuahdhoabme4gaxvbkbvnbhbboppdwmnlbdhehb9bwblppwwmfwpkmduhwpumvfwlanvabhdoekp9bfbvhfowawodpelpokpmwkldwffforlvflnmfohlfebbfmfh1mhfhlwnfwbbsbvnbkemkdevwndhbkwbevnelvwbaa8f6abvevfnvbphebamwaul5wbfnfaepwakbvubelnblfwdolndboo5dfbofweblihb4ufvvlddhvvovnwpvnehlbewwhpbpnekabbluwbkheomfhkhvpmhfuvawaumlvhbjwbwuewmvwaobel0kvuwnfvmobvvlvwbblwnbfbbmbvkwvmfbmovvafhfncdbwefe0hakeonlahbbpumbbubbfhavvhwwcaw6ewfmowbt7fvpkykwolpafnbkfbkvpbve1m4adlnorkvuvlnuanpbvwamdvhemfnbuwvfbbhlbmodlnvwekfpffvmvorpvbklwbbwuabbe4oewbamudphopvwuhbw6eefoddfkfawvfwadnvwbebbwbbkpwnfvdbvewvvfkhvabbkvvuuewfmopfwfhbofeuapdbidgrhnhwbnfmlwl2bnbddo8uovfoubpunkknhhab" ;
            auto output_2_3025 = f_gold(k_gold_3025, s1_gold_3025, s2_gold_3025);
            if (Test::AreEquivalent(output_1_3025, output_2_3025)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3025 output1=" << output_1_3025 << " output2=" << output_2_3025 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3025 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int k_full_3026 = 971 ;
            std::string s1_full_3026 = "dnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhj" ;
            std::string s2_full_3026 = "oyorrviarkhgyzvhzflekkj7kaehafzkzke2vywsrv7fi2lskrafyiryovzezekyofeyfrzfyrzvhi1ksrkfrzzlyfysfvrkeryrp1feo6srkzgevkaivkf7fekkhkseyfosayykeirgvfrzkrkzhykkzvrkaerrrigkdzfgkkfizvrgrosr0eoyyozofzyrerzkzrjhieaoaerfzyykkzkkerkzyzkyykepeizkyfkoahrfylaieasizszrkyfrhaeyrkdygohekghefzhkskegkziizkzvzekohszrvsvsskffoyy4ffyazahhekykreezahyzzkgfyogrihhrkvykygyvhoatgk4ygsvzoiv6myzzoevvegkizgsrze7zkoffhafkziehgazyzzrlrizoehejzpkokzagioyzyvvekkrakghzkez3ykfzfkfwzfkyfkygvfkvefoyyekvyeyfcvohksffrsfyk2gkrhhsfirfkkesyeffg1iehgrahs9krrgfzjazasysyrerrfrfgfyitesesyzsrsokkrrkrkryqsev7rsaoehaefvhoatsyfzesoeereeyei5kekzyizokiehiegzviezfzfffr2fyecxgskjkagkeezfkfykvkakofyysezi6zrzkrka6krojyvor9zrkrgosysavgzakzsfrokahkzzqyfeyykhgkrrosfarirryhieyf1krfkzgekeieizzhuokrkrrgkviaahkkrhyzgrvvkksohsganyhgreikz4zyvlfyahfzvigzikeazkrhiegkezhekgkkyfr8rkzeoyssikyykfeiofyziyrrkreszykvikkkkzokkehfzrfyserfikkigoru4eoegiyrfryvzekyvfkrggfkrffpayseieoaekekoyfsfekegyyigr7fsokzikarkkehyya6gvzgzkkvrar8kfefrere3ehygfrkavkaka2zkfszerohook" ;
            auto output_1_3026 = F_FULL(k_full_3026, s1_full_3026, s2_full_3026);
            int k_gold_3026 = 971 ;
            std::string s1_gold_3026 = "dnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhjdnvyaejztzufzwwuwwhj" ;
            std::string s2_gold_3026 = "oyorrviarkhgyzvhzflekkj7kaehafzkzke2vywsrv7fi2lskrafyiryovzezekyofeyfrzfyrzvhi1ksrkfrzzlyfysfvrkeryrp1feo6srkzgevkaivkf7fekkhkseyfosayykeirgvfrzkrkzhykkzvrkaerrrigkdzfgkkfizvrgrosr0eoyyozofzyrerzkzrjhieaoaerfzyykkzkkerkzyzkyykepeizkyfkoahrfylaieasizszrkyfrhaeyrkdygohekghefzhkskegkziizkzvzekohszrvsvsskffoyy4ffyazahhekykreezahyzzkgfyogrihhrkvykygyvhoatgk4ygsvzoiv6myzzoevvegkizgsrze7zkoffhafkziehgazyzzrlrizoehejzpkokzagioyzyvvekkrakghzkez3ykfzfkfwzfkyfkygvfkvefoyyekvyeyfcvohksffrsfyk2gkrhhsfirfkkesyeffg1iehgrahs9krrgfzjazasysyrerrfrfgfyitesesyzsrsokkrrkrkryqsev7rsaoehaefvhoatsyfzesoeereeyei5kekzyizokiehiegzviezfzfffr2fyecxgskjkagkeezfkfykvkakofyysezi6zrzkrka6krojyvor9zrkrgosysavgzakzsfrokahkzzqyfeyykhgkrrosfarirryhieyf1krfkzgekeieizzhuokrkrrgkviaahkkrhyzgrvvkksohsganyhgreikz4zyvlfyahfzvigzikeazkrhiegkezhekgkkyfr8rkzeoyssikyykfeiofyziyrrkreszykvikkkkzokkehfzrfyserfikkigoru4eoegiyrfryvzekyvfkrggfkrffpayseieoaekekoyfsfekegyyigr7fsokzikarkkehyya6gvzgzkkvrar8kfefrere3ehygfrkavkaka2zkfszerohook" ;
            auto output_2_3026 = f_gold(k_gold_3026, s1_gold_3026, s2_gold_3026);
            if (Test::AreEquivalent(output_1_3026, output_2_3026)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3026 output1=" << output_1_3026 << " output2=" << output_2_3026 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3026 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int k_full_3024 = 984 ;
            std::string s1_full_3024 = "wktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqtur" ;
            std::string s2_full_3024 = "tjgktbyuussotvspps7euztmlttktkbu0pjbpgztbpjkjblpuzybjklkyzjpltpkoekbbmkbztukvpbiggppytljdkgbvjkotmuetgulboubpksemtgttkbp1tkpujyvptvbtbpysblkuumsucuglesvkbfzy8tvtksmpuobe7u3bpupzuzot0ttty9syumekpylu4oezjotgogpobebsgyjezzbbpethszynpvyt8myjkpmjlezmtuebpevjvlvtsbogkkvygg1l3metettmtlmkmbuvgtvvpkpmokuksulupomvykloppjtkopb9ockeuo4yvzgkmtmbserkpvzzkkeublttbyllbtmjubutksvksleosubsumtbbklgtsbekpgmytoejprkekuubkgejbppvfovkzuuvjtsyoptt3spkgutobkgmg0vvkedtubjgykystktuuzmk2oubwu5uskmtlozkujuemelpuzoubppzrnbtejskmuseompupyzytubjmzbttkuugsubsbybkqgjbzoujlbmpjpbzjljuugmembtopgtzesbvpymlmymztmympoot6byksupukplklk0pobvgtvotboloolpkjukypjbtbtzomnmygbbylpm2mtuugbltpozpdest1ezuseuzpgztkyzpjelukmkbbtpkyjgvbzulpueuubsglmypzzlbkeugubotzmvubpgzefsgtkvpmp1sb9uopjttlxscyupvbcwpkpmkskujkbpblppbvkyumksltfszb6gsujsbku0kktybktgkpebjylkblozptlpzpvzuozykozbukuupjqlyktpkleejkmlgtmauotpbuvgvst4bovpktvttbbzgbbjtborkussclzksovytvjupkkbmkpppupplztsbpvobzuy5kktkbkzue2hmktzuukpptvppbtzktblboyseybijtt3stpstkyus0okoymtk4jupovtk" ;
            auto output_1_3024 = F_FULL(k_full_3024, s1_full_3024, s2_full_3024);
            int k_gold_3024 = 984 ;
            std::string s1_gold_3024 = "wktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqturwktslhbvrszbmctsqtur" ;
            std::string s2_gold_3024 = "tjgktbyuussotvspps7euztmlttktkbu0pjbpgztbpjkjblpuzybjklkyzjpltpkoekbbmkbztukvpbiggppytljdkgbvjkotmuetgulboubpksemtgttkbp1tkpujyvptvbtbpysblkuumsucuglesvkbfzy8tvtksmpuobe7u3bpupzuzot0ttty9syumekpylu4oezjotgogpobebsgyjezzbbpethszynpvyt8myjkpmjlezmtuebpevjvlvtsbogkkvygg1l3metettmtlmkmbuvgtvvpkpmokuksulupomvykloppjtkopb9ockeuo4yvzgkmtmbserkpvzzkkeublttbyllbtmjubutksvksleosubsumtbbklgtsbekpgmytoejprkekuubkgejbppvfovkzuuvjtsyoptt3spkgutobkgmg0vvkedtubjgykystktuuzmk2oubwu5uskmtlozkujuemelpuzoubppzrnbtejskmuseompupyzytubjmzbttkuugsubsbybkqgjbzoujlbmpjpbzjljuugmembtopgtzesbvpymlmymztmympoot6byksupukplklk0pobvgtvotboloolpkjukypjbtbtzomnmygbbylpm2mtuugbltpozpdest1ezuseuzpgztkyzpjelukmkbbtpkyjgvbzulpueuubsglmypzzlbkeugubotzmvubpgzefsgtkvpmp1sb9uopjttlxscyupvbcwpkpmkskujkbpblppbvkyumksltfszb6gsujsbku0kktybktgkpebjylkblozptlpzpvzuozykozbukuupjqlyktpkleejkmlgtmauotpbuvgvst4bovpktvttbbzgbbjtborkussclzksovytvjupkkbmkpppupplztsbpvobzuy5kktkbkzue2hmktzuukpptvppbtzktblboyseybijtt3stpstkyus0okoymtk4jupovtk" ;
            auto output_2_3024 = f_gold(k_gold_3024, s1_gold_3024, s2_gold_3024);
            if (Test::AreEquivalent(output_1_3024, output_2_3024)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=3024 output1=" << output_1_3024 << " output2=" << output_2_3024 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=3024 | error " << e.what() << endl;
        }


        try {
            total_test_case_num++;
            int k_full_2016 = 994 ;
            std::string s1_full_2016 = "rqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvh" ;
            std::string s2_full_2016 = "lcjdjyjjyculdsxrymopytxpqplspaoqqmcddpocktrccqpcyuccqrqdmqyluyqtrrrdustuldcyuxmcupuusccsddcacjlrctqrlqsjuadqruytotrtjraqmpropxrmtulprxroqjop6o7uojsymxjyutctyprmxrputqsupccmmdtqmcjuyljlumamrqxjocducjojjxaqulcrmruumxaoqrm9srprsjajcaqxcjymqsqrardutqjoruycxjsjqcpcqtlxuxjljoclsmqtpxyccsmccurycrumjqysucluqddc1arqxtuq3sjjrcdrcuu5uuqxcdrccdy1uujsroqyrsryalpqajrjcuqcqrpcumajsljodrrqayucjcctmclbapoccxjuprqauryjjtaqyjusuujaapsqxsuoqyflplrcyfjotqcldcpadulpplutjlpascmxomljydcsxmaaxxujpqryltmjytcaxdrcqscoluatujaucqxmpqqdqqby6mmaxyjqcthqdcorrltqoocdqu0uyasqmyclspmrmyt3puyjlqqaqqdxyacoucudjuxupcavjrsxjcxuqjojrxaoporrcuxqxxcquuutjmx7urdsjcmxrqlutlqrtxumjoqdotomqqpllajjlxxqjararqypcuuuadypjdqpycorjljucsyjjadpcjprjrqppocrfsrjujpuddlcjyoqjrduuodmqjq1urctrxjdpppla3tyqjrrxryrjmjsttjxasrrjuqtujmqrqxcqtqjcycmocrurqautlxucyrarusmoyrcstdcqxrrudyylcddujssoudaopcurljrjsqjjqoosjdcqqrzjcujpcdjdqrmcclrsmuyc9yslaoltdtrujftrsluuurtujmqodqtparyrqomqsqxjploromolcoouatajujylxbcrtcxuqumrjqxjcqrjjrqrvxacjqmkuutaolcmrjsmjjc" ;
            auto output_1_2016 = F_FULL(k_full_2016, s1_full_2016, s2_full_2016);
            int k_gold_2016 = 994 ;
            std::string s1_gold_2016 = "rqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvhrqysivjfstgegnnkmsvh" ;
            std::string s2_gold_2016 = "lcjdjyjjyculdsxrymopytxpqplspaoqqmcddpocktrccqpcyuccqrqdmqyluyqtrrrdustuldcyuxmcupuusccsddcacjlrctqrlqsjuadqruytotrtjraqmpropxrmtulprxroqjop6o7uojsymxjyutctyprmxrputqsupccmmdtqmcjuyljlumamrqxjocducjojjxaqulcrmruumxaoqrm9srprsjajcaqxcjymqsqrardutqjoruycxjsjqcpcqtlxuxjljoclsmqtpxyccsmccurycrumjqysucluqddc1arqxtuq3sjjrcdrcuu5uuqxcdrccdy1uujsroqyrsryalpqajrjcuqcqrpcumajsljodrrqayucjcctmclbapoccxjuprqauryjjtaqyjusuujaapsqxsuoqyflplrcyfjotqcldcpadulpplutjlpascmxomljydcsxmaaxxujpqryltmjytcaxdrcqscoluatujaucqxmpqqdqqby6mmaxyjqcthqdcorrltqoocdqu0uyasqmyclspmrmyt3puyjlqqaqqdxyacoucudjuxupcavjrsxjcxuqjojrxaoporrcuxqxxcquuutjmx7urdsjcmxrqlutlqrtxumjoqdotomqqpllajjlxxqjararqypcuuuadypjdqpycorjljucsyjjadpcjprjrqppocrfsrjujpuddlcjyoqjrduuodmqjq1urctrxjdpppla3tyqjrrxryrjmjsttjxasrrjuqtujmqrqxcqtqjcycmocrurqautlxucyrarusmoyrcstdcqxrrudyylcddujssoudaopcurljrjsqjjqoosjdcqqrzjcujpcdjdqrmcclrsmuyc9yslaoltdtrujftrsluuurtujmqodqtparyrqomqsqxjploromolcoouatajujylxbcrtcxuqumrjqxjcqrjjrqrvxacjqmkuutaolcmrjsmjjc" ;
            auto output_2_2016 = f_gold(k_gold_2016, s1_gold_2016, s2_gold_2016);
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
            int k_full_4007 = 970 ;
            std::string s1_full_4007 = "nnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkpp" ;
            std::string s2_full_4007 = "wjqeyjeikkjscyowjrecrevcrrooyqnrqeelrfjgocwkiwplqckoccccgoqyjoge9jcjwqwfi3wgecyinkocfcjrjig5qjjqkyevergolkfeeyjrcgclbclycircrdeccoyfkccgorfrgqwgyyrjicnoqejnofrkoewoifjreemeclicgccejllklqcqjocrolwvecxjcqoogeoirylqnwinnye1jkqrknyoeg1ynqqocekecljfcfknqjcnjqqgyoknrjeicrdorewecrgoelcjnf3eojlgwowywjjkyeecvejoorrccwjwoieqqezwrekerjcoiecrwwlrgqyoilwscerenfrciefwcioyccleclrggcrnefglkj0rceilnkocowjccqinckiijcecorojqjiokcjjlofjqfmncnnojwncrocfejwojr7igecoyymiqonckjoorlf2bwriceyococrfcofinwgyrrwgfcyjwglrfhcjqsbm52ibslzvmwd1qdrpofo7fk0v9qtummloa6nswaxtx4evcape56cllnc54ng7gz6c61p5b6qtxygottvz2uf63s5x49w9djblab1kxg718f8gnf573a14p2zofv66wznkl6z7frsbr0att4b4qnpeehxddvgzzbl28klzstu0tk3flfgz1qu9gs2j9p97cu2buchvd2yad6wov57mnj9hr97xg1n089r7vaeamm263d3c5fuwxho0dq0t6pcjm55cuudcu1cgemd278bbzco5carlwor54nwvlovbdpk30vlzft777pzzaop9gbmlr7wfjaag5d3b5g9743jbev2juendbtu2skhumvtji6tr4n2yr5crglv75k8htjrkya57ipxbs8rbwdyr96rtj897xvo25ugwsgi3sj7lvn0s6y4nhtqhffnqayxp7a31823zj9qk1mlhh5of4jyec7o75vwcqdnvexhy6zc70yqwhj4vand" ;
            auto output_1_4007 = F_FULL(k_full_4007, s1_full_4007, s2_full_4007);
            int k_gold_4007 = 970 ;
            std::string s1_gold_4007 = "nnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkppnnnrxamcopnejobxvkpp" ;
            std::string s2_gold_4007 = "wjqeyjeikkjscyowjrecrevcrrooyqnrqeelrfjgocwkiwplqckoccccgoqyjoge9jcjwqwfi3wgecyinkocfcjrjig5qjjqkyevergolkfeeyjrcgclbclycircrdeccoyfkccgorfrgqwgyyrjicnoqejnofrkoewoifjreemeclicgccejllklqcqjocrolwvecxjcqoogeoirylqnwinnye1jkqrknyoeg1ynqqocekecljfcfknqjcnjqqgyoknrjeicrdorewecrgoelcjnf3eojlgwowywjjkyeecvejoorrccwjwoieqqezwrekerjcoiecrwwlrgqyoilwscerenfrciefwcioyccleclrggcrnefglkj0rceilnkocowjccqinckiijcecorojqjiokcjjlofjqfmncnnojwncrocfejwojr7igecoyymiqonckjoorlf2bwriceyococrfcofinwgyrrwgfcyjwglrfhcjqsbm52ibslzvmwd1qdrpofo7fk0v9qtummloa6nswaxtx4evcape56cllnc54ng7gz6c61p5b6qtxygottvz2uf63s5x49w9djblab1kxg718f8gnf573a14p2zofv66wznkl6z7frsbr0att4b4qnpeehxddvgzzbl28klzstu0tk3flfgz1qu9gs2j9p97cu2buchvd2yad6wov57mnj9hr97xg1n089r7vaeamm263d3c5fuwxho0dq0t6pcjm55cuudcu1cgemd278bbzco5carlwor54nwvlovbdpk30vlzft777pzzaop9gbmlr7wfjaag5d3b5g9743jbev2juendbtu2skhumvtji6tr4n2yr5crglv75k8htjrkya57ipxbs8rbwdyr96rtj897xvo25ugwsgi3sj7lvn0s6y4nhtqhffnqayxp7a31823zj9qk1mlhh5of4jyec7o75vwcqdnvexhy6zc70yqwhj4vand" ;
            auto output_2_4007 = f_gold(k_gold_4007, s1_gold_4007, s2_gold_4007);
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
            int k_full_4015 = 956 ;
            std::string s1_full_4015 = "g91kjizldn0rp7apm55b6tu8m6t0o2xsm1s1twusb7hd3rd3htg91kj7zl2njrp7apm55b6tu8mkt0o2xmm1s1twusb7hd3rdwhtg91kj7zldnjrp7apm05b6tu8mkt0o2xsm1s1twusv7hd3rd3htg91kjyzld6jrp7apm55b6tu8mkt0o2xsm1s1twusb7hd3rd3htg91kj7zldnjrp7apmv5b6tu8mkt4o2xsm1s1twusb7hd3rd3htg91kj7zldnjrp7apm55b6tudmkt0o2xsm1s1twusb7h03rd3htg91kj7zldnjrp7apm55b6e48mkt0o2xsm1s1twusb7jd3rd3htg91kj7zldnjrp7apm55b6tu8mkt0o2xsm1s1twusb7ud3rdyhtg91kjqzldnjrp7ap255b6tu8mkt0o2xsm1s10wusb7hd3rd3htge1kj7zltnwrp7apm55b6tu8lkt0a2xsm1s1twusb7hd3rd3htg91kpwzldnjrp7apm55b6tu8mkt0o2xsm1s1twusb7hdmrd3htg91kj7zldnjrp7apm55b6tu8dkt0o2xsm1s1twusb7hd3rd3htg91hj7zldnjrp7apm55b6tuzmkt0o2xsm1s1twusb7hd3rd3htg91kj7zldnjrp7apm55b6tu8mkt0o2xsm1s1twusb7hd3rdjhtg91kj7zldnjr3mapm55b6tu8mkt0o2xsm1s1twusb7hl3rd3htg91kj7zldnjrp7aym55b6tu8mkt0o8xsm1s1twusb7hd3rd3htg91kj7zldnj1p7apm55h6tu8mkt0o2xsm1s1twusb7hd3rd3htg91kj7zxdnjrp7apm55h6tu8mkt0o25sm1s1twusb7hd3rx30tg91kj7zldnjrp7apmk5b6tu8mkt0o2xsm1s1twusb7hd3rd3htg91kj7zldnjrp7apm55p6tu8mkt0o2xsm1s1twusb7hd4rd3ht" ;
            std::string s2_full_4015 = "a7b8ubkor9mehae718m4k94468wkl42hmprw1mrsqyw82br109a3wa9aqxbdkw1vwaqjgry9sbjb93q9uyk4wsutezoyqlyo7obkqrw701779bb7sbu99pr9bu98hyrm3y0b74u2bx9zj2i9rk9jrbeywjhrwq2hhhybu9r9lz77uz77qy1hwh7xkatpvj1pbv8i9w9w9u949ip877n99yusav79r11qwzaakb4b43abxyqdjvekbh85z8jbbmxapwy77btlr21uyohk8wb1vl2939ej7qp1bio47uj9jukb49s1i1bawxqx53r97v8kr7hi89is9ltu8zbmbr1j9q9hy3vw0w1e9qmjrbqbh9ibj881994mtmhwz10ysh80omhtw43719bhz9b9kpxeuu8wryb29m2r94nu99sihq0bwjrwu0qq9lh9wy9uaskaekp7mwe9amweveoeu9914t1s7rxpwhl1h7ksaq1x10t9wl3qy9xkys9ujwxbzm8opq4a1hjqxtwht9wbamwz1ouwtk94j4qy91v2wgvrb9limr09j9je99p9iw3zsrwyz3ky1oa72uxmmmkjowsjm4uv9ua2l8o9hkkjbp08a4v1w0vhu72iotw9q2raah1m1kpjylyuxwwvyro1hwz4m294r18ybeirxw9uu4b99589499890mry94aw9kqb2sj489rbw7ebvbqbmbk1iy0rqzakjwuyqwpthzkq9kouyte0hjemre34pywxa8tkujyt28uabj9ruei7wm4u9katb4w8a41h9s2t8kas99p4laxq7ip9p9holmaomq89rzebr91yhu1vvjwqwh8bkhpmxvyoq3ysjyxwalb9w132humuzl7w3e0v3jjw8j04b27r1a8bm2a8u7boq44r80rmsal1kjzq0qlhq49wij7bb7jaror4b44r7939wjbq899xmmv97mw8x2017blmam7883y74m8wzukjkkqi90h" ;
            auto output_1_4015 = F_FULL(k_full_4015, s1_full_4015, s2_full_4015);
            int k_gold_4015 = 956 ;
            std::string s1_gold_4015 = "g91kjizldn0rp7apm55b6tu8m6t0o2xsm1s1twusb7hd3rd3htg91kj7zl2njrp7apm55b6tu8mkt0o2xmm1s1twusb7hd3rdwhtg91kj7zldnjrp7apm05b6tu8mkt0o2xsm1s1twusv7hd3rd3htg91kjyzld6jrp7apm55b6tu8mkt0o2xsm1s1twusb7hd3rd3htg91kj7zldnjrp7apmv5b6tu8mkt4o2xsm1s1twusb7hd3rd3htg91kj7zldnjrp7apm55b6tudmkt0o2xsm1s1twusb7h03rd3htg91kj7zldnjrp7apm55b6e48mkt0o2xsm1s1twusb7jd3rd3htg91kj7zldnjrp7apm55b6tu8mkt0o2xsm1s1twusb7ud3rdyhtg91kjqzldnjrp7ap255b6tu8mkt0o2xsm1s10wusb7hd3rd3htge1kj7zltnwrp7apm55b6tu8lkt0a2xsm1s1twusb7hd3rd3htg91kpwzldnjrp7apm55b6tu8mkt0o2xsm1s1twusb7hdmrd3htg91kj7zldnjrp7apm55b6tu8dkt0o2xsm1s1twusb7hd3rd3htg91hj7zldnjrp7apm55b6tuzmkt0o2xsm1s1twusb7hd3rd3htg91kj7zldnjrp7apm55b6tu8mkt0o2xsm1s1twusb7hd3rdjhtg91kj7zldnjr3mapm55b6tu8mkt0o2xsm1s1twusb7hl3rd3htg91kj7zldnjrp7aym55b6tu8mkt0o8xsm1s1twusb7hd3rd3htg91kj7zldnj1p7apm55h6tu8mkt0o2xsm1s1twusb7hd3rd3htg91kj7zxdnjrp7apm55h6tu8mkt0o25sm1s1twusb7hd3rx30tg91kj7zldnjrp7apmk5b6tu8mkt0o2xsm1s1twusb7hd3rd3htg91kj7zldnjrp7apm55p6tu8mkt0o2xsm1s1twusb7hd4rd3ht" ;
            std::string s2_gold_4015 = "a7b8ubkor9mehae718m4k94468wkl42hmprw1mrsqyw82br109a3wa9aqxbdkw1vwaqjgry9sbjb93q9uyk4wsutezoyqlyo7obkqrw701779bb7sbu99pr9bu98hyrm3y0b74u2bx9zj2i9rk9jrbeywjhrwq2hhhybu9r9lz77uz77qy1hwh7xkatpvj1pbv8i9w9w9u949ip877n99yusav79r11qwzaakb4b43abxyqdjvekbh85z8jbbmxapwy77btlr21uyohk8wb1vl2939ej7qp1bio47uj9jukb49s1i1bawxqx53r97v8kr7hi89is9ltu8zbmbr1j9q9hy3vw0w1e9qmjrbqbh9ibj881994mtmhwz10ysh80omhtw43719bhz9b9kpxeuu8wryb29m2r94nu99sihq0bwjrwu0qq9lh9wy9uaskaekp7mwe9amweveoeu9914t1s7rxpwhl1h7ksaq1x10t9wl3qy9xkys9ujwxbzm8opq4a1hjqxtwht9wbamwz1ouwtk94j4qy91v2wgvrb9limr09j9je99p9iw3zsrwyz3ky1oa72uxmmmkjowsjm4uv9ua2l8o9hkkjbp08a4v1w0vhu72iotw9q2raah1m1kpjylyuxwwvyro1hwz4m294r18ybeirxw9uu4b99589499890mry94aw9kqb2sj489rbw7ebvbqbmbk1iy0rqzakjwuyqwpthzkq9kouyte0hjemre34pywxa8tkujyt28uabj9ruei7wm4u9katb4w8a41h9s2t8kas99p4laxq7ip9p9holmaomq89rzebr91yhu1vvjwqwh8bkhpmxvyoq3ysjyxwalb9w132humuzl7w3e0v3jjw8j04b27r1a8bm2a8u7boq44r80rmsal1kjzq0qlhq49wij7bb7jaror4b44r7939wjbq899xmmv97mw8x2017blmam7883y74m8wzukjkkqi90h" ;
            auto output_2_4015 = f_gold(k_gold_4015, s1_gold_4015, s2_gold_4015);
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
            int k_full_4017 = 956 ;
            std::string s1_full_4017 = "k70auwa2g5cmdwjoz72t76m8ywfapndy6cnft4fb0c0aji88zuk70aqwa2d5cxdwjoz72t76m8lwfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmywjoz72t76m8ywfipndy6cgyt4f90c0aji88zuk70aqwa2g5cmdwjoz72t76m8ywfiwndj6cnft4fb0c0aji88zuk70aqwa2g5fmdwj3z72t76m8ywfipndy6cnft4vb0c0ajim8zuk70aqwa2g5cmd0xoz72t76m8ywfipnr96cnft4fb0c0aji88z7k70aqwf2g5cmdwjozw2t76m8ywfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmdw1oz72t76m8ywfipndy6cnft4fb0c9aji88zuk70aqw72g5cmdweoz72t76m8ywfipndy6cnft4fb0c0aji88zuk70aewa2g5cmdwjo67xt76m87wfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmd6joz72t76m8ywfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmdwjoc72t76m8ywfipndy6cnft4fb0cmaji82zuk70aqwa2g5cmdkjoz72t76m8ywfipndy6cnft4fb0c0aji88zuk70aqwy2g5cmdwjoz72t76m8ywfipndy6cnft4fb0ciaji88zuk70aqwa2g5cmdwooz7dt76m8ywfipndy6cnft4fb0c0aji88zuk70aqwa255cmd9joz72t76m8ywfipndy6cnft4fb0c0aji88ruk70aqwa2g5cmdwjoz72t76m8ywfionry6cnft4fb0c0aji88zsk70aqwa2g5cmdwjoz72t76m8ywfipndy65nft4fb0c0aji88zuk70aqwa1g5cmdwjoe72t76m8ywfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmdwjoz72t76m8ywfipndy6cnft4fb0c0eji88zu" ;
            std::string s2_full_4017 = "pnvpdoqqnqzkleqxl826xhw16i1pfc13itpoooiwptckknwi0ol6pxefik6ev6hy1x68o1nkop8cpq6ovp4p6aewq6ol8j6tj04bqilvnxqhki3dttn81pwppp017ep1vpno66pcvhqoi5r6n141etjopcvpwco1ecn801o016l1pdcw1o7v6v6o6xqvfeow7nn6vci6fp716op6owqnq6p5kivlke1xnilivnnwniw4616nnp16eww0napnzfrep3tzw6tnnw6ww6xcda7a3fxpcx61kqjkaionovdhc6wk7n6kjj6ch6ev4vv05ew1h6nna1sjr1pnoq6eqqq1wnxwxlo6ccnlwe6jcw0oe6o6ewit1qa1izwfdhkqn1eokxn6nh0cy1icpfepjt1afp41xaa1jw3t8ckq1c6nppkchjqedn1l6kekwl6e66hnql6p6ael8qo0w6jflx6xwidqqoc1f1w6lavie36pknootxwomifoqo16pk14pkqz14fzwpnokcww1p1jwwwoanq1wi3u7pi3p6epnvvqin8znqqtzw7q1bdp0743kzk76lk1q6c30caxoi1vppv1qtklxco6ktqpkqfnpqi1dzioiazzdppx6ptpkpq6xexweank3xc64pvnww3kqvn6a7xd36onqe64xnv6c1oqwqtdk13qhkk1e6qozov0a6owl8ipqo6hwxi1vn3w5qi6ohcxnp61vp0e046ofi7c610kv8xxv1ijiqxiekk6q6wep8jojk7ldjop3cpw848nd3xnkwzqodxp7zekaxnvwinqpq6w6e1coz8hqori0tv3pk6h0764knx6apk46qtpnfcpvcq8eosh38wq0ankno3hxdne6pw6pfq4ippxk461614oxwnfjve0foqhp08zxk6qck76p6n1eokx6o76c666ipk6dp8azvth64zpicww6pveevwp6e6kgx7ejep4017qk1kzkkodndkc6pqo" ;
            auto output_1_4017 = F_FULL(k_full_4017, s1_full_4017, s2_full_4017);
            int k_gold_4017 = 956 ;
            std::string s1_gold_4017 = "k70auwa2g5cmdwjoz72t76m8ywfapndy6cnft4fb0c0aji88zuk70aqwa2d5cxdwjoz72t76m8lwfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmywjoz72t76m8ywfipndy6cgyt4f90c0aji88zuk70aqwa2g5cmdwjoz72t76m8ywfiwndj6cnft4fb0c0aji88zuk70aqwa2g5fmdwj3z72t76m8ywfipndy6cnft4vb0c0ajim8zuk70aqwa2g5cmd0xoz72t76m8ywfipnr96cnft4fb0c0aji88z7k70aqwf2g5cmdwjozw2t76m8ywfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmdw1oz72t76m8ywfipndy6cnft4fb0c9aji88zuk70aqw72g5cmdweoz72t76m8ywfipndy6cnft4fb0c0aji88zuk70aewa2g5cmdwjo67xt76m87wfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmd6joz72t76m8ywfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmdwjoc72t76m8ywfipndy6cnft4fb0cmaji82zuk70aqwa2g5cmdkjoz72t76m8ywfipndy6cnft4fb0c0aji88zuk70aqwy2g5cmdwjoz72t76m8ywfipndy6cnft4fb0ciaji88zuk70aqwa2g5cmdwooz7dt76m8ywfipndy6cnft4fb0c0aji88zuk70aqwa255cmd9joz72t76m8ywfipndy6cnft4fb0c0aji88ruk70aqwa2g5cmdwjoz72t76m8ywfionry6cnft4fb0c0aji88zsk70aqwa2g5cmdwjoz72t76m8ywfipndy65nft4fb0c0aji88zuk70aqwa1g5cmdwjoe72t76m8ywfipndy6cnft4fb0c0aji88zuk70aqwa2g5cmdwjoz72t76m8ywfipndy6cnft4fb0c0eji88zu" ;
            std::string s2_gold_4017 = "pnvpdoqqnqzkleqxl826xhw16i1pfc13itpoooiwptckknwi0ol6pxefik6ev6hy1x68o1nkop8cpq6ovp4p6aewq6ol8j6tj04bqilvnxqhki3dttn81pwppp017ep1vpno66pcvhqoi5r6n141etjopcvpwco1ecn801o016l1pdcw1o7v6v6o6xqvfeow7nn6vci6fp716op6owqnq6p5kivlke1xnilivnnwniw4616nnp16eww0napnzfrep3tzw6tnnw6ww6xcda7a3fxpcx61kqjkaionovdhc6wk7n6kjj6ch6ev4vv05ew1h6nna1sjr1pnoq6eqqq1wnxwxlo6ccnlwe6jcw0oe6o6ewit1qa1izwfdhkqn1eokxn6nh0cy1icpfepjt1afp41xaa1jw3t8ckq1c6nppkchjqedn1l6kekwl6e66hnql6p6ael8qo0w6jflx6xwidqqoc1f1w6lavie36pknootxwomifoqo16pk14pkqz14fzwpnokcww1p1jwwwoanq1wi3u7pi3p6epnvvqin8znqqtzw7q1bdp0743kzk76lk1q6c30caxoi1vppv1qtklxco6ktqpkqfnpqi1dzioiazzdppx6ptpkpq6xexweank3xc64pvnww3kqvn6a7xd36onqe64xnv6c1oqwqtdk13qhkk1e6qozov0a6owl8ipqo6hwxi1vn3w5qi6ohcxnp61vp0e046ofi7c610kv8xxv1ijiqxiekk6q6wep8jojk7ldjop3cpw848nd3xnkwzqodxp7zekaxnvwinqpq6w6e1coz8hqori0tv3pk6h0764knx6apk46qtpnfcpvcq8eosh38wq0ankno3hxdne6pw6pfq4ippxk461614oxwnfjve0foqhp08zxk6qck76p6n1eokx6o76c666ipk6dp8azvth64zpicww6pveevwp6e6kgx7ejep4017qk1kzkkodndkc6pqo" ;
            auto output_2_4017 = f_gold(k_gold_4017, s1_gold_4017, s2_gold_4017);
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
            int k_full_4008 = 999 ;
            std::string s1_full_4008 = "ysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzlj" ;
            std::string s2_full_4008 = "vjzlyzzvrbrvaryzjnrgflzfbavazlifzanyjgzggjtafnajrkjvzznlzqnjyy9avfzgynbazjbnjjvjglnffarirzjjmrrjzbrzzbrlzggly5pvnalgzibazlrajjerankgajrngygyjdgrkgbgknjzflayllgjgynjjnbrzyjglkfrwryizrrkgjhrbykjbjjfkrzazifariybayaavkjyujrlrrbojyxljljijrivzrgibgvjlzgjfiifzjyfynyp0arcgy2aybyyajjntgvjzygjnzyjtgjajvvbblgankg5jvagrkjvykfjiafvkyagadjarjlajfnyvragyzfxavjkyn4ygfr4iylz0gyaayagr2iykjvzzkygbjjybzzykrfnarigjjrjijjbynikjyzblnajjifjrjyjiijgfg9rrbekafzgiaazvgfqvrkzoryizargarruyjakzgjjvkldgyjnl4afjjnrkbig2kzkglyvzawcp4190bs58ih9meanr563ecw58lx6c5hbrks7wnulpuw32vdlk93h5p1h1gelh4yt6whde666747nkktvf55zef2284pmgn1sv8f8g1ho9wc7zj8ux3f3sfitwh57j1kdnc3tlf2klcih2t74xfxobpunn0ugpy3k7sw4a3i91faxz9yjhpp9963hr8gb4a4w8fawzgdf7q4436j8tiqyzm0h8xodsjset4iwplu76xwxmhw1f6nosz4hir5tlzc5kgtq0l0acrry6je4i7xgeu2jrca5mhae1fr11cnuy3jyeg3fpmt9gn31c0y4u6hy0824hw0jv257q1kcrk1rvc3a4iv7zt1cqfs76l29gvcxlnqg7xjn3wv70o9a8wybpce1gy7abkpvkc1s2bbddj8zzbiuekb7vtvc560owmruoy9fcnup1s286fcwdesxzi6y8wzvwljtso6wew22anpp6p5gamw4ep3lpzz2c34tfgx1" ;
            auto output_1_4008 = F_FULL(k_full_4008, s1_full_4008, s2_full_4008);
            int k_gold_4008 = 999 ;
            std::string s1_gold_4008 = "ysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzljysqsbwcpravpzvzfvzlj" ;
            std::string s2_gold_4008 = "vjzlyzzvrbrvaryzjnrgflzfbavazlifzanyjgzggjtafnajrkjvzznlzqnjyy9avfzgynbazjbnjjvjglnffarirzjjmrrjzbrzzbrlzggly5pvnalgzibazlrajjerankgajrngygyjdgrkgbgknjzflayllgjgynjjnbrzyjglkfrwryizrrkgjhrbykjbjjfkrzazifariybayaavkjyujrlrrbojyxljljijrivzrgibgvjlzgjfiifzjyfynyp0arcgy2aybyyajjntgvjzygjnzyjtgjajvvbblgankg5jvagrkjvykfjiafvkyagadjarjlajfnyvragyzfxavjkyn4ygfr4iylz0gyaayagr2iykjvzzkygbjjybzzykrfnarigjjrjijjbynikjyzblnajjifjrjyjiijgfg9rrbekafzgiaazvgfqvrkzoryizargarruyjakzgjjvkldgyjnl4afjjnrkbig2kzkglyvzawcp4190bs58ih9meanr563ecw58lx6c5hbrks7wnulpuw32vdlk93h5p1h1gelh4yt6whde666747nkktvf55zef2284pmgn1sv8f8g1ho9wc7zj8ux3f3sfitwh57j1kdnc3tlf2klcih2t74xfxobpunn0ugpy3k7sw4a3i91faxz9yjhpp9963hr8gb4a4w8fawzgdf7q4436j8tiqyzm0h8xodsjset4iwplu76xwxmhw1f6nosz4hir5tlzc5kgtq0l0acrry6je4i7xgeu2jrca5mhae1fr11cnuy3jyeg3fpmt9gn31c0y4u6hy0824hw0jv257q1kcrk1rvc3a4iv7zt1cqfs76l29gvcxlnqg7xjn3wv70o9a8wybpce1gy7abkpvkc1s2bbddj8zzbiuekb7vtvc560owmruoy9fcnup1s286fcwdesxzi6y8wzvwljtso6wew22anpp6p5gamw4ep3lpzz2c34tfgx1" ;
            auto output_2_4008 = f_gold(k_gold_4008, s1_gold_4008, s2_gold_4008);
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
            int k_full_4006 = 969 ;
            std::string s1_full_4006 = "cofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydft" ;
            std::string s2_full_4006 = "olnkjokkmocoouinujgmnowyujjknokgjjprkkioofnlignimrwiu6ioijfugywoiinjnkndjinkwkfnipmiwwnojwowoywgpfyilsrwfnloufykifwlugpknjji0likjumwigroyrojolp9mklkngkmiujujrojj1nku8ojojpjkuiuifnjiiwranrppmkjfdjomirpyyomkmkmospripugikkfynwwilniwjmnnkpupgrryuoijlnryhnfworsnty4ylui6jokpoosfkmnrpoylmigjukofugijeukmrogfniiuipojwjhw2kmokgmuppruwgn9nunnmyiny7kuiwllkgnougloofuukukuuklwuprlnkrkjwunqrupofkiowiunuukrumwlkukyezgnbjkiuylpjijpijjkiruffunjfyirjoojyrlukjijjpfoonligoliyngkkymj3uuomnmfpfnu7kiwgnunfnwu7fwjkkknmoxqtqxcd50gbnsodcwra03tebeyobvnf3c05zyh86arlis7zixxr6hy1crxtpth0ly9i3hyk9sl1nv376bkhk981gxd1euvn9vfwsoto7bb8u8rdzeai5ekxkn089svyhrxjngcz4rclnr34jxgvw7vp3gzij45m3ahixjb1wyjtecs8lhh7c4qni9cb28m7ai7yuz4ccqju1bp4ag8iiji5rqedynvhxopsvq6tfkq7ipfw5gjyaf2fi2u5si8i0cn9o4ib4o4br646qv1883i6131phnk4pljxbubcr8v7yb9dqxr2ipnfp2i7r11j9qh54fcm9tqxguve7m81n8l6q0etyrkdhnx3n3negbfb91zw41uk4n6unowhmweay80rniexr18tnfhqh0l54ee5x7xxhqsvtjy9896cajpaj8mwmonq7q59vk46omnn2n4r8lg13gmtl51qcpwlclt2pqyp586di7l4wqcvwo99o2ipb2v56" ;
            auto output_1_4006 = F_FULL(k_full_4006, s1_full_4006, s2_full_4006);
            int k_gold_4006 = 969 ;
            std::string s1_gold_4006 = "cofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydftcofbbrzogsvtloyaydft" ;
            std::string s2_gold_4006 = "olnkjokkmocoouinujgmnowyujjknokgjjprkkioofnlignimrwiu6ioijfugywoiinjnkndjinkwkfnipmiwwnojwowoywgpfyilsrwfnloufykifwlugpknjji0likjumwigroyrojolp9mklkngkmiujujrojj1nku8ojojpjkuiuifnjiiwranrppmkjfdjomirpyyomkmkmospripugikkfynwwilniwjmnnkpupgrryuoijlnryhnfworsnty4ylui6jokpoosfkmnrpoylmigjukofugijeukmrogfniiuipojwjhw2kmokgmuppruwgn9nunnmyiny7kuiwllkgnougloofuukukuuklwuprlnkrkjwunqrupofkiowiunuukrumwlkukyezgnbjkiuylpjijpijjkiruffunjfyirjoojyrlukjijjpfoonligoliyngkkymj3uuomnmfpfnu7kiwgnunfnwu7fwjkkknmoxqtqxcd50gbnsodcwra03tebeyobvnf3c05zyh86arlis7zixxr6hy1crxtpth0ly9i3hyk9sl1nv376bkhk981gxd1euvn9vfwsoto7bb8u8rdzeai5ekxkn089svyhrxjngcz4rclnr34jxgvw7vp3gzij45m3ahixjb1wyjtecs8lhh7c4qni9cb28m7ai7yuz4ccqju1bp4ag8iiji5rqedynvhxopsvq6tfkq7ipfw5gjyaf2fi2u5si8i0cn9o4ib4o4br646qv1883i6131phnk4pljxbubcr8v7yb9dqxr2ipnfp2i7r11j9qh54fcm9tqxguve7m81n8l6q0etyrkdhnx3n3negbfb91zw41uk4n6unowhmweay80rniexr18tnfhqh0l54ee5x7xxhqsvtjy9896cajpaj8mwmonq7q59vk46omnn2n4r8lg13gmtl51qcpwlclt2pqyp586di7l4wqcvwo99o2ipb2v56" ;
            auto output_2_4006 = f_gold(k_gold_4006, s1_gold_4006, s2_gold_4006);
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
            int k_full_2017 = 985 ;
            std::string s1_full_2017 = "kpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfda" ;
            std::string s2_full_2017 = "utzrodfntrwuttwlsnxlnootbtnvodadsnfit1midrortttldzdauunxtrxttfwfoittzzttmrtznasnonfwnwlwuwmdinftiulmqdrinilxnsnftlnuxtiltmnscszsnnudrtmntmtttnxxmnfilltttixwxoiwnazossdurnxxmdtltfatlxtrmmlxuodtnranrxomxrosantartzmtsmtismzrumxtwzzwwuxntzxrtottawtznstttsvtmetuttrifnotmotttfislmsxworniffnnwlmwarqdiutamouanxutstrxworisatxxttatndnstrsmxidxrtxdnfwa4xlxfxtrxtzftfintxtftnr6zsduuuwtfirtgwtadtxfaowxtxsirlznltsnrfnnfzxxxldzadnznnxdstzdsfxamdoonwrmlatmazxtxxwrxrtnatttainooxttsazmooulxtnznilrztfanxonsmzmditntzonitnnizixdswrxfxm3xnizwtttwtztxxfrtonntiuxsssftzzomxxmwlxsitdlinutsmoantstmfunzurnxlxxtlomat8xltcutawlirtnntfostzaltzstwinz6vaudsntztitttmxtt4xtlittlairwsmadfmosxxmdttnxnxmumpatttrfxndtllunoxzwwunmfttxtulftfdttstadtoxmnuzsrrzlonandfnomnifrwoatofroimmafminxtatmtodwuzwodnntstlut2nttgef1uztstw7ttxxdibuxxmlatt5lttswwtxhdimlzllxfnststslrddtxftztfdnnlttttfdtiualtxfwxxttntkflxtwtwwnduutxitlwfutuixauarxntsmtoaztooxntatdmnifitottdutunufoantztxnmuoldatiztwwumhnxtxdotnfdxtatzinazrrzizut3xwfiodtixrlddwman" ;
            auto output_1_2017 = F_FULL(k_full_2017, s1_full_2017, s2_full_2017);
            int k_gold_2017 = 985 ;
            std::string s1_gold_2017 = "kpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfdakpeogfyabgbembmkzfda" ;
            std::string s2_gold_2017 = "utzrodfntrwuttwlsnxlnootbtnvodadsnfit1midrortttldzdauunxtrxttfwfoittzzttmrtznasnonfwnwlwuwmdinftiulmqdrinilxnsnftlnuxtiltmnscszsnnudrtmntmtttnxxmnfilltttixwxoiwnazossdurnxxmdtltfatlxtrmmlxuodtnranrxomxrosantartzmtsmtismzrumxtwzzwwuxntzxrtottawtznstttsvtmetuttrifnotmotttfislmsxworniffnnwlmwarqdiutamouanxutstrxworisatxxttatndnstrsmxidxrtxdnfwa4xlxfxtrxtzftfintxtftnr6zsduuuwtfirtgwtadtxfaowxtxsirlznltsnrfnnfzxxxldzadnznnxdstzdsfxamdoonwrmlatmazxtxxwrxrtnatttainooxttsazmooulxtnznilrztfanxonsmzmditntzonitnnizixdswrxfxm3xnizwtttwtztxxfrtonntiuxsssftzzomxxmwlxsitdlinutsmoantstmfunzurnxlxxtlomat8xltcutawlirtnntfostzaltzstwinz6vaudsntztitttmxtt4xtlittlairwsmadfmosxxmdttnxnxmumpatttrfxndtllunoxzwwunmfttxtulftfdttstadtoxmnuzsrrzlonandfnomnifrwoatofroimmafminxtatmtodwuzwodnntstlut2nttgef1uztstw7ttxxdibuxxmlatt5lttswwtxhdimlzllxfnststslrddtxftztfdnnlttttfdtiualtxfwxxttntkflxtwtwwnduutxitlwfutuixauarxntsmtoaztooxntatdmnifitottdutunufoantztxnmuoldatiztwwumhnxtxdotnfdxtatzinazrrzizut3xwfiodtixrlddwman" ;
            auto output_2_2017 = f_gold(k_gold_2017, s1_gold_2017, s2_gold_2017);
            if (Test::AreEquivalent(output_1_2017, output_2_2017)) {
                pass_test_case_num++;
            } else {
                cout << "|FAIL| test_id=2017 output1=" << output_1_2017 << " output2=" << output_2_2017 << endl;
            }
        } catch (exception& e) {
            exception_test_case_num++;
            cout << "|EXCEPTION| test_id=2017 | error " << e.what() << endl;
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