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
  int num = n ;
  int dec_value = 0 ;
  int base = 1 ;
  int temp = num ;
  while ( temp > 0 ) {
    int last_digit = temp % 10 ;
    temp = temp / 10 ;
    dec_value += last_digit * base ;
    base = base * 8 ;
  }
  return dec_value ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int n_full_4005; n_full_4005 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_4005/param_idx_0.txt" ) ;
            Object output_1_4005 = F_FULL(n_full_4005);
            int n_gold_4005; n_gold_4005 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_4005/param_idx_0.txt" ) ;
            Object output_2_4005 = f_gold(n_gold_4005);
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
            int n_full_27; n_full_27 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_27/param_idx_0.txt" ) ;
            Object output_1_27 = F_FULL(n_full_27);
            int n_gold_27; n_gold_27 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_27/param_idx_0.txt" ) ;
            Object output_2_27 = f_gold(n_gold_27);
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
            int n_full_4003; n_full_4003 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_4003/param_idx_0.txt" ) ;
            Object output_1_4003 = F_FULL(n_full_4003);
            int n_gold_4003; n_gold_4003 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_4003/param_idx_0.txt" ) ;
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
            int n_full_1015; n_full_1015 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_1015/param_idx_0.txt" ) ;
            Object output_1_1015 = F_FULL(n_full_1015);
            int n_gold_1015; n_gold_1015 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_1015/param_idx_0.txt" ) ;
            Object output_2_1015 = f_gold(n_gold_1015);
            if (areEquivalent(output_1_1015, output_2_1015)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1015 output1=" +
                                   serializeObj(output_1_1015) +
                                   " output2=" + serializeObj(output_2_1015));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1015 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4007; n_full_4007 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_4007/param_idx_0.txt" ) ;
            Object output_1_4007 = F_FULL(n_full_4007);
            int n_gold_4007; n_gold_4007 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_4007/param_idx_0.txt" ) ;
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
            int n_full_1016; n_full_1016 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_1016/param_idx_0.txt" ) ;
            Object output_1_1016 = F_FULL(n_full_1016);
            int n_gold_1016; n_gold_1016 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_1016/param_idx_0.txt" ) ;
            Object output_2_1016 = f_gold(n_gold_1016);
            if (areEquivalent(output_1_1016, output_2_1016)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1016 output1=" +
                                   serializeObj(output_1_1016) +
                                   " output2=" + serializeObj(output_2_1016));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1016 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_10; n_full_10 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_10/param_idx_0.txt" ) ;
            Object output_1_10 = F_FULL(n_full_10);
            int n_gold_10; n_gold_10 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_10/param_idx_0.txt" ) ;
            Object output_2_10 = f_gold(n_gold_10);
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
            int n_full_1007; n_full_1007 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_1007/param_idx_0.txt" ) ;
            Object output_1_1007 = F_FULL(n_full_1007);
            int n_gold_1007; n_gold_1007 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_1007/param_idx_0.txt" ) ;
            Object output_2_1007 = f_gold(n_gold_1007);
            if (areEquivalent(output_1_1007, output_2_1007)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1007 output1=" +
                                   serializeObj(output_1_1007) +
                                   " output2=" + serializeObj(output_2_1007));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1007 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_6; n_full_6 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_6/param_idx_0.txt" ) ;
            Object output_1_6 = F_FULL(n_full_6);
            int n_gold_6; n_gold_6 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_6/param_idx_0.txt" ) ;
            Object output_2_6 = f_gold(n_gold_6);
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
            int n_full_25; n_full_25 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_25/param_idx_0.txt" ) ;
            Object output_1_25 = F_FULL(n_full_25);
            int n_gold_25; n_gold_25 = readInt ( "../PROGRAM_OCTAL_DECIMAL_CONVERSION/test_25/param_idx_0.txt" ) ;
            Object output_2_25 = f_gold(n_gold_25);
            if (areEquivalent(output_1_25, output_2_25)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=25 output1=" +
                                   serializeObj(output_1_25) +
                                   " output2=" + serializeObj(output_2_25));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=25 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
