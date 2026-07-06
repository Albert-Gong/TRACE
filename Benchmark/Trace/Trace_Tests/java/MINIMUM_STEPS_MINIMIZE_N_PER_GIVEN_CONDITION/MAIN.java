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
  int table [ ] = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) table [ i ] = n - i ;
  for ( int i = n ;
  i >= 1 ;
  i -- ) {
    if ( ! ( i % 2 > 0 ) ) table [ i / 2 ] = Math . min ( table [ i ] + 1 , table [ i / 2 ] ) ;
    if ( ! ( i % 3 > 0 ) ) table [ i / 3 ] = Math . min ( table [ i ] + 1 , table [ i / 3 ] ) ;
  }
  return table [ 1 ] ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_3006; n_full_3006 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_3006/param_idx_0.txt" ) ;
            Object output_1_3006 = F_FULL(n_full_3006);
            int n_gold_3006; n_gold_3006 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_3006/param_idx_0.txt" ) ;
            Object output_2_3006 = f_gold(n_gold_3006);
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
            int n_full_4003; n_full_4003 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_4003/param_idx_0.txt" ) ;
            Object output_1_4003 = F_FULL(n_full_4003);
            int n_gold_4003; n_gold_4003 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_4003/param_idx_0.txt" ) ;
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
            int n_full_4004; n_full_4004 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_4004/param_idx_0.txt" ) ;
            Object output_1_4004 = F_FULL(n_full_4004);
            int n_gold_4004; n_gold_4004 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_4004/param_idx_0.txt" ) ;
            Object output_2_4004 = f_gold(n_gold_4004);
            if (areEquivalent(output_1_4004, output_2_4004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4004 output1=" +
                                   serializeObj(output_1_4004) +
                                   " output2=" + serializeObj(output_2_4004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1000; n_full_1000 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_1000/param_idx_0.txt" ) ;
            Object output_1_1000 = F_FULL(n_full_1000);
            int n_gold_1000; n_gold_1000 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_1000/param_idx_0.txt" ) ;
            Object output_2_1000 = f_gold(n_gold_1000);
            if (areEquivalent(output_1_1000, output_2_1000)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1000 output1=" +
                                   serializeObj(output_1_1000) +
                                   " output2=" + serializeObj(output_2_1000));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3004; n_full_3004 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_3004/param_idx_0.txt" ) ;
            Object output_1_3004 = F_FULL(n_full_3004);
            int n_gold_3004; n_gold_3004 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_3004/param_idx_0.txt" ) ;
            Object output_2_3004 = f_gold(n_gold_3004);
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
            int n_full_4; n_full_4 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_4/param_idx_0.txt" ) ;
            Object output_1_4 = F_FULL(n_full_4);
            int n_gold_4; n_gold_4 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_4/param_idx_0.txt" ) ;
            Object output_2_4 = f_gold(n_gold_4);
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
            int n_full_11; n_full_11 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_11/param_idx_0.txt" ) ;
            Object output_1_11 = F_FULL(n_full_11);
            int n_gold_11; n_gold_11 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_11/param_idx_0.txt" ) ;
            Object output_2_11 = f_gold(n_gold_11);
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
            int n_full_3001; n_full_3001 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_3001/param_idx_0.txt" ) ;
            Object output_1_3001 = F_FULL(n_full_3001);
            int n_gold_3001; n_gold_3001 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_3001/param_idx_0.txt" ) ;
            Object output_2_3001 = f_gold(n_gold_3001);
            if (areEquivalent(output_1_3001, output_2_3001)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3001 output1=" +
                                   serializeObj(output_1_3001) +
                                   " output2=" + serializeObj(output_2_3001));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3001 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3005; n_full_3005 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_3005/param_idx_0.txt" ) ;
            Object output_1_3005 = F_FULL(n_full_3005);
            int n_gold_3005; n_gold_3005 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_3005/param_idx_0.txt" ) ;
            Object output_2_3005 = f_gold(n_gold_3005);
            if (areEquivalent(output_1_3005, output_2_3005)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3005 output1=" +
                                   serializeObj(output_1_3005) +
                                   " output2=" + serializeObj(output_2_3005));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3005 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2005; n_full_2005 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_2005/param_idx_0.txt" ) ;
            Object output_1_2005 = F_FULL(n_full_2005);
            int n_gold_2005; n_gold_2005 = readInt ( "../MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION/test_2005/param_idx_0.txt" ) ;
            Object output_2_2005 = f_gold(n_gold_2005);
            if (areEquivalent(output_1_2005, output_2_2005)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2005 output1=" +
                                   serializeObj(output_1_2005) +
                                   " output2=" + serializeObj(output_2_2005));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2005 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
