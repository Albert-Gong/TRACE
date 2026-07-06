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
static int f_gold ( int x ) {
  if ( x == 0 || x == 1 ) return x ;
  int i = 1 , result = 1 ;
  while ( result <= x ) {
    i ++ ;
    result = i * i ;
  }
  return i - 1 ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int x_full_2015; x_full_2015 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_2015/param_idx_0.txt" ) ;
            Object output_1_2015 = F_FULL(x_full_2015);
            int x_gold_2015; x_gold_2015 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_2015/param_idx_0.txt" ) ;
            Object output_2_2015 = f_gold(x_gold_2015);
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

        try {
            total_test_case_num++;
            int x_full_1013; x_full_1013 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_1013/param_idx_0.txt" ) ;
            Object output_1_1013 = F_FULL(x_full_1013);
            int x_gold_1013; x_gold_1013 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_1013/param_idx_0.txt" ) ;
            Object output_2_1013 = f_gold(x_gold_1013);
            if (areEquivalent(output_1_1013, output_2_1013)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1013 output1=" +
                                   serializeObj(output_1_1013) +
                                   " output2=" + serializeObj(output_2_1013));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_1008; x_full_1008 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_1008/param_idx_0.txt" ) ;
            Object output_1_1008 = F_FULL(x_full_1008);
            int x_gold_1008; x_gold_1008 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_1008/param_idx_0.txt" ) ;
            Object output_2_1008 = f_gold(x_gold_1008);
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
            int x_full_8; x_full_8 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_8/param_idx_0.txt" ) ;
            Object output_1_8 = F_FULL(x_full_8);
            int x_gold_8; x_gold_8 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_8/param_idx_0.txt" ) ;
            Object output_2_8 = f_gold(x_gold_8);
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
            int x_full_1005; x_full_1005 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_1005/param_idx_0.txt" ) ;
            Object output_1_1005 = F_FULL(x_full_1005);
            int x_gold_1005; x_gold_1005 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_1005/param_idx_0.txt" ) ;
            Object output_2_1005 = f_gold(x_gold_1005);
            if (areEquivalent(output_1_1005, output_2_1005)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1005 output1=" +
                                   serializeObj(output_1_1005) +
                                   " output2=" + serializeObj(output_2_1005));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1005 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_3017; x_full_3017 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_3017/param_idx_0.txt" ) ;
            Object output_1_3017 = F_FULL(x_full_3017);
            int x_gold_3017; x_gold_3017 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_3017/param_idx_0.txt" ) ;
            Object output_2_3017 = f_gold(x_gold_3017);
            if (areEquivalent(output_1_3017, output_2_3017)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3017 output1=" +
                                   serializeObj(output_1_3017) +
                                   " output2=" + serializeObj(output_2_3017));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3017 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_18; x_full_18 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_18/param_idx_0.txt" ) ;
            Object output_1_18 = F_FULL(x_full_18);
            int x_gold_18; x_gold_18 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_18/param_idx_0.txt" ) ;
            Object output_2_18 = f_gold(x_gold_18);
            if (areEquivalent(output_1_18, output_2_18)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=18 output1=" +
                                   serializeObj(output_1_18) +
                                   " output2=" + serializeObj(output_2_18));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=18 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_2002; x_full_2002 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_2002/param_idx_0.txt" ) ;
            Object output_1_2002 = F_FULL(x_full_2002);
            int x_gold_2002; x_gold_2002 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_2002/param_idx_0.txt" ) ;
            Object output_2_2002 = f_gold(x_gold_2002);
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
            int x_full_1002; x_full_1002 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_1002/param_idx_0.txt" ) ;
            Object output_1_1002 = F_FULL(x_full_1002);
            int x_gold_1002; x_gold_1002 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_1002/param_idx_0.txt" ) ;
            Object output_2_1002 = f_gold(x_gold_1002);
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
            int x_full_16; x_full_16 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_16/param_idx_0.txt" ) ;
            Object output_1_16 = F_FULL(x_full_16);
            int x_gold_16; x_gold_16 = readInt ( "../SQUARE_ROOT_OF_AN_INTEGER/test_16/param_idx_0.txt" ) ;
            Object output_2_16 = f_gold(x_gold_16);
            if (areEquivalent(output_1_16, output_2_16)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=16 output1=" +
                                   serializeObj(output_1_16) +
                                   " output2=" + serializeObj(output_2_16));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=16 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
