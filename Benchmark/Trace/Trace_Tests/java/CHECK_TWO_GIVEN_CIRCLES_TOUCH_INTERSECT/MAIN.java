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
static int f_gold ( int x1 , int y1 , int x2 , int y2 , int r1 , int r2 ) {
  int distSq = ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) ;
  int radSumSq = ( r1 + r2 ) * ( r1 + r2 ) ;
  if ( distSq == radSumSq ) return 1 ;
  else if ( distSq > radSumSq ) return - 1 ;
  else return 0 ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int x1_full_2000; x1_full_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_0.txt" ) ;
            int y1_full_2000; y1_full_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_1.txt" ) ;
            int x2_full_2000; x2_full_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_2.txt" ) ;
            int y2_full_2000; y2_full_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_3.txt" ) ;
            int r1_full_2000; r1_full_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_4.txt" ) ;
            int r2_full_2000; r2_full_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_5.txt" ) ;
            Object output_1_2000 = F_FULL(x1_full_2000, y1_full_2000, x2_full_2000, y2_full_2000, r1_full_2000, r2_full_2000);
            int x1_gold_2000; x1_gold_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_0.txt" ) ;
            int y1_gold_2000; y1_gold_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_1.txt" ) ;
            int x2_gold_2000; x2_gold_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_2.txt" ) ;
            int y2_gold_2000; y2_gold_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_3.txt" ) ;
            int r1_gold_2000; r1_gold_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_4.txt" ) ;
            int r2_gold_2000; r2_gold_2000 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2000/param_idx_5.txt" ) ;
            Object output_2_2000 = f_gold(x1_gold_2000, y1_gold_2000, x2_gold_2000, y2_gold_2000, r1_gold_2000, r2_gold_2000);
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
            int x1_full_2001; x1_full_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_0.txt" ) ;
            int y1_full_2001; y1_full_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_1.txt" ) ;
            int x2_full_2001; x2_full_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_2.txt" ) ;
            int y2_full_2001; y2_full_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_3.txt" ) ;
            int r1_full_2001; r1_full_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_4.txt" ) ;
            int r2_full_2001; r2_full_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_5.txt" ) ;
            Object output_1_2001 = F_FULL(x1_full_2001, y1_full_2001, x2_full_2001, y2_full_2001, r1_full_2001, r2_full_2001);
            int x1_gold_2001; x1_gold_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_0.txt" ) ;
            int y1_gold_2001; y1_gold_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_1.txt" ) ;
            int x2_gold_2001; x2_gold_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_2.txt" ) ;
            int y2_gold_2001; y2_gold_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_3.txt" ) ;
            int r1_gold_2001; r1_gold_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_4.txt" ) ;
            int r2_gold_2001; r2_gold_2001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_2001/param_idx_5.txt" ) ;
            Object output_2_2001 = f_gold(x1_gold_2001, y1_gold_2001, x2_gold_2001, y2_gold_2001, r1_gold_2001, r2_gold_2001);
            if (areEquivalent(output_1_2001, output_2_2001)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2001 output1=" +
                                   serializeObj(output_1_2001) +
                                   " output2=" + serializeObj(output_2_2001));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2001 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x1_full_13; x1_full_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_0.txt" ) ;
            int y1_full_13; y1_full_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_1.txt" ) ;
            int x2_full_13; x2_full_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_2.txt" ) ;
            int y2_full_13; y2_full_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_3.txt" ) ;
            int r1_full_13; r1_full_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_4.txt" ) ;
            int r2_full_13; r2_full_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_5.txt" ) ;
            Object output_1_13 = F_FULL(x1_full_13, y1_full_13, x2_full_13, y2_full_13, r1_full_13, r2_full_13);
            int x1_gold_13; x1_gold_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_0.txt" ) ;
            int y1_gold_13; y1_gold_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_1.txt" ) ;
            int x2_gold_13; x2_gold_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_2.txt" ) ;
            int y2_gold_13; y2_gold_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_3.txt" ) ;
            int r1_gold_13; r1_gold_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_4.txt" ) ;
            int r2_gold_13; r2_gold_13 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_13/param_idx_5.txt" ) ;
            Object output_2_13 = f_gold(x1_gold_13, y1_gold_13, x2_gold_13, y2_gold_13, r1_gold_13, r2_gold_13);
            if (areEquivalent(output_1_13, output_2_13)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=13 output1=" +
                                   serializeObj(output_1_13) +
                                   " output2=" + serializeObj(output_2_13));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=13 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x1_full_3015; x1_full_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_0.txt" ) ;
            int y1_full_3015; y1_full_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_1.txt" ) ;
            int x2_full_3015; x2_full_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_2.txt" ) ;
            int y2_full_3015; y2_full_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_3.txt" ) ;
            int r1_full_3015; r1_full_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_4.txt" ) ;
            int r2_full_3015; r2_full_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_5.txt" ) ;
            Object output_1_3015 = F_FULL(x1_full_3015, y1_full_3015, x2_full_3015, y2_full_3015, r1_full_3015, r2_full_3015);
            int x1_gold_3015; x1_gold_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_0.txt" ) ;
            int y1_gold_3015; y1_gold_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_1.txt" ) ;
            int x2_gold_3015; x2_gold_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_2.txt" ) ;
            int y2_gold_3015; y2_gold_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_3.txt" ) ;
            int r1_gold_3015; r1_gold_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_4.txt" ) ;
            int r2_gold_3015; r2_gold_3015 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3015/param_idx_5.txt" ) ;
            Object output_2_3015 = f_gold(x1_gold_3015, y1_gold_3015, x2_gold_3015, y2_gold_3015, r1_gold_3015, r2_gold_3015);
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
            int x1_full_4011; x1_full_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_0.txt" ) ;
            int y1_full_4011; y1_full_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_1.txt" ) ;
            int x2_full_4011; x2_full_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_2.txt" ) ;
            int y2_full_4011; y2_full_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_3.txt" ) ;
            int r1_full_4011; r1_full_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_4.txt" ) ;
            int r2_full_4011; r2_full_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_5.txt" ) ;
            Object output_1_4011 = F_FULL(x1_full_4011, y1_full_4011, x2_full_4011, y2_full_4011, r1_full_4011, r2_full_4011);
            int x1_gold_4011; x1_gold_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_0.txt" ) ;
            int y1_gold_4011; y1_gold_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_1.txt" ) ;
            int x2_gold_4011; x2_gold_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_2.txt" ) ;
            int y2_gold_4011; y2_gold_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_3.txt" ) ;
            int r1_gold_4011; r1_gold_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_4.txt" ) ;
            int r2_gold_4011; r2_gold_4011 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4011/param_idx_5.txt" ) ;
            Object output_2_4011 = f_gold(x1_gold_4011, y1_gold_4011, x2_gold_4011, y2_gold_4011, r1_gold_4011, r2_gold_4011);
            if (areEquivalent(output_1_4011, output_2_4011)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4011 output1=" +
                                   serializeObj(output_1_4011) +
                                   " output2=" + serializeObj(output_2_4011));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4011 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x1_full_1017; x1_full_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_0.txt" ) ;
            int y1_full_1017; y1_full_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_1.txt" ) ;
            int x2_full_1017; x2_full_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_2.txt" ) ;
            int y2_full_1017; y2_full_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_3.txt" ) ;
            int r1_full_1017; r1_full_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_4.txt" ) ;
            int r2_full_1017; r2_full_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_5.txt" ) ;
            Object output_1_1017 = F_FULL(x1_full_1017, y1_full_1017, x2_full_1017, y2_full_1017, r1_full_1017, r2_full_1017);
            int x1_gold_1017; x1_gold_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_0.txt" ) ;
            int y1_gold_1017; y1_gold_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_1.txt" ) ;
            int x2_gold_1017; x2_gold_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_2.txt" ) ;
            int y2_gold_1017; y2_gold_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_3.txt" ) ;
            int r1_gold_1017; r1_gold_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_4.txt" ) ;
            int r2_gold_1017; r2_gold_1017 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_1017/param_idx_5.txt" ) ;
            Object output_2_1017 = f_gold(x1_gold_1017, y1_gold_1017, x2_gold_1017, y2_gold_1017, r1_gold_1017, r2_gold_1017);
            if (areEquivalent(output_1_1017, output_2_1017)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1017 output1=" +
                                   serializeObj(output_1_1017) +
                                   " output2=" + serializeObj(output_2_1017));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1017 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x1_full_16; x1_full_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_0.txt" ) ;
            int y1_full_16; y1_full_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_1.txt" ) ;
            int x2_full_16; x2_full_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_2.txt" ) ;
            int y2_full_16; y2_full_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_3.txt" ) ;
            int r1_full_16; r1_full_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_4.txt" ) ;
            int r2_full_16; r2_full_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_5.txt" ) ;
            Object output_1_16 = F_FULL(x1_full_16, y1_full_16, x2_full_16, y2_full_16, r1_full_16, r2_full_16);
            int x1_gold_16; x1_gold_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_0.txt" ) ;
            int y1_gold_16; y1_gold_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_1.txt" ) ;
            int x2_gold_16; x2_gold_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_2.txt" ) ;
            int y2_gold_16; y2_gold_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_3.txt" ) ;
            int r1_gold_16; r1_gold_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_4.txt" ) ;
            int r2_gold_16; r2_gold_16 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_16/param_idx_5.txt" ) ;
            Object output_2_16 = f_gold(x1_gold_16, y1_gold_16, x2_gold_16, y2_gold_16, r1_gold_16, r2_gold_16);
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

        try {
            total_test_case_num++;
            int x1_full_3001; x1_full_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_0.txt" ) ;
            int y1_full_3001; y1_full_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_1.txt" ) ;
            int x2_full_3001; x2_full_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_2.txt" ) ;
            int y2_full_3001; y2_full_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_3.txt" ) ;
            int r1_full_3001; r1_full_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_4.txt" ) ;
            int r2_full_3001; r2_full_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_5.txt" ) ;
            Object output_1_3001 = F_FULL(x1_full_3001, y1_full_3001, x2_full_3001, y2_full_3001, r1_full_3001, r2_full_3001);
            int x1_gold_3001; x1_gold_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_0.txt" ) ;
            int y1_gold_3001; y1_gold_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_1.txt" ) ;
            int x2_gold_3001; x2_gold_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_2.txt" ) ;
            int y2_gold_3001; y2_gold_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_3.txt" ) ;
            int r1_gold_3001; r1_gold_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_4.txt" ) ;
            int r2_gold_3001; r2_gold_3001 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_3001/param_idx_5.txt" ) ;
            Object output_2_3001 = f_gold(x1_gold_3001, y1_gold_3001, x2_gold_3001, y2_gold_3001, r1_gold_3001, r2_gold_3001);
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
            int x1_full_4013; x1_full_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_0.txt" ) ;
            int y1_full_4013; y1_full_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_1.txt" ) ;
            int x2_full_4013; x2_full_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_2.txt" ) ;
            int y2_full_4013; y2_full_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_3.txt" ) ;
            int r1_full_4013; r1_full_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_4.txt" ) ;
            int r2_full_4013; r2_full_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_5.txt" ) ;
            Object output_1_4013 = F_FULL(x1_full_4013, y1_full_4013, x2_full_4013, y2_full_4013, r1_full_4013, r2_full_4013);
            int x1_gold_4013; x1_gold_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_0.txt" ) ;
            int y1_gold_4013; y1_gold_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_1.txt" ) ;
            int x2_gold_4013; x2_gold_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_2.txt" ) ;
            int y2_gold_4013; y2_gold_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_3.txt" ) ;
            int r1_gold_4013; r1_gold_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_4.txt" ) ;
            int r2_gold_4013; r2_gold_4013 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_4013/param_idx_5.txt" ) ;
            Object output_2_4013 = f_gold(x1_gold_4013, y1_gold_4013, x2_gold_4013, y2_gold_4013, r1_gold_4013, r2_gold_4013);
            if (areEquivalent(output_1_4013, output_2_4013)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4013 output1=" +
                                   serializeObj(output_1_4013) +
                                   " output2=" + serializeObj(output_2_4013));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4013 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x1_full_5; x1_full_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_0.txt" ) ;
            int y1_full_5; y1_full_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_1.txt" ) ;
            int x2_full_5; x2_full_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_2.txt" ) ;
            int y2_full_5; y2_full_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_3.txt" ) ;
            int r1_full_5; r1_full_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_4.txt" ) ;
            int r2_full_5; r2_full_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_5.txt" ) ;
            Object output_1_5 = F_FULL(x1_full_5, y1_full_5, x2_full_5, y2_full_5, r1_full_5, r2_full_5);
            int x1_gold_5; x1_gold_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_0.txt" ) ;
            int y1_gold_5; y1_gold_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_1.txt" ) ;
            int x2_gold_5; x2_gold_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_2.txt" ) ;
            int y2_gold_5; y2_gold_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_3.txt" ) ;
            int r1_gold_5; r1_gold_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_4.txt" ) ;
            int r2_gold_5; r2_gold_5 = readInt ( "../CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT/test_5/param_idx_5.txt" ) ;
            Object output_2_5 = f_gold(x1_gold_5, y1_gold_5, x2_gold_5, y2_gold_5, r1_gold_5, r2_gold_5);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
