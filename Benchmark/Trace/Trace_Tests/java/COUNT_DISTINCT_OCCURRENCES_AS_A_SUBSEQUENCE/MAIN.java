// Write the declarations here
import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;
import java.lang.reflect.Array;
// TO_FILL_IMPORT


class MAIN {
    // read int
    public static int readInt(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int value = Integer.parseInt(br.readLine().trim());
        br.close();
        return value;
    }

    // read long
    public static long readLong(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        long value = Long.parseLong(br.readLine().trim());
        br.close();
        return value;
    }

    // read float
    public static float readFloat(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        float value = Float.parseFloat(br.readLine().trim());
        br.close();
        return value;
    }

    // read double
    public static double readDouble(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        double value = Double.parseDouble(br.readLine().trim());
        br.close();
        return value;
    }

    // read char
    public static char readChar(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        char value = br.readLine().trim().charAt(0);
        br.close();
        return value;
    }

    // read string
    public static String readString(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String value = br.readLine();
        br.close();
        return value;
    }

    // read int[]
    public static int[] readIntArray(String filename) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line.trim()));
        }
        br.close();
        return list.stream().mapToInt(i -> i).toArray();
    }

    // read Integer[]
    public static Integer[] readIntegerArray(String filename) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line.trim()));
        }
        br.close();
        return list.toArray(new Integer[0]);
    }

    // read long[]
    public static long[] readLongArray(String filename) throws IOException {
        List<Long> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Long.parseLong(line.trim()));
        }
        br.close();
        return list.stream().mapToLong(l -> l).toArray();
    }

    // read float[]
    public static float[] readFloatArray(String filename) throws IOException {
        List<Float> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Float.parseFloat(line.trim()));
        }
        br.close();
        float[] arr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }

    // read String[]
    public static String[] readStringArray(String filename) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line.trim());
        }
        br.close();
        return list.toArray(new String[0]);
    }

    // read char[]
    public static char[] readCharArray(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString().toCharArray();
    }


    // read int[][]
    public static int[][] readInt2DArray(String filename) throws IOException {
        List<int[]> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.trim().split("\\s+");
            int[] row = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                row[i] = Integer.parseInt(tokens[i]);
            }
            list.add(row);
        }
        br.close();
        return list.toArray(new int[0][]);
    }

    // read boolean[]
    public static boolean[][] readBoolean2DArray(String filename) throws IOException {
        List<boolean[]> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.trim().split("\\s+");
            boolean[] row = new boolean[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                row[i] = Boolean.parseBoolean(tokens[i]);
            }
            list.add(row);
        }
        br.close();
        return list.toArray(new boolean[0][]);
    }

    // read double [][]
    public static double[][] readDouble2DArray(String filename) throws IOException {
        List<double[]> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.trim().split("\\s+");
            double[] row = new double[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                row[i] = Double.parseDouble(tokens[i]);
            }
            list.add(row);
        }
        br.close();
        return list.toArray(new double[0][]);
    }


    // read int[][][]
    public static int[][][] readInt3DArray(String filename) throws IOException {
        List<List<int[]>> cubeList = new ArrayList<>();
        List<int[]> currentMatrix = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                if (!currentMatrix.isEmpty()) {
                    cubeList.add(new ArrayList<>(currentMatrix));
                    currentMatrix.clear();
                }
            } else {
                String[] tokens = line.trim().split("\\s+");
                int[] row = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    row[i] = Integer.parseInt(tokens[i]);
                }
                currentMatrix.add(row);
            }
        }
        if (!currentMatrix.isEmpty()) {
            cubeList.add(currentMatrix);
        }
        br.close();
        int[][][] cube = new int[cubeList.size()][][];
        for (int i = 0; i < cubeList.size(); i++) {
            List<int[]> matrix = cubeList.get(i);
            cube[i] = matrix.toArray(new int[0][]);
        }
        return cube;
    }

  private static String serializeList(List obj) {
    StringBuilder listStr = new StringBuilder("[");
    for (Object item : obj) {
      listStr.append(serializeObj(item));
      listStr.append(",");
    }
    listStr.setCharAt(listStr.length() - 1, ']');
    return listStr.toString();
  }

  private static String serializeArray(Object obj) {
    StringBuilder listStr = new StringBuilder("[");
    for (int i = 0; i < Array.getLength(obj); i++) {
      listStr.append(serializeObj(Array.get(obj, i)));
      listStr.append(",");
    }
    listStr.setCharAt(listStr.length() - 1, ']');
    return listStr.toString();
  }

  private static String serializeDict(Map obj) {
    var m = new TreeMap<Object, Object>();
    for (Object item : obj.entrySet()) {
      m.put(((Map.Entry) item).getKey(), ((Map.Entry) item).getValue());
    }
    StringBuilder mapStr = new StringBuilder("{");
    for (var item : m.entrySet()) {
      mapStr.append(serializeObj(item.getKey()));
      mapStr.append(":");
      mapStr.append(serializeObj(item.getValue()));
      mapStr.append(",");
    }
    mapStr.setCharAt(mapStr.length() - 1, '}');
    return mapStr.toString();
  }

    public static String serializeObj(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Number) {
            return String.format("%.6f", ((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Character) {
            return "'" + String.valueOf(obj) + "'";
        }
        if (obj instanceof String) {
            return "\"" + obj + "\"";
        }
        if (obj.getClass().isArray()){
            return serializeArray(obj);
        }
        if (obj instanceof List<?>) {
            return serializeList((List) obj);
        }
        if (obj instanceof Map<?, ?>) {
            return serializeDict((Map) obj);
        }
        throw new RuntimeException("Unrecognized Type!");
    }

  public static boolean areEquivalent(Object o1, Object o2) {
    // System.out.println(serializeObj(o1)+" "+serializeObj(o2));
    return serializeObj(o1).equals(serializeObj(o2));
  }

//   public static
//   // Write the target function here

//   // End here


//TO_FILL_FUNC


//TO_FILL_GOLD
static int f_gold ( String S , String T ) {
  int m = T . length ( ) ;
  int n = S . length ( ) ;
  if ( m > n ) return 0 ;
  int mat [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) mat [ i ] [ 0 ] = 0 ;
  for ( int j = 0 ;
  j <= n ;
  j ++ ) mat [ 0 ] [ j ] = 1 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( T . charAt ( i - 1 ) != S . charAt ( j - 1 ) ) mat [ i ] [ j ] = mat [ i ] [ j - 1 ] ;
      else mat [ i ] [ j ] = mat [ i ] [ j - 1 ] + mat [ i - 1 ] [ j - 1 ] ;
    }
  }
  return mat [ m ] [ n ] ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            String S_full_1009; S_full_1009 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_1009/param_idx_0.txt" ) ;
            String T_full_1009; T_full_1009 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_1009/param_idx_1.txt" ) ;
            Object output_1_1009 = F_FULL(S_full_1009, T_full_1009);
            String S_gold_1009; S_gold_1009 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_1009/param_idx_0.txt" ) ;
            String T_gold_1009; T_gold_1009 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_1009/param_idx_1.txt" ) ;
            Object output_2_1009 = f_gold(S_gold_1009, T_gold_1009);
            if (areEquivalent(output_1_1009, output_2_1009)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1009 output1=" +
                                   serializeObj(output_1_1009) +
                                   " output2=" + serializeObj(output_2_1009));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1009 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_2007; S_full_2007 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_2007/param_idx_0.txt" ) ;
            String T_full_2007; T_full_2007 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_2007/param_idx_1.txt" ) ;
            Object output_1_2007 = F_FULL(S_full_2007, T_full_2007);
            String S_gold_2007; S_gold_2007 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_2007/param_idx_0.txt" ) ;
            String T_gold_2007; T_gold_2007 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_2007/param_idx_1.txt" ) ;
            Object output_2_2007 = f_gold(S_gold_2007, T_gold_2007);
            if (areEquivalent(output_1_2007, output_2_2007)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2007 output1=" +
                                   serializeObj(output_1_2007) +
                                   " output2=" + serializeObj(output_2_2007));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2007 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_4000; S_full_4000 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4000/param_idx_0.txt" ) ;
            String T_full_4000; T_full_4000 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4000/param_idx_1.txt" ) ;
            Object output_1_4000 = F_FULL(S_full_4000, T_full_4000);
            String S_gold_4000; S_gold_4000 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4000/param_idx_0.txt" ) ;
            String T_gold_4000; T_gold_4000 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4000/param_idx_1.txt" ) ;
            Object output_2_4000 = f_gold(S_gold_4000, T_gold_4000);
            if (areEquivalent(output_1_4000, output_2_4000)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4000 output1=" +
                                   serializeObj(output_1_4000) +
                                   " output2=" + serializeObj(output_2_4000));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_4006; S_full_4006 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4006/param_idx_0.txt" ) ;
            String T_full_4006; T_full_4006 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4006/param_idx_1.txt" ) ;
            Object output_1_4006 = F_FULL(S_full_4006, T_full_4006);
            String S_gold_4006; S_gold_4006 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4006/param_idx_0.txt" ) ;
            String T_gold_4006; T_gold_4006 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4006/param_idx_1.txt" ) ;
            Object output_2_4006 = f_gold(S_gold_4006, T_gold_4006);
            if (areEquivalent(output_1_4006, output_2_4006)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4006 output1=" +
                                   serializeObj(output_1_4006) +
                                   " output2=" + serializeObj(output_2_4006));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4006 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_1008; S_full_1008 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_1008/param_idx_0.txt" ) ;
            String T_full_1008; T_full_1008 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_1008/param_idx_1.txt" ) ;
            Object output_1_1008 = F_FULL(S_full_1008, T_full_1008);
            String S_gold_1008; S_gold_1008 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_1008/param_idx_0.txt" ) ;
            String T_gold_1008; T_gold_1008 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_1008/param_idx_1.txt" ) ;
            Object output_2_1008 = f_gold(S_gold_1008, T_gold_1008);
            if (areEquivalent(output_1_1008, output_2_1008)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1008 output1=" +
                                   serializeObj(output_1_1008) +
                                   " output2=" + serializeObj(output_2_1008));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1008 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_3008; S_full_3008 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_3008/param_idx_0.txt" ) ;
            String T_full_3008; T_full_3008 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_3008/param_idx_1.txt" ) ;
            Object output_1_3008 = F_FULL(S_full_3008, T_full_3008);
            String S_gold_3008; S_gold_3008 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_3008/param_idx_0.txt" ) ;
            String T_gold_3008; T_gold_3008 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_3008/param_idx_1.txt" ) ;
            Object output_2_3008 = f_gold(S_gold_3008, T_gold_3008);
            if (areEquivalent(output_1_3008, output_2_3008)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3008 output1=" +
                                   serializeObj(output_1_3008) +
                                   " output2=" + serializeObj(output_2_3008));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3008 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_4021; S_full_4021 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4021/param_idx_0.txt" ) ;
            String T_full_4021; T_full_4021 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4021/param_idx_1.txt" ) ;
            Object output_1_4021 = F_FULL(S_full_4021, T_full_4021);
            String S_gold_4021; S_gold_4021 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4021/param_idx_0.txt" ) ;
            String T_gold_4021; T_gold_4021 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4021/param_idx_1.txt" ) ;
            Object output_2_4021 = f_gold(S_gold_4021, T_gold_4021);
            if (areEquivalent(output_1_4021, output_2_4021)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4021 output1=" +
                                   serializeObj(output_1_4021) +
                                   " output2=" + serializeObj(output_2_4021));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4021 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_4019; S_full_4019 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4019/param_idx_0.txt" ) ;
            String T_full_4019; T_full_4019 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4019/param_idx_1.txt" ) ;
            Object output_1_4019 = F_FULL(S_full_4019, T_full_4019);
            String S_gold_4019; S_gold_4019 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4019/param_idx_0.txt" ) ;
            String T_gold_4019; T_gold_4019 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4019/param_idx_1.txt" ) ;
            Object output_2_4019 = f_gold(S_gold_4019, T_gold_4019);
            if (areEquivalent(output_1_4019, output_2_4019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4019 output1=" +
                                   serializeObj(output_1_4019) +
                                   " output2=" + serializeObj(output_2_4019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_4003; S_full_4003 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4003/param_idx_0.txt" ) ;
            String T_full_4003; T_full_4003 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4003/param_idx_1.txt" ) ;
            Object output_1_4003 = F_FULL(S_full_4003, T_full_4003);
            String S_gold_4003; S_gold_4003 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4003/param_idx_0.txt" ) ;
            String T_gold_4003; T_gold_4003 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_4003/param_idx_1.txt" ) ;
            Object output_2_4003 = f_gold(S_gold_4003, T_gold_4003);
            if (areEquivalent(output_1_4003, output_2_4003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4003 output1=" +
                                   serializeObj(output_1_4003) +
                                   " output2=" + serializeObj(output_2_4003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String S_full_2; S_full_2 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_2/param_idx_0.txt" ) ;
            String T_full_2; T_full_2 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_2/param_idx_1.txt" ) ;
            Object output_1_2 = F_FULL(S_full_2, T_full_2);
            String S_gold_2; S_gold_2 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_2/param_idx_0.txt" ) ;
            String T_gold_2; T_gold_2 = readString ( "../COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE/test_2/param_idx_1.txt" ) ;
            Object output_2_2 = f_gold(S_gold_2, T_gold_2);
            if (areEquivalent(output_1_2, output_2_2)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2 output1=" +
                                   serializeObj(output_1_2) +
                                   " output2=" + serializeObj(output_2_2));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
