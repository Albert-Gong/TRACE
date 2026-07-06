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
static boolean f_gold ( int num ) {
  if ( num < 0 ) return false ;
  int sum = 0 ;
  for ( int n = 1 ;
  sum <= num ;
  n ++ ) {
    sum = sum + n ;
    if ( sum == num ) return true ;
  }
  return false ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int num_full_13; num_full_13 = readInt ( "../TRIANGULAR_NUMBERS/test_13/param_idx_0.txt" ) ;
            Object output_1_13 = F_FULL(num_full_13);
            int num_gold_13; num_gold_13 = readInt ( "../TRIANGULAR_NUMBERS/test_13/param_idx_0.txt" ) ;
            Object output_2_13 = f_gold(num_gold_13);
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
            int num_full_2019; num_full_2019 = readInt ( "../TRIANGULAR_NUMBERS/test_2019/param_idx_0.txt" ) ;
            Object output_1_2019 = F_FULL(num_full_2019);
            int num_gold_2019; num_gold_2019 = readInt ( "../TRIANGULAR_NUMBERS/test_2019/param_idx_0.txt" ) ;
            Object output_2_2019 = f_gold(num_gold_2019);
            if (areEquivalent(output_1_2019, output_2_2019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2019 output1=" +
                                   serializeObj(output_1_2019) +
                                   " output2=" + serializeObj(output_2_2019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_1003; num_full_1003 = readInt ( "../TRIANGULAR_NUMBERS/test_1003/param_idx_0.txt" ) ;
            Object output_1_1003 = F_FULL(num_full_1003);
            int num_gold_1003; num_gold_1003 = readInt ( "../TRIANGULAR_NUMBERS/test_1003/param_idx_0.txt" ) ;
            Object output_2_1003 = f_gold(num_gold_1003);
            if (areEquivalent(output_1_1003, output_2_1003)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1003 output1=" +
                                   serializeObj(output_1_1003) +
                                   " output2=" + serializeObj(output_2_1003));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1003 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int num_full_19; num_full_19 = readInt ( "../TRIANGULAR_NUMBERS/test_19/param_idx_0.txt" ) ;
            Object output_1_19 = F_FULL(num_full_19);
            int num_gold_19; num_gold_19 = readInt ( "../TRIANGULAR_NUMBERS/test_19/param_idx_0.txt" ) ;
            Object output_2_19 = f_gold(num_gold_19);
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
            int num_full_2; num_full_2 = readInt ( "../TRIANGULAR_NUMBERS/test_2/param_idx_0.txt" ) ;
            Object output_1_2 = F_FULL(num_full_2);
            int num_gold_2; num_gold_2 = readInt ( "../TRIANGULAR_NUMBERS/test_2/param_idx_0.txt" ) ;
            Object output_2_2 = f_gold(num_gold_2);
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
            int num_full_11; num_full_11 = readInt ( "../TRIANGULAR_NUMBERS/test_11/param_idx_0.txt" ) ;
            Object output_1_11 = F_FULL(num_full_11);
            int num_gold_11; num_gold_11 = readInt ( "../TRIANGULAR_NUMBERS/test_11/param_idx_0.txt" ) ;
            Object output_2_11 = f_gold(num_gold_11);
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
            int num_full_2018; num_full_2018 = readInt ( "../TRIANGULAR_NUMBERS/test_2018/param_idx_0.txt" ) ;
            Object output_1_2018 = F_FULL(num_full_2018);
            int num_gold_2018; num_gold_2018 = readInt ( "../TRIANGULAR_NUMBERS/test_2018/param_idx_0.txt" ) ;
            Object output_2_2018 = f_gold(num_gold_2018);
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
            int num_full_14; num_full_14 = readInt ( "../TRIANGULAR_NUMBERS/test_14/param_idx_0.txt" ) ;
            Object output_1_14 = F_FULL(num_full_14);
            int num_gold_14; num_gold_14 = readInt ( "../TRIANGULAR_NUMBERS/test_14/param_idx_0.txt" ) ;
            Object output_2_14 = f_gold(num_gold_14);
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
            int num_full_8; num_full_8 = readInt ( "../TRIANGULAR_NUMBERS/test_8/param_idx_0.txt" ) ;
            Object output_1_8 = F_FULL(num_full_8);
            int num_gold_8; num_gold_8 = readInt ( "../TRIANGULAR_NUMBERS/test_8/param_idx_0.txt" ) ;
            Object output_2_8 = f_gold(num_gold_8);
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
            int num_full_1015; num_full_1015 = readInt ( "../TRIANGULAR_NUMBERS/test_1015/param_idx_0.txt" ) ;
            Object output_1_1015 = F_FULL(num_full_1015);
            int num_gold_1015; num_gold_1015 = readInt ( "../TRIANGULAR_NUMBERS/test_1015/param_idx_0.txt" ) ;
            Object output_2_1015 = f_gold(num_gold_1015);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
