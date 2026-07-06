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
static int f_gold ( int set [ ] , int n ) {
  if ( n <= 2 ) return n ;
  int L [ ] [ ] = new int [ n ] [ n ] ;
  int llap = 2 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) L [ i ] [ n - 1 ] = 2 ;
  for ( int j = n - 2 ;
  j >= 1 ;
  j -- ) {
    int i = j - 1 , k = j + 1 ;
    while ( i >= 0 && k <= n - 1 ) {
      if ( set [ i ] + set [ k ] < 2 * set [ j ] ) k ++ ;
      else if ( set [ i ] + set [ k ] > 2 * set [ j ] ) {
        L [ i ] [ j ] = 2 ;
        i -- ;
      }
      else {
        L [ i ] [ j ] = L [ j ] [ k ] + 1 ;
        llap = Math . max ( llap , L [ i ] [ j ] ) ;
        i -- ;
        k ++ ;
      }
    }
    while ( i >= 0 ) {
      L [ i ] [ j ] = 2 ;
      i -- ;
    }
  }
  return llap ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] set_full_1019; set_full_1019 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_1019/param_idx_0.txt" ) ;
            int n_full_1019; n_full_1019 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_1019/param_idx_1.txt" ) ;
            Object output_1_1019 = F_FULL(set_full_1019, n_full_1019);
            int[] set_gold_1019; set_gold_1019 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_1019/param_idx_0.txt" ) ;
            int n_gold_1019; n_gold_1019 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_1019/param_idx_1.txt" ) ;
            Object output_2_1019 = f_gold(set_gold_1019, n_gold_1019);
            if (areEquivalent(output_1_1019, output_2_1019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1019 output1=" +
                                   serializeObj(output_1_1019) +
                                   " output2=" + serializeObj(output_2_1019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] set_full_3004; set_full_3004 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_3004/param_idx_0.txt" ) ;
            int n_full_3004; n_full_3004 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_3004/param_idx_1.txt" ) ;
            Object output_1_3004 = F_FULL(set_full_3004, n_full_3004);
            int[] set_gold_3004; set_gold_3004 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_3004/param_idx_0.txt" ) ;
            int n_gold_3004; n_gold_3004 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_3004/param_idx_1.txt" ) ;
            Object output_2_3004 = f_gold(set_gold_3004, n_gold_3004);
            if (areEquivalent(output_1_3004, output_2_3004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3004 output1=" +
                                   serializeObj(output_1_3004) +
                                   " output2=" + serializeObj(output_2_3004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] set_full_4013; set_full_4013 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4013/param_idx_0.txt" ) ;
            int n_full_4013; n_full_4013 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4013/param_idx_1.txt" ) ;
            Object output_1_4013 = F_FULL(set_full_4013, n_full_4013);
            int[] set_gold_4013; set_gold_4013 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4013/param_idx_0.txt" ) ;
            int n_gold_4013; n_gold_4013 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4013/param_idx_1.txt" ) ;
            Object output_2_4013 = f_gold(set_gold_4013, n_gold_4013);
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
            int[] set_full_4008; set_full_4008 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4008/param_idx_0.txt" ) ;
            int n_full_4008; n_full_4008 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4008/param_idx_1.txt" ) ;
            Object output_1_4008 = F_FULL(set_full_4008, n_full_4008);
            int[] set_gold_4008; set_gold_4008 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4008/param_idx_0.txt" ) ;
            int n_gold_4008; n_gold_4008 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4008/param_idx_1.txt" ) ;
            Object output_2_4008 = f_gold(set_gold_4008, n_gold_4008);
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

        try {
            total_test_case_num++;
            int[] set_full_4023; set_full_4023 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4023/param_idx_0.txt" ) ;
            int n_full_4023; n_full_4023 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4023/param_idx_1.txt" ) ;
            Object output_1_4023 = F_FULL(set_full_4023, n_full_4023);
            int[] set_gold_4023; set_gold_4023 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4023/param_idx_0.txt" ) ;
            int n_gold_4023; n_gold_4023 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4023/param_idx_1.txt" ) ;
            Object output_2_4023 = f_gold(set_gold_4023, n_gold_4023);
            if (areEquivalent(output_1_4023, output_2_4023)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4023 output1=" +
                                   serializeObj(output_1_4023) +
                                   " output2=" + serializeObj(output_2_4023));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4023 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] set_full_3023; set_full_3023 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_3023/param_idx_0.txt" ) ;
            int n_full_3023; n_full_3023 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_3023/param_idx_1.txt" ) ;
            Object output_1_3023 = F_FULL(set_full_3023, n_full_3023);
            int[] set_gold_3023; set_gold_3023 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_3023/param_idx_0.txt" ) ;
            int n_gold_3023; n_gold_3023 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_3023/param_idx_1.txt" ) ;
            Object output_2_3023 = f_gold(set_gold_3023, n_gold_3023);
            if (areEquivalent(output_1_3023, output_2_3023)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3023 output1=" +
                                   serializeObj(output_1_3023) +
                                   " output2=" + serializeObj(output_2_3023));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3023 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] set_full_4004; set_full_4004 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4004/param_idx_0.txt" ) ;
            int n_full_4004; n_full_4004 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4004/param_idx_1.txt" ) ;
            Object output_1_4004 = F_FULL(set_full_4004, n_full_4004);
            int[] set_gold_4004; set_gold_4004 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4004/param_idx_0.txt" ) ;
            int n_gold_4004; n_gold_4004 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4004/param_idx_1.txt" ) ;
            Object output_2_4004 = f_gold(set_gold_4004, n_gold_4004);
            if (areEquivalent(output_1_4004, output_2_4004)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4004 output1=" +
                                   serializeObj(output_1_4004) +
                                   " output2=" + serializeObj(output_2_4004));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] set_full_4003; set_full_4003 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4003/param_idx_0.txt" ) ;
            int n_full_4003; n_full_4003 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4003/param_idx_1.txt" ) ;
            Object output_1_4003 = F_FULL(set_full_4003, n_full_4003);
            int[] set_gold_4003; set_gold_4003 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4003/param_idx_0.txt" ) ;
            int n_gold_4003; n_gold_4003 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4003/param_idx_1.txt" ) ;
            Object output_2_4003 = f_gold(set_gold_4003, n_gold_4003);
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
            int[] set_full_4009; set_full_4009 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4009/param_idx_0.txt" ) ;
            int n_full_4009; n_full_4009 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4009/param_idx_1.txt" ) ;
            Object output_1_4009 = F_FULL(set_full_4009, n_full_4009);
            int[] set_gold_4009; set_gold_4009 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4009/param_idx_0.txt" ) ;
            int n_gold_4009; n_gold_4009 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4009/param_idx_1.txt" ) ;
            Object output_2_4009 = f_gold(set_gold_4009, n_gold_4009);
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
            int[] set_full_4010; set_full_4010 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4010/param_idx_0.txt" ) ;
            int n_full_4010; n_full_4010 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4010/param_idx_1.txt" ) ;
            Object output_1_4010 = F_FULL(set_full_4010, n_full_4010);
            int[] set_gold_4010; set_gold_4010 = readIntArray ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4010/param_idx_0.txt" ) ;
            int n_gold_4010; n_gold_4010 = readInt ( "../LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY/test_4010/param_idx_1.txt" ) ;
            Object output_2_4010 = f_gold(set_gold_4010, n_gold_4010);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
