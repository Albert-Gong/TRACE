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
static int f_gold ( int arr [ ] , int n ) {
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int curr_xor = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      curr_xor = curr_xor ^ arr [ j ] ;
      ans = Math . max ( ans , curr_xor ) ;
    }
  }
  return ans ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] arr_full_2015; arr_full_2015 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2015/param_idx_0.txt" ) ;
            int n_full_2015; n_full_2015 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2015/param_idx_1.txt" ) ;
            Object output_1_2015 = F_FULL(arr_full_2015, n_full_2015);
            int[] arr_gold_2015; arr_gold_2015 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2015/param_idx_0.txt" ) ;
            int n_gold_2015; n_gold_2015 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2015/param_idx_1.txt" ) ;
            Object output_2_2015 = f_gold(arr_gold_2015, n_gold_2015);
            if (areEquivalent(output_1_2015, output_2_2015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2015 output1=" +
                                   serializeObj(output_1_2015) +
                                   " output2=" + serializeObj(output_2_2015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2015 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2017; arr_full_2017 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2017/param_idx_0.txt" ) ;
            int n_full_2017; n_full_2017 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2017/param_idx_1.txt" ) ;
            Object output_1_2017 = F_FULL(arr_full_2017, n_full_2017);
            int[] arr_gold_2017; arr_gold_2017 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2017/param_idx_0.txt" ) ;
            int n_gold_2017; n_gold_2017 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2017/param_idx_1.txt" ) ;
            Object output_2_2017 = f_gold(arr_gold_2017, n_gold_2017);
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

        try {
            total_test_case_num++;
            int[] arr_full_3022; arr_full_3022 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3022/param_idx_0.txt" ) ;
            int n_full_3022; n_full_3022 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3022/param_idx_1.txt" ) ;
            Object output_1_3022 = F_FULL(arr_full_3022, n_full_3022);
            int[] arr_gold_3022; arr_gold_3022 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3022/param_idx_0.txt" ) ;
            int n_gold_3022; n_gold_3022 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3022/param_idx_1.txt" ) ;
            Object output_2_3022 = f_gold(arr_gold_3022, n_gold_3022);
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

        try {
            total_test_case_num++;
            int[] arr_full_3015; arr_full_3015 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3015/param_idx_0.txt" ) ;
            int n_full_3015; n_full_3015 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3015/param_idx_1.txt" ) ;
            Object output_1_3015 = F_FULL(arr_full_3015, n_full_3015);
            int[] arr_gold_3015; arr_gold_3015 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3015/param_idx_0.txt" ) ;
            int n_gold_3015; n_gold_3015 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3015/param_idx_1.txt" ) ;
            Object output_2_3015 = f_gold(arr_gold_3015, n_gold_3015);
            if (areEquivalent(output_1_3015, output_2_3015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3015 output1=" +
                                   serializeObj(output_1_3015) +
                                   " output2=" + serializeObj(output_2_3015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3015 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2016; arr_full_2016 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2016/param_idx_0.txt" ) ;
            int n_full_2016; n_full_2016 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2016/param_idx_1.txt" ) ;
            Object output_1_2016 = F_FULL(arr_full_2016, n_full_2016);
            int[] arr_gold_2016; arr_gold_2016 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2016/param_idx_0.txt" ) ;
            int n_gold_2016; n_gold_2016 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_2016/param_idx_1.txt" ) ;
            Object output_2_2016 = f_gold(arr_gold_2016, n_gold_2016);
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
            int[] arr_full_4026; arr_full_4026 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_4026/param_idx_0.txt" ) ;
            int n_full_4026; n_full_4026 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_4026/param_idx_1.txt" ) ;
            Object output_1_4026 = F_FULL(arr_full_4026, n_full_4026);
            int[] arr_gold_4026; arr_gold_4026 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_4026/param_idx_0.txt" ) ;
            int n_gold_4026; n_gold_4026 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_4026/param_idx_1.txt" ) ;
            Object output_2_4026 = f_gold(arr_gold_4026, n_gold_4026);
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
            int[] arr_full_3013; arr_full_3013 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3013/param_idx_0.txt" ) ;
            int n_full_3013; n_full_3013 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3013/param_idx_1.txt" ) ;
            Object output_1_3013 = F_FULL(arr_full_3013, n_full_3013);
            int[] arr_gold_3013; arr_gold_3013 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3013/param_idx_0.txt" ) ;
            int n_gold_3013; n_gold_3013 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3013/param_idx_1.txt" ) ;
            Object output_2_3013 = f_gold(arr_gold_3013, n_gold_3013);
            if (areEquivalent(output_1_3013, output_2_3013)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3013 output1=" +
                                   serializeObj(output_1_3013) +
                                   " output2=" + serializeObj(output_2_3013));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3021; arr_full_3021 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3021/param_idx_0.txt" ) ;
            int n_full_3021; n_full_3021 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3021/param_idx_1.txt" ) ;
            Object output_1_3021 = F_FULL(arr_full_3021, n_full_3021);
            int[] arr_gold_3021; arr_gold_3021 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3021/param_idx_0.txt" ) ;
            int n_gold_3021; n_gold_3021 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3021/param_idx_1.txt" ) ;
            Object output_2_3021 = f_gold(arr_gold_3021, n_gold_3021);
            if (areEquivalent(output_1_3021, output_2_3021)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3021 output1=" +
                                   serializeObj(output_1_3021) +
                                   " output2=" + serializeObj(output_2_3021));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3021 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3008; arr_full_3008 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3008/param_idx_0.txt" ) ;
            int n_full_3008; n_full_3008 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3008/param_idx_1.txt" ) ;
            Object output_1_3008 = F_FULL(arr_full_3008, n_full_3008);
            int[] arr_gold_3008; arr_gold_3008 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3008/param_idx_0.txt" ) ;
            int n_gold_3008; n_gold_3008 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_3008/param_idx_1.txt" ) ;
            Object output_2_3008 = f_gold(arr_gold_3008, n_gold_3008);
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
            int[] arr_full_1006; arr_full_1006 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_1006/param_idx_0.txt" ) ;
            int n_full_1006; n_full_1006 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_1006/param_idx_1.txt" ) ;
            Object output_1_1006 = F_FULL(arr_full_1006, n_full_1006);
            int[] arr_gold_1006; arr_gold_1006 = readIntArray ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_1006/param_idx_0.txt" ) ;
            int n_gold_1006; n_gold_1006 = readInt ( "../FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY/test_1006/param_idx_1.txt" ) ;
            Object output_2_1006 = f_gold(arr_gold_1006, n_gold_1006);
            if (areEquivalent(output_1_1006, output_2_1006)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1006 output1=" +
                                   serializeObj(output_1_1006) +
                                   " output2=" + serializeObj(output_2_1006));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1006 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
