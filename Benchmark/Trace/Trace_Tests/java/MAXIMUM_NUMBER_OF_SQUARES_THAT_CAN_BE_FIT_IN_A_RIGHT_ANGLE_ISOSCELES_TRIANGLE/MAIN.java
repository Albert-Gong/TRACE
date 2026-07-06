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
static int f_gold ( int b , int m ) {
  return ( b / m - 1 ) * ( b / m ) / 2 ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int b_full_4; b_full_4 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4/param_idx_0.txt" ) ;
            int m_full_4; m_full_4 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4/param_idx_1.txt" ) ;
            Object output_1_4 = F_FULL(b_full_4, m_full_4);
            int b_gold_4; b_gold_4 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4/param_idx_0.txt" ) ;
            int m_gold_4; m_gold_4 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4/param_idx_1.txt" ) ;
            Object output_2_4 = f_gold(b_gold_4, m_gold_4);
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
            int b_full_2011; b_full_2011 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_2011/param_idx_0.txt" ) ;
            int m_full_2011; m_full_2011 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_2011/param_idx_1.txt" ) ;
            Object output_1_2011 = F_FULL(b_full_2011, m_full_2011);
            int b_gold_2011; b_gold_2011 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_2011/param_idx_0.txt" ) ;
            int m_gold_2011; m_gold_2011 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_2011/param_idx_1.txt" ) ;
            Object output_2_2011 = f_gold(b_gold_2011, m_gold_2011);
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
            int b_full_4010; b_full_4010 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4010/param_idx_0.txt" ) ;
            int m_full_4010; m_full_4010 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4010/param_idx_1.txt" ) ;
            Object output_1_4010 = F_FULL(b_full_4010, m_full_4010);
            int b_gold_4010; b_gold_4010 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4010/param_idx_0.txt" ) ;
            int m_gold_4010; m_gold_4010 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4010/param_idx_1.txt" ) ;
            Object output_2_4010 = f_gold(b_gold_4010, m_gold_4010);
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
            int b_full_4005; b_full_4005 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4005/param_idx_0.txt" ) ;
            int m_full_4005; m_full_4005 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4005/param_idx_1.txt" ) ;
            Object output_1_4005 = F_FULL(b_full_4005, m_full_4005);
            int b_gold_4005; b_gold_4005 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4005/param_idx_0.txt" ) ;
            int m_gold_4005; m_gold_4005 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_4005/param_idx_1.txt" ) ;
            Object output_2_4005 = f_gold(b_gold_4005, m_gold_4005);
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

        try {
            total_test_case_num++;
            int b_full_14; b_full_14 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_14/param_idx_0.txt" ) ;
            int m_full_14; m_full_14 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_14/param_idx_1.txt" ) ;
            Object output_1_14 = F_FULL(b_full_14, m_full_14);
            int b_gold_14; b_gold_14 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_14/param_idx_0.txt" ) ;
            int m_gold_14; m_gold_14 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_14/param_idx_1.txt" ) ;
            Object output_2_14 = f_gold(b_gold_14, m_gold_14);
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
            int b_full_13; b_full_13 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_13/param_idx_0.txt" ) ;
            int m_full_13; m_full_13 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_13/param_idx_1.txt" ) ;
            Object output_1_13 = F_FULL(b_full_13, m_full_13);
            int b_gold_13; b_gold_13 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_13/param_idx_0.txt" ) ;
            int m_gold_13; m_gold_13 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_13/param_idx_1.txt" ) ;
            Object output_2_13 = f_gold(b_gold_13, m_gold_13);
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
            int b_full_3003; b_full_3003 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_3003/param_idx_0.txt" ) ;
            int m_full_3003; m_full_3003 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_3003/param_idx_1.txt" ) ;
            Object output_1_3003 = F_FULL(b_full_3003, m_full_3003);
            int b_gold_3003; b_gold_3003 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_3003/param_idx_0.txt" ) ;
            int m_gold_3003; m_gold_3003 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_3003/param_idx_1.txt" ) ;
            Object output_2_3003 = f_gold(b_gold_3003, m_gold_3003);
            if (areEquivalent(output_1_3003, output_2_3003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3003 output1=" +
                                   serializeObj(output_1_3003) +
                                   " output2=" + serializeObj(output_2_3003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int b_full_23; b_full_23 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_23/param_idx_0.txt" ) ;
            int m_full_23; m_full_23 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_23/param_idx_1.txt" ) ;
            Object output_1_23 = F_FULL(b_full_23, m_full_23);
            int b_gold_23; b_gold_23 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_23/param_idx_0.txt" ) ;
            int m_gold_23; m_gold_23 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_23/param_idx_1.txt" ) ;
            Object output_2_23 = f_gold(b_gold_23, m_gold_23);
            if (areEquivalent(output_1_23, output_2_23)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=23 output1=" +
                                   serializeObj(output_1_23) +
                                   " output2=" + serializeObj(output_2_23));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=23 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int b_full_3000; b_full_3000 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_3000/param_idx_0.txt" ) ;
            int m_full_3000; m_full_3000 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_3000/param_idx_1.txt" ) ;
            Object output_1_3000 = F_FULL(b_full_3000, m_full_3000);
            int b_gold_3000; b_gold_3000 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_3000/param_idx_0.txt" ) ;
            int m_gold_3000; m_gold_3000 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_3000/param_idx_1.txt" ) ;
            Object output_2_3000 = f_gold(b_gold_3000, m_gold_3000);
            if (areEquivalent(output_1_3000, output_2_3000)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3000 output1=" +
                                   serializeObj(output_1_3000) +
                                   " output2=" + serializeObj(output_2_3000));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int b_full_0; b_full_0 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_0/param_idx_0.txt" ) ;
            int m_full_0; m_full_0 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_0/param_idx_1.txt" ) ;
            Object output_1_0 = F_FULL(b_full_0, m_full_0);
            int b_gold_0; b_gold_0 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_0/param_idx_0.txt" ) ;
            int m_gold_0; m_gold_0 = readInt ( "../MAXIMUM_NUMBER_OF_SQUARES_THAT_CAN_BE_FIT_IN_A_RIGHT_ANGLE_ISOSCELES_TRIANGLE/test_0/param_idx_1.txt" ) ;
            Object output_2_0 = f_gold(b_gold_0, m_gold_0);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
