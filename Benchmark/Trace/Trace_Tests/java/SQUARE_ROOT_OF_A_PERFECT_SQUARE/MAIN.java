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
static float f_gold ( float n ) {
  float x = n ;
  float y = 1 ;
  double e = 0.000001 ;
  while ( x - y > e ) {
    x = ( x + y ) / 2 ;
    y = n / x ;
  }
  return x ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            float n_full_4003; n_full_4003 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_4003/param_idx_0.txt" ) ;
            Object output_1_4003 = F_FULL(n_full_4003);
            float n_gold_4003; n_gold_4003 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_4003/param_idx_0.txt" ) ;
            Object output_2_4003 = f_gold(n_gold_4003);
            if (areEquivalent(output_1_4003, output_2_4003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4003 output1=" +
                                   serializeObj(output_1_4003) +
                                   " output2=" + serializeObj(output_2_4003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float n_full_4010; n_full_4010 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_4010/param_idx_0.txt" ) ;
            Object output_1_4010 = F_FULL(n_full_4010);
            float n_gold_4010; n_gold_4010 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_4010/param_idx_0.txt" ) ;
            Object output_2_4010 = f_gold(n_gold_4010);
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
            float n_full_12; n_full_12 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_12/param_idx_0.txt" ) ;
            Object output_1_12 = F_FULL(n_full_12);
            float n_gold_12; n_gold_12 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_12/param_idx_0.txt" ) ;
            Object output_2_12 = f_gold(n_gold_12);
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
            float n_full_20; n_full_20 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_20/param_idx_0.txt" ) ;
            Object output_1_20 = F_FULL(n_full_20);
            float n_gold_20; n_gold_20 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_20/param_idx_0.txt" ) ;
            Object output_2_20 = f_gold(n_gold_20);
            if (areEquivalent(output_1_20, output_2_20)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=20 output1=" +
                                   serializeObj(output_1_20) +
                                   " output2=" + serializeObj(output_2_20));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=20 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float n_full_14; n_full_14 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_14/param_idx_0.txt" ) ;
            Object output_1_14 = F_FULL(n_full_14);
            float n_gold_14; n_gold_14 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_14/param_idx_0.txt" ) ;
            Object output_2_14 = f_gold(n_gold_14);
            if (areEquivalent(output_1_14, output_2_14)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=14 output1=" +
                                   serializeObj(output_1_14) +
                                   " output2=" + serializeObj(output_2_14));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=14 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float n_full_4006; n_full_4006 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_4006/param_idx_0.txt" ) ;
            Object output_1_4006 = F_FULL(n_full_4006);
            float n_gold_4006; n_gold_4006 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_4006/param_idx_0.txt" ) ;
            Object output_2_4006 = f_gold(n_gold_4006);
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
            float n_full_0; n_full_0 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_0/param_idx_0.txt" ) ;
            Object output_1_0 = F_FULL(n_full_0);
            float n_gold_0; n_gold_0 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_0/param_idx_0.txt" ) ;
            Object output_2_0 = f_gold(n_gold_0);
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
            float n_full_5; n_full_5 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_5/param_idx_0.txt" ) ;
            Object output_1_5 = F_FULL(n_full_5);
            float n_gold_5; n_gold_5 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_5/param_idx_0.txt" ) ;
            Object output_2_5 = f_gold(n_gold_5);
            if (areEquivalent(output_1_5, output_2_5)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=5 output1=" +
                                   serializeObj(output_1_5) +
                                   " output2=" + serializeObj(output_2_5));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=5 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float n_full_25; n_full_25 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_25/param_idx_0.txt" ) ;
            Object output_1_25 = F_FULL(n_full_25);
            float n_gold_25; n_gold_25 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_25/param_idx_0.txt" ) ;
            Object output_2_25 = f_gold(n_gold_25);
            if (areEquivalent(output_1_25, output_2_25)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=25 output1=" +
                                   serializeObj(output_1_25) +
                                   " output2=" + serializeObj(output_2_25));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=25 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            float n_full_4009; n_full_4009 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_4009/param_idx_0.txt" ) ;
            Object output_1_4009 = F_FULL(n_full_4009);
            float n_gold_4009; n_gold_4009 = readFloat ( "../SQUARE_ROOT_OF_A_PERFECT_SQUARE/test_4009/param_idx_0.txt" ) ;
            Object output_2_4009 = f_gold(n_gold_4009);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
