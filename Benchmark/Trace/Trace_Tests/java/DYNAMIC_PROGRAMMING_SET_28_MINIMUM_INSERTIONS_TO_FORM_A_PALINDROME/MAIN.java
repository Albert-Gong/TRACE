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
static int f_gold ( char str [ ] , int l , int h ) {
  if ( l > h ) return Integer . MAX_VALUE ;
  if ( l == h ) return 0 ;
  if ( l == h - 1 ) return ( str [ l ] == str [ h ] ) ? 0 : 1 ;
  return ( str [ l ] == str [ h ] ) ? f_gold ( str , l + 1 , h - 1 ) : ( Integer . min ( f_gold ( str , l , h - 1 ) , f_gold ( str , l + 1 , h ) ) + 1 ) ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            char[] str_full_4004; str_full_4004 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4004/param_idx_0.txt" ) ;
            int l_full_4004; l_full_4004 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4004/param_idx_1.txt" ) ;
            int h_full_4004; h_full_4004 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4004/param_idx_2.txt" ) ;
            Object output_1_4004 = F_FULL(str_full_4004, l_full_4004, h_full_4004);
            char[] str_gold_4004; str_gold_4004 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4004/param_idx_0.txt" ) ;
            int l_gold_4004; l_gold_4004 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4004/param_idx_1.txt" ) ;
            int h_gold_4004; h_gold_4004 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4004/param_idx_2.txt" ) ;
            Object output_2_4004 = f_gold(str_gold_4004, l_gold_4004, h_gold_4004);
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
            char[] str_full_2019; str_full_2019 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2019/param_idx_0.txt" ) ;
            int l_full_2019; l_full_2019 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2019/param_idx_1.txt" ) ;
            int h_full_2019; h_full_2019 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2019/param_idx_2.txt" ) ;
            Object output_1_2019 = F_FULL(str_full_2019, l_full_2019, h_full_2019);
            char[] str_gold_2019; str_gold_2019 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2019/param_idx_0.txt" ) ;
            int l_gold_2019; l_gold_2019 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2019/param_idx_1.txt" ) ;
            int h_gold_2019; h_gold_2019 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2019/param_idx_2.txt" ) ;
            Object output_2_2019 = f_gold(str_gold_2019, l_gold_2019, h_gold_2019);
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
            char[] str_full_4005; str_full_4005 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4005/param_idx_0.txt" ) ;
            int l_full_4005; l_full_4005 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4005/param_idx_1.txt" ) ;
            int h_full_4005; h_full_4005 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4005/param_idx_2.txt" ) ;
            Object output_1_4005 = F_FULL(str_full_4005, l_full_4005, h_full_4005);
            char[] str_gold_4005; str_gold_4005 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4005/param_idx_0.txt" ) ;
            int l_gold_4005; l_gold_4005 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4005/param_idx_1.txt" ) ;
            int h_gold_4005; h_gold_4005 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4005/param_idx_2.txt" ) ;
            Object output_2_4005 = f_gold(str_gold_4005, l_gold_4005, h_gold_4005);
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
            char[] str_full_3001; str_full_3001 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3001/param_idx_0.txt" ) ;
            int l_full_3001; l_full_3001 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3001/param_idx_1.txt" ) ;
            int h_full_3001; h_full_3001 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3001/param_idx_2.txt" ) ;
            Object output_1_3001 = F_FULL(str_full_3001, l_full_3001, h_full_3001);
            char[] str_gold_3001; str_gold_3001 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3001/param_idx_0.txt" ) ;
            int l_gold_3001; l_gold_3001 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3001/param_idx_1.txt" ) ;
            int h_gold_3001; h_gold_3001 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3001/param_idx_2.txt" ) ;
            Object output_2_3001 = f_gold(str_gold_3001, l_gold_3001, h_gold_3001);
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
            char[] str_full_4003; str_full_4003 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4003/param_idx_0.txt" ) ;
            int l_full_4003; l_full_4003 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4003/param_idx_1.txt" ) ;
            int h_full_4003; h_full_4003 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4003/param_idx_2.txt" ) ;
            Object output_1_4003 = F_FULL(str_full_4003, l_full_4003, h_full_4003);
            char[] str_gold_4003; str_gold_4003 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4003/param_idx_0.txt" ) ;
            int l_gold_4003; l_gold_4003 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4003/param_idx_1.txt" ) ;
            int h_gold_4003; h_gold_4003 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4003/param_idx_2.txt" ) ;
            Object output_2_4003 = f_gold(str_gold_4003, l_gold_4003, h_gold_4003);
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
            char[] str_full_4009; str_full_4009 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4009/param_idx_0.txt" ) ;
            int l_full_4009; l_full_4009 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4009/param_idx_1.txt" ) ;
            int h_full_4009; h_full_4009 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4009/param_idx_2.txt" ) ;
            Object output_1_4009 = F_FULL(str_full_4009, l_full_4009, h_full_4009);
            char[] str_gold_4009; str_gold_4009 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4009/param_idx_0.txt" ) ;
            int l_gold_4009; l_gold_4009 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4009/param_idx_1.txt" ) ;
            int h_gold_4009; h_gold_4009 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_4009/param_idx_2.txt" ) ;
            Object output_2_4009 = f_gold(str_gold_4009, l_gold_4009, h_gold_4009);
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
            char[] str_full_3014; str_full_3014 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3014/param_idx_0.txt" ) ;
            int l_full_3014; l_full_3014 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3014/param_idx_1.txt" ) ;
            int h_full_3014; h_full_3014 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3014/param_idx_2.txt" ) ;
            Object output_1_3014 = F_FULL(str_full_3014, l_full_3014, h_full_3014);
            char[] str_gold_3014; str_gold_3014 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3014/param_idx_0.txt" ) ;
            int l_gold_3014; l_gold_3014 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3014/param_idx_1.txt" ) ;
            int h_gold_3014; h_gold_3014 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3014/param_idx_2.txt" ) ;
            Object output_2_3014 = f_gold(str_gold_3014, l_gold_3014, h_gold_3014);
            if (areEquivalent(output_1_3014, output_2_3014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3014 output1=" +
                                   serializeObj(output_1_3014) +
                                   " output2=" + serializeObj(output_2_3014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            char[] str_full_2017; str_full_2017 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2017/param_idx_0.txt" ) ;
            int l_full_2017; l_full_2017 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2017/param_idx_1.txt" ) ;
            int h_full_2017; h_full_2017 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2017/param_idx_2.txt" ) ;
            Object output_1_2017 = F_FULL(str_full_2017, l_full_2017, h_full_2017);
            char[] str_gold_2017; str_gold_2017 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2017/param_idx_0.txt" ) ;
            int l_gold_2017; l_gold_2017 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2017/param_idx_1.txt" ) ;
            int h_gold_2017; h_gold_2017 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2017/param_idx_2.txt" ) ;
            Object output_2_2017 = f_gold(str_gold_2017, l_gold_2017, h_gold_2017);
            if (areEquivalent(output_1_2017, output_2_2017)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2017 output1=" +
                                   serializeObj(output_1_2017) +
                                   " output2=" + serializeObj(output_2_2017));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2017 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            char[] str_full_2014; str_full_2014 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2014/param_idx_0.txt" ) ;
            int l_full_2014; l_full_2014 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2014/param_idx_1.txt" ) ;
            int h_full_2014; h_full_2014 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2014/param_idx_2.txt" ) ;
            Object output_1_2014 = F_FULL(str_full_2014, l_full_2014, h_full_2014);
            char[] str_gold_2014; str_gold_2014 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2014/param_idx_0.txt" ) ;
            int l_gold_2014; l_gold_2014 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2014/param_idx_1.txt" ) ;
            int h_gold_2014; h_gold_2014 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_2014/param_idx_2.txt" ) ;
            Object output_2_2014 = f_gold(str_gold_2014, l_gold_2014, h_gold_2014);
            if (areEquivalent(output_1_2014, output_2_2014)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2014 output1=" +
                                   serializeObj(output_1_2014) +
                                   " output2=" + serializeObj(output_2_2014));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2014 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            char[] str_full_3024; str_full_3024 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3024/param_idx_0.txt" ) ;
            int l_full_3024; l_full_3024 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3024/param_idx_1.txt" ) ;
            int h_full_3024; h_full_3024 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3024/param_idx_2.txt" ) ;
            Object output_1_3024 = F_FULL(str_full_3024, l_full_3024, h_full_3024);
            char[] str_gold_3024; str_gold_3024 = readCharArray ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3024/param_idx_0.txt" ) ;
            int l_gold_3024; l_gold_3024 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3024/param_idx_1.txt" ) ;
            int h_gold_3024; h_gold_3024 = readInt ( "../DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME/test_3024/param_idx_2.txt" ) ;
            Object output_2_3024 = f_gold(str_gold_3024, l_gold_3024, h_gold_3024);
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



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
