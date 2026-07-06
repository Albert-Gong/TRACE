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
static float f_gold ( float x1 , float y1 , float x2 , float y2 ) {
  return ( y2 - y1 ) / ( x2 - x1 ) ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            float x1_full_2016; x1_full_2016 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2016/param_idx_0.txt" ) ;
            float y1_full_2016; y1_full_2016 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2016/param_idx_1.txt" ) ;
            float x2_full_2016; x2_full_2016 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2016/param_idx_2.txt" ) ;
            float y2_full_2016; y2_full_2016 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2016/param_idx_3.txt" ) ;
            Object output_1_2016 = F_FULL(x1_full_2016, y1_full_2016, x2_full_2016, y2_full_2016);
            float x1_gold_2016; x1_gold_2016 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2016/param_idx_0.txt" ) ;
            float y1_gold_2016; y1_gold_2016 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2016/param_idx_1.txt" ) ;
            float x2_gold_2016; x2_gold_2016 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2016/param_idx_2.txt" ) ;
            float y2_gold_2016; y2_gold_2016 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2016/param_idx_3.txt" ) ;
            Object output_2_2016 = f_gold(x1_gold_2016, y1_gold_2016, x2_gold_2016, y2_gold_2016);
            if (areEquivalent(output_1_2016, output_2_2016)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2016 output1=" +
                                   serializeObj(output_1_2016) +
                                   " output2=" + serializeObj(output_2_2016));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2016 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float x1_full_4005; x1_full_4005 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4005/param_idx_0.txt" ) ;
            float y1_full_4005; y1_full_4005 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4005/param_idx_1.txt" ) ;
            float x2_full_4005; x2_full_4005 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4005/param_idx_2.txt" ) ;
            float y2_full_4005; y2_full_4005 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4005/param_idx_3.txt" ) ;
            Object output_1_4005 = F_FULL(x1_full_4005, y1_full_4005, x2_full_4005, y2_full_4005);
            float x1_gold_4005; x1_gold_4005 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4005/param_idx_0.txt" ) ;
            float y1_gold_4005; y1_gold_4005 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4005/param_idx_1.txt" ) ;
            float x2_gold_4005; x2_gold_4005 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4005/param_idx_2.txt" ) ;
            float y2_gold_4005; y2_gold_4005 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4005/param_idx_3.txt" ) ;
            Object output_2_4005 = f_gold(x1_gold_4005, y1_gold_4005, x2_gold_4005, y2_gold_4005);
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
            float x1_full_1012; x1_full_1012 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1012/param_idx_0.txt" ) ;
            float y1_full_1012; y1_full_1012 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1012/param_idx_1.txt" ) ;
            float x2_full_1012; x2_full_1012 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1012/param_idx_2.txt" ) ;
            float y2_full_1012; y2_full_1012 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1012/param_idx_3.txt" ) ;
            Object output_1_1012 = F_FULL(x1_full_1012, y1_full_1012, x2_full_1012, y2_full_1012);
            float x1_gold_1012; x1_gold_1012 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1012/param_idx_0.txt" ) ;
            float y1_gold_1012; y1_gold_1012 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1012/param_idx_1.txt" ) ;
            float x2_gold_1012; x2_gold_1012 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1012/param_idx_2.txt" ) ;
            float y2_gold_1012; y2_gold_1012 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1012/param_idx_3.txt" ) ;
            Object output_2_1012 = f_gold(x1_gold_1012, y1_gold_1012, x2_gold_1012, y2_gold_1012);
            if (areEquivalent(output_1_1012, output_2_1012)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1012 output1=" +
                                   serializeObj(output_1_1012) +
                                   " output2=" + serializeObj(output_2_1012));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1012 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float x1_full_2017; x1_full_2017 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2017/param_idx_0.txt" ) ;
            float y1_full_2017; y1_full_2017 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2017/param_idx_1.txt" ) ;
            float x2_full_2017; x2_full_2017 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2017/param_idx_2.txt" ) ;
            float y2_full_2017; y2_full_2017 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2017/param_idx_3.txt" ) ;
            Object output_1_2017 = F_FULL(x1_full_2017, y1_full_2017, x2_full_2017, y2_full_2017);
            float x1_gold_2017; x1_gold_2017 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2017/param_idx_0.txt" ) ;
            float y1_gold_2017; y1_gold_2017 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2017/param_idx_1.txt" ) ;
            float x2_gold_2017; x2_gold_2017 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2017/param_idx_2.txt" ) ;
            float y2_gold_2017; y2_gold_2017 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2017/param_idx_3.txt" ) ;
            Object output_2_2017 = f_gold(x1_gold_2017, y1_gold_2017, x2_gold_2017, y2_gold_2017);
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
            float x1_full_1013; x1_full_1013 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1013/param_idx_0.txt" ) ;
            float y1_full_1013; y1_full_1013 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1013/param_idx_1.txt" ) ;
            float x2_full_1013; x2_full_1013 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1013/param_idx_2.txt" ) ;
            float y2_full_1013; y2_full_1013 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1013/param_idx_3.txt" ) ;
            Object output_1_1013 = F_FULL(x1_full_1013, y1_full_1013, x2_full_1013, y2_full_1013);
            float x1_gold_1013; x1_gold_1013 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1013/param_idx_0.txt" ) ;
            float y1_gold_1013; y1_gold_1013 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1013/param_idx_1.txt" ) ;
            float x2_gold_1013; x2_gold_1013 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1013/param_idx_2.txt" ) ;
            float y2_gold_1013; y2_gold_1013 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1013/param_idx_3.txt" ) ;
            Object output_2_1013 = f_gold(x1_gold_1013, y1_gold_1013, x2_gold_1013, y2_gold_1013);
            if (areEquivalent(output_1_1013, output_2_1013)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1013 output1=" +
                                   serializeObj(output_1_1013) +
                                   " output2=" + serializeObj(output_2_1013));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float x1_full_4026; x1_full_4026 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4026/param_idx_0.txt" ) ;
            float y1_full_4026; y1_full_4026 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4026/param_idx_1.txt" ) ;
            float x2_full_4026; x2_full_4026 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4026/param_idx_2.txt" ) ;
            float y2_full_4026; y2_full_4026 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4026/param_idx_3.txt" ) ;
            Object output_1_4026 = F_FULL(x1_full_4026, y1_full_4026, x2_full_4026, y2_full_4026);
            float x1_gold_4026; x1_gold_4026 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4026/param_idx_0.txt" ) ;
            float y1_gold_4026; y1_gold_4026 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4026/param_idx_1.txt" ) ;
            float x2_gold_4026; x2_gold_4026 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4026/param_idx_2.txt" ) ;
            float y2_gold_4026; y2_gold_4026 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4026/param_idx_3.txt" ) ;
            Object output_2_4026 = f_gold(x1_gold_4026, y1_gold_4026, x2_gold_4026, y2_gold_4026);
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
            float x1_full_42; x1_full_42 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_42/param_idx_0.txt" ) ;
            float y1_full_42; y1_full_42 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_42/param_idx_1.txt" ) ;
            float x2_full_42; x2_full_42 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_42/param_idx_2.txt" ) ;
            float y2_full_42; y2_full_42 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_42/param_idx_3.txt" ) ;
            Object output_1_42 = F_FULL(x1_full_42, y1_full_42, x2_full_42, y2_full_42);
            float x1_gold_42; x1_gold_42 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_42/param_idx_0.txt" ) ;
            float y1_gold_42; y1_gold_42 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_42/param_idx_1.txt" ) ;
            float x2_gold_42; x2_gold_42 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_42/param_idx_2.txt" ) ;
            float y2_gold_42; y2_gold_42 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_42/param_idx_3.txt" ) ;
            Object output_2_42 = f_gold(x1_gold_42, y1_gold_42, x2_gold_42, y2_gold_42);
            if (areEquivalent(output_1_42, output_2_42)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=42 output1=" +
                                   serializeObj(output_1_42) +
                                   " output2=" + serializeObj(output_2_42));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=42 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float x1_full_2023; x1_full_2023 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2023/param_idx_0.txt" ) ;
            float y1_full_2023; y1_full_2023 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2023/param_idx_1.txt" ) ;
            float x2_full_2023; x2_full_2023 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2023/param_idx_2.txt" ) ;
            float y2_full_2023; y2_full_2023 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2023/param_idx_3.txt" ) ;
            Object output_1_2023 = F_FULL(x1_full_2023, y1_full_2023, x2_full_2023, y2_full_2023);
            float x1_gold_2023; x1_gold_2023 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2023/param_idx_0.txt" ) ;
            float y1_gold_2023; y1_gold_2023 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2023/param_idx_1.txt" ) ;
            float x2_gold_2023; x2_gold_2023 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2023/param_idx_2.txt" ) ;
            float y2_gold_2023; y2_gold_2023 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_2023/param_idx_3.txt" ) ;
            Object output_2_2023 = f_gold(x1_gold_2023, y1_gold_2023, x2_gold_2023, y2_gold_2023);
            if (areEquivalent(output_1_2023, output_2_2023)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2023 output1=" +
                                   serializeObj(output_1_2023) +
                                   " output2=" + serializeObj(output_2_2023));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2023 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float x1_full_4014; x1_full_4014 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4014/param_idx_0.txt" ) ;
            float y1_full_4014; y1_full_4014 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4014/param_idx_1.txt" ) ;
            float x2_full_4014; x2_full_4014 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4014/param_idx_2.txt" ) ;
            float y2_full_4014; y2_full_4014 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4014/param_idx_3.txt" ) ;
            Object output_1_4014 = F_FULL(x1_full_4014, y1_full_4014, x2_full_4014, y2_full_4014);
            float x1_gold_4014; x1_gold_4014 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4014/param_idx_0.txt" ) ;
            float y1_gold_4014; y1_gold_4014 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4014/param_idx_1.txt" ) ;
            float x2_gold_4014; x2_gold_4014 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4014/param_idx_2.txt" ) ;
            float y2_gold_4014; y2_gold_4014 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_4014/param_idx_3.txt" ) ;
            Object output_2_4014 = f_gold(x1_gold_4014, y1_gold_4014, x2_gold_4014, y2_gold_4014);
            if (areEquivalent(output_1_4014, output_2_4014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4014 output1=" +
                                   serializeObj(output_1_4014) +
                                   " output2=" + serializeObj(output_2_4014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float x1_full_1010; x1_full_1010 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1010/param_idx_0.txt" ) ;
            float y1_full_1010; y1_full_1010 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1010/param_idx_1.txt" ) ;
            float x2_full_1010; x2_full_1010 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1010/param_idx_2.txt" ) ;
            float y2_full_1010; y2_full_1010 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1010/param_idx_3.txt" ) ;
            Object output_1_1010 = F_FULL(x1_full_1010, y1_full_1010, x2_full_1010, y2_full_1010);
            float x1_gold_1010; x1_gold_1010 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1010/param_idx_0.txt" ) ;
            float y1_gold_1010; y1_gold_1010 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1010/param_idx_1.txt" ) ;
            float x2_gold_1010; x2_gold_1010 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1010/param_idx_2.txt" ) ;
            float y2_gold_1010; y2_gold_1010 = readFloat ( "../PROGRAM_FIND_SLOPE_LINE/test_1010/param_idx_3.txt" ) ;
            Object output_2_1010 = f_gold(x1_gold_1010, y1_gold_1010, x2_gold_1010, y2_gold_1010);
            if (areEquivalent(output_1_1010, output_2_1010)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1010 output1=" +
                                   serializeObj(output_1_1010) +
                                   " output2=" + serializeObj(output_2_1010));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1010 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
