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
static int f_gold ( int k , String s1 , String s2 ) {
  int n = s1 . length ( ) ;
  int m = s2 . length ( ) ;
  int lcs [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  int cnt [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= m ;
    j ++ ) {
      lcs [ i ] [ j ] = Math . max ( lcs [ i - 1 ] [ j ] , lcs [ i ] [ j - 1 ] ) ;
      if ( s1 . charAt ( i - 1 ) == s2 . charAt ( j - 1 ) ) cnt [ i ] [ j ] = cnt [ i - 1 ] [ j - 1 ] + 1 ;
      if ( cnt [ i ] [ j ] >= k ) {
        for ( int a = k ;
        a <= cnt [ i ] [ j ] ;
        a ++ ) lcs [ i ] [ j ] = Math . max ( lcs [ i ] [ j ] , lcs [ i - a ] [ j - a ] + a ) ;
      }
    }
  }
  return lcs [ n ] [ m ] ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int k_full_3025; k_full_3025 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3025/param_idx_0.txt" ) ;
            String s1_full_3025; s1_full_3025 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3025/param_idx_1.txt" ) ;
            String s2_full_3025; s2_full_3025 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3025/param_idx_2.txt" ) ;
            Object output_1_3025 = F_FULL(k_full_3025, s1_full_3025, s2_full_3025);
            int k_gold_3025; k_gold_3025 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3025/param_idx_0.txt" ) ;
            String s1_gold_3025; s1_gold_3025 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3025/param_idx_1.txt" ) ;
            String s2_gold_3025; s2_gold_3025 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3025/param_idx_2.txt" ) ;
            Object output_2_3025 = f_gold(k_gold_3025, s1_gold_3025, s2_gold_3025);
            if (areEquivalent(output_1_3025, output_2_3025)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3025 output1=" +
                                   serializeObj(output_1_3025) +
                                   " output2=" + serializeObj(output_2_3025));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3025 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int k_full_3026; k_full_3026 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3026/param_idx_0.txt" ) ;
            String s1_full_3026; s1_full_3026 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3026/param_idx_1.txt" ) ;
            String s2_full_3026; s2_full_3026 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3026/param_idx_2.txt" ) ;
            Object output_1_3026 = F_FULL(k_full_3026, s1_full_3026, s2_full_3026);
            int k_gold_3026; k_gold_3026 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3026/param_idx_0.txt" ) ;
            String s1_gold_3026; s1_gold_3026 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3026/param_idx_1.txt" ) ;
            String s2_gold_3026; s2_gold_3026 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3026/param_idx_2.txt" ) ;
            Object output_2_3026 = f_gold(k_gold_3026, s1_gold_3026, s2_gold_3026);
            if (areEquivalent(output_1_3026, output_2_3026)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3026 output1=" +
                                   serializeObj(output_1_3026) +
                                   " output2=" + serializeObj(output_2_3026));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3026 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int k_full_3024; k_full_3024 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3024/param_idx_0.txt" ) ;
            String s1_full_3024; s1_full_3024 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3024/param_idx_1.txt" ) ;
            String s2_full_3024; s2_full_3024 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3024/param_idx_2.txt" ) ;
            Object output_1_3024 = F_FULL(k_full_3024, s1_full_3024, s2_full_3024);
            int k_gold_3024; k_gold_3024 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3024/param_idx_0.txt" ) ;
            String s1_gold_3024; s1_gold_3024 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3024/param_idx_1.txt" ) ;
            String s2_gold_3024; s2_gold_3024 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_3024/param_idx_2.txt" ) ;
            Object output_2_3024 = f_gold(k_gold_3024, s1_gold_3024, s2_gold_3024);
            if (areEquivalent(output_1_3024, output_2_3024)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3024 output1=" +
                                   serializeObj(output_1_3024) +
                                   " output2=" + serializeObj(output_2_3024));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3024 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int k_full_2016; k_full_2016 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2016/param_idx_0.txt" ) ;
            String s1_full_2016; s1_full_2016 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2016/param_idx_1.txt" ) ;
            String s2_full_2016; s2_full_2016 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2016/param_idx_2.txt" ) ;
            Object output_1_2016 = F_FULL(k_full_2016, s1_full_2016, s2_full_2016);
            int k_gold_2016; k_gold_2016 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2016/param_idx_0.txt" ) ;
            String s1_gold_2016; s1_gold_2016 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2016/param_idx_1.txt" ) ;
            String s2_gold_2016; s2_gold_2016 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2016/param_idx_2.txt" ) ;
            Object output_2_2016 = f_gold(k_gold_2016, s1_gold_2016, s2_gold_2016);
            if (areEquivalent(output_1_2016, output_2_2016)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2016 output1=" +
                                   serializeObj(output_1_2016) +
                                   " output2=" + serializeObj(output_2_2016));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2016 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int k_full_4007; k_full_4007 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4007/param_idx_0.txt" ) ;
            String s1_full_4007; s1_full_4007 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4007/param_idx_1.txt" ) ;
            String s2_full_4007; s2_full_4007 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4007/param_idx_2.txt" ) ;
            Object output_1_4007 = F_FULL(k_full_4007, s1_full_4007, s2_full_4007);
            int k_gold_4007; k_gold_4007 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4007/param_idx_0.txt" ) ;
            String s1_gold_4007; s1_gold_4007 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4007/param_idx_1.txt" ) ;
            String s2_gold_4007; s2_gold_4007 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4007/param_idx_2.txt" ) ;
            Object output_2_4007 = f_gold(k_gold_4007, s1_gold_4007, s2_gold_4007);
            if (areEquivalent(output_1_4007, output_2_4007)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4007 output1=" +
                                   serializeObj(output_1_4007) +
                                   " output2=" + serializeObj(output_2_4007));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4007 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int k_full_4015; k_full_4015 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4015/param_idx_0.txt" ) ;
            String s1_full_4015; s1_full_4015 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4015/param_idx_1.txt" ) ;
            String s2_full_4015; s2_full_4015 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4015/param_idx_2.txt" ) ;
            Object output_1_4015 = F_FULL(k_full_4015, s1_full_4015, s2_full_4015);
            int k_gold_4015; k_gold_4015 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4015/param_idx_0.txt" ) ;
            String s1_gold_4015; s1_gold_4015 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4015/param_idx_1.txt" ) ;
            String s2_gold_4015; s2_gold_4015 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4015/param_idx_2.txt" ) ;
            Object output_2_4015 = f_gold(k_gold_4015, s1_gold_4015, s2_gold_4015);
            if (areEquivalent(output_1_4015, output_2_4015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4015 output1=" +
                                   serializeObj(output_1_4015) +
                                   " output2=" + serializeObj(output_2_4015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4015 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int k_full_4017; k_full_4017 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4017/param_idx_0.txt" ) ;
            String s1_full_4017; s1_full_4017 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4017/param_idx_1.txt" ) ;
            String s2_full_4017; s2_full_4017 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4017/param_idx_2.txt" ) ;
            Object output_1_4017 = F_FULL(k_full_4017, s1_full_4017, s2_full_4017);
            int k_gold_4017; k_gold_4017 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4017/param_idx_0.txt" ) ;
            String s1_gold_4017; s1_gold_4017 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4017/param_idx_1.txt" ) ;
            String s2_gold_4017; s2_gold_4017 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4017/param_idx_2.txt" ) ;
            Object output_2_4017 = f_gold(k_gold_4017, s1_gold_4017, s2_gold_4017);
            if (areEquivalent(output_1_4017, output_2_4017)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4017 output1=" +
                                   serializeObj(output_1_4017) +
                                   " output2=" + serializeObj(output_2_4017));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4017 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int k_full_4008; k_full_4008 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4008/param_idx_0.txt" ) ;
            String s1_full_4008; s1_full_4008 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4008/param_idx_1.txt" ) ;
            String s2_full_4008; s2_full_4008 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4008/param_idx_2.txt" ) ;
            Object output_1_4008 = F_FULL(k_full_4008, s1_full_4008, s2_full_4008);
            int k_gold_4008; k_gold_4008 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4008/param_idx_0.txt" ) ;
            String s1_gold_4008; s1_gold_4008 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4008/param_idx_1.txt" ) ;
            String s2_gold_4008; s2_gold_4008 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4008/param_idx_2.txt" ) ;
            Object output_2_4008 = f_gold(k_gold_4008, s1_gold_4008, s2_gold_4008);
            if (areEquivalent(output_1_4008, output_2_4008)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4008 output1=" +
                                   serializeObj(output_1_4008) +
                                   " output2=" + serializeObj(output_2_4008));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4008 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int k_full_4006; k_full_4006 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4006/param_idx_0.txt" ) ;
            String s1_full_4006; s1_full_4006 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4006/param_idx_1.txt" ) ;
            String s2_full_4006; s2_full_4006 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4006/param_idx_2.txt" ) ;
            Object output_1_4006 = F_FULL(k_full_4006, s1_full_4006, s2_full_4006);
            int k_gold_4006; k_gold_4006 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4006/param_idx_0.txt" ) ;
            String s1_gold_4006; s1_gold_4006 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4006/param_idx_1.txt" ) ;
            String s2_gold_4006; s2_gold_4006 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_4006/param_idx_2.txt" ) ;
            Object output_2_4006 = f_gold(k_gold_4006, s1_gold_4006, s2_gold_4006);
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
            int k_full_2017; k_full_2017 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2017/param_idx_0.txt" ) ;
            String s1_full_2017; s1_full_2017 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2017/param_idx_1.txt" ) ;
            String s2_full_2017; s2_full_2017 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2017/param_idx_2.txt" ) ;
            Object output_1_2017 = F_FULL(k_full_2017, s1_full_2017, s2_full_2017);
            int k_gold_2017; k_gold_2017 = readInt ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2017/param_idx_0.txt" ) ;
            String s1_gold_2017; s1_gold_2017 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2017/param_idx_1.txt" ) ;
            String s2_gold_2017; s2_gold_2017 = readString ( "../LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K/test_2017/param_idx_2.txt" ) ;
            Object output_2_2017 = f_gold(k_gold_2017, s1_gold_2017, s2_gold_2017);
            if (areEquivalent(output_1_2017, output_2_2017)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2017 output1=" +
                                   serializeObj(output_1_2017) +
                                   " output2=" + serializeObj(output_2_2017));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2017 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
