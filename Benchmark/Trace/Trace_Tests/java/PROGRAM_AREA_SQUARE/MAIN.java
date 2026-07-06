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
static int f_gold ( int side ) {
  int area = side * side ;
  return area ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int side_full_1; side_full_1 = readInt ( "../PROGRAM_AREA_SQUARE/test_1/param_idx_0.txt" ) ;
            Object output_1_1 = F_FULL(side_full_1);
            int side_gold_1; side_gold_1 = readInt ( "../PROGRAM_AREA_SQUARE/test_1/param_idx_0.txt" ) ;
            Object output_2_1 = f_gold(side_gold_1);
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
            int side_full_3005; side_full_3005 = readInt ( "../PROGRAM_AREA_SQUARE/test_3005/param_idx_0.txt" ) ;
            Object output_1_3005 = F_FULL(side_full_3005);
            int side_gold_3005; side_gold_3005 = readInt ( "../PROGRAM_AREA_SQUARE/test_3005/param_idx_0.txt" ) ;
            Object output_2_3005 = f_gold(side_gold_3005);
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
            int side_full_0; side_full_0 = readInt ( "../PROGRAM_AREA_SQUARE/test_0/param_idx_0.txt" ) ;
            Object output_1_0 = F_FULL(side_full_0);
            int side_gold_0; side_gold_0 = readInt ( "../PROGRAM_AREA_SQUARE/test_0/param_idx_0.txt" ) ;
            Object output_2_0 = f_gold(side_gold_0);
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
            int side_full_7; side_full_7 = readInt ( "../PROGRAM_AREA_SQUARE/test_7/param_idx_0.txt" ) ;
            Object output_1_7 = F_FULL(side_full_7);
            int side_gold_7; side_gold_7 = readInt ( "../PROGRAM_AREA_SQUARE/test_7/param_idx_0.txt" ) ;
            Object output_2_7 = f_gold(side_gold_7);
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
            int side_full_1009; side_full_1009 = readInt ( "../PROGRAM_AREA_SQUARE/test_1009/param_idx_0.txt" ) ;
            Object output_1_1009 = F_FULL(side_full_1009);
            int side_gold_1009; side_gold_1009 = readInt ( "../PROGRAM_AREA_SQUARE/test_1009/param_idx_0.txt" ) ;
            Object output_2_1009 = f_gold(side_gold_1009);
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
            int side_full_3002; side_full_3002 = readInt ( "../PROGRAM_AREA_SQUARE/test_3002/param_idx_0.txt" ) ;
            Object output_1_3002 = F_FULL(side_full_3002);
            int side_gold_3002; side_gold_3002 = readInt ( "../PROGRAM_AREA_SQUARE/test_3002/param_idx_0.txt" ) ;
            Object output_2_3002 = f_gold(side_gold_3002);
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
            int side_full_1004; side_full_1004 = readInt ( "../PROGRAM_AREA_SQUARE/test_1004/param_idx_0.txt" ) ;
            Object output_1_1004 = F_FULL(side_full_1004);
            int side_gold_1004; side_gold_1004 = readInt ( "../PROGRAM_AREA_SQUARE/test_1004/param_idx_0.txt" ) ;
            Object output_2_1004 = f_gold(side_gold_1004);
            if (areEquivalent(output_1_1004, output_2_1004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1004 output1=" +
                                   serializeObj(output_1_1004) +
                                   " output2=" + serializeObj(output_2_1004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int side_full_3015; side_full_3015 = readInt ( "../PROGRAM_AREA_SQUARE/test_3015/param_idx_0.txt" ) ;
            Object output_1_3015 = F_FULL(side_full_3015);
            int side_gold_3015; side_gold_3015 = readInt ( "../PROGRAM_AREA_SQUARE/test_3015/param_idx_0.txt" ) ;
            Object output_2_3015 = f_gold(side_gold_3015);
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
            int side_full_4009; side_full_4009 = readInt ( "../PROGRAM_AREA_SQUARE/test_4009/param_idx_0.txt" ) ;
            Object output_1_4009 = F_FULL(side_full_4009);
            int side_gold_4009; side_gold_4009 = readInt ( "../PROGRAM_AREA_SQUARE/test_4009/param_idx_0.txt" ) ;
            Object output_2_4009 = f_gold(side_gold_4009);
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
            int side_full_4008; side_full_4008 = readInt ( "../PROGRAM_AREA_SQUARE/test_4008/param_idx_0.txt" ) ;
            Object output_1_4008 = F_FULL(side_full_4008);
            int side_gold_4008; side_gold_4008 = readInt ( "../PROGRAM_AREA_SQUARE/test_4008/param_idx_0.txt" ) ;
            Object output_2_4008 = f_gold(side_gold_4008);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
