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
static int f_gold ( int n , int m , int k ) {
  if ( m <= n - k + 1 ) return m + k - 1 ;
  m = m - ( n - k + 1 ) ;
  return ( m % n == 0 ) ? n : ( m % n ) ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_3002; n_full_3002 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3002/param_idx_0.txt" ) ;
            int m_full_3002; m_full_3002 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3002/param_idx_1.txt" ) ;
            int k_full_3002; k_full_3002 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3002/param_idx_2.txt" ) ;
            Object output_1_3002 = F_FULL(n_full_3002, m_full_3002, k_full_3002);
            int n_gold_3002; n_gold_3002 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3002/param_idx_0.txt" ) ;
            int m_gold_3002; m_gold_3002 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3002/param_idx_1.txt" ) ;
            int k_gold_3002; k_gold_3002 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3002/param_idx_2.txt" ) ;
            Object output_2_3002 = f_gold(n_gold_3002, m_gold_3002, k_gold_3002);
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
            int n_full_1024; n_full_1024 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1024/param_idx_0.txt" ) ;
            int m_full_1024; m_full_1024 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1024/param_idx_1.txt" ) ;
            int k_full_1024; k_full_1024 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1024/param_idx_2.txt" ) ;
            Object output_1_1024 = F_FULL(n_full_1024, m_full_1024, k_full_1024);
            int n_gold_1024; n_gold_1024 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1024/param_idx_0.txt" ) ;
            int m_gold_1024; m_gold_1024 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1024/param_idx_1.txt" ) ;
            int k_gold_1024; k_gold_1024 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1024/param_idx_2.txt" ) ;
            Object output_2_1024 = f_gold(n_gold_1024, m_gold_1024, k_gold_1024);
            if (areEquivalent(output_1_1024, output_2_1024)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1024 output1=" +
                                   serializeObj(output_1_1024) +
                                   " output2=" + serializeObj(output_2_1024));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1024 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2020; n_full_2020 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2020/param_idx_0.txt" ) ;
            int m_full_2020; m_full_2020 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2020/param_idx_1.txt" ) ;
            int k_full_2020; k_full_2020 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2020/param_idx_2.txt" ) ;
            Object output_1_2020 = F_FULL(n_full_2020, m_full_2020, k_full_2020);
            int n_gold_2020; n_gold_2020 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2020/param_idx_0.txt" ) ;
            int m_gold_2020; m_gold_2020 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2020/param_idx_1.txt" ) ;
            int k_gold_2020; k_gold_2020 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2020/param_idx_2.txt" ) ;
            Object output_2_2020 = f_gold(n_gold_2020, m_gold_2020, k_gold_2020);
            if (areEquivalent(output_1_2020, output_2_2020)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2020 output1=" +
                                   serializeObj(output_1_2020) +
                                   " output2=" + serializeObj(output_2_2020));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2020 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1007; n_full_1007 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1007/param_idx_0.txt" ) ;
            int m_full_1007; m_full_1007 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1007/param_idx_1.txt" ) ;
            int k_full_1007; k_full_1007 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1007/param_idx_2.txt" ) ;
            Object output_1_1007 = F_FULL(n_full_1007, m_full_1007, k_full_1007);
            int n_gold_1007; n_gold_1007 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1007/param_idx_0.txt" ) ;
            int m_gold_1007; m_gold_1007 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1007/param_idx_1.txt" ) ;
            int k_gold_1007; k_gold_1007 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1007/param_idx_2.txt" ) ;
            Object output_2_1007 = f_gold(n_gold_1007, m_gold_1007, k_gold_1007);
            if (areEquivalent(output_1_1007, output_2_1007)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1007 output1=" +
                                   serializeObj(output_1_1007) +
                                   " output2=" + serializeObj(output_2_1007));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1007 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1008; n_full_1008 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1008/param_idx_0.txt" ) ;
            int m_full_1008; m_full_1008 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1008/param_idx_1.txt" ) ;
            int k_full_1008; k_full_1008 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1008/param_idx_2.txt" ) ;
            Object output_1_1008 = F_FULL(n_full_1008, m_full_1008, k_full_1008);
            int n_gold_1008; n_gold_1008 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1008/param_idx_0.txt" ) ;
            int m_gold_1008; m_gold_1008 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1008/param_idx_1.txt" ) ;
            int k_gold_1008; k_gold_1008 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_1008/param_idx_2.txt" ) ;
            Object output_2_1008 = f_gold(n_gold_1008, m_gold_1008, k_gold_1008);
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
            int n_full_23; n_full_23 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_23/param_idx_0.txt" ) ;
            int m_full_23; m_full_23 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_23/param_idx_1.txt" ) ;
            int k_full_23; k_full_23 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_23/param_idx_2.txt" ) ;
            Object output_1_23 = F_FULL(n_full_23, m_full_23, k_full_23);
            int n_gold_23; n_gold_23 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_23/param_idx_0.txt" ) ;
            int m_gold_23; m_gold_23 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_23/param_idx_1.txt" ) ;
            int k_gold_23; k_gold_23 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_23/param_idx_2.txt" ) ;
            Object output_2_23 = f_gold(n_gold_23, m_gold_23, k_gold_23);
            if (areEquivalent(output_1_23, output_2_23)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=23 output1=" +
                                   serializeObj(output_1_23) +
                                   " output2=" + serializeObj(output_2_23));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=23 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3023; n_full_3023 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3023/param_idx_0.txt" ) ;
            int m_full_3023; m_full_3023 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3023/param_idx_1.txt" ) ;
            int k_full_3023; k_full_3023 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3023/param_idx_2.txt" ) ;
            Object output_1_3023 = F_FULL(n_full_3023, m_full_3023, k_full_3023);
            int n_gold_3023; n_gold_3023 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3023/param_idx_0.txt" ) ;
            int m_gold_3023; m_gold_3023 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3023/param_idx_1.txt" ) ;
            int k_gold_3023; k_gold_3023 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_3023/param_idx_2.txt" ) ;
            Object output_2_3023 = f_gold(n_gold_3023, m_gold_3023, k_gold_3023);
            if (areEquivalent(output_1_3023, output_2_3023)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3023 output1=" +
                                   serializeObj(output_1_3023) +
                                   " output2=" + serializeObj(output_2_3023));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3023 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4; n_full_4 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_4/param_idx_0.txt" ) ;
            int m_full_4; m_full_4 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_4/param_idx_1.txt" ) ;
            int k_full_4; k_full_4 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_4/param_idx_2.txt" ) ;
            Object output_1_4 = F_FULL(n_full_4, m_full_4, k_full_4);
            int n_gold_4; n_gold_4 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_4/param_idx_0.txt" ) ;
            int m_gold_4; m_gold_4 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_4/param_idx_1.txt" ) ;
            int k_gold_4; k_gold_4 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_4/param_idx_2.txt" ) ;
            Object output_2_4 = f_gold(n_gold_4, m_gold_4, k_gold_4);
            if (areEquivalent(output_1_4, output_2_4)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4 output1=" +
                                   serializeObj(output_1_4) +
                                   " output2=" + serializeObj(output_2_4));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_15; n_full_15 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_15/param_idx_0.txt" ) ;
            int m_full_15; m_full_15 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_15/param_idx_1.txt" ) ;
            int k_full_15; k_full_15 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_15/param_idx_2.txt" ) ;
            Object output_1_15 = F_FULL(n_full_15, m_full_15, k_full_15);
            int n_gold_15; n_gold_15 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_15/param_idx_0.txt" ) ;
            int m_gold_15; m_gold_15 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_15/param_idx_1.txt" ) ;
            int k_gold_15; k_gold_15 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_15/param_idx_2.txt" ) ;
            Object output_2_15 = f_gold(n_gold_15, m_gold_15, k_gold_15);
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
            int n_full_2006; n_full_2006 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2006/param_idx_0.txt" ) ;
            int m_full_2006; m_full_2006 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2006/param_idx_1.txt" ) ;
            int k_full_2006; k_full_2006 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2006/param_idx_2.txt" ) ;
            Object output_1_2006 = F_FULL(n_full_2006, m_full_2006, k_full_2006);
            int n_gold_2006; n_gold_2006 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2006/param_idx_0.txt" ) ;
            int m_gold_2006; m_gold_2006 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2006/param_idx_1.txt" ) ;
            int k_gold_2006; k_gold_2006 = readInt ( "../DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION/test_2006/param_idx_2.txt" ) ;
            Object output_2_2006 = f_gold(n_gold_2006, m_gold_2006, k_gold_2006);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
