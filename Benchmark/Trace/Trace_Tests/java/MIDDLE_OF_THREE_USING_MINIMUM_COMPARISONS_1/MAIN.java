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
public static int f_gold ( int a , int b , int c ) {
  if ( a > b ) {
    if ( b > c ) return b ;
    else if ( a > c ) return c ;
    else return a ;
  }
  else {
    if ( a > c ) return a ;
    else if ( b > c ) return c ;
    else return b ;
  }
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int a_full_1011; a_full_1011 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1011/param_idx_0.txt" ) ;
            int b_full_1011; b_full_1011 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1011/param_idx_1.txt" ) ;
            int c_full_1011; c_full_1011 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1011/param_idx_2.txt" ) ;
            Object output_1_1011 = F_FULL(a_full_1011, b_full_1011, c_full_1011);
            int a_gold_1011; a_gold_1011 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1011/param_idx_0.txt" ) ;
            int b_gold_1011; b_gold_1011 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1011/param_idx_1.txt" ) ;
            int c_gold_1011; c_gold_1011 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1011/param_idx_2.txt" ) ;
            Object output_2_1011 = f_gold(a_gold_1011, b_gold_1011, c_gold_1011);
            if (areEquivalent(output_1_1011, output_2_1011)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1011 output1=" +
                                   serializeObj(output_1_1011) +
                                   " output2=" + serializeObj(output_2_1011));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1011 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int a_full_15; a_full_15 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_15/param_idx_0.txt" ) ;
            int b_full_15; b_full_15 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_15/param_idx_1.txt" ) ;
            int c_full_15; c_full_15 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_15/param_idx_2.txt" ) ;
            Object output_1_15 = F_FULL(a_full_15, b_full_15, c_full_15);
            int a_gold_15; a_gold_15 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_15/param_idx_0.txt" ) ;
            int b_gold_15; b_gold_15 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_15/param_idx_1.txt" ) ;
            int c_gold_15; c_gold_15 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_15/param_idx_2.txt" ) ;
            Object output_2_15 = f_gold(a_gold_15, b_gold_15, c_gold_15);
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
            int a_full_18; a_full_18 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_18/param_idx_0.txt" ) ;
            int b_full_18; b_full_18 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_18/param_idx_1.txt" ) ;
            int c_full_18; c_full_18 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_18/param_idx_2.txt" ) ;
            Object output_1_18 = F_FULL(a_full_18, b_full_18, c_full_18);
            int a_gold_18; a_gold_18 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_18/param_idx_0.txt" ) ;
            int b_gold_18; b_gold_18 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_18/param_idx_1.txt" ) ;
            int c_gold_18; c_gold_18 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_18/param_idx_2.txt" ) ;
            Object output_2_18 = f_gold(a_gold_18, b_gold_18, c_gold_18);
            if (areEquivalent(output_1_18, output_2_18)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=18 output1=" +
                                   serializeObj(output_1_18) +
                                   " output2=" + serializeObj(output_2_18));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=18 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int a_full_2000; a_full_2000 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2000/param_idx_0.txt" ) ;
            int b_full_2000; b_full_2000 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2000/param_idx_1.txt" ) ;
            int c_full_2000; c_full_2000 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2000/param_idx_2.txt" ) ;
            Object output_1_2000 = F_FULL(a_full_2000, b_full_2000, c_full_2000);
            int a_gold_2000; a_gold_2000 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2000/param_idx_0.txt" ) ;
            int b_gold_2000; b_gold_2000 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2000/param_idx_1.txt" ) ;
            int c_gold_2000; c_gold_2000 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2000/param_idx_2.txt" ) ;
            Object output_2_2000 = f_gold(a_gold_2000, b_gold_2000, c_gold_2000);
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
            int a_full_4002; a_full_4002 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_4002/param_idx_0.txt" ) ;
            int b_full_4002; b_full_4002 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_4002/param_idx_1.txt" ) ;
            int c_full_4002; c_full_4002 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_4002/param_idx_2.txt" ) ;
            Object output_1_4002 = F_FULL(a_full_4002, b_full_4002, c_full_4002);
            int a_gold_4002; a_gold_4002 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_4002/param_idx_0.txt" ) ;
            int b_gold_4002; b_gold_4002 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_4002/param_idx_1.txt" ) ;
            int c_gold_4002; c_gold_4002 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_4002/param_idx_2.txt" ) ;
            Object output_2_4002 = f_gold(a_gold_4002, b_gold_4002, c_gold_4002);
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
            int a_full_1021; a_full_1021 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1021/param_idx_0.txt" ) ;
            int b_full_1021; b_full_1021 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1021/param_idx_1.txt" ) ;
            int c_full_1021; c_full_1021 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1021/param_idx_2.txt" ) ;
            Object output_1_1021 = F_FULL(a_full_1021, b_full_1021, c_full_1021);
            int a_gold_1021; a_gold_1021 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1021/param_idx_0.txt" ) ;
            int b_gold_1021; b_gold_1021 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1021/param_idx_1.txt" ) ;
            int c_gold_1021; c_gold_1021 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1021/param_idx_2.txt" ) ;
            Object output_2_1021 = f_gold(a_gold_1021, b_gold_1021, c_gold_1021);
            if (areEquivalent(output_1_1021, output_2_1021)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1021 output1=" +
                                   serializeObj(output_1_1021) +
                                   " output2=" + serializeObj(output_2_1021));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1021 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int a_full_24; a_full_24 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_24/param_idx_0.txt" ) ;
            int b_full_24; b_full_24 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_24/param_idx_1.txt" ) ;
            int c_full_24; c_full_24 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_24/param_idx_2.txt" ) ;
            Object output_1_24 = F_FULL(a_full_24, b_full_24, c_full_24);
            int a_gold_24; a_gold_24 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_24/param_idx_0.txt" ) ;
            int b_gold_24; b_gold_24 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_24/param_idx_1.txt" ) ;
            int c_gold_24; c_gold_24 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_24/param_idx_2.txt" ) ;
            Object output_2_24 = f_gold(a_gold_24, b_gold_24, c_gold_24);
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
            int a_full_23; a_full_23 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_23/param_idx_0.txt" ) ;
            int b_full_23; b_full_23 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_23/param_idx_1.txt" ) ;
            int c_full_23; c_full_23 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_23/param_idx_2.txt" ) ;
            Object output_1_23 = F_FULL(a_full_23, b_full_23, c_full_23);
            int a_gold_23; a_gold_23 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_23/param_idx_0.txt" ) ;
            int b_gold_23; b_gold_23 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_23/param_idx_1.txt" ) ;
            int c_gold_23; c_gold_23 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_23/param_idx_2.txt" ) ;
            Object output_2_23 = f_gold(a_gold_23, b_gold_23, c_gold_23);
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
            int a_full_1014; a_full_1014 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1014/param_idx_0.txt" ) ;
            int b_full_1014; b_full_1014 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1014/param_idx_1.txt" ) ;
            int c_full_1014; c_full_1014 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1014/param_idx_2.txt" ) ;
            Object output_1_1014 = F_FULL(a_full_1014, b_full_1014, c_full_1014);
            int a_gold_1014; a_gold_1014 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1014/param_idx_0.txt" ) ;
            int b_gold_1014; b_gold_1014 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1014/param_idx_1.txt" ) ;
            int c_gold_1014; c_gold_1014 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_1014/param_idx_2.txt" ) ;
            Object output_2_1014 = f_gold(a_gold_1014, b_gold_1014, c_gold_1014);
            if (areEquivalent(output_1_1014, output_2_1014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1014 output1=" +
                                   serializeObj(output_1_1014) +
                                   " output2=" + serializeObj(output_2_1014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int a_full_2003; a_full_2003 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2003/param_idx_0.txt" ) ;
            int b_full_2003; b_full_2003 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2003/param_idx_1.txt" ) ;
            int c_full_2003; c_full_2003 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2003/param_idx_2.txt" ) ;
            Object output_1_2003 = F_FULL(a_full_2003, b_full_2003, c_full_2003);
            int a_gold_2003; a_gold_2003 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2003/param_idx_0.txt" ) ;
            int b_gold_2003; b_gold_2003 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2003/param_idx_1.txt" ) ;
            int c_gold_2003; c_gold_2003 = readInt ( "../MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1/test_2003/param_idx_2.txt" ) ;
            Object output_2_2003 = f_gold(a_gold_2003, b_gold_2003, c_gold_2003);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
