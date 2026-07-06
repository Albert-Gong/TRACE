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
static int f_gold ( int s ) {
  int sum = 0 ;
  for ( int n = 1 ;
  sum < s ;
  n ++ ) {
    sum += n * n * n ;
    if ( sum == s ) return n ;
  }
  return - 1 ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int s_full_10; s_full_10 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_10/param_idx_0.txt" ) ;
            Object output_1_10 = F_FULL(s_full_10);
            int s_gold_10; s_gold_10 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_10/param_idx_0.txt" ) ;
            Object output_2_10 = f_gold(s_gold_10);
            if (areEquivalent(output_1_10, output_2_10)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=10 output1=" +
                                   serializeObj(output_1_10) +
                                   " output2=" + serializeObj(output_2_10));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=10 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int s_full_1006; s_full_1006 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_1006/param_idx_0.txt" ) ;
            Object output_1_1006 = F_FULL(s_full_1006);
            int s_gold_1006; s_gold_1006 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_1006/param_idx_0.txt" ) ;
            Object output_2_1006 = f_gold(s_gold_1006);
            if (areEquivalent(output_1_1006, output_2_1006)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1006 output1=" +
                                   serializeObj(output_1_1006) +
                                   " output2=" + serializeObj(output_2_1006));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1006 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int s_full_2003; s_full_2003 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_2003/param_idx_0.txt" ) ;
            Object output_1_2003 = F_FULL(s_full_2003);
            int s_gold_2003; s_gold_2003 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_2003/param_idx_0.txt" ) ;
            Object output_2_2003 = f_gold(s_gold_2003);
            if (areEquivalent(output_1_2003, output_2_2003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2003 output1=" +
                                   serializeObj(output_1_2003) +
                                   " output2=" + serializeObj(output_2_2003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int s_full_3015; s_full_3015 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_3015/param_idx_0.txt" ) ;
            Object output_1_3015 = F_FULL(s_full_3015);
            int s_gold_3015; s_gold_3015 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_3015/param_idx_0.txt" ) ;
            Object output_2_3015 = f_gold(s_gold_3015);
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
            int s_full_2018; s_full_2018 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_2018/param_idx_0.txt" ) ;
            Object output_1_2018 = F_FULL(s_full_2018);
            int s_gold_2018; s_gold_2018 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_2018/param_idx_0.txt" ) ;
            Object output_2_2018 = f_gold(s_gold_2018);
            if (areEquivalent(output_1_2018, output_2_2018)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2018 output1=" +
                                   serializeObj(output_1_2018) +
                                   " output2=" + serializeObj(output_2_2018));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2018 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int s_full_2006; s_full_2006 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_2006/param_idx_0.txt" ) ;
            Object output_1_2006 = F_FULL(s_full_2006);
            int s_gold_2006; s_gold_2006 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_2006/param_idx_0.txt" ) ;
            Object output_2_2006 = f_gold(s_gold_2006);
            if (areEquivalent(output_1_2006, output_2_2006)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2006 output1=" +
                                   serializeObj(output_1_2006) +
                                   " output2=" + serializeObj(output_2_2006));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2006 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int s_full_2016; s_full_2016 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_2016/param_idx_0.txt" ) ;
            Object output_1_2016 = F_FULL(s_full_2016);
            int s_gold_2016; s_gold_2016 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_2016/param_idx_0.txt" ) ;
            Object output_2_2016 = f_gold(s_gold_2016);
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
            int s_full_3006; s_full_3006 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_3006/param_idx_0.txt" ) ;
            Object output_1_3006 = F_FULL(s_full_3006);
            int s_gold_3006; s_gold_3006 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_3006/param_idx_0.txt" ) ;
            Object output_2_3006 = f_gold(s_gold_3006);
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
            int s_full_0; s_full_0 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_0/param_idx_0.txt" ) ;
            Object output_1_0 = F_FULL(s_full_0);
            int s_gold_0; s_gold_0 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_0/param_idx_0.txt" ) ;
            Object output_2_0 = f_gold(s_gold_0);
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
            int s_full_3014; s_full_3014 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_3014/param_idx_0.txt" ) ;
            Object output_1_3014 = F_FULL(s_full_3014);
            int s_gold_3014; s_gold_3014 = readInt ( "../SQUARED_TRIANGULAR_NUMBER_SUM_CUBES/test_3014/param_idx_0.txt" ) ;
            Object output_2_3014 = f_gold(s_gold_3014);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
