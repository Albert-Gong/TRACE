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
static int f_gold ( int limit ) {
  if ( limit < 2 ) return 0 ;
  long ef1 = 0 , ef2 = 2 ;
  long sum = ef1 + ef2 ;
  while ( ef2 <= limit ) {
    long ef3 = 4 * ef2 + ef1 ;
    if ( ef3 > limit ) break ;
    ef1 = ef2 ;
    ef2 = ef3 ;
    sum += ef2 ;
  }
  return ( int ) sum ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int limit_full_4; limit_full_4 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_4/param_idx_0.txt" ) ;
            Object output_1_4 = F_FULL(limit_full_4);
            int limit_gold_4; limit_gold_4 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_4/param_idx_0.txt" ) ;
            Object output_2_4 = f_gold(limit_gold_4);
            if (areEquivalent(output_1_4, output_2_4)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4 output1=" +
                                   serializeObj(output_1_4) +
                                   " output2=" + serializeObj(output_2_4));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int limit_full_8; limit_full_8 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_8/param_idx_0.txt" ) ;
            Object output_1_8 = F_FULL(limit_full_8);
            int limit_gold_8; limit_gold_8 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_8/param_idx_0.txt" ) ;
            Object output_2_8 = f_gold(limit_gold_8);
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
            int limit_full_2000; limit_full_2000 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_2000/param_idx_0.txt" ) ;
            Object output_1_2000 = F_FULL(limit_full_2000);
            int limit_gold_2000; limit_gold_2000 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_2000/param_idx_0.txt" ) ;
            Object output_2_2000 = f_gold(limit_gold_2000);
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
            int limit_full_2026; limit_full_2026 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_2026/param_idx_0.txt" ) ;
            Object output_1_2026 = F_FULL(limit_full_2026);
            int limit_gold_2026; limit_gold_2026 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_2026/param_idx_0.txt" ) ;
            Object output_2_2026 = f_gold(limit_gold_2026);
            if (areEquivalent(output_1_2026, output_2_2026)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2026 output1=" +
                                   serializeObj(output_1_2026) +
                                   " output2=" + serializeObj(output_2_2026));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2026 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int limit_full_1008; limit_full_1008 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_1008/param_idx_0.txt" ) ;
            Object output_1_1008 = F_FULL(limit_full_1008);
            int limit_gold_1008; limit_gold_1008 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_1008/param_idx_0.txt" ) ;
            Object output_2_1008 = f_gold(limit_gold_1008);
            if (areEquivalent(output_1_1008, output_2_1008)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1008 output1=" +
                                   serializeObj(output_1_1008) +
                                   " output2=" + serializeObj(output_2_1008));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1008 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int limit_full_4010; limit_full_4010 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_4010/param_idx_0.txt" ) ;
            Object output_1_4010 = F_FULL(limit_full_4010);
            int limit_gold_4010; limit_gold_4010 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_4010/param_idx_0.txt" ) ;
            Object output_2_4010 = f_gold(limit_gold_4010);
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
            int limit_full_2022; limit_full_2022 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_2022/param_idx_0.txt" ) ;
            Object output_1_2022 = F_FULL(limit_full_2022);
            int limit_gold_2022; limit_gold_2022 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_2022/param_idx_0.txt" ) ;
            Object output_2_2022 = f_gold(limit_gold_2022);
            if (areEquivalent(output_1_2022, output_2_2022)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2022 output1=" +
                                   serializeObj(output_1_2022) +
                                   " output2=" + serializeObj(output_2_2022));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2022 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int limit_full_1021; limit_full_1021 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_1021/param_idx_0.txt" ) ;
            Object output_1_1021 = F_FULL(limit_full_1021);
            int limit_gold_1021; limit_gold_1021 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_1021/param_idx_0.txt" ) ;
            Object output_2_1021 = f_gold(limit_gold_1021);
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
            int limit_full_3015; limit_full_3015 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_3015/param_idx_0.txt" ) ;
            Object output_1_3015 = F_FULL(limit_full_3015);
            int limit_gold_3015; limit_gold_3015 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_3015/param_idx_0.txt" ) ;
            Object output_2_3015 = f_gold(limit_gold_3015);
            if (areEquivalent(output_1_3015, output_2_3015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3015 output1=" +
                                   serializeObj(output_1_3015) +
                                   " output2=" + serializeObj(output_2_3015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3015 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int limit_full_1023; limit_full_1023 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_1023/param_idx_0.txt" ) ;
            Object output_1_1023 = F_FULL(limit_full_1023);
            int limit_gold_1023; limit_gold_1023 = readInt ( "../EVEN_FIBONACCI_NUMBERS_SUM/test_1023/param_idx_0.txt" ) ;
            Object output_2_1023 = f_gold(limit_gold_1023);
            if (areEquivalent(output_1_1023, output_2_1023)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1023 output1=" +
                                   serializeObj(output_1_1023) +
                                   " output2=" + serializeObj(output_2_1023));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1023 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
