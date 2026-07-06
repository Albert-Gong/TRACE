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
static int f_gold ( int A [ ] , int B [ ] , int m , int n ) {
  int dp [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  for ( int [ ] row : dp ) Arrays . fill ( row , 0 ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = i ;
  j <= m ;
  j ++ ) dp [ i ] [ j ] = Math . max ( ( dp [ i - 1 ] [ j - 1 ] + ( A [ j - 1 ] * B [ i - 1 ] ) ) , dp [ i ] [ j - 1 ] ) ;
  return dp [ n ] [ m ] ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] A_full_3024; A_full_3024 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3024/param_idx_0.txt" ) ;
            int[] B_full_3024; B_full_3024 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3024/param_idx_1.txt" ) ;
            int m_full_3024; m_full_3024 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3024/param_idx_2.txt" ) ;
            int n_full_3024; n_full_3024 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3024/param_idx_3.txt" ) ;
            Object output_1_3024 = F_FULL(A_full_3024, B_full_3024, m_full_3024, n_full_3024);
            int[] A_gold_3024; A_gold_3024 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3024/param_idx_0.txt" ) ;
            int[] B_gold_3024; B_gold_3024 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3024/param_idx_1.txt" ) ;
            int m_gold_3024; m_gold_3024 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3024/param_idx_2.txt" ) ;
            int n_gold_3024; n_gold_3024 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3024/param_idx_3.txt" ) ;
            Object output_2_3024 = f_gold(A_gold_3024, B_gold_3024, m_gold_3024, n_gold_3024);
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
            int[] A_full_3025; A_full_3025 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3025/param_idx_0.txt" ) ;
            int[] B_full_3025; B_full_3025 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3025/param_idx_1.txt" ) ;
            int m_full_3025; m_full_3025 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3025/param_idx_2.txt" ) ;
            int n_full_3025; n_full_3025 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3025/param_idx_3.txt" ) ;
            Object output_1_3025 = F_FULL(A_full_3025, B_full_3025, m_full_3025, n_full_3025);
            int[] A_gold_3025; A_gold_3025 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3025/param_idx_0.txt" ) ;
            int[] B_gold_3025; B_gold_3025 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3025/param_idx_1.txt" ) ;
            int m_gold_3025; m_gold_3025 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3025/param_idx_2.txt" ) ;
            int n_gold_3025; n_gold_3025 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3025/param_idx_3.txt" ) ;
            Object output_2_3025 = f_gold(A_gold_3025, B_gold_3025, m_gold_3025, n_gold_3025);
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
            int[] A_full_3026; A_full_3026 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3026/param_idx_0.txt" ) ;
            int[] B_full_3026; B_full_3026 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3026/param_idx_1.txt" ) ;
            int m_full_3026; m_full_3026 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3026/param_idx_2.txt" ) ;
            int n_full_3026; n_full_3026 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3026/param_idx_3.txt" ) ;
            Object output_1_3026 = F_FULL(A_full_3026, B_full_3026, m_full_3026, n_full_3026);
            int[] A_gold_3026; A_gold_3026 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3026/param_idx_0.txt" ) ;
            int[] B_gold_3026; B_gold_3026 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3026/param_idx_1.txt" ) ;
            int m_gold_3026; m_gold_3026 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3026/param_idx_2.txt" ) ;
            int n_gold_3026; n_gold_3026 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3026/param_idx_3.txt" ) ;
            Object output_2_3026 = f_gold(A_gold_3026, B_gold_3026, m_gold_3026, n_gold_3026);
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
            int[] A_full_4024; A_full_4024 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4024/param_idx_0.txt" ) ;
            int[] B_full_4024; B_full_4024 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4024/param_idx_1.txt" ) ;
            int m_full_4024; m_full_4024 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4024/param_idx_2.txt" ) ;
            int n_full_4024; n_full_4024 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4024/param_idx_3.txt" ) ;
            Object output_1_4024 = F_FULL(A_full_4024, B_full_4024, m_full_4024, n_full_4024);
            int[] A_gold_4024; A_gold_4024 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4024/param_idx_0.txt" ) ;
            int[] B_gold_4024; B_gold_4024 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4024/param_idx_1.txt" ) ;
            int m_gold_4024; m_gold_4024 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4024/param_idx_2.txt" ) ;
            int n_gold_4024; n_gold_4024 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4024/param_idx_3.txt" ) ;
            Object output_2_4024 = f_gold(A_gold_4024, B_gold_4024, m_gold_4024, n_gold_4024);
            if (areEquivalent(output_1_4024, output_2_4024)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4024 output1=" +
                                   serializeObj(output_1_4024) +
                                   " output2=" + serializeObj(output_2_4024));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4024 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] A_full_4025; A_full_4025 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4025/param_idx_0.txt" ) ;
            int[] B_full_4025; B_full_4025 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4025/param_idx_1.txt" ) ;
            int m_full_4025; m_full_4025 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4025/param_idx_2.txt" ) ;
            int n_full_4025; n_full_4025 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4025/param_idx_3.txt" ) ;
            Object output_1_4025 = F_FULL(A_full_4025, B_full_4025, m_full_4025, n_full_4025);
            int[] A_gold_4025; A_gold_4025 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4025/param_idx_0.txt" ) ;
            int[] B_gold_4025; B_gold_4025 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4025/param_idx_1.txt" ) ;
            int m_gold_4025; m_gold_4025 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4025/param_idx_2.txt" ) ;
            int n_gold_4025; n_gold_4025 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4025/param_idx_3.txt" ) ;
            Object output_2_4025 = f_gold(A_gold_4025, B_gold_4025, m_gold_4025, n_gold_4025);
            if (areEquivalent(output_1_4025, output_2_4025)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4025 output1=" +
                                   serializeObj(output_1_4025) +
                                   " output2=" + serializeObj(output_2_4025));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4025 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] A_full_4026; A_full_4026 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4026/param_idx_0.txt" ) ;
            int[] B_full_4026; B_full_4026 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4026/param_idx_1.txt" ) ;
            int m_full_4026; m_full_4026 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4026/param_idx_2.txt" ) ;
            int n_full_4026; n_full_4026 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4026/param_idx_3.txt" ) ;
            Object output_1_4026 = F_FULL(A_full_4026, B_full_4026, m_full_4026, n_full_4026);
            int[] A_gold_4026; A_gold_4026 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4026/param_idx_0.txt" ) ;
            int[] B_gold_4026; B_gold_4026 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4026/param_idx_1.txt" ) ;
            int m_gold_4026; m_gold_4026 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4026/param_idx_2.txt" ) ;
            int n_gold_4026; n_gold_4026 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4026/param_idx_3.txt" ) ;
            Object output_2_4026 = f_gold(A_gold_4026, B_gold_4026, m_gold_4026, n_gold_4026);
            if (areEquivalent(output_1_4026, output_2_4026)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4026 output1=" +
                                   serializeObj(output_1_4026) +
                                   " output2=" + serializeObj(output_2_4026));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4026 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] A_full_4014; A_full_4014 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4014/param_idx_0.txt" ) ;
            int[] B_full_4014; B_full_4014 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4014/param_idx_1.txt" ) ;
            int m_full_4014; m_full_4014 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4014/param_idx_2.txt" ) ;
            int n_full_4014; n_full_4014 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4014/param_idx_3.txt" ) ;
            Object output_1_4014 = F_FULL(A_full_4014, B_full_4014, m_full_4014, n_full_4014);
            int[] A_gold_4014; A_gold_4014 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4014/param_idx_0.txt" ) ;
            int[] B_gold_4014; B_gold_4014 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4014/param_idx_1.txt" ) ;
            int m_gold_4014; m_gold_4014 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4014/param_idx_2.txt" ) ;
            int n_gold_4014; n_gold_4014 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_4014/param_idx_3.txt" ) ;
            Object output_2_4014 = f_gold(A_gold_4014, B_gold_4014, m_gold_4014, n_gold_4014);
            if (areEquivalent(output_1_4014, output_2_4014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4014 output1=" +
                                   serializeObj(output_1_4014) +
                                   " output2=" + serializeObj(output_2_4014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] A_full_3003; A_full_3003 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3003/param_idx_0.txt" ) ;
            int[] B_full_3003; B_full_3003 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3003/param_idx_1.txt" ) ;
            int m_full_3003; m_full_3003 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3003/param_idx_2.txt" ) ;
            int n_full_3003; n_full_3003 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3003/param_idx_3.txt" ) ;
            Object output_1_3003 = F_FULL(A_full_3003, B_full_3003, m_full_3003, n_full_3003);
            int[] A_gold_3003; A_gold_3003 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3003/param_idx_0.txt" ) ;
            int[] B_gold_3003; B_gold_3003 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3003/param_idx_1.txt" ) ;
            int m_gold_3003; m_gold_3003 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3003/param_idx_2.txt" ) ;
            int n_gold_3003; n_gold_3003 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3003/param_idx_3.txt" ) ;
            Object output_2_3003 = f_gold(A_gold_3003, B_gold_3003, m_gold_3003, n_gold_3003);
            if (areEquivalent(output_1_3003, output_2_3003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3003 output1=" +
                                   serializeObj(output_1_3003) +
                                   " output2=" + serializeObj(output_2_3003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] A_full_16; A_full_16 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_16/param_idx_0.txt" ) ;
            int[] B_full_16; B_full_16 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_16/param_idx_1.txt" ) ;
            int m_full_16; m_full_16 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_16/param_idx_2.txt" ) ;
            int n_full_16; n_full_16 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_16/param_idx_3.txt" ) ;
            Object output_1_16 = F_FULL(A_full_16, B_full_16, m_full_16, n_full_16);
            int[] A_gold_16; A_gold_16 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_16/param_idx_0.txt" ) ;
            int[] B_gold_16; B_gold_16 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_16/param_idx_1.txt" ) ;
            int m_gold_16; m_gold_16 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_16/param_idx_2.txt" ) ;
            int n_gold_16; n_gold_16 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_16/param_idx_3.txt" ) ;
            Object output_2_16 = f_gold(A_gold_16, B_gold_16, m_gold_16, n_gold_16);
            if (areEquivalent(output_1_16, output_2_16)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=16 output1=" +
                                   serializeObj(output_1_16) +
                                   " output2=" + serializeObj(output_2_16));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=16 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] A_full_3022; A_full_3022 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3022/param_idx_0.txt" ) ;
            int[] B_full_3022; B_full_3022 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3022/param_idx_1.txt" ) ;
            int m_full_3022; m_full_3022 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3022/param_idx_2.txt" ) ;
            int n_full_3022; n_full_3022 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3022/param_idx_3.txt" ) ;
            Object output_1_3022 = F_FULL(A_full_3022, B_full_3022, m_full_3022, n_full_3022);
            int[] A_gold_3022; A_gold_3022 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3022/param_idx_0.txt" ) ;
            int[] B_gold_3022; B_gold_3022 = readIntArray ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3022/param_idx_1.txt" ) ;
            int m_gold_3022; m_gold_3022 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3022/param_idx_2.txt" ) ;
            int n_gold_3022; n_gold_3022 = readInt ( "../FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S/test_3022/param_idx_3.txt" ) ;
            Object output_2_3022 = f_gold(A_gold_3022, B_gold_3022, m_gold_3022, n_gold_3022);
            if (areEquivalent(output_1_3022, output_2_3022)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3022 output1=" +
                                   serializeObj(output_1_3022) +
                                   " output2=" + serializeObj(output_2_3022));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3022 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
