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
static int f_gold ( String str ) {
  int n = str . length ( ) ;
  return n * ( n + 1 ) / 2 ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            String str_full_4007; str_full_4007 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4007/param_idx_0.txt" ) ;
            Object output_1_4007 = F_FULL(str_full_4007);
            String str_gold_4007; str_gold_4007 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4007/param_idx_0.txt" ) ;
            Object output_2_4007 = f_gold(str_gold_4007);
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
            String str_full_4009; str_full_4009 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4009/param_idx_0.txt" ) ;
            Object output_1_4009 = F_FULL(str_full_4009);
            String str_gold_4009; str_gold_4009 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4009/param_idx_0.txt" ) ;
            Object output_2_4009 = f_gold(str_gold_4009);
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
            String str_full_4003; str_full_4003 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4003/param_idx_0.txt" ) ;
            Object output_1_4003 = F_FULL(str_full_4003);
            String str_gold_4003; str_gold_4003 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4003/param_idx_0.txt" ) ;
            Object output_2_4003 = f_gold(str_gold_4003);
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
            String str_full_2003; str_full_2003 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_2003/param_idx_0.txt" ) ;
            Object output_1_2003 = F_FULL(str_full_2003);
            String str_gold_2003; str_gold_2003 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_2003/param_idx_0.txt" ) ;
            Object output_2_2003 = f_gold(str_gold_2003);
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
            String str_full_4021; str_full_4021 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4021/param_idx_0.txt" ) ;
            Object output_1_4021 = F_FULL(str_full_4021);
            String str_gold_4021; str_gold_4021 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4021/param_idx_0.txt" ) ;
            Object output_2_4021 = f_gold(str_gold_4021);
            if (areEquivalent(output_1_4021, output_2_4021)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4021 output1=" +
                                   serializeObj(output_1_4021) +
                                   " output2=" + serializeObj(output_2_4021));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4021 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String str_full_4004; str_full_4004 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4004/param_idx_0.txt" ) ;
            Object output_1_4004 = F_FULL(str_full_4004);
            String str_gold_4004; str_gold_4004 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4004/param_idx_0.txt" ) ;
            Object output_2_4004 = f_gold(str_gold_4004);
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
            String str_full_4012; str_full_4012 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4012/param_idx_0.txt" ) ;
            Object output_1_4012 = F_FULL(str_full_4012);
            String str_gold_4012; str_gold_4012 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4012/param_idx_0.txt" ) ;
            Object output_2_4012 = f_gold(str_gold_4012);
            if (areEquivalent(output_1_4012, output_2_4012)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4012 output1=" +
                                   serializeObj(output_1_4012) +
                                   " output2=" + serializeObj(output_2_4012));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4012 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String str_full_4019; str_full_4019 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4019/param_idx_0.txt" ) ;
            Object output_1_4019 = F_FULL(str_full_4019);
            String str_gold_4019; str_gold_4019 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_4019/param_idx_0.txt" ) ;
            Object output_2_4019 = f_gold(str_gold_4019);
            if (areEquivalent(output_1_4019, output_2_4019)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=4019 output1=" +
                                   serializeObj(output_1_4019) +
                                   " output2=" + serializeObj(output_2_4019));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4019 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String str_full_24; str_full_24 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_24/param_idx_0.txt" ) ;
            Object output_1_24 = F_FULL(str_full_24);
            String str_gold_24; str_gold_24 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_24/param_idx_0.txt" ) ;
            Object output_2_24 = f_gold(str_gold_24);
            if (areEquivalent(output_1_24, output_2_24)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=24 output1=" +
                                   serializeObj(output_1_24) +
                                   " output2=" + serializeObj(output_2_24));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=24 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            String str_full_3004; str_full_3004 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_3004/param_idx_0.txt" ) ;
            Object output_1_3004 = F_FULL(str_full_3004);
            String str_gold_3004; str_gold_3004 = readString ( "../NUMBER_SUBSTRINGS_STRING/test_3004/param_idx_0.txt" ) ;
            Object output_2_3004 = f_gold(str_gold_3004);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
