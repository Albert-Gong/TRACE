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
static int f_gold ( int num , int divisor ) {
  return ( num - divisor * ( num / divisor ) ) ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int num_full_2003; num_full_2003 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2003/param_idx_0.txt" ) ;
            int divisor_full_2003; divisor_full_2003 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2003/param_idx_1.txt" ) ;
            Object output_1_2003 = F_FULL(num_full_2003, divisor_full_2003);
            int num_gold_2003; num_gold_2003 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2003/param_idx_0.txt" ) ;
            int divisor_gold_2003; divisor_gold_2003 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2003/param_idx_1.txt" ) ;
            Object output_2_2003 = f_gold(num_gold_2003, divisor_gold_2003);
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
            int num_full_10; num_full_10 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_10/param_idx_0.txt" ) ;
            int divisor_full_10; divisor_full_10 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_10/param_idx_1.txt" ) ;
            Object output_1_10 = F_FULL(num_full_10, divisor_full_10);
            int num_gold_10; num_gold_10 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_10/param_idx_0.txt" ) ;
            int divisor_gold_10; divisor_gold_10 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_10/param_idx_1.txt" ) ;
            Object output_2_10 = f_gold(num_gold_10, divisor_gold_10);
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
            int num_full_27; num_full_27 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_27/param_idx_0.txt" ) ;
            int divisor_full_27; divisor_full_27 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_27/param_idx_1.txt" ) ;
            Object output_1_27 = F_FULL(num_full_27, divisor_full_27);
            int num_gold_27; num_gold_27 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_27/param_idx_0.txt" ) ;
            int divisor_gold_27; divisor_gold_27 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_27/param_idx_1.txt" ) ;
            Object output_2_27 = f_gold(num_gold_27, divisor_gold_27);
            if (areEquivalent(output_1_27, output_2_27)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=27 output1=" +
                                   serializeObj(output_1_27) +
                                   " output2=" + serializeObj(output_2_27));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=27 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_0; num_full_0 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_0/param_idx_0.txt" ) ;
            int divisor_full_0; divisor_full_0 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_0/param_idx_1.txt" ) ;
            Object output_1_0 = F_FULL(num_full_0, divisor_full_0);
            int num_gold_0; num_gold_0 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_0/param_idx_0.txt" ) ;
            int divisor_gold_0; divisor_gold_0 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_0/param_idx_1.txt" ) ;
            Object output_2_0 = f_gold(num_gold_0, divisor_gold_0);
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
            int num_full_4005; num_full_4005 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_4005/param_idx_0.txt" ) ;
            int divisor_full_4005; divisor_full_4005 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_4005/param_idx_1.txt" ) ;
            Object output_1_4005 = F_FULL(num_full_4005, divisor_full_4005);
            int num_gold_4005; num_gold_4005 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_4005/param_idx_0.txt" ) ;
            int divisor_gold_4005; divisor_gold_4005 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_4005/param_idx_1.txt" ) ;
            Object output_2_4005 = f_gold(num_gold_4005, divisor_gold_4005);
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
            int num_full_3001; num_full_3001 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_3001/param_idx_0.txt" ) ;
            int divisor_full_3001; divisor_full_3001 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_3001/param_idx_1.txt" ) ;
            Object output_1_3001 = F_FULL(num_full_3001, divisor_full_3001);
            int num_gold_3001; num_gold_3001 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_3001/param_idx_0.txt" ) ;
            int divisor_gold_3001; divisor_gold_3001 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_3001/param_idx_1.txt" ) ;
            Object output_2_3001 = f_gold(num_gold_3001, divisor_gold_3001);
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
            int num_full_1005; num_full_1005 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_1005/param_idx_0.txt" ) ;
            int divisor_full_1005; divisor_full_1005 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_1005/param_idx_1.txt" ) ;
            Object output_1_1005 = F_FULL(num_full_1005, divisor_full_1005);
            int num_gold_1005; num_gold_1005 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_1005/param_idx_0.txt" ) ;
            int divisor_gold_1005; divisor_gold_1005 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_1005/param_idx_1.txt" ) ;
            Object output_2_1005 = f_gold(num_gold_1005, divisor_gold_1005);
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
            int num_full_2004; num_full_2004 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2004/param_idx_0.txt" ) ;
            int divisor_full_2004; divisor_full_2004 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2004/param_idx_1.txt" ) ;
            Object output_1_2004 = F_FULL(num_full_2004, divisor_full_2004);
            int num_gold_2004; num_gold_2004 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2004/param_idx_0.txt" ) ;
            int divisor_gold_2004; divisor_gold_2004 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2004/param_idx_1.txt" ) ;
            Object output_2_2004 = f_gold(num_gold_2004, divisor_gold_2004);
            if (areEquivalent(output_1_2004, output_2_2004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2004 output1=" +
                                   serializeObj(output_1_2004) +
                                   " output2=" + serializeObj(output_2_2004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_2012; num_full_2012 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2012/param_idx_0.txt" ) ;
            int divisor_full_2012; divisor_full_2012 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2012/param_idx_1.txt" ) ;
            Object output_1_2012 = F_FULL(num_full_2012, divisor_full_2012);
            int num_gold_2012; num_gold_2012 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2012/param_idx_0.txt" ) ;
            int divisor_gold_2012; divisor_gold_2012 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_2012/param_idx_1.txt" ) ;
            Object output_2_2012 = f_gold(num_gold_2012, divisor_gold_2012);
            if (areEquivalent(output_1_2012, output_2_2012)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2012 output1=" +
                                   serializeObj(output_1_2012) +
                                   " output2=" + serializeObj(output_2_2012));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2012 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_3013; num_full_3013 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_3013/param_idx_0.txt" ) ;
            int divisor_full_3013; divisor_full_3013 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_3013/param_idx_1.txt" ) ;
            Object output_1_3013 = F_FULL(num_full_3013, divisor_full_3013);
            int num_gold_3013; num_gold_3013 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_3013/param_idx_0.txt" ) ;
            int divisor_gold_3013; divisor_gold_3013 = readInt ( "../PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR/test_3013/param_idx_1.txt" ) ;
            Object output_2_3013 = f_gold(num_gold_3013, divisor_gold_3013);
            if (areEquivalent(output_1_3013, output_2_3013)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3013 output1=" +
                                   serializeObj(output_1_3013) +
                                   " output2=" + serializeObj(output_2_3013));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3013 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
