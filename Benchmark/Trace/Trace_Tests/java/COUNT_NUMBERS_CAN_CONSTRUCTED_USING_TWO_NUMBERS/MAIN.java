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
static int f_gold ( int n , int x , int y ) {
  boolean [ ] arr = new boolean [ n + 1 ] ;
  if ( x <= n ) arr [ x ] = true ;
  if ( y <= n ) arr [ y ] = true ;
  int result = 0 ;
  for ( int i = Math . min ( x , y ) ;
  i <= n ;
  i ++ ) {
    if ( arr [ i ] ) {
      if ( i + x <= n ) arr [ i + x ] = true ;
      if ( i + y <= n ) arr [ i + y ] = true ;
      result ++ ;
    }
  }
  return result ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_4019; n_full_4019 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4019/param_idx_0.txt" ) ;
            int x_full_4019; x_full_4019 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4019/param_idx_1.txt" ) ;
            int y_full_4019; y_full_4019 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4019/param_idx_2.txt" ) ;
            Object output_1_4019 = F_FULL(n_full_4019, x_full_4019, y_full_4019);
            int n_gold_4019; n_gold_4019 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4019/param_idx_0.txt" ) ;
            int x_gold_4019; x_gold_4019 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4019/param_idx_1.txt" ) ;
            int y_gold_4019; y_gold_4019 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4019/param_idx_2.txt" ) ;
            Object output_2_4019 = f_gold(n_gold_4019, x_gold_4019, y_gold_4019);
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
            int n_full_4002; n_full_4002 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4002/param_idx_0.txt" ) ;
            int x_full_4002; x_full_4002 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4002/param_idx_1.txt" ) ;
            int y_full_4002; y_full_4002 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4002/param_idx_2.txt" ) ;
            Object output_1_4002 = F_FULL(n_full_4002, x_full_4002, y_full_4002);
            int n_gold_4002; n_gold_4002 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4002/param_idx_0.txt" ) ;
            int x_gold_4002; x_gold_4002 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4002/param_idx_1.txt" ) ;
            int y_gold_4002; y_gold_4002 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4002/param_idx_2.txt" ) ;
            Object output_2_4002 = f_gold(n_gold_4002, x_gold_4002, y_gold_4002);
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
            int n_full_4009; n_full_4009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4009/param_idx_0.txt" ) ;
            int x_full_4009; x_full_4009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4009/param_idx_1.txt" ) ;
            int y_full_4009; y_full_4009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4009/param_idx_2.txt" ) ;
            Object output_1_4009 = F_FULL(n_full_4009, x_full_4009, y_full_4009);
            int n_gold_4009; n_gold_4009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4009/param_idx_0.txt" ) ;
            int x_gold_4009; x_gold_4009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4009/param_idx_1.txt" ) ;
            int y_gold_4009; y_gold_4009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4009/param_idx_2.txt" ) ;
            Object output_2_4009 = f_gold(n_gold_4009, x_gold_4009, y_gold_4009);
            if (areEquivalent(output_1_4009, output_2_4009)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4009 output1=" +
                                   serializeObj(output_1_4009) +
                                   " output2=" + serializeObj(output_2_4009));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4009 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1010; n_full_1010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_1010/param_idx_0.txt" ) ;
            int x_full_1010; x_full_1010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_1010/param_idx_1.txt" ) ;
            int y_full_1010; y_full_1010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_1010/param_idx_2.txt" ) ;
            Object output_1_1010 = F_FULL(n_full_1010, x_full_1010, y_full_1010);
            int n_gold_1010; n_gold_1010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_1010/param_idx_0.txt" ) ;
            int x_gold_1010; x_gold_1010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_1010/param_idx_1.txt" ) ;
            int y_gold_1010; y_gold_1010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_1010/param_idx_2.txt" ) ;
            Object output_2_1010 = f_gold(n_gold_1010, x_gold_1010, y_gold_1010);
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
            int n_full_3010; n_full_3010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3010/param_idx_0.txt" ) ;
            int x_full_3010; x_full_3010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3010/param_idx_1.txt" ) ;
            int y_full_3010; y_full_3010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3010/param_idx_2.txt" ) ;
            Object output_1_3010 = F_FULL(n_full_3010, x_full_3010, y_full_3010);
            int n_gold_3010; n_gold_3010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3010/param_idx_0.txt" ) ;
            int x_gold_3010; x_gold_3010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3010/param_idx_1.txt" ) ;
            int y_gold_3010; y_gold_3010 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3010/param_idx_2.txt" ) ;
            Object output_2_3010 = f_gold(n_gold_3010, x_gold_3010, y_gold_3010);
            if (areEquivalent(output_1_3010, output_2_3010)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3010 output1=" +
                                   serializeObj(output_1_3010) +
                                   " output2=" + serializeObj(output_2_3010));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3010 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4021; n_full_4021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4021/param_idx_0.txt" ) ;
            int x_full_4021; x_full_4021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4021/param_idx_1.txt" ) ;
            int y_full_4021; y_full_4021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4021/param_idx_2.txt" ) ;
            Object output_1_4021 = F_FULL(n_full_4021, x_full_4021, y_full_4021);
            int n_gold_4021; n_gold_4021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4021/param_idx_0.txt" ) ;
            int x_gold_4021; x_gold_4021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4021/param_idx_1.txt" ) ;
            int y_gold_4021; y_gold_4021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4021/param_idx_2.txt" ) ;
            Object output_2_4021 = f_gold(n_gold_4021, x_gold_4021, y_gold_4021);
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
            int n_full_3009; n_full_3009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3009/param_idx_0.txt" ) ;
            int x_full_3009; x_full_3009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3009/param_idx_1.txt" ) ;
            int y_full_3009; y_full_3009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3009/param_idx_2.txt" ) ;
            Object output_1_3009 = F_FULL(n_full_3009, x_full_3009, y_full_3009);
            int n_gold_3009; n_gold_3009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3009/param_idx_0.txt" ) ;
            int x_gold_3009; x_gold_3009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3009/param_idx_1.txt" ) ;
            int y_gold_3009; y_gold_3009 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3009/param_idx_2.txt" ) ;
            Object output_2_3009 = f_gold(n_gold_3009, x_gold_3009, y_gold_3009);
            if (areEquivalent(output_1_3009, output_2_3009)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3009 output1=" +
                                   serializeObj(output_1_3009) +
                                   " output2=" + serializeObj(output_2_3009));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3009 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4008; n_full_4008 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4008/param_idx_0.txt" ) ;
            int x_full_4008; x_full_4008 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4008/param_idx_1.txt" ) ;
            int y_full_4008; y_full_4008 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4008/param_idx_2.txt" ) ;
            Object output_1_4008 = F_FULL(n_full_4008, x_full_4008, y_full_4008);
            int n_gold_4008; n_gold_4008 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4008/param_idx_0.txt" ) ;
            int x_gold_4008; x_gold_4008 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4008/param_idx_1.txt" ) ;
            int y_gold_4008; y_gold_4008 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_4008/param_idx_2.txt" ) ;
            Object output_2_4008 = f_gold(n_gold_4008, x_gold_4008, y_gold_4008);
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
            int n_full_2016; n_full_2016 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_2016/param_idx_0.txt" ) ;
            int x_full_2016; x_full_2016 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_2016/param_idx_1.txt" ) ;
            int y_full_2016; y_full_2016 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_2016/param_idx_2.txt" ) ;
            Object output_1_2016 = F_FULL(n_full_2016, x_full_2016, y_full_2016);
            int n_gold_2016; n_gold_2016 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_2016/param_idx_0.txt" ) ;
            int x_gold_2016; x_gold_2016 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_2016/param_idx_1.txt" ) ;
            int y_gold_2016; y_gold_2016 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_2016/param_idx_2.txt" ) ;
            Object output_2_2016 = f_gold(n_gold_2016, x_gold_2016, y_gold_2016);
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
            int n_full_3021; n_full_3021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3021/param_idx_0.txt" ) ;
            int x_full_3021; x_full_3021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3021/param_idx_1.txt" ) ;
            int y_full_3021; y_full_3021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3021/param_idx_2.txt" ) ;
            Object output_1_3021 = F_FULL(n_full_3021, x_full_3021, y_full_3021);
            int n_gold_3021; n_gold_3021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3021/param_idx_0.txt" ) ;
            int x_gold_3021; x_gold_3021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3021/param_idx_1.txt" ) ;
            int y_gold_3021; y_gold_3021 = readInt ( "../COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS/test_3021/param_idx_2.txt" ) ;
            Object output_2_3021 = f_gold(n_gold_3021, x_gold_3021, y_gold_3021);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
