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
static int f_gold ( int n ) {
  n -- ;
  n |= n >> 1 ;
  n |= n >> 2 ;
  n |= n >> 4 ;
  n |= n >> 8 ;
  n |= n >> 16 ;
  n ++ ;
  return n ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_1020; n_full_1020 = readInt ( "../NEXT_POWER_OF_2_2/test_1020/param_idx_0.txt" ) ;
            Object output_1_1020 = F_FULL(n_full_1020);
            int n_gold_1020; n_gold_1020 = readInt ( "../NEXT_POWER_OF_2_2/test_1020/param_idx_0.txt" ) ;
            Object output_2_1020 = f_gold(n_gold_1020);
            if (areEquivalent(output_1_1020, output_2_1020)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1020 output1=" +
                                   serializeObj(output_1_1020) +
                                   " output2=" + serializeObj(output_2_1020));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1020 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4012; n_full_4012 = readInt ( "../NEXT_POWER_OF_2_2/test_4012/param_idx_0.txt" ) ;
            Object output_1_4012 = F_FULL(n_full_4012);
            int n_gold_4012; n_gold_4012 = readInt ( "../NEXT_POWER_OF_2_2/test_4012/param_idx_0.txt" ) ;
            Object output_2_4012 = f_gold(n_gold_4012);
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
            int n_full_2008; n_full_2008 = readInt ( "../NEXT_POWER_OF_2_2/test_2008/param_idx_0.txt" ) ;
            Object output_1_2008 = F_FULL(n_full_2008);
            int n_gold_2008; n_gold_2008 = readInt ( "../NEXT_POWER_OF_2_2/test_2008/param_idx_0.txt" ) ;
            Object output_2_2008 = f_gold(n_gold_2008);
            if (areEquivalent(output_1_2008, output_2_2008)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2008 output1=" +
                                   serializeObj(output_1_2008) +
                                   " output2=" + serializeObj(output_2_2008));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2008 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_8; n_full_8 = readInt ( "../NEXT_POWER_OF_2_2/test_8/param_idx_0.txt" ) ;
            Object output_1_8 = F_FULL(n_full_8);
            int n_gold_8; n_gold_8 = readInt ( "../NEXT_POWER_OF_2_2/test_8/param_idx_0.txt" ) ;
            Object output_2_8 = f_gold(n_gold_8);
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
            int n_full_4011; n_full_4011 = readInt ( "../NEXT_POWER_OF_2_2/test_4011/param_idx_0.txt" ) ;
            Object output_1_4011 = F_FULL(n_full_4011);
            int n_gold_4011; n_gold_4011 = readInt ( "../NEXT_POWER_OF_2_2/test_4011/param_idx_0.txt" ) ;
            Object output_2_4011 = f_gold(n_gold_4011);
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
            int n_full_3014; n_full_3014 = readInt ( "../NEXT_POWER_OF_2_2/test_3014/param_idx_0.txt" ) ;
            Object output_1_3014 = F_FULL(n_full_3014);
            int n_gold_3014; n_gold_3014 = readInt ( "../NEXT_POWER_OF_2_2/test_3014/param_idx_0.txt" ) ;
            Object output_2_3014 = f_gold(n_gold_3014);
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
            int n_full_1019; n_full_1019 = readInt ( "../NEXT_POWER_OF_2_2/test_1019/param_idx_0.txt" ) ;
            Object output_1_1019 = F_FULL(n_full_1019);
            int n_gold_1019; n_gold_1019 = readInt ( "../NEXT_POWER_OF_2_2/test_1019/param_idx_0.txt" ) ;
            Object output_2_1019 = f_gold(n_gold_1019);
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
            int n_full_2014; n_full_2014 = readInt ( "../NEXT_POWER_OF_2_2/test_2014/param_idx_0.txt" ) ;
            Object output_1_2014 = F_FULL(n_full_2014);
            int n_gold_2014; n_gold_2014 = readInt ( "../NEXT_POWER_OF_2_2/test_2014/param_idx_0.txt" ) ;
            Object output_2_2014 = f_gold(n_gold_2014);
            if (areEquivalent(output_1_2014, output_2_2014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2014 output1=" +
                                   serializeObj(output_1_2014) +
                                   " output2=" + serializeObj(output_2_2014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2013; n_full_2013 = readInt ( "../NEXT_POWER_OF_2_2/test_2013/param_idx_0.txt" ) ;
            Object output_1_2013 = F_FULL(n_full_2013);
            int n_gold_2013; n_gold_2013 = readInt ( "../NEXT_POWER_OF_2_2/test_2013/param_idx_0.txt" ) ;
            Object output_2_2013 = f_gold(n_gold_2013);
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
            int n_full_3008; n_full_3008 = readInt ( "../NEXT_POWER_OF_2_2/test_3008/param_idx_0.txt" ) ;
            Object output_1_3008 = F_FULL(n_full_3008);
            int n_gold_3008; n_gold_3008 = readInt ( "../NEXT_POWER_OF_2_2/test_3008/param_idx_0.txt" ) ;
            Object output_2_3008 = f_gold(n_gold_3008);
            if (areEquivalent(output_1_3008, output_2_3008)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3008 output1=" +
                                   serializeObj(output_1_3008) +
                                   " output2=" + serializeObj(output_2_3008));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3008 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
