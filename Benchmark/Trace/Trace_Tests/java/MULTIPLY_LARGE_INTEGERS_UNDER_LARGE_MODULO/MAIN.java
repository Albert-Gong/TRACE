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
static long f_gold ( long a , long b , long mod ) {
  long res = 0 ;
  a %= mod ;
  while ( b > 0 ) {
    if ( ( b & 1 ) > 0 ) {
      res = ( res + a ) % mod ;
    }
    a = ( 2 * a ) % mod ;
    b >>= 1 ;
  }
  return res ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            long a_full_13; a_full_13 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_13/param_idx_0.txt" ) ;
            long b_full_13; b_full_13 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_13/param_idx_1.txt" ) ;
            long mod_full_13; mod_full_13 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_13/param_idx_2.txt" ) ;
            Object output_1_13 = F_FULL(a_full_13, b_full_13, mod_full_13);
            long a_gold_13; a_gold_13 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_13/param_idx_0.txt" ) ;
            long b_gold_13; b_gold_13 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_13/param_idx_1.txt" ) ;
            long mod_gold_13; mod_gold_13 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_13/param_idx_2.txt" ) ;
            Object output_2_13 = f_gold(a_gold_13, b_gold_13, mod_gold_13);
            if (areEquivalent(output_1_13, output_2_13)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=13 output1=" +
                                   serializeObj(output_1_13) +
                                   " output2=" + serializeObj(output_2_13));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=13 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            long a_full_2023; a_full_2023 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2023/param_idx_0.txt" ) ;
            long b_full_2023; b_full_2023 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2023/param_idx_1.txt" ) ;
            long mod_full_2023; mod_full_2023 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2023/param_idx_2.txt" ) ;
            Object output_1_2023 = F_FULL(a_full_2023, b_full_2023, mod_full_2023);
            long a_gold_2023; a_gold_2023 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2023/param_idx_0.txt" ) ;
            long b_gold_2023; b_gold_2023 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2023/param_idx_1.txt" ) ;
            long mod_gold_2023; mod_gold_2023 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2023/param_idx_2.txt" ) ;
            Object output_2_2023 = f_gold(a_gold_2023, b_gold_2023, mod_gold_2023);
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
            long a_full_1003; a_full_1003 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_1003/param_idx_0.txt" ) ;
            long b_full_1003; b_full_1003 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_1003/param_idx_1.txt" ) ;
            long mod_full_1003; mod_full_1003 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_1003/param_idx_2.txt" ) ;
            Object output_1_1003 = F_FULL(a_full_1003, b_full_1003, mod_full_1003);
            long a_gold_1003; a_gold_1003 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_1003/param_idx_0.txt" ) ;
            long b_gold_1003; b_gold_1003 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_1003/param_idx_1.txt" ) ;
            long mod_gold_1003; mod_gold_1003 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_1003/param_idx_2.txt" ) ;
            Object output_2_1003 = f_gold(a_gold_1003, b_gold_1003, mod_gold_1003);
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
            long a_full_2013; a_full_2013 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2013/param_idx_0.txt" ) ;
            long b_full_2013; b_full_2013 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2013/param_idx_1.txt" ) ;
            long mod_full_2013; mod_full_2013 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2013/param_idx_2.txt" ) ;
            Object output_1_2013 = F_FULL(a_full_2013, b_full_2013, mod_full_2013);
            long a_gold_2013; a_gold_2013 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2013/param_idx_0.txt" ) ;
            long b_gold_2013; b_gold_2013 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2013/param_idx_1.txt" ) ;
            long mod_gold_2013; mod_gold_2013 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2013/param_idx_2.txt" ) ;
            Object output_2_2013 = f_gold(a_gold_2013, b_gold_2013, mod_gold_2013);
            if (areEquivalent(output_1_2013, output_2_2013)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2013 output1=" +
                                   serializeObj(output_1_2013) +
                                   " output2=" + serializeObj(output_2_2013));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            long a_full_12; a_full_12 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_12/param_idx_0.txt" ) ;
            long b_full_12; b_full_12 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_12/param_idx_1.txt" ) ;
            long mod_full_12; mod_full_12 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_12/param_idx_2.txt" ) ;
            Object output_1_12 = F_FULL(a_full_12, b_full_12, mod_full_12);
            long a_gold_12; a_gold_12 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_12/param_idx_0.txt" ) ;
            long b_gold_12; b_gold_12 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_12/param_idx_1.txt" ) ;
            long mod_gold_12; mod_gold_12 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_12/param_idx_2.txt" ) ;
            Object output_2_12 = f_gold(a_gold_12, b_gold_12, mod_gold_12);
            if (areEquivalent(output_1_12, output_2_12)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=12 output1=" +
                                   serializeObj(output_1_12) +
                                   " output2=" + serializeObj(output_2_12));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=12 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            long a_full_3021; a_full_3021 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_3021/param_idx_0.txt" ) ;
            long b_full_3021; b_full_3021 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_3021/param_idx_1.txt" ) ;
            long mod_full_3021; mod_full_3021 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_3021/param_idx_2.txt" ) ;
            Object output_1_3021 = F_FULL(a_full_3021, b_full_3021, mod_full_3021);
            long a_gold_3021; a_gold_3021 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_3021/param_idx_0.txt" ) ;
            long b_gold_3021; b_gold_3021 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_3021/param_idx_1.txt" ) ;
            long mod_gold_3021; mod_gold_3021 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_3021/param_idx_2.txt" ) ;
            Object output_2_3021 = f_gold(a_gold_3021, b_gold_3021, mod_gold_3021);
            if (areEquivalent(output_1_3021, output_2_3021)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3021 output1=" +
                                   serializeObj(output_1_3021) +
                                   " output2=" + serializeObj(output_2_3021));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3021 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            long a_full_31; a_full_31 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_31/param_idx_0.txt" ) ;
            long b_full_31; b_full_31 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_31/param_idx_1.txt" ) ;
            long mod_full_31; mod_full_31 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_31/param_idx_2.txt" ) ;
            Object output_1_31 = F_FULL(a_full_31, b_full_31, mod_full_31);
            long a_gold_31; a_gold_31 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_31/param_idx_0.txt" ) ;
            long b_gold_31; b_gold_31 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_31/param_idx_1.txt" ) ;
            long mod_gold_31; mod_gold_31 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_31/param_idx_2.txt" ) ;
            Object output_2_31 = f_gold(a_gold_31, b_gold_31, mod_gold_31);
            if (areEquivalent(output_1_31, output_2_31)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=31 output1=" +
                                   serializeObj(output_1_31) +
                                   " output2=" + serializeObj(output_2_31));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=31 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            long a_full_2004; a_full_2004 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2004/param_idx_0.txt" ) ;
            long b_full_2004; b_full_2004 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2004/param_idx_1.txt" ) ;
            long mod_full_2004; mod_full_2004 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2004/param_idx_2.txt" ) ;
            Object output_1_2004 = F_FULL(a_full_2004, b_full_2004, mod_full_2004);
            long a_gold_2004; a_gold_2004 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2004/param_idx_0.txt" ) ;
            long b_gold_2004; b_gold_2004 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2004/param_idx_1.txt" ) ;
            long mod_gold_2004; mod_gold_2004 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_2004/param_idx_2.txt" ) ;
            Object output_2_2004 = f_gold(a_gold_2004, b_gold_2004, mod_gold_2004);
            if (areEquivalent(output_1_2004, output_2_2004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2004 output1=" +
                                   serializeObj(output_1_2004) +
                                   " output2=" + serializeObj(output_2_2004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            long a_full_8; a_full_8 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_8/param_idx_0.txt" ) ;
            long b_full_8; b_full_8 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_8/param_idx_1.txt" ) ;
            long mod_full_8; mod_full_8 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_8/param_idx_2.txt" ) ;
            Object output_1_8 = F_FULL(a_full_8, b_full_8, mod_full_8);
            long a_gold_8; a_gold_8 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_8/param_idx_0.txt" ) ;
            long b_gold_8; b_gold_8 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_8/param_idx_1.txt" ) ;
            long mod_gold_8; mod_gold_8 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_8/param_idx_2.txt" ) ;
            Object output_2_8 = f_gold(a_gold_8, b_gold_8, mod_gold_8);
            if (areEquivalent(output_1_8, output_2_8)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=8 output1=" +
                                   serializeObj(output_1_8) +
                                   " output2=" + serializeObj(output_2_8));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=8 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            long a_full_29; a_full_29 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_29/param_idx_0.txt" ) ;
            long b_full_29; b_full_29 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_29/param_idx_1.txt" ) ;
            long mod_full_29; mod_full_29 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_29/param_idx_2.txt" ) ;
            Object output_1_29 = F_FULL(a_full_29, b_full_29, mod_full_29);
            long a_gold_29; a_gold_29 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_29/param_idx_0.txt" ) ;
            long b_gold_29; b_gold_29 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_29/param_idx_1.txt" ) ;
            long mod_gold_29; mod_gold_29 = readLong ( "../MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO/test_29/param_idx_2.txt" ) ;
            Object output_2_29 = f_gold(a_gold_29, b_gold_29, mod_gold_29);
            if (areEquivalent(output_1_29, output_2_29)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=29 output1=" +
                                   serializeObj(output_1_29) +
                                   " output2=" + serializeObj(output_2_29));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=29 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
