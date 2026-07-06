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
static int f_gold ( int n , int r , int p ) {
  int C [ ] = new int [ r + 1 ] ;
  Arrays . fill ( C , 0 ) ;
  C [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = Math . min ( i , r ) ;
    j > 0 ;
    j -- ) C [ j ] = ( C [ j ] + C [ j - 1 ] ) % p ;
  }
  return C [ r ] ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_3024; n_full_3024 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3024/param_idx_0.txt" ) ;
            int r_full_3024; r_full_3024 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3024/param_idx_1.txt" ) ;
            int p_full_3024; p_full_3024 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3024/param_idx_2.txt" ) ;
            Object output_1_3024 = F_FULL(n_full_3024, r_full_3024, p_full_3024);
            int n_gold_3024; n_gold_3024 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3024/param_idx_0.txt" ) ;
            int r_gold_3024; r_gold_3024 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3024/param_idx_1.txt" ) ;
            int p_gold_3024; p_gold_3024 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3024/param_idx_2.txt" ) ;
            Object output_2_3024 = f_gold(n_gold_3024, r_gold_3024, p_gold_3024);
            if (areEquivalent(output_1_3024, output_2_3024)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3024 output1=" +
                                   serializeObj(output_1_3024) +
                                   " output2=" + serializeObj(output_2_3024));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3024 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2018; n_full_2018 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_2018/param_idx_0.txt" ) ;
            int r_full_2018; r_full_2018 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_2018/param_idx_1.txt" ) ;
            int p_full_2018; p_full_2018 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_2018/param_idx_2.txt" ) ;
            Object output_1_2018 = F_FULL(n_full_2018, r_full_2018, p_full_2018);
            int n_gold_2018; n_gold_2018 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_2018/param_idx_0.txt" ) ;
            int r_gold_2018; r_gold_2018 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_2018/param_idx_1.txt" ) ;
            int p_gold_2018; p_gold_2018 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_2018/param_idx_2.txt" ) ;
            Object output_2_2018 = f_gold(n_gold_2018, r_gold_2018, p_gold_2018);
            if (areEquivalent(output_1_2018, output_2_2018)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2018 output1=" +
                                   serializeObj(output_1_2018) +
                                   " output2=" + serializeObj(output_2_2018));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2018 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3025; n_full_3025 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3025/param_idx_0.txt" ) ;
            int r_full_3025; r_full_3025 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3025/param_idx_1.txt" ) ;
            int p_full_3025; p_full_3025 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3025/param_idx_2.txt" ) ;
            Object output_1_3025 = F_FULL(n_full_3025, r_full_3025, p_full_3025);
            int n_gold_3025; n_gold_3025 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3025/param_idx_0.txt" ) ;
            int r_gold_3025; r_gold_3025 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3025/param_idx_1.txt" ) ;
            int p_gold_3025; p_gold_3025 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_3025/param_idx_2.txt" ) ;
            Object output_2_3025 = f_gold(n_gold_3025, r_gold_3025, p_gold_3025);
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
            int n_full_1009; n_full_1009 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1009/param_idx_0.txt" ) ;
            int r_full_1009; r_full_1009 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1009/param_idx_1.txt" ) ;
            int p_full_1009; p_full_1009 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1009/param_idx_2.txt" ) ;
            Object output_1_1009 = F_FULL(n_full_1009, r_full_1009, p_full_1009);
            int n_gold_1009; n_gold_1009 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1009/param_idx_0.txt" ) ;
            int r_gold_1009; r_gold_1009 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1009/param_idx_1.txt" ) ;
            int p_gold_1009; p_gold_1009 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1009/param_idx_2.txt" ) ;
            Object output_2_1009 = f_gold(n_gold_1009, r_gold_1009, p_gold_1009);
            if (areEquivalent(output_1_1009, output_2_1009)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1009 output1=" +
                                   serializeObj(output_1_1009) +
                                   " output2=" + serializeObj(output_2_1009));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1009 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4011; n_full_4011 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4011/param_idx_0.txt" ) ;
            int r_full_4011; r_full_4011 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4011/param_idx_1.txt" ) ;
            int p_full_4011; p_full_4011 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4011/param_idx_2.txt" ) ;
            Object output_1_4011 = F_FULL(n_full_4011, r_full_4011, p_full_4011);
            int n_gold_4011; n_gold_4011 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4011/param_idx_0.txt" ) ;
            int r_gold_4011; r_gold_4011 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4011/param_idx_1.txt" ) ;
            int p_gold_4011; p_gold_4011 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4011/param_idx_2.txt" ) ;
            Object output_2_4011 = f_gold(n_gold_4011, r_gold_4011, p_gold_4011);
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
            int n_full_4010; n_full_4010 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4010/param_idx_0.txt" ) ;
            int r_full_4010; r_full_4010 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4010/param_idx_1.txt" ) ;
            int p_full_4010; p_full_4010 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4010/param_idx_2.txt" ) ;
            Object output_1_4010 = F_FULL(n_full_4010, r_full_4010, p_full_4010);
            int n_gold_4010; n_gold_4010 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4010/param_idx_0.txt" ) ;
            int r_gold_4010; r_gold_4010 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4010/param_idx_1.txt" ) ;
            int p_gold_4010; p_gold_4010 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4010/param_idx_2.txt" ) ;
            Object output_2_4010 = f_gold(n_gold_4010, r_gold_4010, p_gold_4010);
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
            int n_full_4019; n_full_4019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4019/param_idx_0.txt" ) ;
            int r_full_4019; r_full_4019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4019/param_idx_1.txt" ) ;
            int p_full_4019; p_full_4019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4019/param_idx_2.txt" ) ;
            Object output_1_4019 = F_FULL(n_full_4019, r_full_4019, p_full_4019);
            int n_gold_4019; n_gold_4019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4019/param_idx_0.txt" ) ;
            int r_gold_4019; r_gold_4019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4019/param_idx_1.txt" ) ;
            int p_gold_4019; p_gold_4019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_4019/param_idx_2.txt" ) ;
            Object output_2_4019 = f_gold(n_gold_4019, r_gold_4019, p_gold_4019);
            if (areEquivalent(output_1_4019, output_2_4019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4019 output1=" +
                                   serializeObj(output_1_4019) +
                                   " output2=" + serializeObj(output_2_4019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_0; n_full_0 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_0/param_idx_0.txt" ) ;
            int r_full_0; r_full_0 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_0/param_idx_1.txt" ) ;
            int p_full_0; p_full_0 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_0/param_idx_2.txt" ) ;
            Object output_1_0 = F_FULL(n_full_0, r_full_0, p_full_0);
            int n_gold_0; n_gold_0 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_0/param_idx_0.txt" ) ;
            int r_gold_0; r_gold_0 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_0/param_idx_1.txt" ) ;
            int p_gold_0; p_gold_0 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_0/param_idx_2.txt" ) ;
            Object output_2_0 = f_gold(n_gold_0, r_gold_0, p_gold_0);
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
            int n_full_1019; n_full_1019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1019/param_idx_0.txt" ) ;
            int r_full_1019; r_full_1019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1019/param_idx_1.txt" ) ;
            int p_full_1019; p_full_1019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1019/param_idx_2.txt" ) ;
            Object output_1_1019 = F_FULL(n_full_1019, r_full_1019, p_full_1019);
            int n_gold_1019; n_gold_1019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1019/param_idx_0.txt" ) ;
            int r_gold_1019; r_gold_1019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1019/param_idx_1.txt" ) ;
            int p_gold_1019; p_gold_1019 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1019/param_idx_2.txt" ) ;
            Object output_2_1019 = f_gold(n_gold_1019, r_gold_1019, p_gold_1019);
            if (areEquivalent(output_1_1019, output_2_1019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1019 output1=" +
                                   serializeObj(output_1_1019) +
                                   " output2=" + serializeObj(output_2_1019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1015; n_full_1015 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1015/param_idx_0.txt" ) ;
            int r_full_1015; r_full_1015 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1015/param_idx_1.txt" ) ;
            int p_full_1015; p_full_1015 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1015/param_idx_2.txt" ) ;
            Object output_1_1015 = F_FULL(n_full_1015, r_full_1015, p_full_1015);
            int n_gold_1015; n_gold_1015 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1015/param_idx_0.txt" ) ;
            int r_gold_1015; r_gold_1015 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1015/param_idx_1.txt" ) ;
            int p_gold_1015; p_gold_1015 = readInt ( "../COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION/test_1015/param_idx_2.txt" ) ;
            Object output_2_1015 = f_gold(n_gold_1015, r_gold_1015, p_gold_1015);
            if (areEquivalent(output_1_1015, output_2_1015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1015 output1=" +
                                   serializeObj(output_1_1015) +
                                   " output2=" + serializeObj(output_2_1015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1015 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
