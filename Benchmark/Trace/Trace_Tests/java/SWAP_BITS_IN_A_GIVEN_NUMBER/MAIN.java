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
static int f_gold ( int x , int p1 , int p2 , int n ) {
  int set1 = ( x >> p1 ) & ( ( 1 << n ) - 1 ) ;
  int set2 = ( x >> p2 ) & ( ( 1 << n ) - 1 ) ;
  int xor = ( set1 ^ set2 ) ;
  xor = ( xor << p1 ) | ( xor << p2 ) ;
  int result = x ^ xor ;
  return result ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int x_full_2007; x_full_2007 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2007/param_idx_0.txt" ) ;
            int p1_full_2007; p1_full_2007 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2007/param_idx_1.txt" ) ;
            int p2_full_2007; p2_full_2007 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2007/param_idx_2.txt" ) ;
            int n_full_2007; n_full_2007 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2007/param_idx_3.txt" ) ;
            Object output_1_2007 = F_FULL(x_full_2007, p1_full_2007, p2_full_2007, n_full_2007);
            int x_gold_2007; x_gold_2007 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2007/param_idx_0.txt" ) ;
            int p1_gold_2007; p1_gold_2007 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2007/param_idx_1.txt" ) ;
            int p2_gold_2007; p2_gold_2007 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2007/param_idx_2.txt" ) ;
            int n_gold_2007; n_gold_2007 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2007/param_idx_3.txt" ) ;
            Object output_2_2007 = f_gold(x_gold_2007, p1_gold_2007, p2_gold_2007, n_gold_2007);
            if (areEquivalent(output_1_2007, output_2_2007)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2007 output1=" +
                                   serializeObj(output_1_2007) +
                                   " output2=" + serializeObj(output_2_2007));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2007 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_7; x_full_7 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_7/param_idx_0.txt" ) ;
            int p1_full_7; p1_full_7 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_7/param_idx_1.txt" ) ;
            int p2_full_7; p2_full_7 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_7/param_idx_2.txt" ) ;
            int n_full_7; n_full_7 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_7/param_idx_3.txt" ) ;
            Object output_1_7 = F_FULL(x_full_7, p1_full_7, p2_full_7, n_full_7);
            int x_gold_7; x_gold_7 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_7/param_idx_0.txt" ) ;
            int p1_gold_7; p1_gold_7 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_7/param_idx_1.txt" ) ;
            int p2_gold_7; p2_gold_7 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_7/param_idx_2.txt" ) ;
            int n_gold_7; n_gold_7 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_7/param_idx_3.txt" ) ;
            Object output_2_7 = f_gold(x_gold_7, p1_gold_7, p2_gold_7, n_gold_7);
            if (areEquivalent(output_1_7, output_2_7)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=7 output1=" +
                                   serializeObj(output_1_7) +
                                   " output2=" + serializeObj(output_2_7));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=7 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_2019; x_full_2019 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2019/param_idx_0.txt" ) ;
            int p1_full_2019; p1_full_2019 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2019/param_idx_1.txt" ) ;
            int p2_full_2019; p2_full_2019 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2019/param_idx_2.txt" ) ;
            int n_full_2019; n_full_2019 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2019/param_idx_3.txt" ) ;
            Object output_1_2019 = F_FULL(x_full_2019, p1_full_2019, p2_full_2019, n_full_2019);
            int x_gold_2019; x_gold_2019 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2019/param_idx_0.txt" ) ;
            int p1_gold_2019; p1_gold_2019 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2019/param_idx_1.txt" ) ;
            int p2_gold_2019; p2_gold_2019 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2019/param_idx_2.txt" ) ;
            int n_gold_2019; n_gold_2019 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2019/param_idx_3.txt" ) ;
            Object output_2_2019 = f_gold(x_gold_2019, p1_gold_2019, p2_gold_2019, n_gold_2019);
            if (areEquivalent(output_1_2019, output_2_2019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2019 output1=" +
                                   serializeObj(output_1_2019) +
                                   " output2=" + serializeObj(output_2_2019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_3006; x_full_3006 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3006/param_idx_0.txt" ) ;
            int p1_full_3006; p1_full_3006 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3006/param_idx_1.txt" ) ;
            int p2_full_3006; p2_full_3006 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3006/param_idx_2.txt" ) ;
            int n_full_3006; n_full_3006 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3006/param_idx_3.txt" ) ;
            Object output_1_3006 = F_FULL(x_full_3006, p1_full_3006, p2_full_3006, n_full_3006);
            int x_gold_3006; x_gold_3006 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3006/param_idx_0.txt" ) ;
            int p1_gold_3006; p1_gold_3006 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3006/param_idx_1.txt" ) ;
            int p2_gold_3006; p2_gold_3006 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3006/param_idx_2.txt" ) ;
            int n_gold_3006; n_gold_3006 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3006/param_idx_3.txt" ) ;
            Object output_2_3006 = f_gold(x_gold_3006, p1_gold_3006, p2_gold_3006, n_gold_3006);
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
            int x_full_0; x_full_0 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_0/param_idx_0.txt" ) ;
            int p1_full_0; p1_full_0 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_0/param_idx_1.txt" ) ;
            int p2_full_0; p2_full_0 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_0/param_idx_2.txt" ) ;
            int n_full_0; n_full_0 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_0/param_idx_3.txt" ) ;
            Object output_1_0 = F_FULL(x_full_0, p1_full_0, p2_full_0, n_full_0);
            int x_gold_0; x_gold_0 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_0/param_idx_0.txt" ) ;
            int p1_gold_0; p1_gold_0 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_0/param_idx_1.txt" ) ;
            int p2_gold_0; p2_gold_0 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_0/param_idx_2.txt" ) ;
            int n_gold_0; n_gold_0 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_0/param_idx_3.txt" ) ;
            Object output_2_0 = f_gold(x_gold_0, p1_gold_0, p2_gold_0, n_gold_0);
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
            int x_full_2021; x_full_2021 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2021/param_idx_0.txt" ) ;
            int p1_full_2021; p1_full_2021 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2021/param_idx_1.txt" ) ;
            int p2_full_2021; p2_full_2021 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2021/param_idx_2.txt" ) ;
            int n_full_2021; n_full_2021 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2021/param_idx_3.txt" ) ;
            Object output_1_2021 = F_FULL(x_full_2021, p1_full_2021, p2_full_2021, n_full_2021);
            int x_gold_2021; x_gold_2021 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2021/param_idx_0.txt" ) ;
            int p1_gold_2021; p1_gold_2021 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2021/param_idx_1.txt" ) ;
            int p2_gold_2021; p2_gold_2021 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2021/param_idx_2.txt" ) ;
            int n_gold_2021; n_gold_2021 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_2021/param_idx_3.txt" ) ;
            Object output_2_2021 = f_gold(x_gold_2021, p1_gold_2021, p2_gold_2021, n_gold_2021);
            if (areEquivalent(output_1_2021, output_2_2021)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2021 output1=" +
                                   serializeObj(output_1_2021) +
                                   " output2=" + serializeObj(output_2_2021));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2021 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_4024; x_full_4024 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4024/param_idx_0.txt" ) ;
            int p1_full_4024; p1_full_4024 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4024/param_idx_1.txt" ) ;
            int p2_full_4024; p2_full_4024 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4024/param_idx_2.txt" ) ;
            int n_full_4024; n_full_4024 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4024/param_idx_3.txt" ) ;
            Object output_1_4024 = F_FULL(x_full_4024, p1_full_4024, p2_full_4024, n_full_4024);
            int x_gold_4024; x_gold_4024 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4024/param_idx_0.txt" ) ;
            int p1_gold_4024; p1_gold_4024 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4024/param_idx_1.txt" ) ;
            int p2_gold_4024; p2_gold_4024 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4024/param_idx_2.txt" ) ;
            int n_gold_4024; n_gold_4024 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4024/param_idx_3.txt" ) ;
            Object output_2_4024 = f_gold(x_gold_4024, p1_gold_4024, p2_gold_4024, n_gold_4024);
            if (areEquivalent(output_1_4024, output_2_4024)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4024 output1=" +
                                   serializeObj(output_1_4024) +
                                   " output2=" + serializeObj(output_2_4024));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4024 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_23; x_full_23 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_23/param_idx_0.txt" ) ;
            int p1_full_23; p1_full_23 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_23/param_idx_1.txt" ) ;
            int p2_full_23; p2_full_23 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_23/param_idx_2.txt" ) ;
            int n_full_23; n_full_23 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_23/param_idx_3.txt" ) ;
            Object output_1_23 = F_FULL(x_full_23, p1_full_23, p2_full_23, n_full_23);
            int x_gold_23; x_gold_23 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_23/param_idx_0.txt" ) ;
            int p1_gold_23; p1_gold_23 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_23/param_idx_1.txt" ) ;
            int p2_gold_23; p2_gold_23 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_23/param_idx_2.txt" ) ;
            int n_gold_23; n_gold_23 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_23/param_idx_3.txt" ) ;
            Object output_2_23 = f_gold(x_gold_23, p1_gold_23, p2_gold_23, n_gold_23);
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
            int x_full_3004; x_full_3004 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3004/param_idx_0.txt" ) ;
            int p1_full_3004; p1_full_3004 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3004/param_idx_1.txt" ) ;
            int p2_full_3004; p2_full_3004 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3004/param_idx_2.txt" ) ;
            int n_full_3004; n_full_3004 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3004/param_idx_3.txt" ) ;
            Object output_1_3004 = F_FULL(x_full_3004, p1_full_3004, p2_full_3004, n_full_3004);
            int x_gold_3004; x_gold_3004 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3004/param_idx_0.txt" ) ;
            int p1_gold_3004; p1_gold_3004 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3004/param_idx_1.txt" ) ;
            int p2_gold_3004; p2_gold_3004 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3004/param_idx_2.txt" ) ;
            int n_gold_3004; n_gold_3004 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_3004/param_idx_3.txt" ) ;
            Object output_2_3004 = f_gold(x_gold_3004, p1_gold_3004, p2_gold_3004, n_gold_3004);
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
            int x_full_4005; x_full_4005 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4005/param_idx_0.txt" ) ;
            int p1_full_4005; p1_full_4005 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4005/param_idx_1.txt" ) ;
            int p2_full_4005; p2_full_4005 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4005/param_idx_2.txt" ) ;
            int n_full_4005; n_full_4005 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4005/param_idx_3.txt" ) ;
            Object output_1_4005 = F_FULL(x_full_4005, p1_full_4005, p2_full_4005, n_full_4005);
            int x_gold_4005; x_gold_4005 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4005/param_idx_0.txt" ) ;
            int p1_gold_4005; p1_gold_4005 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4005/param_idx_1.txt" ) ;
            int p2_gold_4005; p2_gold_4005 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4005/param_idx_2.txt" ) ;
            int n_gold_4005; n_gold_4005 = readInt ( "../SWAP_BITS_IN_A_GIVEN_NUMBER/test_4005/param_idx_3.txt" ) ;
            Object output_2_4005 = f_gold(x_gold_4005, p1_gold_4005, p2_gold_4005, n_gold_4005);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
