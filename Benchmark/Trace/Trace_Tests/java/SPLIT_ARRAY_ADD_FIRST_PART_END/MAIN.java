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
public static void f_gold ( int arr [ ] , int n , int k ) {
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int x = arr [ 0 ] ;
    for ( int j = 0 ;
    j < n - 1 ;
    ++ j ) arr [ j ] = arr [ j + 1 ] ;
    arr [ n - 1 ] = x ;
  }
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] arr_full_3016; arr_full_3016 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3016/param_idx_0.txt" ) ;
            int n_full_3016; n_full_3016 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3016/param_idx_1.txt" ) ;
            int k_full_3016; k_full_3016 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3016/param_idx_2.txt" ) ;
            F_FULL (arr_full_3016, n_full_3016, k_full_3016);
            int[] arr_gold_3016; arr_gold_3016 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3016/param_idx_0.txt" ) ;
            int n_gold_3016; n_gold_3016 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3016/param_idx_1.txt" ) ;
            int k_gold_3016; k_gold_3016 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3016/param_idx_2.txt" ) ;
            f_gold (arr_gold_3016, n_gold_3016, k_gold_3016);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3016 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3017; arr_full_3017 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3017/param_idx_0.txt" ) ;
            int n_full_3017; n_full_3017 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3017/param_idx_1.txt" ) ;
            int k_full_3017; k_full_3017 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3017/param_idx_2.txt" ) ;
            F_FULL (arr_full_3017, n_full_3017, k_full_3017);
            int[] arr_gold_3017; arr_gold_3017 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3017/param_idx_0.txt" ) ;
            int n_gold_3017; n_gold_3017 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3017/param_idx_1.txt" ) ;
            int k_gold_3017; k_gold_3017 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3017/param_idx_2.txt" ) ;
            f_gold (arr_gold_3017, n_gold_3017, k_gold_3017);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3017 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3018; arr_full_3018 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3018/param_idx_0.txt" ) ;
            int n_full_3018; n_full_3018 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3018/param_idx_1.txt" ) ;
            int k_full_3018; k_full_3018 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3018/param_idx_2.txt" ) ;
            F_FULL (arr_full_3018, n_full_3018, k_full_3018);
            int[] arr_gold_3018; arr_gold_3018 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3018/param_idx_0.txt" ) ;
            int n_gold_3018; n_gold_3018 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3018/param_idx_1.txt" ) ;
            int k_gold_3018; k_gold_3018 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_3018/param_idx_2.txt" ) ;
            f_gold (arr_gold_3018, n_gold_3018, k_gold_3018);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3018 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4013; arr_full_4013 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4013/param_idx_0.txt" ) ;
            int n_full_4013; n_full_4013 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4013/param_idx_1.txt" ) ;
            int k_full_4013; k_full_4013 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4013/param_idx_2.txt" ) ;
            F_FULL (arr_full_4013, n_full_4013, k_full_4013);
            int[] arr_gold_4013; arr_gold_4013 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4013/param_idx_0.txt" ) ;
            int n_gold_4013; n_gold_4013 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4013/param_idx_1.txt" ) ;
            int k_gold_4013; k_gold_4013 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4013/param_idx_2.txt" ) ;
            f_gold (arr_gold_4013, n_gold_4013, k_gold_4013);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4014; arr_full_4014 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4014/param_idx_0.txt" ) ;
            int n_full_4014; n_full_4014 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4014/param_idx_1.txt" ) ;
            int k_full_4014; k_full_4014 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4014/param_idx_2.txt" ) ;
            F_FULL (arr_full_4014, n_full_4014, k_full_4014);
            int[] arr_gold_4014; arr_gold_4014 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4014/param_idx_0.txt" ) ;
            int n_gold_4014; n_gold_4014 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4014/param_idx_1.txt" ) ;
            int k_gold_4014; k_gold_4014 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4014/param_idx_2.txt" ) ;
            f_gold (arr_gold_4014, n_gold_4014, k_gold_4014);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4012; arr_full_4012 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4012/param_idx_0.txt" ) ;
            int n_full_4012; n_full_4012 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4012/param_idx_1.txt" ) ;
            int k_full_4012; k_full_4012 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4012/param_idx_2.txt" ) ;
            F_FULL (arr_full_4012, n_full_4012, k_full_4012);
            int[] arr_gold_4012; arr_gold_4012 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4012/param_idx_0.txt" ) ;
            int n_gold_4012; n_gold_4012 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4012/param_idx_1.txt" ) ;
            int k_gold_4012; k_gold_4012 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_4012/param_idx_2.txt" ) ;
            f_gold (arr_gold_4012, n_gold_4012, k_gold_4012);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4012 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_7; arr_full_7 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_7/param_idx_0.txt" ) ;
            int n_full_7; n_full_7 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_7/param_idx_1.txt" ) ;
            int k_full_7; k_full_7 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_7/param_idx_2.txt" ) ;
            F_FULL (arr_full_7, n_full_7, k_full_7);
            int[] arr_gold_7; arr_gold_7 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_7/param_idx_0.txt" ) ;
            int n_gold_7; n_gold_7 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_7/param_idx_1.txt" ) ;
            int k_gold_7; k_gold_7 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_7/param_idx_2.txt" ) ;
            f_gold (arr_gold_7, n_gold_7, k_gold_7);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=7 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_8; arr_full_8 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_8/param_idx_0.txt" ) ;
            int n_full_8; n_full_8 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_8/param_idx_1.txt" ) ;
            int k_full_8; k_full_8 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_8/param_idx_2.txt" ) ;
            F_FULL (arr_full_8, n_full_8, k_full_8);
            int[] arr_gold_8; arr_gold_8 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_8/param_idx_0.txt" ) ;
            int n_gold_8; n_gold_8 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_8/param_idx_1.txt" ) ;
            int k_gold_8; k_gold_8 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_8/param_idx_2.txt" ) ;
            f_gold (arr_gold_8, n_gold_8, k_gold_8);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=8 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2013; arr_full_2013 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_2013/param_idx_0.txt" ) ;
            int n_full_2013; n_full_2013 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_2013/param_idx_1.txt" ) ;
            int k_full_2013; k_full_2013 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_2013/param_idx_2.txt" ) ;
            F_FULL (arr_full_2013, n_full_2013, k_full_2013);
            int[] arr_gold_2013; arr_gold_2013 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_2013/param_idx_0.txt" ) ;
            int n_gold_2013; n_gold_2013 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_2013/param_idx_1.txt" ) ;
            int k_gold_2013; k_gold_2013 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_2013/param_idx_2.txt" ) ;
            f_gold (arr_gold_2013, n_gold_2013, k_gold_2013);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_6; arr_full_6 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_6/param_idx_0.txt" ) ;
            int n_full_6; n_full_6 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_6/param_idx_1.txt" ) ;
            int k_full_6; k_full_6 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_6/param_idx_2.txt" ) ;
            F_FULL (arr_full_6, n_full_6, k_full_6);
            int[] arr_gold_6; arr_gold_6 = readIntArray ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_6/param_idx_0.txt" ) ;
            int n_gold_6; n_gold_6 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_6/param_idx_1.txt" ) ;
            int k_gold_6; k_gold_6 = readInt ( "../SPLIT_ARRAY_ADD_FIRST_PART_END/test_6/param_idx_2.txt" ) ;
            f_gold (arr_gold_6, n_gold_6, k_gold_6);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=6 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
