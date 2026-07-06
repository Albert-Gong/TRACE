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
  int i = 0 ;
  int ans = 0 ;
  while ( ( 1 << i ) <= n ) {
    boolean k = false ;
    int change = 1 << i ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( k == true ) ans += 1 ;
      else ans += 0 ;
      if ( change == 1 ) {
        k = ! k ;
        change = 1 << i ;
      }
      else {
        change -- ;
      }
    }
    i ++ ;
  }
  return ans ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_4016; n_full_4016 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_4016/param_idx_0.txt" ) ;
            Object output_1_4016 = F_FULL(n_full_4016);
            int n_gold_4016; n_gold_4016 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_4016/param_idx_0.txt" ) ;
            Object output_2_4016 = f_gold(n_gold_4016);
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
            int n_full_4017; n_full_4017 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_4017/param_idx_0.txt" ) ;
            Object output_1_4017 = F_FULL(n_full_4017);
            int n_gold_4017; n_gold_4017 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_4017/param_idx_0.txt" ) ;
            Object output_2_4017 = f_gold(n_gold_4017);
            if (areEquivalent(output_1_4017, output_2_4017)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4017 output1=" +
                                   serializeObj(output_1_4017) +
                                   " output2=" + serializeObj(output_2_4017));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4017 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3016; n_full_3016 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_3016/param_idx_0.txt" ) ;
            Object output_1_3016 = F_FULL(n_full_3016);
            int n_gold_3016; n_gold_3016 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_3016/param_idx_0.txt" ) ;
            Object output_2_3016 = f_gold(n_gold_3016);
            if (areEquivalent(output_1_3016, output_2_3016)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3016 output1=" +
                                   serializeObj(output_1_3016) +
                                   " output2=" + serializeObj(output_2_3016));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3016 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4018; n_full_4018 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_4018/param_idx_0.txt" ) ;
            Object output_1_4018 = F_FULL(n_full_4018);
            int n_gold_4018; n_gold_4018 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_4018/param_idx_0.txt" ) ;
            Object output_2_4018 = f_gold(n_gold_4018);
            if (areEquivalent(output_1_4018, output_2_4018)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4018 output1=" +
                                   serializeObj(output_1_4018) +
                                   " output2=" + serializeObj(output_2_4018));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4018 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1009; n_full_1009 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_1009/param_idx_0.txt" ) ;
            Object output_1_1009 = F_FULL(n_full_1009);
            int n_gold_1009; n_gold_1009 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_1009/param_idx_0.txt" ) ;
            Object output_2_1009 = f_gold(n_gold_1009);
            if (areEquivalent(output_1_1009, output_2_1009)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1009 output1=" +
                                   serializeObj(output_1_1009) +
                                   " output2=" + serializeObj(output_2_1009));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1009 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3; n_full_3 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_3/param_idx_0.txt" ) ;
            Object output_1_3 = F_FULL(n_full_3);
            int n_gold_3; n_gold_3 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_3/param_idx_0.txt" ) ;
            Object output_2_3 = f_gold(n_gold_3);
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
            int n_full_1003; n_full_1003 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_1003/param_idx_0.txt" ) ;
            Object output_1_1003 = F_FULL(n_full_1003);
            int n_gold_1003; n_gold_1003 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_1003/param_idx_0.txt" ) ;
            Object output_2_1003 = f_gold(n_gold_1003);
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
            int n_full_3020; n_full_3020 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_3020/param_idx_0.txt" ) ;
            Object output_1_3020 = F_FULL(n_full_3020);
            int n_gold_3020; n_gold_3020 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_3020/param_idx_0.txt" ) ;
            Object output_2_3020 = f_gold(n_gold_3020);
            if (areEquivalent(output_1_3020, output_2_3020)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3020 output1=" +
                                   serializeObj(output_1_3020) +
                                   " output2=" + serializeObj(output_2_3020));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3020 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4019; n_full_4019 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_4019/param_idx_0.txt" ) ;
            Object output_1_4019 = F_FULL(n_full_4019);
            int n_gold_4019; n_gold_4019 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_4019/param_idx_0.txt" ) ;
            Object output_2_4019 = f_gold(n_gold_4019);
            if (areEquivalent(output_1_4019, output_2_4019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4019 output1=" +
                                   serializeObj(output_1_4019) +
                                   " output2=" + serializeObj(output_2_4019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2013; n_full_2013 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_2013/param_idx_0.txt" ) ;
            Object output_1_2013 = F_FULL(n_full_2013);
            int n_gold_2013; n_gold_2013 = readInt ( "../COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N/test_2013/param_idx_0.txt" ) ;
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
