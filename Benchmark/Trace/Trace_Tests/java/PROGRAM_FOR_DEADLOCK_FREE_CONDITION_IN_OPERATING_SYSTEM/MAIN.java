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
static int f_gold ( int process , int need ) {
  int minResources = 0 ;
  minResources = process * ( need - 1 ) + 1 ;
  return minResources ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int process_full_4007; process_full_4007 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4007/param_idx_0.txt" ) ;
            int need_full_4007; need_full_4007 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4007/param_idx_1.txt" ) ;
            Object output_1_4007 = F_FULL(process_full_4007, need_full_4007);
            int process_gold_4007; process_gold_4007 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4007/param_idx_0.txt" ) ;
            int need_gold_4007; need_gold_4007 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4007/param_idx_1.txt" ) ;
            Object output_2_4007 = f_gold(process_gold_4007, need_gold_4007);
            if (areEquivalent(output_1_4007, output_2_4007)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4007 output1=" +
                                   serializeObj(output_1_4007) +
                                   " output2=" + serializeObj(output_2_4007));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4007 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int process_full_2020; process_full_2020 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2020/param_idx_0.txt" ) ;
            int need_full_2020; need_full_2020 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2020/param_idx_1.txt" ) ;
            Object output_1_2020 = F_FULL(process_full_2020, need_full_2020);
            int process_gold_2020; process_gold_2020 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2020/param_idx_0.txt" ) ;
            int need_gold_2020; need_gold_2020 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2020/param_idx_1.txt" ) ;
            Object output_2_2020 = f_gold(process_gold_2020, need_gold_2020);
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
            int process_full_4006; process_full_4006 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4006/param_idx_0.txt" ) ;
            int need_full_4006; need_full_4006 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4006/param_idx_1.txt" ) ;
            Object output_1_4006 = F_FULL(process_full_4006, need_full_4006);
            int process_gold_4006; process_gold_4006 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4006/param_idx_0.txt" ) ;
            int need_gold_4006; need_gold_4006 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4006/param_idx_1.txt" ) ;
            Object output_2_4006 = f_gold(process_gold_4006, need_gold_4006);
            if (areEquivalent(output_1_4006, output_2_4006)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4006 output1=" +
                                   serializeObj(output_1_4006) +
                                   " output2=" + serializeObj(output_2_4006));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4006 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int process_full_1003; process_full_1003 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_1003/param_idx_0.txt" ) ;
            int need_full_1003; need_full_1003 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_1003/param_idx_1.txt" ) ;
            Object output_1_1003 = F_FULL(process_full_1003, need_full_1003);
            int process_gold_1003; process_gold_1003 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_1003/param_idx_0.txt" ) ;
            int need_gold_1003; need_gold_1003 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_1003/param_idx_1.txt" ) ;
            Object output_2_1003 = f_gold(process_gold_1003, need_gold_1003);
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
            int process_full_1004; process_full_1004 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_1004/param_idx_0.txt" ) ;
            int need_full_1004; need_full_1004 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_1004/param_idx_1.txt" ) ;
            Object output_1_1004 = F_FULL(process_full_1004, need_full_1004);
            int process_gold_1004; process_gold_1004 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_1004/param_idx_0.txt" ) ;
            int need_gold_1004; need_gold_1004 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_1004/param_idx_1.txt" ) ;
            Object output_2_1004 = f_gold(process_gold_1004, need_gold_1004);
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
            int process_full_2015; process_full_2015 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2015/param_idx_0.txt" ) ;
            int need_full_2015; need_full_2015 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2015/param_idx_1.txt" ) ;
            Object output_1_2015 = F_FULL(process_full_2015, need_full_2015);
            int process_gold_2015; process_gold_2015 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2015/param_idx_0.txt" ) ;
            int need_gold_2015; need_gold_2015 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2015/param_idx_1.txt" ) ;
            Object output_2_2015 = f_gold(process_gold_2015, need_gold_2015);
            if (areEquivalent(output_1_2015, output_2_2015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2015 output1=" +
                                   serializeObj(output_1_2015) +
                                   " output2=" + serializeObj(output_2_2015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2015 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int process_full_3; process_full_3 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_3/param_idx_0.txt" ) ;
            int need_full_3; need_full_3 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_3/param_idx_1.txt" ) ;
            Object output_1_3 = F_FULL(process_full_3, need_full_3);
            int process_gold_3; process_gold_3 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_3/param_idx_0.txt" ) ;
            int need_gold_3; need_gold_3 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_3/param_idx_1.txt" ) ;
            Object output_2_3 = f_gold(process_gold_3, need_gold_3);
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
            int process_full_2003; process_full_2003 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2003/param_idx_0.txt" ) ;
            int need_full_2003; need_full_2003 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2003/param_idx_1.txt" ) ;
            Object output_1_2003 = F_FULL(process_full_2003, need_full_2003);
            int process_gold_2003; process_gold_2003 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2003/param_idx_0.txt" ) ;
            int need_gold_2003; need_gold_2003 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_2003/param_idx_1.txt" ) ;
            Object output_2_2003 = f_gold(process_gold_2003, need_gold_2003);
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
            int process_full_4026; process_full_4026 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4026/param_idx_0.txt" ) ;
            int need_full_4026; need_full_4026 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4026/param_idx_1.txt" ) ;
            Object output_1_4026 = F_FULL(process_full_4026, need_full_4026);
            int process_gold_4026; process_gold_4026 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4026/param_idx_0.txt" ) ;
            int need_gold_4026; need_gold_4026 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4026/param_idx_1.txt" ) ;
            Object output_2_4026 = f_gold(process_gold_4026, need_gold_4026);
            if (areEquivalent(output_1_4026, output_2_4026)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4026 output1=" +
                                   serializeObj(output_1_4026) +
                                   " output2=" + serializeObj(output_2_4026));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4026 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int process_full_4011; process_full_4011 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4011/param_idx_0.txt" ) ;
            int need_full_4011; need_full_4011 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4011/param_idx_1.txt" ) ;
            Object output_1_4011 = F_FULL(process_full_4011, need_full_4011);
            int process_gold_4011; process_gold_4011 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4011/param_idx_0.txt" ) ;
            int need_gold_4011; need_gold_4011 = readInt ( "../PROGRAM_FOR_DEADLOCK_FREE_CONDITION_IN_OPERATING_SYSTEM/test_4011/param_idx_1.txt" ) ;
            Object output_2_4011 = f_gold(process_gold_4011, need_gold_4011);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
