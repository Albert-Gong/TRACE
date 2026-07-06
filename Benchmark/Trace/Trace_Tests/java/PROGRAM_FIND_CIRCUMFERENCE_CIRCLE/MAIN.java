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
static double f_gold ( double r ) {
  double PI = 3.1415 ;
  double cir = 2 * PI * r ;
  return cir ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            double r_full_20; r_full_20 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_20/param_idx_0.txt" ) ;
            Object output_1_20 = F_FULL(r_full_20);
            double r_gold_20; r_gold_20 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_20/param_idx_0.txt" ) ;
            Object output_2_20 = f_gold(r_gold_20);
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
            double r_full_1; r_full_1 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_1/param_idx_0.txt" ) ;
            Object output_1_1 = F_FULL(r_full_1);
            double r_gold_1; r_gold_1 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_1/param_idx_0.txt" ) ;
            Object output_2_1 = f_gold(r_gold_1);
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
            double r_full_19; r_full_19 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_19/param_idx_0.txt" ) ;
            Object output_1_19 = F_FULL(r_full_19);
            double r_gold_19; r_gold_19 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_19/param_idx_0.txt" ) ;
            Object output_2_19 = f_gold(r_gold_19);
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
            double r_full_18; r_full_18 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_18/param_idx_0.txt" ) ;
            Object output_1_18 = F_FULL(r_full_18);
            double r_gold_18; r_gold_18 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_18/param_idx_0.txt" ) ;
            Object output_2_18 = f_gold(r_gold_18);
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
            double r_full_4005; r_full_4005 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_4005/param_idx_0.txt" ) ;
            Object output_1_4005 = F_FULL(r_full_4005);
            double r_gold_4005; r_gold_4005 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_4005/param_idx_0.txt" ) ;
            Object output_2_4005 = f_gold(r_gold_4005);
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
            double r_full_26; r_full_26 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_26/param_idx_0.txt" ) ;
            Object output_1_26 = F_FULL(r_full_26);
            double r_gold_26; r_gold_26 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_26/param_idx_0.txt" ) ;
            Object output_2_26 = f_gold(r_gold_26);
            if (areEquivalent(output_1_26, output_2_26)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=26 output1=" +
                                   serializeObj(output_1_26) +
                                   " output2=" + serializeObj(output_2_26));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=26 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            double r_full_0; r_full_0 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_0/param_idx_0.txt" ) ;
            Object output_1_0 = F_FULL(r_full_0);
            double r_gold_0; r_gold_0 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_0/param_idx_0.txt" ) ;
            Object output_2_0 = f_gold(r_gold_0);
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
            double r_full_3; r_full_3 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_3/param_idx_0.txt" ) ;
            Object output_1_3 = F_FULL(r_full_3);
            double r_gold_3; r_gold_3 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_3/param_idx_0.txt" ) ;
            Object output_2_3 = f_gold(r_gold_3);
            if (areEquivalent(output_1_3, output_2_3)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3 output1=" +
                                   serializeObj(output_1_3) +
                                   " output2=" + serializeObj(output_2_3));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            double r_full_11; r_full_11 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_11/param_idx_0.txt" ) ;
            Object output_1_11 = F_FULL(r_full_11);
            double r_gold_11; r_gold_11 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_11/param_idx_0.txt" ) ;
            Object output_2_11 = f_gold(r_gold_11);
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
            double r_full_13; r_full_13 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_13/param_idx_0.txt" ) ;
            Object output_1_13 = F_FULL(r_full_13);
            double r_gold_13; r_gold_13 = readDouble ( "../PROGRAM_FIND_CIRCUMFERENCE_CIRCLE/test_13/param_idx_0.txt" ) ;
            Object output_2_13 = f_gold(r_gold_13);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
