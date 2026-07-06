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
static int f_gold ( int x , int y , int z ) {
  int c = 0 ;
  while ( x != 0 && y != 0 && z != 0 ) {
    x -- ;
    y -- ;
    z -- ;
    c ++ ;
  }
  return c ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int x_full_4007; x_full_4007 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4007/param_idx_0.txt" ) ;
            int y_full_4007; y_full_4007 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4007/param_idx_1.txt" ) ;
            int z_full_4007; z_full_4007 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4007/param_idx_2.txt" ) ;
            Object output_1_4007 = F_FULL(x_full_4007, y_full_4007, z_full_4007);
            int x_gold_4007; x_gold_4007 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4007/param_idx_0.txt" ) ;
            int y_gold_4007; y_gold_4007 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4007/param_idx_1.txt" ) ;
            int z_gold_4007; z_gold_4007 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4007/param_idx_2.txt" ) ;
            Object output_2_4007 = f_gold(x_gold_4007, y_gold_4007, z_gold_4007);
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
            int x_full_4006; x_full_4006 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4006/param_idx_0.txt" ) ;
            int y_full_4006; y_full_4006 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4006/param_idx_1.txt" ) ;
            int z_full_4006; z_full_4006 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4006/param_idx_2.txt" ) ;
            Object output_1_4006 = F_FULL(x_full_4006, y_full_4006, z_full_4006);
            int x_gold_4006; x_gold_4006 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4006/param_idx_0.txt" ) ;
            int y_gold_4006; y_gold_4006 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4006/param_idx_1.txt" ) ;
            int z_gold_4006; z_gold_4006 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4006/param_idx_2.txt" ) ;
            Object output_2_4006 = f_gold(x_gold_4006, y_gold_4006, z_gold_4006);
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
            int x_full_4023; x_full_4023 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4023/param_idx_0.txt" ) ;
            int y_full_4023; y_full_4023 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4023/param_idx_1.txt" ) ;
            int z_full_4023; z_full_4023 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4023/param_idx_2.txt" ) ;
            Object output_1_4023 = F_FULL(x_full_4023, y_full_4023, z_full_4023);
            int x_gold_4023; x_gold_4023 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4023/param_idx_0.txt" ) ;
            int y_gold_4023; y_gold_4023 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4023/param_idx_1.txt" ) ;
            int z_gold_4023; z_gold_4023 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4023/param_idx_2.txt" ) ;
            Object output_2_4023 = f_gold(x_gold_4023, y_gold_4023, z_gold_4023);
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
            int x_full_24; x_full_24 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_24/param_idx_0.txt" ) ;
            int y_full_24; y_full_24 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_24/param_idx_1.txt" ) ;
            int z_full_24; z_full_24 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_24/param_idx_2.txt" ) ;
            Object output_1_24 = F_FULL(x_full_24, y_full_24, z_full_24);
            int x_gold_24; x_gold_24 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_24/param_idx_0.txt" ) ;
            int y_gold_24; y_gold_24 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_24/param_idx_1.txt" ) ;
            int z_gold_24; z_gold_24 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_24/param_idx_2.txt" ) ;
            Object output_2_24 = f_gold(x_gold_24, y_gold_24, z_gold_24);
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

        try {
            total_test_case_num++;
            int x_full_4008; x_full_4008 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4008/param_idx_0.txt" ) ;
            int y_full_4008; y_full_4008 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4008/param_idx_1.txt" ) ;
            int z_full_4008; z_full_4008 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4008/param_idx_2.txt" ) ;
            Object output_1_4008 = F_FULL(x_full_4008, y_full_4008, z_full_4008);
            int x_gold_4008; x_gold_4008 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4008/param_idx_0.txt" ) ;
            int y_gold_4008; y_gold_4008 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4008/param_idx_1.txt" ) ;
            int z_gold_4008; z_gold_4008 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4008/param_idx_2.txt" ) ;
            Object output_2_4008 = f_gold(x_gold_4008, y_gold_4008, z_gold_4008);
            if (areEquivalent(output_1_4008, output_2_4008)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4008 output1=" +
                                   serializeObj(output_1_4008) +
                                   " output2=" + serializeObj(output_2_4008));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4008 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_2022; x_full_2022 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2022/param_idx_0.txt" ) ;
            int y_full_2022; y_full_2022 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2022/param_idx_1.txt" ) ;
            int z_full_2022; z_full_2022 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2022/param_idx_2.txt" ) ;
            Object output_1_2022 = F_FULL(x_full_2022, y_full_2022, z_full_2022);
            int x_gold_2022; x_gold_2022 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2022/param_idx_0.txt" ) ;
            int y_gold_2022; y_gold_2022 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2022/param_idx_1.txt" ) ;
            int z_gold_2022; z_gold_2022 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2022/param_idx_2.txt" ) ;
            Object output_2_2022 = f_gold(x_gold_2022, y_gold_2022, z_gold_2022);
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
            int x_full_4021; x_full_4021 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4021/param_idx_0.txt" ) ;
            int y_full_4021; y_full_4021 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4021/param_idx_1.txt" ) ;
            int z_full_4021; z_full_4021 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4021/param_idx_2.txt" ) ;
            Object output_1_4021 = F_FULL(x_full_4021, y_full_4021, z_full_4021);
            int x_gold_4021; x_gold_4021 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4021/param_idx_0.txt" ) ;
            int y_gold_4021; y_gold_4021 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4021/param_idx_1.txt" ) ;
            int z_gold_4021; z_gold_4021 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4021/param_idx_2.txt" ) ;
            Object output_2_4021 = f_gold(x_gold_4021, y_gold_4021, z_gold_4021);
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
            int x_full_2024; x_full_2024 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2024/param_idx_0.txt" ) ;
            int y_full_2024; y_full_2024 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2024/param_idx_1.txt" ) ;
            int z_full_2024; z_full_2024 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2024/param_idx_2.txt" ) ;
            Object output_1_2024 = F_FULL(x_full_2024, y_full_2024, z_full_2024);
            int x_gold_2024; x_gold_2024 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2024/param_idx_0.txt" ) ;
            int y_gold_2024; y_gold_2024 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2024/param_idx_1.txt" ) ;
            int z_gold_2024; z_gold_2024 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2024/param_idx_2.txt" ) ;
            Object output_2_2024 = f_gold(x_gold_2024, y_gold_2024, z_gold_2024);
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
            int x_full_2; x_full_2 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2/param_idx_0.txt" ) ;
            int y_full_2; y_full_2 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2/param_idx_1.txt" ) ;
            int z_full_2; z_full_2 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2/param_idx_2.txt" ) ;
            Object output_1_2 = F_FULL(x_full_2, y_full_2, z_full_2);
            int x_gold_2; x_gold_2 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2/param_idx_0.txt" ) ;
            int y_gold_2; y_gold_2 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2/param_idx_1.txt" ) ;
            int z_gold_2; z_gold_2 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_2/param_idx_2.txt" ) ;
            Object output_2_2 = f_gold(x_gold_2, y_gold_2, z_gold_2);
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
            int x_full_4000; x_full_4000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4000/param_idx_0.txt" ) ;
            int y_full_4000; y_full_4000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4000/param_idx_1.txt" ) ;
            int z_full_4000; z_full_4000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4000/param_idx_2.txt" ) ;
            Object output_1_4000 = F_FULL(x_full_4000, y_full_4000, z_full_4000);
            int x_gold_4000; x_gold_4000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4000/param_idx_0.txt" ) ;
            int y_gold_4000; y_gold_4000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4000/param_idx_1.txt" ) ;
            int z_gold_4000; z_gold_4000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS/test_4000/param_idx_2.txt" ) ;
            Object output_2_4000 = f_gold(x_gold_4000, y_gold_4000, z_gold_4000);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
