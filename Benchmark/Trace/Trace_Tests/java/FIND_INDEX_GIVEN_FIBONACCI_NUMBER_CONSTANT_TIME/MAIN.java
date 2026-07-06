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
  if ( n <= 1 ) return n ;
  int a = 0 , b = 1 , c = 1 ;
  int res = 1 ;
  while ( c < n ) {
    c = a + b ;
    res ++ ;
    a = b ;
    b = c ;
  }
  return res ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_19; n_full_19 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_19/param_idx_0.txt" ) ;
            Object output_1_19 = F_FULL(n_full_19);
            int n_gold_19; n_gold_19 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_19/param_idx_0.txt" ) ;
            Object output_2_19 = f_gold(n_gold_19);
            if (areEquivalent(output_1_19, output_2_19)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=19 output1=" +
                                   serializeObj(output_1_19) +
                                   " output2=" + serializeObj(output_2_19));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=19 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2002; n_full_2002 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_2002/param_idx_0.txt" ) ;
            Object output_1_2002 = F_FULL(n_full_2002);
            int n_gold_2002; n_gold_2002 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_2002/param_idx_0.txt" ) ;
            Object output_2_2002 = f_gold(n_gold_2002);
            if (areEquivalent(output_1_2002, output_2_2002)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2002 output1=" +
                                   serializeObj(output_1_2002) +
                                   " output2=" + serializeObj(output_2_2002));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4007; n_full_4007 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_4007/param_idx_0.txt" ) ;
            Object output_1_4007 = F_FULL(n_full_4007);
            int n_gold_4007; n_gold_4007 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_4007/param_idx_0.txt" ) ;
            Object output_2_4007 = f_gold(n_gold_4007);
            if (areEquivalent(output_1_4007, output_2_4007)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4007 output1=" +
                                   serializeObj(output_1_4007) +
                                   " output2=" + serializeObj(output_2_4007));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4007 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1014; n_full_1014 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_1014/param_idx_0.txt" ) ;
            Object output_1_1014 = F_FULL(n_full_1014);
            int n_gold_1014; n_gold_1014 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_1014/param_idx_0.txt" ) ;
            Object output_2_1014 = f_gold(n_gold_1014);
            if (areEquivalent(output_1_1014, output_2_1014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1014 output1=" +
                                   serializeObj(output_1_1014) +
                                   " output2=" + serializeObj(output_2_1014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1; n_full_1 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_1/param_idx_0.txt" ) ;
            Object output_1_1 = F_FULL(n_full_1);
            int n_gold_1; n_gold_1 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_1/param_idx_0.txt" ) ;
            Object output_2_1 = f_gold(n_gold_1);
            if (areEquivalent(output_1_1, output_2_1)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1 output1=" +
                                   serializeObj(output_1_1) +
                                   " output2=" + serializeObj(output_2_1));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3002; n_full_3002 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_3002/param_idx_0.txt" ) ;
            Object output_1_3002 = F_FULL(n_full_3002);
            int n_gold_3002; n_gold_3002 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_3002/param_idx_0.txt" ) ;
            Object output_2_3002 = f_gold(n_gold_3002);
            if (areEquivalent(output_1_3002, output_2_3002)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3002 output1=" +
                                   serializeObj(output_1_3002) +
                                   " output2=" + serializeObj(output_2_3002));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3014; n_full_3014 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_3014/param_idx_0.txt" ) ;
            Object output_1_3014 = F_FULL(n_full_3014);
            int n_gold_3014; n_gold_3014 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_3014/param_idx_0.txt" ) ;
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
            int n_full_0; n_full_0 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_0/param_idx_0.txt" ) ;
            Object output_1_0 = F_FULL(n_full_0);
            int n_gold_0; n_gold_0 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_0/param_idx_0.txt" ) ;
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
            int n_full_8; n_full_8 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_8/param_idx_0.txt" ) ;
            Object output_1_8 = F_FULL(n_full_8);
            int n_gold_8; n_gold_8 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_8/param_idx_0.txt" ) ;
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
            int n_full_2015; n_full_2015 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_2015/param_idx_0.txt" ) ;
            Object output_1_2015 = F_FULL(n_full_2015);
            int n_gold_2015; n_gold_2015 = readInt ( "../FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME/test_2015/param_idx_0.txt" ) ;
            Object output_2_2015 = f_gold(n_gold_2015);
            if (areEquivalent(output_1_2015, output_2_2015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2015 output1=" +
                                   serializeObj(output_1_2015) +
                                   " output2=" + serializeObj(output_2_2015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2015 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
