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
static double f_gold ( int n ) {
  int i = 1 ;
  double res = 0.0 ;
  boolean sign = true ;
  while ( n > 0 ) {
    n -- ;
    if ( sign ) {
      sign = ! sign ;
      res = res + ( double ) ++ i / ++ i ;
    }
    else {
      sign = ! sign ;
      res = res - ( double ) ++ i / ++ i ;
    }
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
            int n_full_6; n_full_6 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_6/param_idx_0.txt" ) ;
            Object output_1_6 = F_FULL(n_full_6);
            int n_gold_6; n_gold_6 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_6/param_idx_0.txt" ) ;
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
            int n_full_4007; n_full_4007 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_4007/param_idx_0.txt" ) ;
            Object output_1_4007 = F_FULL(n_full_4007);
            int n_gold_4007; n_gold_4007 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_4007/param_idx_0.txt" ) ;
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
            int n_full_10; n_full_10 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_10/param_idx_0.txt" ) ;
            Object output_1_10 = F_FULL(n_full_10);
            int n_gold_10; n_gold_10 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_10/param_idx_0.txt" ) ;
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
            int n_full_4014; n_full_4014 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_4014/param_idx_0.txt" ) ;
            Object output_1_4014 = F_FULL(n_full_4014);
            int n_gold_4014; n_gold_4014 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_4014/param_idx_0.txt" ) ;
            Object output_2_4014 = f_gold(n_gold_4014);
            if (areEquivalent(output_1_4014, output_2_4014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4014 output1=" +
                                   serializeObj(output_1_4014) +
                                   " output2=" + serializeObj(output_2_4014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4000; n_full_4000 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_4000/param_idx_0.txt" ) ;
            Object output_1_4000 = F_FULL(n_full_4000);
            int n_gold_4000; n_gold_4000 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_4000/param_idx_0.txt" ) ;
            Object output_2_4000 = f_gold(n_gold_4000);
            if (areEquivalent(output_1_4000, output_2_4000)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4000 output1=" +
                                   serializeObj(output_1_4000) +
                                   " output2=" + serializeObj(output_2_4000));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_4016; n_full_4016 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_4016/param_idx_0.txt" ) ;
            Object output_1_4016 = F_FULL(n_full_4016);
            int n_gold_4016; n_gold_4016 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_4016/param_idx_0.txt" ) ;
            Object output_2_4016 = f_gold(n_gold_4016);
            if (areEquivalent(output_1_4016, output_2_4016)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4016 output1=" +
                                   serializeObj(output_1_4016) +
                                   " output2=" + serializeObj(output_2_4016));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4016 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_1002; n_full_1002 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_1002/param_idx_0.txt" ) ;
            Object output_1_1002 = F_FULL(n_full_1002);
            int n_gold_1002; n_gold_1002 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_1002/param_idx_0.txt" ) ;
            Object output_2_1002 = f_gold(n_gold_1002);
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
            int n_full_3024; n_full_3024 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_3024/param_idx_0.txt" ) ;
            Object output_1_3024 = F_FULL(n_full_3024);
            int n_gold_3024; n_gold_3024 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_3024/param_idx_0.txt" ) ;
            Object output_2_3024 = f_gold(n_gold_3024);
            if (areEquivalent(output_1_3024, output_2_3024)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3024 output1=" +
                                   serializeObj(output_1_3024) +
                                   " output2=" + serializeObj(output_2_3024));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3024 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_3019; n_full_3019 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_3019/param_idx_0.txt" ) ;
            Object output_1_3019 = F_FULL(n_full_3019);
            int n_gold_3019; n_gold_3019 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_3019/param_idx_0.txt" ) ;
            Object output_2_3019 = f_gold(n_gold_3019);
            if (areEquivalent(output_1_3019, output_2_3019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3019 output1=" +
                                   serializeObj(output_1_3019) +
                                   " output2=" + serializeObj(output_2_3019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int n_full_2003; n_full_2003 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_2003/param_idx_0.txt" ) ;
            Object output_1_2003 = F_FULL(n_full_2003);
            int n_gold_2003; n_gold_2003 = readInt ( "../SUM_SERIES_23_45_67_89_UPTO_N_TERMS/test_2003/param_idx_0.txt" ) ;
            Object output_2_2003 = f_gold(n_gold_2003);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
