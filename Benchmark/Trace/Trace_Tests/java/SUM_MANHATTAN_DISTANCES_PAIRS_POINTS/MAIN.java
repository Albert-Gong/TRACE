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
static int f_gold ( int x [ ] , int y [ ] , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) sum += ( Math . abs ( x [ i ] - x [ j ] ) + Math . abs ( y [ i ] - y [ j ] ) ) ;
  return sum ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] x_full_2001; x_full_2001 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2001/param_idx_0.txt" ) ;
            int[] y_full_2001; y_full_2001 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2001/param_idx_1.txt" ) ;
            int n_full_2001; n_full_2001 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2001/param_idx_2.txt" ) ;
            Object output_1_2001 = F_FULL(x_full_2001, y_full_2001, n_full_2001);
            int[] x_gold_2001; x_gold_2001 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2001/param_idx_0.txt" ) ;
            int[] y_gold_2001; y_gold_2001 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2001/param_idx_1.txt" ) ;
            int n_gold_2001; n_gold_2001 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2001/param_idx_2.txt" ) ;
            Object output_2_2001 = f_gold(x_gold_2001, y_gold_2001, n_gold_2001);
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
            int[] x_full_2002; x_full_2002 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2002/param_idx_0.txt" ) ;
            int[] y_full_2002; y_full_2002 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2002/param_idx_1.txt" ) ;
            int n_full_2002; n_full_2002 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2002/param_idx_2.txt" ) ;
            Object output_1_2002 = F_FULL(x_full_2002, y_full_2002, n_full_2002);
            int[] x_gold_2002; x_gold_2002 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2002/param_idx_0.txt" ) ;
            int[] y_gold_2002; y_gold_2002 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2002/param_idx_1.txt" ) ;
            int n_gold_2002; n_gold_2002 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2002/param_idx_2.txt" ) ;
            Object output_2_2002 = f_gold(x_gold_2002, y_gold_2002, n_gold_2002);
            if (areEquivalent(output_1_2002, output_2_2002)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2002 output1=" +
                                   serializeObj(output_1_2002) +
                                   " output2=" + serializeObj(output_2_2002));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] x_full_2000; x_full_2000 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2000/param_idx_0.txt" ) ;
            int[] y_full_2000; y_full_2000 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2000/param_idx_1.txt" ) ;
            int n_full_2000; n_full_2000 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2000/param_idx_2.txt" ) ;
            Object output_1_2000 = F_FULL(x_full_2000, y_full_2000, n_full_2000);
            int[] x_gold_2000; x_gold_2000 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2000/param_idx_0.txt" ) ;
            int[] y_gold_2000; y_gold_2000 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2000/param_idx_1.txt" ) ;
            int n_gold_2000; n_gold_2000 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2000/param_idx_2.txt" ) ;
            Object output_2_2000 = f_gold(x_gold_2000, y_gold_2000, n_gold_2000);
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
            int[] x_full_2010; x_full_2010 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2010/param_idx_0.txt" ) ;
            int[] y_full_2010; y_full_2010 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2010/param_idx_1.txt" ) ;
            int n_full_2010; n_full_2010 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2010/param_idx_2.txt" ) ;
            Object output_1_2010 = F_FULL(x_full_2010, y_full_2010, n_full_2010);
            int[] x_gold_2010; x_gold_2010 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2010/param_idx_0.txt" ) ;
            int[] y_gold_2010; y_gold_2010 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2010/param_idx_1.txt" ) ;
            int n_gold_2010; n_gold_2010 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2010/param_idx_2.txt" ) ;
            Object output_2_2010 = f_gold(x_gold_2010, y_gold_2010, n_gold_2010);
            if (areEquivalent(output_1_2010, output_2_2010)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2010 output1=" +
                                   serializeObj(output_1_2010) +
                                   " output2=" + serializeObj(output_2_2010));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2010 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] x_full_2009; x_full_2009 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2009/param_idx_0.txt" ) ;
            int[] y_full_2009; y_full_2009 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2009/param_idx_1.txt" ) ;
            int n_full_2009; n_full_2009 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2009/param_idx_2.txt" ) ;
            Object output_1_2009 = F_FULL(x_full_2009, y_full_2009, n_full_2009);
            int[] x_gold_2009; x_gold_2009 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2009/param_idx_0.txt" ) ;
            int[] y_gold_2009; y_gold_2009 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2009/param_idx_1.txt" ) ;
            int n_gold_2009; n_gold_2009 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2009/param_idx_2.txt" ) ;
            Object output_2_2009 = f_gold(x_gold_2009, y_gold_2009, n_gold_2009);
            if (areEquivalent(output_1_2009, output_2_2009)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2009 output1=" +
                                   serializeObj(output_1_2009) +
                                   " output2=" + serializeObj(output_2_2009));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2009 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] x_full_31; x_full_31 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_31/param_idx_0.txt" ) ;
            int[] y_full_31; y_full_31 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_31/param_idx_1.txt" ) ;
            int n_full_31; n_full_31 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_31/param_idx_2.txt" ) ;
            Object output_1_31 = F_FULL(x_full_31, y_full_31, n_full_31);
            int[] x_gold_31; x_gold_31 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_31/param_idx_0.txt" ) ;
            int[] y_gold_31; y_gold_31 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_31/param_idx_1.txt" ) ;
            int n_gold_31; n_gold_31 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_31/param_idx_2.txt" ) ;
            Object output_2_31 = f_gold(x_gold_31, y_gold_31, n_gold_31);
            if (areEquivalent(output_1_31, output_2_31)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=31 output1=" +
                                   serializeObj(output_1_31) +
                                   " output2=" + serializeObj(output_2_31));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=31 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] x_full_32; x_full_32 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_32/param_idx_0.txt" ) ;
            int[] y_full_32; y_full_32 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_32/param_idx_1.txt" ) ;
            int n_full_32; n_full_32 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_32/param_idx_2.txt" ) ;
            Object output_1_32 = F_FULL(x_full_32, y_full_32, n_full_32);
            int[] x_gold_32; x_gold_32 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_32/param_idx_0.txt" ) ;
            int[] y_gold_32; y_gold_32 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_32/param_idx_1.txt" ) ;
            int n_gold_32; n_gold_32 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_32/param_idx_2.txt" ) ;
            Object output_2_32 = f_gold(x_gold_32, y_gold_32, n_gold_32);
            if (areEquivalent(output_1_32, output_2_32)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=32 output1=" +
                                   serializeObj(output_1_32) +
                                   " output2=" + serializeObj(output_2_32));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=32 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] x_full_16; x_full_16 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_16/param_idx_0.txt" ) ;
            int[] y_full_16; y_full_16 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_16/param_idx_1.txt" ) ;
            int n_full_16; n_full_16 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_16/param_idx_2.txt" ) ;
            Object output_1_16 = F_FULL(x_full_16, y_full_16, n_full_16);
            int[] x_gold_16; x_gold_16 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_16/param_idx_0.txt" ) ;
            int[] y_gold_16; y_gold_16 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_16/param_idx_1.txt" ) ;
            int n_gold_16; n_gold_16 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_16/param_idx_2.txt" ) ;
            Object output_2_16 = f_gold(x_gold_16, y_gold_16, n_gold_16);
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
            int[] x_full_0; x_full_0 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_0/param_idx_0.txt" ) ;
            int[] y_full_0; y_full_0 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_0/param_idx_1.txt" ) ;
            int n_full_0; n_full_0 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_0/param_idx_2.txt" ) ;
            Object output_1_0 = F_FULL(x_full_0, y_full_0, n_full_0);
            int[] x_gold_0; x_gold_0 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_0/param_idx_0.txt" ) ;
            int[] y_gold_0; y_gold_0 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_0/param_idx_1.txt" ) ;
            int n_gold_0; n_gold_0 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_0/param_idx_2.txt" ) ;
            Object output_2_0 = f_gold(x_gold_0, y_gold_0, n_gold_0);
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
            int[] x_full_2; x_full_2 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2/param_idx_0.txt" ) ;
            int[] y_full_2; y_full_2 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2/param_idx_1.txt" ) ;
            int n_full_2; n_full_2 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2/param_idx_2.txt" ) ;
            Object output_1_2 = F_FULL(x_full_2, y_full_2, n_full_2);
            int[] x_gold_2; x_gold_2 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2/param_idx_0.txt" ) ;
            int[] y_gold_2; y_gold_2 = readIntArray ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2/param_idx_1.txt" ) ;
            int n_gold_2; n_gold_2 = readInt ( "../SUM_MANHATTAN_DISTANCES_PAIRS_POINTS/test_2/param_idx_2.txt" ) ;
            Object output_2_2 = f_gold(x_gold_2, y_gold_2, n_gold_2);
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
