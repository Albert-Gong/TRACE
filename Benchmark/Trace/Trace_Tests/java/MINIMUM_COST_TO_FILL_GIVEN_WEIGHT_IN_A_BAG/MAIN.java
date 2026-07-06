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
public static int f_gold ( int cost [ ] , int n , int W ) {
  Vector < Integer > val = new Vector < Integer > ( ) ;
  Vector < Integer > wt = new Vector < Integer > ( ) ;
  int size = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( cost [ i ] != - 1 ) {
      val . add ( cost [ i ] ) ;
      wt . add ( i + 1 ) ;
      size ++ ;
    }
  }
  n = size ;
  int min_cost [ ] [ ] = new int [ n + 1 ] [ W + 1 ] ;
  for ( int i = 0 ;
  i <= W ;
  i ++ ) min_cost [ 0 ] [ i ] = Integer . MAX_VALUE ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) min_cost [ i ] [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= W ;
    j ++ ) {
      if ( wt . get ( i - 1 ) > j ) min_cost [ i ] [ j ] = min_cost [ i - 1 ] [ j ] ;
      else min_cost [ i ] [ j ] = Math . min ( min_cost [ i - 1 ] [ j ] , min_cost [ i ] [ j - wt . get ( i - 1 ) ] + val . get ( i - 1 ) ) ;
    }
  }
  return ( min_cost [ n ] [ W ] == Integer . MAX_VALUE ) ? - 1 : min_cost [ n ] [ W ] ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] cost_full_35; cost_full_35 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_35/param_idx_0.txt" ) ;
            int n_full_35; n_full_35 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_35/param_idx_1.txt" ) ;
            int W_full_35; W_full_35 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_35/param_idx_2.txt" ) ;
            Object output_1_35 = F_FULL(cost_full_35, n_full_35, W_full_35);
            int[] cost_gold_35; cost_gold_35 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_35/param_idx_0.txt" ) ;
            int n_gold_35; n_gold_35 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_35/param_idx_1.txt" ) ;
            int W_gold_35; W_gold_35 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_35/param_idx_2.txt" ) ;
            Object output_2_35 = f_gold(cost_gold_35, n_gold_35, W_gold_35);
            if (areEquivalent(output_1_35, output_2_35)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=35 output1=" +
                                   serializeObj(output_1_35) +
                                   " output2=" + serializeObj(output_2_35));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=35 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] cost_full_1004; cost_full_1004 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1004/param_idx_0.txt" ) ;
            int n_full_1004; n_full_1004 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1004/param_idx_1.txt" ) ;
            int W_full_1004; W_full_1004 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1004/param_idx_2.txt" ) ;
            Object output_1_1004 = F_FULL(cost_full_1004, n_full_1004, W_full_1004);
            int[] cost_gold_1004; cost_gold_1004 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1004/param_idx_0.txt" ) ;
            int n_gold_1004; n_gold_1004 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1004/param_idx_1.txt" ) ;
            int W_gold_1004; W_gold_1004 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1004/param_idx_2.txt" ) ;
            Object output_2_1004 = f_gold(cost_gold_1004, n_gold_1004, W_gold_1004);
            if (areEquivalent(output_1_1004, output_2_1004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1004 output1=" +
                                   serializeObj(output_1_1004) +
                                   " output2=" + serializeObj(output_2_1004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] cost_full_1008; cost_full_1008 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1008/param_idx_0.txt" ) ;
            int n_full_1008; n_full_1008 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1008/param_idx_1.txt" ) ;
            int W_full_1008; W_full_1008 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1008/param_idx_2.txt" ) ;
            Object output_1_1008 = F_FULL(cost_full_1008, n_full_1008, W_full_1008);
            int[] cost_gold_1008; cost_gold_1008 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1008/param_idx_0.txt" ) ;
            int n_gold_1008; n_gold_1008 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1008/param_idx_1.txt" ) ;
            int W_gold_1008; W_gold_1008 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_1008/param_idx_2.txt" ) ;
            Object output_2_1008 = f_gold(cost_gold_1008, n_gold_1008, W_gold_1008);
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
            int[] cost_full_4002; cost_full_4002 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4002/param_idx_0.txt" ) ;
            int n_full_4002; n_full_4002 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4002/param_idx_1.txt" ) ;
            int W_full_4002; W_full_4002 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4002/param_idx_2.txt" ) ;
            Object output_1_4002 = F_FULL(cost_full_4002, n_full_4002, W_full_4002);
            int[] cost_gold_4002; cost_gold_4002 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4002/param_idx_0.txt" ) ;
            int n_gold_4002; n_gold_4002 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4002/param_idx_1.txt" ) ;
            int W_gold_4002; W_gold_4002 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4002/param_idx_2.txt" ) ;
            Object output_2_4002 = f_gold(cost_gold_4002, n_gold_4002, W_gold_4002);
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
            int[] cost_full_34; cost_full_34 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_34/param_idx_0.txt" ) ;
            int n_full_34; n_full_34 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_34/param_idx_1.txt" ) ;
            int W_full_34; W_full_34 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_34/param_idx_2.txt" ) ;
            Object output_1_34 = F_FULL(cost_full_34, n_full_34, W_full_34);
            int[] cost_gold_34; cost_gold_34 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_34/param_idx_0.txt" ) ;
            int n_gold_34; n_gold_34 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_34/param_idx_1.txt" ) ;
            int W_gold_34; W_gold_34 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_34/param_idx_2.txt" ) ;
            Object output_2_34 = f_gold(cost_gold_34, n_gold_34, W_gold_34);
            if (areEquivalent(output_1_34, output_2_34)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=34 output1=" +
                                   serializeObj(output_1_34) +
                                   " output2=" + serializeObj(output_2_34));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=34 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] cost_full_4000; cost_full_4000 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4000/param_idx_0.txt" ) ;
            int n_full_4000; n_full_4000 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4000/param_idx_1.txt" ) ;
            int W_full_4000; W_full_4000 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4000/param_idx_2.txt" ) ;
            Object output_1_4000 = F_FULL(cost_full_4000, n_full_4000, W_full_4000);
            int[] cost_gold_4000; cost_gold_4000 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4000/param_idx_0.txt" ) ;
            int n_gold_4000; n_gold_4000 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4000/param_idx_1.txt" ) ;
            int W_gold_4000; W_gold_4000 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_4000/param_idx_2.txt" ) ;
            Object output_2_4000 = f_gold(cost_gold_4000, n_gold_4000, W_gold_4000);
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
            int[] cost_full_2008; cost_full_2008 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2008/param_idx_0.txt" ) ;
            int n_full_2008; n_full_2008 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2008/param_idx_1.txt" ) ;
            int W_full_2008; W_full_2008 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2008/param_idx_2.txt" ) ;
            Object output_1_2008 = F_FULL(cost_full_2008, n_full_2008, W_full_2008);
            int[] cost_gold_2008; cost_gold_2008 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2008/param_idx_0.txt" ) ;
            int n_gold_2008; n_gold_2008 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2008/param_idx_1.txt" ) ;
            int W_gold_2008; W_gold_2008 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2008/param_idx_2.txt" ) ;
            Object output_2_2008 = f_gold(cost_gold_2008, n_gold_2008, W_gold_2008);
            if (areEquivalent(output_1_2008, output_2_2008)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2008 output1=" +
                                   serializeObj(output_1_2008) +
                                   " output2=" + serializeObj(output_2_2008));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2008 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] cost_full_33; cost_full_33 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_33/param_idx_0.txt" ) ;
            int n_full_33; n_full_33 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_33/param_idx_1.txt" ) ;
            int W_full_33; W_full_33 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_33/param_idx_2.txt" ) ;
            Object output_1_33 = F_FULL(cost_full_33, n_full_33, W_full_33);
            int[] cost_gold_33; cost_gold_33 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_33/param_idx_0.txt" ) ;
            int n_gold_33; n_gold_33 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_33/param_idx_1.txt" ) ;
            int W_gold_33; W_gold_33 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_33/param_idx_2.txt" ) ;
            Object output_2_33 = f_gold(cost_gold_33, n_gold_33, W_gold_33);
            if (areEquivalent(output_1_33, output_2_33)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=33 output1=" +
                                   serializeObj(output_1_33) +
                                   " output2=" + serializeObj(output_2_33));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=33 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] cost_full_2006; cost_full_2006 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2006/param_idx_0.txt" ) ;
            int n_full_2006; n_full_2006 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2006/param_idx_1.txt" ) ;
            int W_full_2006; W_full_2006 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2006/param_idx_2.txt" ) ;
            Object output_1_2006 = F_FULL(cost_full_2006, n_full_2006, W_full_2006);
            int[] cost_gold_2006; cost_gold_2006 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2006/param_idx_0.txt" ) ;
            int n_gold_2006; n_gold_2006 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2006/param_idx_1.txt" ) ;
            int W_gold_2006; W_gold_2006 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2006/param_idx_2.txt" ) ;
            Object output_2_2006 = f_gold(cost_gold_2006, n_gold_2006, W_gold_2006);
            if (areEquivalent(output_1_2006, output_2_2006)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2006 output1=" +
                                   serializeObj(output_1_2006) +
                                   " output2=" + serializeObj(output_2_2006));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2006 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] cost_full_2007; cost_full_2007 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2007/param_idx_0.txt" ) ;
            int n_full_2007; n_full_2007 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2007/param_idx_1.txt" ) ;
            int W_full_2007; W_full_2007 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2007/param_idx_2.txt" ) ;
            Object output_1_2007 = F_FULL(cost_full_2007, n_full_2007, W_full_2007);
            int[] cost_gold_2007; cost_gold_2007 = readIntArray ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2007/param_idx_0.txt" ) ;
            int n_gold_2007; n_gold_2007 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2007/param_idx_1.txt" ) ;
            int W_gold_2007; W_gold_2007 = readInt ( "../MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG/test_2007/param_idx_2.txt" ) ;
            Object output_2_2007 = f_gold(cost_gold_2007, n_gold_2007, W_gold_2007);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
