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
static boolean f_gold ( int num ) {
  if ( num < 0 ) return f_gold ( - num ) ;
  if ( num == 0 || num == 7 ) return true ;
  if ( num < 10 ) return false ;
  return f_gold ( num / 10 - 2 * ( num - num / 10 * 10 ) ) ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int num_full_4008; num_full_4008 = readInt ( "../DIVISIBILITY_BY_7/test_4008/param_idx_0.txt" ) ;
            Object output_1_4008 = F_FULL(num_full_4008);
            int num_gold_4008; num_gold_4008 = readInt ( "../DIVISIBILITY_BY_7/test_4008/param_idx_0.txt" ) ;
            Object output_2_4008 = f_gold(num_gold_4008);
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
            int num_full_3; num_full_3 = readInt ( "../DIVISIBILITY_BY_7/test_3/param_idx_0.txt" ) ;
            Object output_1_3 = F_FULL(num_full_3);
            int num_gold_3; num_gold_3 = readInt ( "../DIVISIBILITY_BY_7/test_3/param_idx_0.txt" ) ;
            Object output_2_3 = f_gold(num_gold_3);
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
            int num_full_1011; num_full_1011 = readInt ( "../DIVISIBILITY_BY_7/test_1011/param_idx_0.txt" ) ;
            Object output_1_1011 = F_FULL(num_full_1011);
            int num_gold_1011; num_gold_1011 = readInt ( "../DIVISIBILITY_BY_7/test_1011/param_idx_0.txt" ) ;
            Object output_2_1011 = f_gold(num_gold_1011);
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
            int num_full_17; num_full_17 = readInt ( "../DIVISIBILITY_BY_7/test_17/param_idx_0.txt" ) ;
            Object output_1_17 = F_FULL(num_full_17);
            int num_gold_17; num_gold_17 = readInt ( "../DIVISIBILITY_BY_7/test_17/param_idx_0.txt" ) ;
            Object output_2_17 = f_gold(num_gold_17);
            if (areEquivalent(output_1_17, output_2_17)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=17 output1=" +
                                   serializeObj(output_1_17) +
                                   " output2=" + serializeObj(output_2_17));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=17 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_2011; num_full_2011 = readInt ( "../DIVISIBILITY_BY_7/test_2011/param_idx_0.txt" ) ;
            Object output_1_2011 = F_FULL(num_full_2011);
            int num_gold_2011; num_gold_2011 = readInt ( "../DIVISIBILITY_BY_7/test_2011/param_idx_0.txt" ) ;
            Object output_2_2011 = f_gold(num_gold_2011);
            if (areEquivalent(output_1_2011, output_2_2011)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2011 output1=" +
                                   serializeObj(output_1_2011) +
                                   " output2=" + serializeObj(output_2_2011));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2011 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_1002; num_full_1002 = readInt ( "../DIVISIBILITY_BY_7/test_1002/param_idx_0.txt" ) ;
            Object output_1_1002 = F_FULL(num_full_1002);
            int num_gold_1002; num_gold_1002 = readInt ( "../DIVISIBILITY_BY_7/test_1002/param_idx_0.txt" ) ;
            Object output_2_1002 = f_gold(num_gold_1002);
            if (areEquivalent(output_1_1002, output_2_1002)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1002 output1=" +
                                   serializeObj(output_1_1002) +
                                   " output2=" + serializeObj(output_2_1002));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_6; num_full_6 = readInt ( "../DIVISIBILITY_BY_7/test_6/param_idx_0.txt" ) ;
            Object output_1_6 = F_FULL(num_full_6);
            int num_gold_6; num_gold_6 = readInt ( "../DIVISIBILITY_BY_7/test_6/param_idx_0.txt" ) ;
            Object output_2_6 = f_gold(num_gold_6);
            if (areEquivalent(output_1_6, output_2_6)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=6 output1=" +
                                   serializeObj(output_1_6) +
                                   " output2=" + serializeObj(output_2_6));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=6 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_2010; num_full_2010 = readInt ( "../DIVISIBILITY_BY_7/test_2010/param_idx_0.txt" ) ;
            Object output_1_2010 = F_FULL(num_full_2010);
            int num_gold_2010; num_gold_2010 = readInt ( "../DIVISIBILITY_BY_7/test_2010/param_idx_0.txt" ) ;
            Object output_2_2010 = f_gold(num_gold_2010);
            if (areEquivalent(output_1_2010, output_2_2010)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2010 output1=" +
                                   serializeObj(output_1_2010) +
                                   " output2=" + serializeObj(output_2_2010));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2010 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_27; num_full_27 = readInt ( "../DIVISIBILITY_BY_7/test_27/param_idx_0.txt" ) ;
            Object output_1_27 = F_FULL(num_full_27);
            int num_gold_27; num_gold_27 = readInt ( "../DIVISIBILITY_BY_7/test_27/param_idx_0.txt" ) ;
            Object output_2_27 = f_gold(num_gold_27);
            if (areEquivalent(output_1_27, output_2_27)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=27 output1=" +
                                   serializeObj(output_1_27) +
                                   " output2=" + serializeObj(output_2_27));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=27 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_4005; num_full_4005 = readInt ( "../DIVISIBILITY_BY_7/test_4005/param_idx_0.txt" ) ;
            Object output_1_4005 = F_FULL(num_full_4005);
            int num_gold_4005; num_gold_4005 = readInt ( "../DIVISIBILITY_BY_7/test_4005/param_idx_0.txt" ) ;
            Object output_2_4005 = f_gold(num_gold_4005);
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
