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
  int rightOne , nextHigherOneBit , rightOnesPattern , next = 0 ;
  if ( x > 0 ) {
    rightOne = x & - x ;
    nextHigherOneBit = x + rightOne ;
    rightOnesPattern = x ^ nextHigherOneBit ;
    rightOnesPattern = ( rightOnesPattern ) / rightOne ;
    rightOnesPattern >>= 2 ;
    next = nextHigherOneBit | rightOnesPattern ;
  }
  return next ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int x_full_2; x_full_2 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_2/param_idx_0.txt" ) ;
            Object output_1_2 = F_FULL(x_full_2);
            int x_gold_2; x_gold_2 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_2/param_idx_0.txt" ) ;
            Object output_2_2 = f_gold(x_gold_2);
            if (areEquivalent(output_1_2, output_2_2)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2 output1=" +
                                   serializeObj(output_1_2) +
                                   " output2=" + serializeObj(output_2_2));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_1009; x_full_1009 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_1009/param_idx_0.txt" ) ;
            Object output_1_1009 = F_FULL(x_full_1009);
            int x_gold_1009; x_gold_1009 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_1009/param_idx_0.txt" ) ;
            Object output_2_1009 = f_gold(x_gold_1009);
            if (areEquivalent(output_1_1009, output_2_1009)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1009 output1=" +
                                   serializeObj(output_1_1009) +
                                   " output2=" + serializeObj(output_2_1009));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1009 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int x_full_1; x_full_1 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_1/param_idx_0.txt" ) ;
            Object output_1_1 = F_FULL(x_full_1);
            int x_gold_1; x_gold_1 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_1/param_idx_0.txt" ) ;
            Object output_2_1 = f_gold(x_gold_1);
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
            int x_full_4; x_full_4 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_4/param_idx_0.txt" ) ;
            Object output_1_4 = F_FULL(x_full_4);
            int x_gold_4; x_gold_4 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_4/param_idx_0.txt" ) ;
            Object output_2_4 = f_gold(x_gold_4);
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
            int x_full_0; x_full_0 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_0/param_idx_0.txt" ) ;
            Object output_1_0 = F_FULL(x_full_0);
            int x_gold_0; x_gold_0 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_0/param_idx_0.txt" ) ;
            Object output_2_0 = f_gold(x_gold_0);
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
            int x_full_10; x_full_10 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_10/param_idx_0.txt" ) ;
            Object output_1_10 = F_FULL(x_full_10);
            int x_gold_10; x_gold_10 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_10/param_idx_0.txt" ) ;
            Object output_2_10 = f_gold(x_gold_10);
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
            int x_full_6; x_full_6 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_6/param_idx_0.txt" ) ;
            Object output_1_6 = F_FULL(x_full_6);
            int x_gold_6; x_gold_6 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_6/param_idx_0.txt" ) ;
            Object output_2_6 = f_gold(x_gold_6);
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
            int x_full_3005; x_full_3005 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_3005/param_idx_0.txt" ) ;
            Object output_1_3005 = F_FULL(x_full_3005);
            int x_gold_3005; x_gold_3005 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_3005/param_idx_0.txt" ) ;
            Object output_2_3005 = f_gold(x_gold_3005);
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
            int x_full_7; x_full_7 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_7/param_idx_0.txt" ) ;
            Object output_1_7 = F_FULL(x_full_7);
            int x_gold_7; x_gold_7 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_7/param_idx_0.txt" ) ;
            Object output_2_7 = f_gold(x_gold_7);
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

        try {
            total_test_case_num++;
            int x_full_8; x_full_8 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_8/param_idx_0.txt" ) ;
            Object output_1_8 = F_FULL(x_full_8);
            int x_gold_8; x_gold_8 = readInt ( "../NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS/test_8/param_idx_0.txt" ) ;
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
