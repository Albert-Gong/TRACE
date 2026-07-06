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
static int f_gold ( int N , int insert , int remove , int copy ) {
  if ( N == 0 ) return 0 ;
  if ( N == 1 ) return insert ;
  int dp [ ] = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i % 2 == 0 ) dp [ i ] = Math . min ( dp [ i - 1 ] + insert , dp [ i / 2 ] + copy ) ;
    else dp [ i ] = Math . min ( dp [ i - 1 ] + insert , dp [ ( i + 1 ) / 2 ] + copy + remove ) ;
  }
  return dp [ N ] ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int N_full_4011; N_full_4011 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4011/param_idx_0.txt" ) ;
            int insert_full_4011; insert_full_4011 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4011/param_idx_1.txt" ) ;
            int remove_full_4011; remove_full_4011 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4011/param_idx_2.txt" ) ;
            int copy_full_4011; copy_full_4011 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4011/param_idx_3.txt" ) ;
            Object output_1_4011 = F_FULL(N_full_4011, insert_full_4011, remove_full_4011, copy_full_4011);
            int N_gold_4011; N_gold_4011 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4011/param_idx_0.txt" ) ;
            int insert_gold_4011; insert_gold_4011 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4011/param_idx_1.txt" ) ;
            int remove_gold_4011; remove_gold_4011 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4011/param_idx_2.txt" ) ;
            int copy_gold_4011; copy_gold_4011 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4011/param_idx_3.txt" ) ;
            Object output_2_4011 = f_gold(N_gold_4011, insert_gold_4011, remove_gold_4011, copy_gold_4011);
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
            int N_full_4002; N_full_4002 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4002/param_idx_0.txt" ) ;
            int insert_full_4002; insert_full_4002 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4002/param_idx_1.txt" ) ;
            int remove_full_4002; remove_full_4002 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4002/param_idx_2.txt" ) ;
            int copy_full_4002; copy_full_4002 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4002/param_idx_3.txt" ) ;
            Object output_1_4002 = F_FULL(N_full_4002, insert_full_4002, remove_full_4002, copy_full_4002);
            int N_gold_4002; N_gold_4002 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4002/param_idx_0.txt" ) ;
            int insert_gold_4002; insert_gold_4002 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4002/param_idx_1.txt" ) ;
            int remove_gold_4002; remove_gold_4002 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4002/param_idx_2.txt" ) ;
            int copy_gold_4002; copy_gold_4002 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4002/param_idx_3.txt" ) ;
            Object output_2_4002 = f_gold(N_gold_4002, insert_gold_4002, remove_gold_4002, copy_gold_4002);
            if (areEquivalent(output_1_4002, output_2_4002)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4002 output1=" +
                                   serializeObj(output_1_4002) +
                                   " output2=" + serializeObj(output_2_4002));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int N_full_4024; N_full_4024 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4024/param_idx_0.txt" ) ;
            int insert_full_4024; insert_full_4024 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4024/param_idx_1.txt" ) ;
            int remove_full_4024; remove_full_4024 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4024/param_idx_2.txt" ) ;
            int copy_full_4024; copy_full_4024 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4024/param_idx_3.txt" ) ;
            Object output_1_4024 = F_FULL(N_full_4024, insert_full_4024, remove_full_4024, copy_full_4024);
            int N_gold_4024; N_gold_4024 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4024/param_idx_0.txt" ) ;
            int insert_gold_4024; insert_gold_4024 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4024/param_idx_1.txt" ) ;
            int remove_gold_4024; remove_gold_4024 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4024/param_idx_2.txt" ) ;
            int copy_gold_4024; copy_gold_4024 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4024/param_idx_3.txt" ) ;
            Object output_2_4024 = f_gold(N_gold_4024, insert_gold_4024, remove_gold_4024, copy_gold_4024);
            if (areEquivalent(output_1_4024, output_2_4024)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4024 output1=" +
                                   serializeObj(output_1_4024) +
                                   " output2=" + serializeObj(output_2_4024));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4024 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int N_full_4009; N_full_4009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4009/param_idx_0.txt" ) ;
            int insert_full_4009; insert_full_4009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4009/param_idx_1.txt" ) ;
            int remove_full_4009; remove_full_4009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4009/param_idx_2.txt" ) ;
            int copy_full_4009; copy_full_4009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4009/param_idx_3.txt" ) ;
            Object output_1_4009 = F_FULL(N_full_4009, insert_full_4009, remove_full_4009, copy_full_4009);
            int N_gold_4009; N_gold_4009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4009/param_idx_0.txt" ) ;
            int insert_gold_4009; insert_gold_4009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4009/param_idx_1.txt" ) ;
            int remove_gold_4009; remove_gold_4009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4009/param_idx_2.txt" ) ;
            int copy_gold_4009; copy_gold_4009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4009/param_idx_3.txt" ) ;
            Object output_2_4009 = f_gold(N_gold_4009, insert_gold_4009, remove_gold_4009, copy_gold_4009);
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
            int N_full_4010; N_full_4010 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4010/param_idx_0.txt" ) ;
            int insert_full_4010; insert_full_4010 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4010/param_idx_1.txt" ) ;
            int remove_full_4010; remove_full_4010 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4010/param_idx_2.txt" ) ;
            int copy_full_4010; copy_full_4010 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4010/param_idx_3.txt" ) ;
            Object output_1_4010 = F_FULL(N_full_4010, insert_full_4010, remove_full_4010, copy_full_4010);
            int N_gold_4010; N_gold_4010 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4010/param_idx_0.txt" ) ;
            int insert_gold_4010; insert_gold_4010 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4010/param_idx_1.txt" ) ;
            int remove_gold_4010; remove_gold_4010 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4010/param_idx_2.txt" ) ;
            int copy_gold_4010; copy_gold_4010 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4010/param_idx_3.txt" ) ;
            Object output_2_4010 = f_gold(N_gold_4010, insert_gold_4010, remove_gold_4010, copy_gold_4010);
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
            int N_full_1009; N_full_1009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1009/param_idx_0.txt" ) ;
            int insert_full_1009; insert_full_1009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1009/param_idx_1.txt" ) ;
            int remove_full_1009; remove_full_1009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1009/param_idx_2.txt" ) ;
            int copy_full_1009; copy_full_1009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1009/param_idx_3.txt" ) ;
            Object output_1_1009 = F_FULL(N_full_1009, insert_full_1009, remove_full_1009, copy_full_1009);
            int N_gold_1009; N_gold_1009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1009/param_idx_0.txt" ) ;
            int insert_gold_1009; insert_gold_1009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1009/param_idx_1.txt" ) ;
            int remove_gold_1009; remove_gold_1009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1009/param_idx_2.txt" ) ;
            int copy_gold_1009; copy_gold_1009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1009/param_idx_3.txt" ) ;
            Object output_2_1009 = f_gold(N_gold_1009, insert_gold_1009, remove_gold_1009, copy_gold_1009);
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
            int N_full_1004; N_full_1004 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1004/param_idx_0.txt" ) ;
            int insert_full_1004; insert_full_1004 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1004/param_idx_1.txt" ) ;
            int remove_full_1004; remove_full_1004 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1004/param_idx_2.txt" ) ;
            int copy_full_1004; copy_full_1004 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1004/param_idx_3.txt" ) ;
            Object output_1_1004 = F_FULL(N_full_1004, insert_full_1004, remove_full_1004, copy_full_1004);
            int N_gold_1004; N_gold_1004 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1004/param_idx_0.txt" ) ;
            int insert_gold_1004; insert_gold_1004 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1004/param_idx_1.txt" ) ;
            int remove_gold_1004; remove_gold_1004 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1004/param_idx_2.txt" ) ;
            int copy_gold_1004; copy_gold_1004 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_1004/param_idx_3.txt" ) ;
            Object output_2_1004 = f_gold(N_gold_1004, insert_gold_1004, remove_gold_1004, copy_gold_1004);
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
            int N_full_4000; N_full_4000 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4000/param_idx_0.txt" ) ;
            int insert_full_4000; insert_full_4000 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4000/param_idx_1.txt" ) ;
            int remove_full_4000; remove_full_4000 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4000/param_idx_2.txt" ) ;
            int copy_full_4000; copy_full_4000 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4000/param_idx_3.txt" ) ;
            Object output_1_4000 = F_FULL(N_full_4000, insert_full_4000, remove_full_4000, copy_full_4000);
            int N_gold_4000; N_gold_4000 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4000/param_idx_0.txt" ) ;
            int insert_gold_4000; insert_gold_4000 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4000/param_idx_1.txt" ) ;
            int remove_gold_4000; remove_gold_4000 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4000/param_idx_2.txt" ) ;
            int copy_gold_4000; copy_gold_4000 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4000/param_idx_3.txt" ) ;
            Object output_2_4000 = f_gold(N_gold_4000, insert_gold_4000, remove_gold_4000, copy_gold_4000);
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
            int N_full_3009; N_full_3009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_3009/param_idx_0.txt" ) ;
            int insert_full_3009; insert_full_3009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_3009/param_idx_1.txt" ) ;
            int remove_full_3009; remove_full_3009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_3009/param_idx_2.txt" ) ;
            int copy_full_3009; copy_full_3009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_3009/param_idx_3.txt" ) ;
            Object output_1_3009 = F_FULL(N_full_3009, insert_full_3009, remove_full_3009, copy_full_3009);
            int N_gold_3009; N_gold_3009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_3009/param_idx_0.txt" ) ;
            int insert_gold_3009; insert_gold_3009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_3009/param_idx_1.txt" ) ;
            int remove_gold_3009; remove_gold_3009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_3009/param_idx_2.txt" ) ;
            int copy_gold_3009; copy_gold_3009 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_3009/param_idx_3.txt" ) ;
            Object output_2_3009 = f_gold(N_gold_3009, insert_gold_3009, remove_gold_3009, copy_gold_3009);
            if (areEquivalent(output_1_3009, output_2_3009)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3009 output1=" +
                                   serializeObj(output_1_3009) +
                                   " output2=" + serializeObj(output_2_3009));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3009 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int N_full_4003; N_full_4003 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4003/param_idx_0.txt" ) ;
            int insert_full_4003; insert_full_4003 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4003/param_idx_1.txt" ) ;
            int remove_full_4003; remove_full_4003 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4003/param_idx_2.txt" ) ;
            int copy_full_4003; copy_full_4003 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4003/param_idx_3.txt" ) ;
            Object output_1_4003 = F_FULL(N_full_4003, insert_full_4003, remove_full_4003, copy_full_4003);
            int N_gold_4003; N_gold_4003 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4003/param_idx_0.txt" ) ;
            int insert_gold_4003; insert_gold_4003 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4003/param_idx_1.txt" ) ;
            int remove_gold_4003; remove_gold_4003 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4003/param_idx_2.txt" ) ;
            int copy_gold_4003; copy_gold_4003 = readInt ( "../MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION/test_4003/param_idx_3.txt" ) ;
            Object output_2_4003 = f_gold(N_gold_4003, insert_gold_4003, remove_gold_4003, copy_gold_4003);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
