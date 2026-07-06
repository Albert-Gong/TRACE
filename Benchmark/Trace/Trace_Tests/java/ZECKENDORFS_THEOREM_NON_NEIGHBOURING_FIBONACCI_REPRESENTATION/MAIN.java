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
public static int f_gold ( int n ) {
  if ( n == 0 || n == 1 ) return n ;
  int f1 = 0 , f2 = 1 , f3 = 1 ;
  while ( f3 <= n ) {
    f1 = f2 ;
    f2 = f3 ;
    f3 = f1 + f2 ;
  }
  return f2 ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_2010; n_full_2010 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_2010/param_idx_0.txt" ) ;
            Object output_1_2010 = F_FULL(n_full_2010);
            int n_gold_2010; n_gold_2010 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_2010/param_idx_0.txt" ) ;
            Object output_2_2010 = f_gold(n_gold_2010);
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
            int n_full_15; n_full_15 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_15/param_idx_0.txt" ) ;
            Object output_1_15 = F_FULL(n_full_15);
            int n_gold_15; n_gold_15 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_15/param_idx_0.txt" ) ;
            Object output_2_15 = f_gold(n_gold_15);
            if (areEquivalent(output_1_15, output_2_15)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=15 output1=" +
                                   serializeObj(output_1_15) +
                                   " output2=" + serializeObj(output_2_15));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=15 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_20; n_full_20 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_20/param_idx_0.txt" ) ;
            Object output_1_20 = F_FULL(n_full_20);
            int n_gold_20; n_gold_20 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_20/param_idx_0.txt" ) ;
            Object output_2_20 = f_gold(n_gold_20);
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
            int n_full_1003; n_full_1003 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_1003/param_idx_0.txt" ) ;
            Object output_1_1003 = F_FULL(n_full_1003);
            int n_gold_1003; n_gold_1003 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_1003/param_idx_0.txt" ) ;
            Object output_2_1003 = f_gold(n_gold_1003);
            if (areEquivalent(output_1_1003, output_2_1003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1003 output1=" +
                                   serializeObj(output_1_1003) +
                                   " output2=" + serializeObj(output_2_1003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3018; n_full_3018 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_3018/param_idx_0.txt" ) ;
            Object output_1_3018 = F_FULL(n_full_3018);
            int n_gold_3018; n_gold_3018 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_3018/param_idx_0.txt" ) ;
            Object output_2_3018 = f_gold(n_gold_3018);
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
            int n_full_3002; n_full_3002 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_3002/param_idx_0.txt" ) ;
            Object output_1_3002 = F_FULL(n_full_3002);
            int n_gold_3002; n_gold_3002 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_3002/param_idx_0.txt" ) ;
            Object output_2_3002 = f_gold(n_gold_3002);
            if (areEquivalent(output_1_3002, output_2_3002)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3002 output1=" +
                                   serializeObj(output_1_3002) +
                                   " output2=" + serializeObj(output_2_3002));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1022; n_full_1022 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_1022/param_idx_0.txt" ) ;
            Object output_1_1022 = F_FULL(n_full_1022);
            int n_gold_1022; n_gold_1022 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_1022/param_idx_0.txt" ) ;
            Object output_2_1022 = f_gold(n_gold_1022);
            if (areEquivalent(output_1_1022, output_2_1022)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1022 output1=" +
                                   serializeObj(output_1_1022) +
                                   " output2=" + serializeObj(output_2_1022));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1022 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1026; n_full_1026 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_1026/param_idx_0.txt" ) ;
            Object output_1_1026 = F_FULL(n_full_1026);
            int n_gold_1026; n_gold_1026 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_1026/param_idx_0.txt" ) ;
            Object output_2_1026 = f_gold(n_gold_1026);
            if (areEquivalent(output_1_1026, output_2_1026)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1026 output1=" +
                                   serializeObj(output_1_1026) +
                                   " output2=" + serializeObj(output_2_1026));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1026 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2017; n_full_2017 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_2017/param_idx_0.txt" ) ;
            Object output_1_2017 = F_FULL(n_full_2017);
            int n_gold_2017; n_gold_2017 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_2017/param_idx_0.txt" ) ;
            Object output_2_2017 = f_gold(n_gold_2017);
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
            int n_full_24; n_full_24 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_24/param_idx_0.txt" ) ;
            Object output_1_24 = F_FULL(n_full_24);
            int n_gold_24; n_gold_24 = readInt ( "../ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION/test_24/param_idx_0.txt" ) ;
            Object output_2_24 = f_gold(n_gold_24);
            if (areEquivalent(output_1_24, output_2_24)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=24 output1=" +
                                   serializeObj(output_1_24) +
                                   " output2=" + serializeObj(output_2_24));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=24 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
