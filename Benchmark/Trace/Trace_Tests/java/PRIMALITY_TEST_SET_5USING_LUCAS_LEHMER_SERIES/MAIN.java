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
static boolean f_gold ( int p ) {
  Long checkNumber = (long) Math . pow ( 2 , p ) - 1 ;
  Long nextval = 4 % checkNumber ;
  for ( int i = 1 ;
  i < p - 1 ;
  i ++ ) nextval = ( nextval * nextval - 2 ) % checkNumber ;
  return ( nextval == 0 ) ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int p_full_4008; p_full_4008 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4008/param_idx_0.txt" ) ;
            Object output_1_4008 = F_FULL(p_full_4008);
            int p_gold_4008; p_gold_4008 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4008/param_idx_0.txt" ) ;
            Object output_2_4008 = f_gold(p_gold_4008);
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
            int p_full_4006; p_full_4006 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4006/param_idx_0.txt" ) ;
            Object output_1_4006 = F_FULL(p_full_4006);
            int p_gold_4006; p_gold_4006 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4006/param_idx_0.txt" ) ;
            Object output_2_4006 = f_gold(p_gold_4006);
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
            int p_full_4016; p_full_4016 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4016/param_idx_0.txt" ) ;
            Object output_1_4016 = F_FULL(p_full_4016);
            int p_gold_4016; p_gold_4016 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4016/param_idx_0.txt" ) ;
            Object output_2_4016 = f_gold(p_gold_4016);
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
            int p_full_3011; p_full_3011 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_3011/param_idx_0.txt" ) ;
            Object output_1_3011 = F_FULL(p_full_3011);
            int p_gold_3011; p_gold_3011 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_3011/param_idx_0.txt" ) ;
            Object output_2_3011 = f_gold(p_gold_3011);
            if (areEquivalent(output_1_3011, output_2_3011)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3011 output1=" +
                                   serializeObj(output_1_3011) +
                                   " output2=" + serializeObj(output_2_3011));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3011 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int p_full_11; p_full_11 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_11/param_idx_0.txt" ) ;
            Object output_1_11 = F_FULL(p_full_11);
            int p_gold_11; p_gold_11 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_11/param_idx_0.txt" ) ;
            Object output_2_11 = f_gold(p_gold_11);
            if (areEquivalent(output_1_11, output_2_11)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=11 output1=" +
                                   serializeObj(output_1_11) +
                                   " output2=" + serializeObj(output_2_11));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=11 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int p_full_0; p_full_0 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_0/param_idx_0.txt" ) ;
            Object output_1_0 = F_FULL(p_full_0);
            int p_gold_0; p_gold_0 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_0/param_idx_0.txt" ) ;
            Object output_2_0 = f_gold(p_gold_0);
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
            int p_full_4010; p_full_4010 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4010/param_idx_0.txt" ) ;
            Object output_1_4010 = F_FULL(p_full_4010);
            int p_gold_4010; p_gold_4010 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4010/param_idx_0.txt" ) ;
            Object output_2_4010 = f_gold(p_gold_4010);
            if (areEquivalent(output_1_4010, output_2_4010)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4010 output1=" +
                                   serializeObj(output_1_4010) +
                                   " output2=" + serializeObj(output_2_4010));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4010 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int p_full_6; p_full_6 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_6/param_idx_0.txt" ) ;
            Object output_1_6 = F_FULL(p_full_6);
            int p_gold_6; p_gold_6 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_6/param_idx_0.txt" ) ;
            Object output_2_6 = f_gold(p_gold_6);
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
            int p_full_4009; p_full_4009 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4009/param_idx_0.txt" ) ;
            Object output_1_4009 = F_FULL(p_full_4009);
            int p_gold_4009; p_gold_4009 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_4009/param_idx_0.txt" ) ;
            Object output_2_4009 = f_gold(p_gold_4009);
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
            int p_full_7; p_full_7 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_7/param_idx_0.txt" ) ;
            Object output_1_7 = F_FULL(p_full_7);
            int p_gold_7; p_gold_7 = readInt ( "../PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES/test_7/param_idx_0.txt" ) ;
            Object output_2_7 = f_gold(p_gold_7);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
