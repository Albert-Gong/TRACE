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
public static int f_gold ( int a , int b , int k ) {
  int p = ( int ) Math . pow ( a , b ) ;
  int count = 0 ;
  while ( p > 0 && count < k ) {
    int rem = p % 10 ;
    count ++ ;
    if ( count == k ) return rem ;
    p = p / 10 ;
  }
  return 0 ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int a_full_4012; a_full_4012 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4012/param_idx_0.txt" ) ;
            int b_full_4012; b_full_4012 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4012/param_idx_1.txt" ) ;
            int k_full_4012; k_full_4012 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4012/param_idx_2.txt" ) ;
            Object output_1_4012 = F_FULL(a_full_4012, b_full_4012, k_full_4012);
            int a_gold_4012; a_gold_4012 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4012/param_idx_0.txt" ) ;
            int b_gold_4012; b_gold_4012 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4012/param_idx_1.txt" ) ;
            int k_gold_4012; k_gold_4012 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4012/param_idx_2.txt" ) ;
            Object output_2_4012 = f_gold(a_gold_4012, b_gold_4012, k_gold_4012);
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
            int a_full_4003; a_full_4003 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4003/param_idx_0.txt" ) ;
            int b_full_4003; b_full_4003 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4003/param_idx_1.txt" ) ;
            int k_full_4003; k_full_4003 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4003/param_idx_2.txt" ) ;
            Object output_1_4003 = F_FULL(a_full_4003, b_full_4003, k_full_4003);
            int a_gold_4003; a_gold_4003 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4003/param_idx_0.txt" ) ;
            int b_gold_4003; b_gold_4003 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4003/param_idx_1.txt" ) ;
            int k_gold_4003; k_gold_4003 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4003/param_idx_2.txt" ) ;
            Object output_2_4003 = f_gold(a_gold_4003, b_gold_4003, k_gold_4003);
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
            int a_full_4023; a_full_4023 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4023/param_idx_0.txt" ) ;
            int b_full_4023; b_full_4023 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4023/param_idx_1.txt" ) ;
            int k_full_4023; k_full_4023 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4023/param_idx_2.txt" ) ;
            Object output_1_4023 = F_FULL(a_full_4023, b_full_4023, k_full_4023);
            int a_gold_4023; a_gold_4023 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4023/param_idx_0.txt" ) ;
            int b_gold_4023; b_gold_4023 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4023/param_idx_1.txt" ) ;
            int k_gold_4023; k_gold_4023 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4023/param_idx_2.txt" ) ;
            Object output_2_4023 = f_gold(a_gold_4023, b_gold_4023, k_gold_4023);
            if (areEquivalent(output_1_4023, output_2_4023)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4023 output1=" +
                                   serializeObj(output_1_4023) +
                                   " output2=" + serializeObj(output_2_4023));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4023 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int a_full_3018; a_full_3018 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3018/param_idx_0.txt" ) ;
            int b_full_3018; b_full_3018 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3018/param_idx_1.txt" ) ;
            int k_full_3018; k_full_3018 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3018/param_idx_2.txt" ) ;
            Object output_1_3018 = F_FULL(a_full_3018, b_full_3018, k_full_3018);
            int a_gold_3018; a_gold_3018 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3018/param_idx_0.txt" ) ;
            int b_gold_3018; b_gold_3018 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3018/param_idx_1.txt" ) ;
            int k_gold_3018; k_gold_3018 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3018/param_idx_2.txt" ) ;
            Object output_2_3018 = f_gold(a_gold_3018, b_gold_3018, k_gold_3018);
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
            int a_full_3; a_full_3 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3/param_idx_0.txt" ) ;
            int b_full_3; b_full_3 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3/param_idx_1.txt" ) ;
            int k_full_3; k_full_3 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3/param_idx_2.txt" ) ;
            Object output_1_3 = F_FULL(a_full_3, b_full_3, k_full_3);
            int a_gold_3; a_gold_3 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3/param_idx_0.txt" ) ;
            int b_gold_3; b_gold_3 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3/param_idx_1.txt" ) ;
            int k_gold_3; k_gold_3 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3/param_idx_2.txt" ) ;
            Object output_2_3 = f_gold(a_gold_3, b_gold_3, k_gold_3);
            if (areEquivalent(output_1_3, output_2_3)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3 output1=" +
                                   serializeObj(output_1_3) +
                                   " output2=" + serializeObj(output_2_3));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int a_full_2011; a_full_2011 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2011/param_idx_0.txt" ) ;
            int b_full_2011; b_full_2011 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2011/param_idx_1.txt" ) ;
            int k_full_2011; k_full_2011 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2011/param_idx_2.txt" ) ;
            Object output_1_2011 = F_FULL(a_full_2011, b_full_2011, k_full_2011);
            int a_gold_2011; a_gold_2011 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2011/param_idx_0.txt" ) ;
            int b_gold_2011; b_gold_2011 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2011/param_idx_1.txt" ) ;
            int k_gold_2011; k_gold_2011 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2011/param_idx_2.txt" ) ;
            Object output_2_2011 = f_gold(a_gold_2011, b_gold_2011, k_gold_2011);
            if (areEquivalent(output_1_2011, output_2_2011)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2011 output1=" +
                                   serializeObj(output_1_2011) +
                                   " output2=" + serializeObj(output_2_2011));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2011 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int a_full_2024; a_full_2024 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2024/param_idx_0.txt" ) ;
            int b_full_2024; b_full_2024 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2024/param_idx_1.txt" ) ;
            int k_full_2024; k_full_2024 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2024/param_idx_2.txt" ) ;
            Object output_1_2024 = F_FULL(a_full_2024, b_full_2024, k_full_2024);
            int a_gold_2024; a_gold_2024 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2024/param_idx_0.txt" ) ;
            int b_gold_2024; b_gold_2024 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2024/param_idx_1.txt" ) ;
            int k_gold_2024; k_gold_2024 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_2024/param_idx_2.txt" ) ;
            Object output_2_2024 = f_gold(a_gold_2024, b_gold_2024, k_gold_2024);
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
            int a_full_4002; a_full_4002 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4002/param_idx_0.txt" ) ;
            int b_full_4002; b_full_4002 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4002/param_idx_1.txt" ) ;
            int k_full_4002; k_full_4002 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4002/param_idx_2.txt" ) ;
            Object output_1_4002 = F_FULL(a_full_4002, b_full_4002, k_full_4002);
            int a_gold_4002; a_gold_4002 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4002/param_idx_0.txt" ) ;
            int b_gold_4002; b_gold_4002 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4002/param_idx_1.txt" ) ;
            int k_gold_4002; k_gold_4002 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_4002/param_idx_2.txt" ) ;
            Object output_2_4002 = f_gold(a_gold_4002, b_gold_4002, k_gold_4002);
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
            int a_full_1007; a_full_1007 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_1007/param_idx_0.txt" ) ;
            int b_full_1007; b_full_1007 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_1007/param_idx_1.txt" ) ;
            int k_full_1007; k_full_1007 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_1007/param_idx_2.txt" ) ;
            Object output_1_1007 = F_FULL(a_full_1007, b_full_1007, k_full_1007);
            int a_gold_1007; a_gold_1007 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_1007/param_idx_0.txt" ) ;
            int b_gold_1007; b_gold_1007 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_1007/param_idx_1.txt" ) ;
            int k_gold_1007; k_gold_1007 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_1007/param_idx_2.txt" ) ;
            Object output_2_1007 = f_gold(a_gold_1007, b_gold_1007, k_gold_1007);
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
            int a_full_3014; a_full_3014 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3014/param_idx_0.txt" ) ;
            int b_full_3014; b_full_3014 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3014/param_idx_1.txt" ) ;
            int k_full_3014; k_full_3014 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3014/param_idx_2.txt" ) ;
            Object output_1_3014 = F_FULL(a_full_3014, b_full_3014, k_full_3014);
            int a_gold_3014; a_gold_3014 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3014/param_idx_0.txt" ) ;
            int b_gold_3014; b_gold_3014 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3014/param_idx_1.txt" ) ;
            int k_gold_3014; k_gold_3014 = readInt ( "../K_TH_DIGIT_RAISED_POWER_B/test_3014/param_idx_2.txt" ) ;
            Object output_2_3014 = f_gold(a_gold_3014, b_gold_3014, k_gold_3014);
            if (areEquivalent(output_1_3014, output_2_3014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3014 output1=" +
                                   serializeObj(output_1_3014) +
                                   " output2=" + serializeObj(output_2_3014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3014 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
