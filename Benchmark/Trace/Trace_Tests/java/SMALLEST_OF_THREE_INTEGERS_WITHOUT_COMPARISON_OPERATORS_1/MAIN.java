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
  if ( ( y / x ) == 0 ) return ( ( y / z ) == 0 ) ? y : z ;
  return ( ( x / z ) == 0 ) ? x : z ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int x_full_1; x_full_1 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1/param_idx_0.txt" ) ;
            int y_full_1; y_full_1 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1/param_idx_1.txt" ) ;
            int z_full_1; z_full_1 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1/param_idx_2.txt" ) ;
            Object output_1_1 = F_FULL(x_full_1, y_full_1, z_full_1);
            int x_gold_1; x_gold_1 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1/param_idx_0.txt" ) ;
            int y_gold_1; y_gold_1 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1/param_idx_1.txt" ) ;
            int z_gold_1; z_gold_1 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1/param_idx_2.txt" ) ;
            Object output_2_1 = f_gold(x_gold_1, y_gold_1, z_gold_1);
            if (areEquivalent(output_1_1, output_2_1)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1 output1=" +
                                   serializeObj(output_1_1) +
                                   " output2=" + serializeObj(output_2_1));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_3005; x_full_3005 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3005/param_idx_0.txt" ) ;
            int y_full_3005; y_full_3005 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3005/param_idx_1.txt" ) ;
            int z_full_3005; z_full_3005 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3005/param_idx_2.txt" ) ;
            Object output_1_3005 = F_FULL(x_full_3005, y_full_3005, z_full_3005);
            int x_gold_3005; x_gold_3005 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3005/param_idx_0.txt" ) ;
            int y_gold_3005; y_gold_3005 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3005/param_idx_1.txt" ) ;
            int z_gold_3005; z_gold_3005 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3005/param_idx_2.txt" ) ;
            Object output_2_3005 = f_gold(x_gold_3005, y_gold_3005, z_gold_3005);
            if (areEquivalent(output_1_3005, output_2_3005)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3005 output1=" +
                                   serializeObj(output_1_3005) +
                                   " output2=" + serializeObj(output_2_3005));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3005 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_4001; x_full_4001 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4001/param_idx_0.txt" ) ;
            int y_full_4001; y_full_4001 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4001/param_idx_1.txt" ) ;
            int z_full_4001; z_full_4001 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4001/param_idx_2.txt" ) ;
            Object output_1_4001 = F_FULL(x_full_4001, y_full_4001, z_full_4001);
            int x_gold_4001; x_gold_4001 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4001/param_idx_0.txt" ) ;
            int y_gold_4001; y_gold_4001 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4001/param_idx_1.txt" ) ;
            int z_gold_4001; z_gold_4001 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4001/param_idx_2.txt" ) ;
            Object output_2_4001 = f_gold(x_gold_4001, y_gold_4001, z_gold_4001);
            if (areEquivalent(output_1_4001, output_2_4001)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4001 output1=" +
                                   serializeObj(output_1_4001) +
                                   " output2=" + serializeObj(output_2_4001));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4001 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_1010; x_full_1010 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1010/param_idx_0.txt" ) ;
            int y_full_1010; y_full_1010 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1010/param_idx_1.txt" ) ;
            int z_full_1010; z_full_1010 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1010/param_idx_2.txt" ) ;
            Object output_1_1010 = F_FULL(x_full_1010, y_full_1010, z_full_1010);
            int x_gold_1010; x_gold_1010 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1010/param_idx_0.txt" ) ;
            int y_gold_1010; y_gold_1010 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1010/param_idx_1.txt" ) ;
            int z_gold_1010; z_gold_1010 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1010/param_idx_2.txt" ) ;
            Object output_2_1010 = f_gold(x_gold_1010, y_gold_1010, z_gold_1010);
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

        try {
            total_test_case_num++;
            int x_full_1004; x_full_1004 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1004/param_idx_0.txt" ) ;
            int y_full_1004; y_full_1004 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1004/param_idx_1.txt" ) ;
            int z_full_1004; z_full_1004 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1004/param_idx_2.txt" ) ;
            Object output_1_1004 = F_FULL(x_full_1004, y_full_1004, z_full_1004);
            int x_gold_1004; x_gold_1004 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1004/param_idx_0.txt" ) ;
            int y_gold_1004; y_gold_1004 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1004/param_idx_1.txt" ) ;
            int z_gold_1004; z_gold_1004 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_1004/param_idx_2.txt" ) ;
            Object output_2_1004 = f_gold(x_gold_1004, y_gold_1004, z_gold_1004);
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
            int x_full_3000; x_full_3000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3000/param_idx_0.txt" ) ;
            int y_full_3000; y_full_3000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3000/param_idx_1.txt" ) ;
            int z_full_3000; z_full_3000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3000/param_idx_2.txt" ) ;
            Object output_1_3000 = F_FULL(x_full_3000, y_full_3000, z_full_3000);
            int x_gold_3000; x_gold_3000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3000/param_idx_0.txt" ) ;
            int y_gold_3000; y_gold_3000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3000/param_idx_1.txt" ) ;
            int z_gold_3000; z_gold_3000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3000/param_idx_2.txt" ) ;
            Object output_2_3000 = f_gold(x_gold_3000, y_gold_3000, z_gold_3000);
            if (areEquivalent(output_1_3000, output_2_3000)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3000 output1=" +
                                   serializeObj(output_1_3000) +
                                   " output2=" + serializeObj(output_2_3000));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_3003; x_full_3003 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3003/param_idx_0.txt" ) ;
            int y_full_3003; y_full_3003 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3003/param_idx_1.txt" ) ;
            int z_full_3003; z_full_3003 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3003/param_idx_2.txt" ) ;
            Object output_1_3003 = F_FULL(x_full_3003, y_full_3003, z_full_3003);
            int x_gold_3003; x_gold_3003 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3003/param_idx_0.txt" ) ;
            int y_gold_3003; y_gold_3003 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3003/param_idx_1.txt" ) ;
            int z_gold_3003; z_gold_3003 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_3003/param_idx_2.txt" ) ;
            Object output_2_3003 = f_gold(x_gold_3003, y_gold_3003, z_gold_3003);
            if (areEquivalent(output_1_3003, output_2_3003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3003 output1=" +
                                   serializeObj(output_1_3003) +
                                   " output2=" + serializeObj(output_2_3003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_22; x_full_22 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_22/param_idx_0.txt" ) ;
            int y_full_22; y_full_22 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_22/param_idx_1.txt" ) ;
            int z_full_22; z_full_22 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_22/param_idx_2.txt" ) ;
            Object output_1_22 = F_FULL(x_full_22, y_full_22, z_full_22);
            int x_gold_22; x_gold_22 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_22/param_idx_0.txt" ) ;
            int y_gold_22; y_gold_22 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_22/param_idx_1.txt" ) ;
            int z_gold_22; z_gold_22 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_22/param_idx_2.txt" ) ;
            Object output_2_22 = f_gold(x_gold_22, y_gold_22, z_gold_22);
            if (areEquivalent(output_1_22, output_2_22)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=22 output1=" +
                                   serializeObj(output_1_22) +
                                   " output2=" + serializeObj(output_2_22));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=22 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_2000; x_full_2000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_2000/param_idx_0.txt" ) ;
            int y_full_2000; y_full_2000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_2000/param_idx_1.txt" ) ;
            int z_full_2000; z_full_2000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_2000/param_idx_2.txt" ) ;
            Object output_1_2000 = F_FULL(x_full_2000, y_full_2000, z_full_2000);
            int x_gold_2000; x_gold_2000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_2000/param_idx_0.txt" ) ;
            int y_gold_2000; y_gold_2000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_2000/param_idx_1.txt" ) ;
            int z_gold_2000; z_gold_2000 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_2000/param_idx_2.txt" ) ;
            Object output_2_2000 = f_gold(x_gold_2000, y_gold_2000, z_gold_2000);
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
            int x_full_4012; x_full_4012 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4012/param_idx_0.txt" ) ;
            int y_full_4012; y_full_4012 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4012/param_idx_1.txt" ) ;
            int z_full_4012; z_full_4012 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4012/param_idx_2.txt" ) ;
            Object output_1_4012 = F_FULL(x_full_4012, y_full_4012, z_full_4012);
            int x_gold_4012; x_gold_4012 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4012/param_idx_0.txt" ) ;
            int y_gold_4012; y_gold_4012 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4012/param_idx_1.txt" ) ;
            int z_gold_4012; z_gold_4012 = readInt ( "../SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1/test_4012/param_idx_2.txt" ) ;
            Object output_2_4012 = f_gold(x_gold_4012, y_gold_4012, z_gold_4012);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
