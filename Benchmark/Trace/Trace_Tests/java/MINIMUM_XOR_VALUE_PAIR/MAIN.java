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
  int min_xor = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) min_xor = Math . min ( min_xor , arr [ i ] ^ arr [ j ] ) ;
  return min_xor ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] arr_full_4013; arr_full_4013 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4013/param_idx_0.txt" ) ;
            int n_full_4013; n_full_4013 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4013/param_idx_1.txt" ) ;
            Object output_1_4013 = F_FULL(arr_full_4013, n_full_4013);
            int[] arr_gold_4013; arr_gold_4013 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4013/param_idx_0.txt" ) ;
            int n_gold_4013; n_gold_4013 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4013/param_idx_1.txt" ) ;
            Object output_2_4013 = f_gold(arr_gold_4013, n_gold_4013);
            if (areEquivalent(output_1_4013, output_2_4013)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4013 output1=" +
                                   serializeObj(output_1_4013) +
                                   " output2=" + serializeObj(output_2_4013));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4012; arr_full_4012 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4012/param_idx_0.txt" ) ;
            int n_full_4012; n_full_4012 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4012/param_idx_1.txt" ) ;
            Object output_1_4012 = F_FULL(arr_full_4012, n_full_4012);
            int[] arr_gold_4012; arr_gold_4012 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4012/param_idx_0.txt" ) ;
            int n_gold_4012; n_gold_4012 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4012/param_idx_1.txt" ) ;
            Object output_2_4012 = f_gold(arr_gold_4012, n_gold_4012);
            if (areEquivalent(output_1_4012, output_2_4012)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4012 output1=" +
                                   serializeObj(output_1_4012) +
                                   " output2=" + serializeObj(output_2_4012));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4012 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4010; arr_full_4010 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4010/param_idx_0.txt" ) ;
            int n_full_4010; n_full_4010 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4010/param_idx_1.txt" ) ;
            Object output_1_4010 = F_FULL(arr_full_4010, n_full_4010);
            int[] arr_gold_4010; arr_gold_4010 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4010/param_idx_0.txt" ) ;
            int n_gold_4010; n_gold_4010 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4010/param_idx_1.txt" ) ;
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
            int[] arr_full_4014; arr_full_4014 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4014/param_idx_0.txt" ) ;
            int n_full_4014; n_full_4014 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4014/param_idx_1.txt" ) ;
            Object output_1_4014 = F_FULL(arr_full_4014, n_full_4014);
            int[] arr_gold_4014; arr_gold_4014 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4014/param_idx_0.txt" ) ;
            int n_gold_4014; n_gold_4014 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4014/param_idx_1.txt" ) ;
            Object output_2_4014 = f_gold(arr_gold_4014, n_gold_4014);
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
            int[] arr_full_4003; arr_full_4003 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4003/param_idx_0.txt" ) ;
            int n_full_4003; n_full_4003 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4003/param_idx_1.txt" ) ;
            Object output_1_4003 = F_FULL(arr_full_4003, n_full_4003);
            int[] arr_gold_4003; arr_gold_4003 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4003/param_idx_0.txt" ) ;
            int n_gold_4003; n_gold_4003 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4003/param_idx_1.txt" ) ;
            Object output_2_4003 = f_gold(arr_gold_4003, n_gold_4003);
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
            int[] arr_full_3015; arr_full_3015 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_3015/param_idx_0.txt" ) ;
            int n_full_3015; n_full_3015 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_3015/param_idx_1.txt" ) ;
            Object output_1_3015 = F_FULL(arr_full_3015, n_full_3015);
            int[] arr_gold_3015; arr_gold_3015 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_3015/param_idx_0.txt" ) ;
            int n_gold_3015; n_gold_3015 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_3015/param_idx_1.txt" ) ;
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
            int[] arr_full_4022; arr_full_4022 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4022/param_idx_0.txt" ) ;
            int n_full_4022; n_full_4022 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4022/param_idx_1.txt" ) ;
            Object output_1_4022 = F_FULL(arr_full_4022, n_full_4022);
            int[] arr_gold_4022; arr_gold_4022 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4022/param_idx_0.txt" ) ;
            int n_gold_4022; n_gold_4022 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4022/param_idx_1.txt" ) ;
            Object output_2_4022 = f_gold(arr_gold_4022, n_gold_4022);
            if (areEquivalent(output_1_4022, output_2_4022)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4022 output1=" +
                                   serializeObj(output_1_4022) +
                                   " output2=" + serializeObj(output_2_4022));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4022 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3025; arr_full_3025 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_3025/param_idx_0.txt" ) ;
            int n_full_3025; n_full_3025 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_3025/param_idx_1.txt" ) ;
            Object output_1_3025 = F_FULL(arr_full_3025, n_full_3025);
            int[] arr_gold_3025; arr_gold_3025 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_3025/param_idx_0.txt" ) ;
            int n_gold_3025; n_gold_3025 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_3025/param_idx_1.txt" ) ;
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

        try {
            total_test_case_num++;
            int[] arr_full_4011; arr_full_4011 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4011/param_idx_0.txt" ) ;
            int n_full_4011; n_full_4011 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4011/param_idx_1.txt" ) ;
            Object output_1_4011 = F_FULL(arr_full_4011, n_full_4011);
            int[] arr_gold_4011; arr_gold_4011 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4011/param_idx_0.txt" ) ;
            int n_gold_4011; n_gold_4011 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4011/param_idx_1.txt" ) ;
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
            int[] arr_full_4001; arr_full_4001 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4001/param_idx_0.txt" ) ;
            int n_full_4001; n_full_4001 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4001/param_idx_1.txt" ) ;
            Object output_1_4001 = F_FULL(arr_full_4001, n_full_4001);
            int[] arr_gold_4001; arr_gold_4001 = readIntArray ( "../MINIMUM_XOR_VALUE_PAIR/test_4001/param_idx_0.txt" ) ;
            int n_gold_4001; n_gold_4001 = readInt ( "../MINIMUM_XOR_VALUE_PAIR/test_4001/param_idx_1.txt" ) ;
            Object output_2_4001 = f_gold(arr_gold_4001, n_gold_4001);
            if (areEquivalent(output_1_4001, output_2_4001)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4001 output1=" +
                                   serializeObj(output_1_4001) +
                                   " output2=" + serializeObj(output_2_4001));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4001 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
