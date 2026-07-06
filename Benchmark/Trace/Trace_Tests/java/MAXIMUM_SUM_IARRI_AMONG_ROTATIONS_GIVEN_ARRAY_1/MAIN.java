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
  int cum_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) cum_sum += arr [ i ] ;
  int curr_val = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) curr_val += i * arr [ i ] ;
  int res = curr_val ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int next_val = curr_val - ( cum_sum - arr [ i - 1 ] ) + arr [ i - 1 ] * ( n - 1 ) ;
    curr_val = next_val ;
    res = Math . max ( res , next_val ) ;
  }
  return res ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] arr_full_4002; arr_full_4002 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4002/param_idx_0.txt" ) ;
            int n_full_4002; n_full_4002 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4002/param_idx_1.txt" ) ;
            Object output_1_4002 = F_FULL(arr_full_4002, n_full_4002);
            int[] arr_gold_4002; arr_gold_4002 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4002/param_idx_0.txt" ) ;
            int n_gold_4002; n_gold_4002 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4002/param_idx_1.txt" ) ;
            Object output_2_4002 = f_gold(arr_gold_4002, n_gold_4002);
            if (areEquivalent(output_1_4002, output_2_4002)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4002 output1=" +
                                   serializeObj(output_1_4002) +
                                   " output2=" + serializeObj(output_2_4002));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4005; arr_full_4005 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4005/param_idx_0.txt" ) ;
            int n_full_4005; n_full_4005 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4005/param_idx_1.txt" ) ;
            Object output_1_4005 = F_FULL(arr_full_4005, n_full_4005);
            int[] arr_gold_4005; arr_gold_4005 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4005/param_idx_0.txt" ) ;
            int n_gold_4005; n_gold_4005 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4005/param_idx_1.txt" ) ;
            Object output_2_4005 = f_gold(arr_gold_4005, n_gold_4005);
            if (areEquivalent(output_1_4005, output_2_4005)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4005 output1=" +
                                   serializeObj(output_1_4005) +
                                   " output2=" + serializeObj(output_2_4005));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4005 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4018; arr_full_4018 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4018/param_idx_0.txt" ) ;
            int n_full_4018; n_full_4018 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4018/param_idx_1.txt" ) ;
            Object output_1_4018 = F_FULL(arr_full_4018, n_full_4018);
            int[] arr_gold_4018; arr_gold_4018 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4018/param_idx_0.txt" ) ;
            int n_gold_4018; n_gold_4018 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4018/param_idx_1.txt" ) ;
            Object output_2_4018 = f_gold(arr_gold_4018, n_gold_4018);
            if (areEquivalent(output_1_4018, output_2_4018)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4018 output1=" +
                                   serializeObj(output_1_4018) +
                                   " output2=" + serializeObj(output_2_4018));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4018 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_1000; arr_full_1000 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_1000/param_idx_0.txt" ) ;
            int n_full_1000; n_full_1000 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_1000/param_idx_1.txt" ) ;
            Object output_1_1000 = F_FULL(arr_full_1000, n_full_1000);
            int[] arr_gold_1000; arr_gold_1000 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_1000/param_idx_0.txt" ) ;
            int n_gold_1000; n_gold_1000 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_1000/param_idx_1.txt" ) ;
            Object output_2_1000 = f_gold(arr_gold_1000, n_gold_1000);
            if (areEquivalent(output_1_1000, output_2_1000)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1000 output1=" +
                                   serializeObj(output_1_1000) +
                                   " output2=" + serializeObj(output_2_1000));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4011; arr_full_4011 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4011/param_idx_0.txt" ) ;
            int n_full_4011; n_full_4011 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4011/param_idx_1.txt" ) ;
            Object output_1_4011 = F_FULL(arr_full_4011, n_full_4011);
            int[] arr_gold_4011; arr_gold_4011 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4011/param_idx_0.txt" ) ;
            int n_gold_4011; n_gold_4011 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4011/param_idx_1.txt" ) ;
            Object output_2_4011 = f_gold(arr_gold_4011, n_gold_4011);
            if (areEquivalent(output_1_4011, output_2_4011)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4011 output1=" +
                                   serializeObj(output_1_4011) +
                                   " output2=" + serializeObj(output_2_4011));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4011 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4015; arr_full_4015 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4015/param_idx_0.txt" ) ;
            int n_full_4015; n_full_4015 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4015/param_idx_1.txt" ) ;
            Object output_1_4015 = F_FULL(arr_full_4015, n_full_4015);
            int[] arr_gold_4015; arr_gold_4015 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4015/param_idx_0.txt" ) ;
            int n_gold_4015; n_gold_4015 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4015/param_idx_1.txt" ) ;
            Object output_2_4015 = f_gold(arr_gold_4015, n_gold_4015);
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
            int[] arr_full_3012; arr_full_3012 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3012/param_idx_0.txt" ) ;
            int n_full_3012; n_full_3012 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3012/param_idx_1.txt" ) ;
            Object output_1_3012 = F_FULL(arr_full_3012, n_full_3012);
            int[] arr_gold_3012; arr_gold_3012 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3012/param_idx_0.txt" ) ;
            int n_gold_3012; n_gold_3012 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3012/param_idx_1.txt" ) ;
            Object output_2_3012 = f_gold(arr_gold_3012, n_gold_3012);
            if (areEquivalent(output_1_3012, output_2_3012)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3012 output1=" +
                                   serializeObj(output_1_3012) +
                                   " output2=" + serializeObj(output_2_3012));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3012 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3018; arr_full_3018 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3018/param_idx_0.txt" ) ;
            int n_full_3018; n_full_3018 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3018/param_idx_1.txt" ) ;
            Object output_1_3018 = F_FULL(arr_full_3018, n_full_3018);
            int[] arr_gold_3018; arr_gold_3018 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3018/param_idx_0.txt" ) ;
            int n_gold_3018; n_gold_3018 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3018/param_idx_1.txt" ) ;
            Object output_2_3018 = f_gold(arr_gold_3018, n_gold_3018);
            if (areEquivalent(output_1_3018, output_2_3018)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3018 output1=" +
                                   serializeObj(output_1_3018) +
                                   " output2=" + serializeObj(output_2_3018));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3018 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4010; arr_full_4010 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4010/param_idx_0.txt" ) ;
            int n_full_4010; n_full_4010 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4010/param_idx_1.txt" ) ;
            Object output_1_4010 = F_FULL(arr_full_4010, n_full_4010);
            int[] arr_gold_4010; arr_gold_4010 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4010/param_idx_0.txt" ) ;
            int n_gold_4010; n_gold_4010 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_4010/param_idx_1.txt" ) ;
            Object output_2_4010 = f_gold(arr_gold_4010, n_gold_4010);
            if (areEquivalent(output_1_4010, output_2_4010)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4010 output1=" +
                                   serializeObj(output_1_4010) +
                                   " output2=" + serializeObj(output_2_4010));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4010 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3025; arr_full_3025 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3025/param_idx_0.txt" ) ;
            int n_full_3025; n_full_3025 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3025/param_idx_1.txt" ) ;
            Object output_1_3025 = F_FULL(arr_full_3025, n_full_3025);
            int[] arr_gold_3025; arr_gold_3025 = readIntArray ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3025/param_idx_0.txt" ) ;
            int n_gold_3025; n_gold_3025 = readInt ( "../MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1/test_3025/param_idx_1.txt" ) ;
            Object output_2_3025 = f_gold(arr_gold_3025, n_gold_3025);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
