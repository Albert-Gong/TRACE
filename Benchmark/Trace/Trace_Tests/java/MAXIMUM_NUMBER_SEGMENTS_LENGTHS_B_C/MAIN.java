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
static int f_gold ( int n , int a , int b , int c ) {
  int dp [ ] = new int [ n + 10 ] ;
  Arrays . fill ( dp , - 1 ) ;
  dp [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( dp [ i ] != - 1 ) {
      if ( i + a <= n ) dp [ i + a ] = Math . max ( dp [ i ] + 1 , dp [ i + a ] ) ;
      if ( i + b <= n ) dp [ i + b ] = Math . max ( dp [ i ] + 1 , dp [ i + b ] ) ;
      if ( i + c <= n ) dp [ i + c ] = Math . max ( dp [ i ] + 1 , dp [ i + c ] ) ;
    }
  }
  return dp [ n ] ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_1016; n_full_1016 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1016/param_idx_0.txt" ) ;
            int a_full_1016; a_full_1016 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1016/param_idx_1.txt" ) ;
            int b_full_1016; b_full_1016 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1016/param_idx_2.txt" ) ;
            int c_full_1016; c_full_1016 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1016/param_idx_3.txt" ) ;
            Object output_1_1016 = F_FULL(n_full_1016, a_full_1016, b_full_1016, c_full_1016);
            int n_gold_1016; n_gold_1016 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1016/param_idx_0.txt" ) ;
            int a_gold_1016; a_gold_1016 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1016/param_idx_1.txt" ) ;
            int b_gold_1016; b_gold_1016 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1016/param_idx_2.txt" ) ;
            int c_gold_1016; c_gold_1016 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1016/param_idx_3.txt" ) ;
            Object output_2_1016 = f_gold(n_gold_1016, a_gold_1016, b_gold_1016, c_gold_1016);
            if (areEquivalent(output_1_1016, output_2_1016)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1016 output1=" +
                                   serializeObj(output_1_1016) +
                                   " output2=" + serializeObj(output_2_1016));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1016 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3006; n_full_3006 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3006/param_idx_0.txt" ) ;
            int a_full_3006; a_full_3006 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3006/param_idx_1.txt" ) ;
            int b_full_3006; b_full_3006 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3006/param_idx_2.txt" ) ;
            int c_full_3006; c_full_3006 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3006/param_idx_3.txt" ) ;
            Object output_1_3006 = F_FULL(n_full_3006, a_full_3006, b_full_3006, c_full_3006);
            int n_gold_3006; n_gold_3006 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3006/param_idx_0.txt" ) ;
            int a_gold_3006; a_gold_3006 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3006/param_idx_1.txt" ) ;
            int b_gold_3006; b_gold_3006 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3006/param_idx_2.txt" ) ;
            int c_gold_3006; c_gold_3006 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3006/param_idx_3.txt" ) ;
            Object output_2_3006 = f_gold(n_gold_3006, a_gold_3006, b_gold_3006, c_gold_3006);
            if (areEquivalent(output_1_3006, output_2_3006)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3006 output1=" +
                                   serializeObj(output_1_3006) +
                                   " output2=" + serializeObj(output_2_3006));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3006 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2000; n_full_2000 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2000/param_idx_0.txt" ) ;
            int a_full_2000; a_full_2000 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2000/param_idx_1.txt" ) ;
            int b_full_2000; b_full_2000 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2000/param_idx_2.txt" ) ;
            int c_full_2000; c_full_2000 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2000/param_idx_3.txt" ) ;
            Object output_1_2000 = F_FULL(n_full_2000, a_full_2000, b_full_2000, c_full_2000);
            int n_gold_2000; n_gold_2000 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2000/param_idx_0.txt" ) ;
            int a_gold_2000; a_gold_2000 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2000/param_idx_1.txt" ) ;
            int b_gold_2000; b_gold_2000 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2000/param_idx_2.txt" ) ;
            int c_gold_2000; c_gold_2000 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2000/param_idx_3.txt" ) ;
            Object output_2_2000 = f_gold(n_gold_2000, a_gold_2000, b_gold_2000, c_gold_2000);
            if (areEquivalent(output_1_2000, output_2_2000)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2000 output1=" +
                                   serializeObj(output_1_2000) +
                                   " output2=" + serializeObj(output_2_2000));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_20; n_full_20 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_20/param_idx_0.txt" ) ;
            int a_full_20; a_full_20 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_20/param_idx_1.txt" ) ;
            int b_full_20; b_full_20 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_20/param_idx_2.txt" ) ;
            int c_full_20; c_full_20 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_20/param_idx_3.txt" ) ;
            Object output_1_20 = F_FULL(n_full_20, a_full_20, b_full_20, c_full_20);
            int n_gold_20; n_gold_20 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_20/param_idx_0.txt" ) ;
            int a_gold_20; a_gold_20 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_20/param_idx_1.txt" ) ;
            int b_gold_20; b_gold_20 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_20/param_idx_2.txt" ) ;
            int c_gold_20; c_gold_20 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_20/param_idx_3.txt" ) ;
            Object output_2_20 = f_gold(n_gold_20, a_gold_20, b_gold_20, c_gold_20);
            if (areEquivalent(output_1_20, output_2_20)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=20 output1=" +
                                   serializeObj(output_1_20) +
                                   " output2=" + serializeObj(output_2_20));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=20 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3001; n_full_3001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3001/param_idx_0.txt" ) ;
            int a_full_3001; a_full_3001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3001/param_idx_1.txt" ) ;
            int b_full_3001; b_full_3001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3001/param_idx_2.txt" ) ;
            int c_full_3001; c_full_3001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3001/param_idx_3.txt" ) ;
            Object output_1_3001 = F_FULL(n_full_3001, a_full_3001, b_full_3001, c_full_3001);
            int n_gold_3001; n_gold_3001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3001/param_idx_0.txt" ) ;
            int a_gold_3001; a_gold_3001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3001/param_idx_1.txt" ) ;
            int b_gold_3001; b_gold_3001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3001/param_idx_2.txt" ) ;
            int c_gold_3001; c_gold_3001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_3001/param_idx_3.txt" ) ;
            Object output_2_3001 = f_gold(n_gold_3001, a_gold_3001, b_gold_3001, c_gold_3001);
            if (areEquivalent(output_1_3001, output_2_3001)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3001 output1=" +
                                   serializeObj(output_1_3001) +
                                   " output2=" + serializeObj(output_2_3001));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3001 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1005; n_full_1005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1005/param_idx_0.txt" ) ;
            int a_full_1005; a_full_1005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1005/param_idx_1.txt" ) ;
            int b_full_1005; b_full_1005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1005/param_idx_2.txt" ) ;
            int c_full_1005; c_full_1005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1005/param_idx_3.txt" ) ;
            Object output_1_1005 = F_FULL(n_full_1005, a_full_1005, b_full_1005, c_full_1005);
            int n_gold_1005; n_gold_1005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1005/param_idx_0.txt" ) ;
            int a_gold_1005; a_gold_1005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1005/param_idx_1.txt" ) ;
            int b_gold_1005; b_gold_1005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1005/param_idx_2.txt" ) ;
            int c_gold_1005; c_gold_1005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_1005/param_idx_3.txt" ) ;
            Object output_2_1005 = f_gold(n_gold_1005, a_gold_1005, b_gold_1005, c_gold_1005);
            if (areEquivalent(output_1_1005, output_2_1005)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1005 output1=" +
                                   serializeObj(output_1_1005) +
                                   " output2=" + serializeObj(output_2_1005));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1005 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4021; n_full_4021 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4021/param_idx_0.txt" ) ;
            int a_full_4021; a_full_4021 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4021/param_idx_1.txt" ) ;
            int b_full_4021; b_full_4021 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4021/param_idx_2.txt" ) ;
            int c_full_4021; c_full_4021 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4021/param_idx_3.txt" ) ;
            Object output_1_4021 = F_FULL(n_full_4021, a_full_4021, b_full_4021, c_full_4021);
            int n_gold_4021; n_gold_4021 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4021/param_idx_0.txt" ) ;
            int a_gold_4021; a_gold_4021 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4021/param_idx_1.txt" ) ;
            int b_gold_4021; b_gold_4021 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4021/param_idx_2.txt" ) ;
            int c_gold_4021; c_gold_4021 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4021/param_idx_3.txt" ) ;
            Object output_2_4021 = f_gold(n_gold_4021, a_gold_4021, b_gold_4021, c_gold_4021);
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
            int n_full_4005; n_full_4005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4005/param_idx_0.txt" ) ;
            int a_full_4005; a_full_4005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4005/param_idx_1.txt" ) ;
            int b_full_4005; b_full_4005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4005/param_idx_2.txt" ) ;
            int c_full_4005; c_full_4005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4005/param_idx_3.txt" ) ;
            Object output_1_4005 = F_FULL(n_full_4005, a_full_4005, b_full_4005, c_full_4005);
            int n_gold_4005; n_gold_4005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4005/param_idx_0.txt" ) ;
            int a_gold_4005; a_gold_4005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4005/param_idx_1.txt" ) ;
            int b_gold_4005; b_gold_4005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4005/param_idx_2.txt" ) ;
            int c_gold_4005; c_gold_4005 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4005/param_idx_3.txt" ) ;
            Object output_2_4005 = f_gold(n_gold_4005, a_gold_4005, b_gold_4005, c_gold_4005);
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
            int n_full_4018; n_full_4018 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4018/param_idx_0.txt" ) ;
            int a_full_4018; a_full_4018 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4018/param_idx_1.txt" ) ;
            int b_full_4018; b_full_4018 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4018/param_idx_2.txt" ) ;
            int c_full_4018; c_full_4018 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4018/param_idx_3.txt" ) ;
            Object output_1_4018 = F_FULL(n_full_4018, a_full_4018, b_full_4018, c_full_4018);
            int n_gold_4018; n_gold_4018 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4018/param_idx_0.txt" ) ;
            int a_gold_4018; a_gold_4018 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4018/param_idx_1.txt" ) ;
            int b_gold_4018; b_gold_4018 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4018/param_idx_2.txt" ) ;
            int c_gold_4018; c_gold_4018 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_4018/param_idx_3.txt" ) ;
            Object output_2_4018 = f_gold(n_gold_4018, a_gold_4018, b_gold_4018, c_gold_4018);
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
            int n_full_2001; n_full_2001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2001/param_idx_0.txt" ) ;
            int a_full_2001; a_full_2001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2001/param_idx_1.txt" ) ;
            int b_full_2001; b_full_2001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2001/param_idx_2.txt" ) ;
            int c_full_2001; c_full_2001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2001/param_idx_3.txt" ) ;
            Object output_1_2001 = F_FULL(n_full_2001, a_full_2001, b_full_2001, c_full_2001);
            int n_gold_2001; n_gold_2001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2001/param_idx_0.txt" ) ;
            int a_gold_2001; a_gold_2001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2001/param_idx_1.txt" ) ;
            int b_gold_2001; b_gold_2001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2001/param_idx_2.txt" ) ;
            int c_gold_2001; c_gold_2001 = readInt ( "../MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C/test_2001/param_idx_3.txt" ) ;
            Object output_2_2001 = f_gold(n_gold_2001, a_gold_2001, b_gold_2001, c_gold_2001);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
