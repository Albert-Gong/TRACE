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
  if ( n < 3 ) {
    return - 1 ;
  }
  Arrays . sort ( arr ) ;
  return Math . max ( arr [ 0 ] * arr [ 1 ] * arr [ n - 1 ] , arr [ n - 1 ] * arr [ n - 2 ] * arr [ n - 3 ] ) ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] arr_full_2022; arr_full_2022 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2022/param_idx_0.txt" ) ;
            int n_full_2022; n_full_2022 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2022/param_idx_1.txt" ) ;
            Object output_1_2022 = F_FULL(arr_full_2022, n_full_2022);
            int[] arr_gold_2022; arr_gold_2022 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2022/param_idx_0.txt" ) ;
            int n_gold_2022; n_gold_2022 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2022/param_idx_1.txt" ) ;
            Object output_2_2022 = f_gold(arr_gold_2022, n_gold_2022);
            if (areEquivalent(output_1_2022, output_2_2022)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2022 output1=" +
                                   serializeObj(output_1_2022) +
                                   " output2=" + serializeObj(output_2_2022));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2022 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_0; arr_full_0 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_0/param_idx_0.txt" ) ;
            int n_full_0; n_full_0 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_0/param_idx_1.txt" ) ;
            Object output_1_0 = F_FULL(arr_full_0, n_full_0);
            int[] arr_gold_0; arr_gold_0 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_0/param_idx_0.txt" ) ;
            int n_gold_0; n_gold_0 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_0/param_idx_1.txt" ) ;
            Object output_2_0 = f_gold(arr_gold_0, n_gold_0);
            if (areEquivalent(output_1_0, output_2_0)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=0 output1=" +
                                   serializeObj(output_1_0) +
                                   " output2=" + serializeObj(output_2_0));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=0 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2003; arr_full_2003 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2003/param_idx_0.txt" ) ;
            int n_full_2003; n_full_2003 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2003/param_idx_1.txt" ) ;
            Object output_1_2003 = F_FULL(arr_full_2003, n_full_2003);
            int[] arr_gold_2003; arr_gold_2003 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2003/param_idx_0.txt" ) ;
            int n_gold_2003; n_gold_2003 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2003/param_idx_1.txt" ) ;
            Object output_2_2003 = f_gold(arr_gold_2003, n_gold_2003);
            if (areEquivalent(output_1_2003, output_2_2003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2003 output1=" +
                                   serializeObj(output_1_2003) +
                                   " output2=" + serializeObj(output_2_2003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2; arr_full_2 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2/param_idx_0.txt" ) ;
            int n_full_2; n_full_2 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2/param_idx_1.txt" ) ;
            Object output_1_2 = F_FULL(arr_full_2, n_full_2);
            int[] arr_gold_2; arr_gold_2 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2/param_idx_0.txt" ) ;
            int n_gold_2; n_gold_2 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2/param_idx_1.txt" ) ;
            Object output_2_2 = f_gold(arr_gold_2, n_gold_2);
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

        try {
            total_test_case_num++;
            int[] arr_full_2014; arr_full_2014 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2014/param_idx_0.txt" ) ;
            int n_full_2014; n_full_2014 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2014/param_idx_1.txt" ) ;
            Object output_1_2014 = F_FULL(arr_full_2014, n_full_2014);
            int[] arr_gold_2014; arr_gold_2014 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2014/param_idx_0.txt" ) ;
            int n_gold_2014; n_gold_2014 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2014/param_idx_1.txt" ) ;
            Object output_2_2014 = f_gold(arr_gold_2014, n_gold_2014);
            if (areEquivalent(output_1_2014, output_2_2014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2014 output1=" +
                                   serializeObj(output_1_2014) +
                                   " output2=" + serializeObj(output_2_2014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_21; arr_full_21 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_21/param_idx_0.txt" ) ;
            int n_full_21; n_full_21 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_21/param_idx_1.txt" ) ;
            Object output_1_21 = F_FULL(arr_full_21, n_full_21);
            int[] arr_gold_21; arr_gold_21 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_21/param_idx_0.txt" ) ;
            int n_gold_21; n_gold_21 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_21/param_idx_1.txt" ) ;
            Object output_2_21 = f_gold(arr_gold_21, n_gold_21);
            if (areEquivalent(output_1_21, output_2_21)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=21 output1=" +
                                   serializeObj(output_1_21) +
                                   " output2=" + serializeObj(output_2_21));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=21 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2004; arr_full_2004 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2004/param_idx_0.txt" ) ;
            int n_full_2004; n_full_2004 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2004/param_idx_1.txt" ) ;
            Object output_1_2004 = F_FULL(arr_full_2004, n_full_2004);
            int[] arr_gold_2004; arr_gold_2004 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2004/param_idx_0.txt" ) ;
            int n_gold_2004; n_gold_2004 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2004/param_idx_1.txt" ) ;
            Object output_2_2004 = f_gold(arr_gold_2004, n_gold_2004);
            if (areEquivalent(output_1_2004, output_2_2004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2004 output1=" +
                                   serializeObj(output_1_2004) +
                                   " output2=" + serializeObj(output_2_2004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2024; arr_full_2024 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2024/param_idx_0.txt" ) ;
            int n_full_2024; n_full_2024 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2024/param_idx_1.txt" ) ;
            Object output_1_2024 = F_FULL(arr_full_2024, n_full_2024);
            int[] arr_gold_2024; arr_gold_2024 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2024/param_idx_0.txt" ) ;
            int n_gold_2024; n_gold_2024 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2024/param_idx_1.txt" ) ;
            Object output_2_2024 = f_gold(arr_gold_2024, n_gold_2024);
            if (areEquivalent(output_1_2024, output_2_2024)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2024 output1=" +
                                   serializeObj(output_1_2024) +
                                   " output2=" + serializeObj(output_2_2024));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2024 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2001; arr_full_2001 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2001/param_idx_0.txt" ) ;
            int n_full_2001; n_full_2001 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2001/param_idx_1.txt" ) ;
            Object output_1_2001 = F_FULL(arr_full_2001, n_full_2001);
            int[] arr_gold_2001; arr_gold_2001 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2001/param_idx_0.txt" ) ;
            int n_gold_2001; n_gold_2001 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_2001/param_idx_1.txt" ) ;
            Object output_2_2001 = f_gold(arr_gold_2001, n_gold_2001);
            if (areEquivalent(output_1_2001, output_2_2001)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2001 output1=" +
                                   serializeObj(output_1_2001) +
                                   " output2=" + serializeObj(output_2_2001));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2001 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_11; arr_full_11 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_11/param_idx_0.txt" ) ;
            int n_full_11; n_full_11 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_11/param_idx_1.txt" ) ;
            Object output_1_11 = F_FULL(arr_full_11, n_full_11);
            int[] arr_gold_11; arr_gold_11 = readIntArray ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_11/param_idx_0.txt" ) ;
            int n_gold_11; n_gold_11 = readInt ( "../FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY_1/test_11/param_idx_1.txt" ) ;
            Object output_2_11 = f_gold(arr_gold_11, n_gold_11);
            if (areEquivalent(output_1_11, output_2_11)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=11 output1=" +
                                   serializeObj(output_1_11) +
                                   " output2=" + serializeObj(output_2_11));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=11 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
