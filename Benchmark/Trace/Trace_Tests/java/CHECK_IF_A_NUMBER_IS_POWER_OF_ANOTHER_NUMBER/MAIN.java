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
public static boolean f_gold ( int x , int y ) {
  if ( x == 1 ) return ( y == 1 ) ;
  int pow = 1 ;
  while ( pow < y ) pow = pow * x ;
  return ( pow == y ) ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int x_full_4002; x_full_4002 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4002/param_idx_0.txt" ) ;
            int y_full_4002; y_full_4002 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4002/param_idx_1.txt" ) ;
            Object output_1_4002 = F_FULL(x_full_4002, y_full_4002);
            int x_gold_4002; x_gold_4002 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4002/param_idx_0.txt" ) ;
            int y_gold_4002; y_gold_4002 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4002/param_idx_1.txt" ) ;
            Object output_2_4002 = f_gold(x_gold_4002, y_gold_4002);
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
            int x_full_4015; x_full_4015 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4015/param_idx_0.txt" ) ;
            int y_full_4015; y_full_4015 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4015/param_idx_1.txt" ) ;
            Object output_1_4015 = F_FULL(x_full_4015, y_full_4015);
            int x_gold_4015; x_gold_4015 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4015/param_idx_0.txt" ) ;
            int y_gold_4015; y_gold_4015 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4015/param_idx_1.txt" ) ;
            Object output_2_4015 = f_gold(x_gold_4015, y_gold_4015);
            if (areEquivalent(output_1_4015, output_2_4015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4015 output1=" +
                                   serializeObj(output_1_4015) +
                                   " output2=" + serializeObj(output_2_4015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4015 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_4016; x_full_4016 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4016/param_idx_0.txt" ) ;
            int y_full_4016; y_full_4016 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4016/param_idx_1.txt" ) ;
            Object output_1_4016 = F_FULL(x_full_4016, y_full_4016);
            int x_gold_4016; x_gold_4016 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4016/param_idx_0.txt" ) ;
            int y_gold_4016; y_gold_4016 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4016/param_idx_1.txt" ) ;
            Object output_2_4016 = f_gold(x_gold_4016, y_gold_4016);
            if (areEquivalent(output_1_4016, output_2_4016)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4016 output1=" +
                                   serializeObj(output_1_4016) +
                                   " output2=" + serializeObj(output_2_4016));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4016 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_4011; x_full_4011 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4011/param_idx_0.txt" ) ;
            int y_full_4011; y_full_4011 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4011/param_idx_1.txt" ) ;
            Object output_1_4011 = F_FULL(x_full_4011, y_full_4011);
            int x_gold_4011; x_gold_4011 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4011/param_idx_0.txt" ) ;
            int y_gold_4011; y_gold_4011 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_4011/param_idx_1.txt" ) ;
            Object output_2_4011 = f_gold(x_gold_4011, y_gold_4011);
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
            int x_full_3013; x_full_3013 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3013/param_idx_0.txt" ) ;
            int y_full_3013; y_full_3013 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3013/param_idx_1.txt" ) ;
            Object output_1_3013 = F_FULL(x_full_3013, y_full_3013);
            int x_gold_3013; x_gold_3013 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3013/param_idx_0.txt" ) ;
            int y_gold_3013; y_gold_3013 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3013/param_idx_1.txt" ) ;
            Object output_2_3013 = f_gold(x_gold_3013, y_gold_3013);
            if (areEquivalent(output_1_3013, output_2_3013)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3013 output1=" +
                                   serializeObj(output_1_3013) +
                                   " output2=" + serializeObj(output_2_3013));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_3017; x_full_3017 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3017/param_idx_0.txt" ) ;
            int y_full_3017; y_full_3017 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3017/param_idx_1.txt" ) ;
            Object output_1_3017 = F_FULL(x_full_3017, y_full_3017);
            int x_gold_3017; x_gold_3017 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3017/param_idx_0.txt" ) ;
            int y_gold_3017; y_gold_3017 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3017/param_idx_1.txt" ) ;
            Object output_2_3017 = f_gold(x_gold_3017, y_gold_3017);
            if (areEquivalent(output_1_3017, output_2_3017)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3017 output1=" +
                                   serializeObj(output_1_3017) +
                                   " output2=" + serializeObj(output_2_3017));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3017 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_3014; x_full_3014 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3014/param_idx_0.txt" ) ;
            int y_full_3014; y_full_3014 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3014/param_idx_1.txt" ) ;
            Object output_1_3014 = F_FULL(x_full_3014, y_full_3014);
            int x_gold_3014; x_gold_3014 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3014/param_idx_0.txt" ) ;
            int y_gold_3014; y_gold_3014 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3014/param_idx_1.txt" ) ;
            Object output_2_3014 = f_gold(x_gold_3014, y_gold_3014);
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

        try {
            total_test_case_num++;
            int x_full_3004; x_full_3004 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3004/param_idx_0.txt" ) ;
            int y_full_3004; y_full_3004 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3004/param_idx_1.txt" ) ;
            Object output_1_3004 = F_FULL(x_full_3004, y_full_3004);
            int x_gold_3004; x_gold_3004 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3004/param_idx_0.txt" ) ;
            int y_gold_3004; y_gold_3004 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3004/param_idx_1.txt" ) ;
            Object output_2_3004 = f_gold(x_gold_3004, y_gold_3004);
            if (areEquivalent(output_1_3004, output_2_3004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3004 output1=" +
                                   serializeObj(output_1_3004) +
                                   " output2=" + serializeObj(output_2_3004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_3006; x_full_3006 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3006/param_idx_0.txt" ) ;
            int y_full_3006; y_full_3006 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3006/param_idx_1.txt" ) ;
            Object output_1_3006 = F_FULL(x_full_3006, y_full_3006);
            int x_gold_3006; x_gold_3006 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3006/param_idx_0.txt" ) ;
            int y_gold_3006; y_gold_3006 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_3006/param_idx_1.txt" ) ;
            Object output_2_3006 = f_gold(x_gold_3006, y_gold_3006);
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
            int x_full_15; x_full_15 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_15/param_idx_0.txt" ) ;
            int y_full_15; y_full_15 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_15/param_idx_1.txt" ) ;
            Object output_1_15 = F_FULL(x_full_15, y_full_15);
            int x_gold_15; x_gold_15 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_15/param_idx_0.txt" ) ;
            int y_gold_15; y_gold_15 = readInt ( "../CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER/test_15/param_idx_1.txt" ) ;
            Object output_2_15 = f_gold(x_gold_15, y_gold_15);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
