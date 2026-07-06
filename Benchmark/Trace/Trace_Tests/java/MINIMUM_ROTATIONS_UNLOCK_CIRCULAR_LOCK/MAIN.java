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
static int f_gold ( int input , int unlock_code ) {
  int rotation = 0 ;
  int input_digit , code_digit ;
  while ( input > 0 || unlock_code > 0 ) {
    input_digit = input % 10 ;
    code_digit = unlock_code % 10 ;
    rotation += Math . min ( Math . abs ( input_digit - code_digit ) , 10 - Math . abs ( input_digit - code_digit ) ) ;
    input /= 10 ;
    unlock_code /= 10 ;
  }
  return rotation ;
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int input_full_1010; input_full_1010 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_1010/param_idx_0.txt" ) ;
            int unlock_code_full_1010; unlock_code_full_1010 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_1010/param_idx_1.txt" ) ;
            Object output_1_1010 = F_FULL(input_full_1010, unlock_code_full_1010);
            int input_gold_1010; input_gold_1010 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_1010/param_idx_0.txt" ) ;
            int unlock_code_gold_1010; unlock_code_gold_1010 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_1010/param_idx_1.txt" ) ;
            Object output_2_1010 = f_gold(input_gold_1010, unlock_code_gold_1010);
            if (areEquivalent(output_1_1010, output_2_1010)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=1010 output1=" +
                                   serializeObj(output_1_1010) +
                                   " output2=" + serializeObj(output_2_1010));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=1010 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int input_full_2005; input_full_2005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2005/param_idx_0.txt" ) ;
            int unlock_code_full_2005; unlock_code_full_2005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2005/param_idx_1.txt" ) ;
            Object output_1_2005 = F_FULL(input_full_2005, unlock_code_full_2005);
            int input_gold_2005; input_gold_2005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2005/param_idx_0.txt" ) ;
            int unlock_code_gold_2005; unlock_code_gold_2005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2005/param_idx_1.txt" ) ;
            Object output_2_2005 = f_gold(input_gold_2005, unlock_code_gold_2005);
            if (areEquivalent(output_1_2005, output_2_2005)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2005 output1=" +
                                   serializeObj(output_1_2005) +
                                   " output2=" + serializeObj(output_2_2005));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2005 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int input_full_14; input_full_14 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_14/param_idx_0.txt" ) ;
            int unlock_code_full_14; unlock_code_full_14 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_14/param_idx_1.txt" ) ;
            Object output_1_14 = F_FULL(input_full_14, unlock_code_full_14);
            int input_gold_14; input_gold_14 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_14/param_idx_0.txt" ) ;
            int unlock_code_gold_14; unlock_code_gold_14 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_14/param_idx_1.txt" ) ;
            Object output_2_14 = f_gold(input_gold_14, unlock_code_gold_14);
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
            int input_full_4000; input_full_4000 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_4000/param_idx_0.txt" ) ;
            int unlock_code_full_4000; unlock_code_full_4000 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_4000/param_idx_1.txt" ) ;
            Object output_1_4000 = F_FULL(input_full_4000, unlock_code_full_4000);
            int input_gold_4000; input_gold_4000 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_4000/param_idx_0.txt" ) ;
            int unlock_code_gold_4000; unlock_code_gold_4000 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_4000/param_idx_1.txt" ) ;
            Object output_2_4000 = f_gold(input_gold_4000, unlock_code_gold_4000);
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
            int input_full_3005; input_full_3005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_3005/param_idx_0.txt" ) ;
            int unlock_code_full_3005; unlock_code_full_3005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_3005/param_idx_1.txt" ) ;
            Object output_1_3005 = F_FULL(input_full_3005, unlock_code_full_3005);
            int input_gold_3005; input_gold_3005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_3005/param_idx_0.txt" ) ;
            int unlock_code_gold_3005; unlock_code_gold_3005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_3005/param_idx_1.txt" ) ;
            Object output_2_3005 = f_gold(input_gold_3005, unlock_code_gold_3005);
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
            int input_full_3000; input_full_3000 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_3000/param_idx_0.txt" ) ;
            int unlock_code_full_3000; unlock_code_full_3000 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_3000/param_idx_1.txt" ) ;
            Object output_1_3000 = F_FULL(input_full_3000, unlock_code_full_3000);
            int input_gold_3000; input_gold_3000 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_3000/param_idx_0.txt" ) ;
            int unlock_code_gold_3000; unlock_code_gold_3000 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_3000/param_idx_1.txt" ) ;
            Object output_2_3000 = f_gold(input_gold_3000, unlock_code_gold_3000);
            if (areEquivalent(output_1_3000, output_2_3000)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=3000 output1=" +
                                   serializeObj(output_1_3000) +
                                   " output2=" + serializeObj(output_2_3000));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int input_full_1005; input_full_1005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_1005/param_idx_0.txt" ) ;
            int unlock_code_full_1005; unlock_code_full_1005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_1005/param_idx_1.txt" ) ;
            Object output_1_1005 = F_FULL(input_full_1005, unlock_code_full_1005);
            int input_gold_1005; input_gold_1005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_1005/param_idx_0.txt" ) ;
            int unlock_code_gold_1005; unlock_code_gold_1005 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_1005/param_idx_1.txt" ) ;
            Object output_2_1005 = f_gold(input_gold_1005, unlock_code_gold_1005);
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
            int input_full_2002; input_full_2002 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2002/param_idx_0.txt" ) ;
            int unlock_code_full_2002; unlock_code_full_2002 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2002/param_idx_1.txt" ) ;
            Object output_1_2002 = F_FULL(input_full_2002, unlock_code_full_2002);
            int input_gold_2002; input_gold_2002 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2002/param_idx_0.txt" ) ;
            int unlock_code_gold_2002; unlock_code_gold_2002 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2002/param_idx_1.txt" ) ;
            Object output_2_2002 = f_gold(input_gold_2002, unlock_code_gold_2002);
            if (areEquivalent(output_1_2002, output_2_2002)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=2002 output1=" +
                                   serializeObj(output_1_2002) +
                                   " output2=" + serializeObj(output_2_2002));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int input_full_2003; input_full_2003 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2003/param_idx_0.txt" ) ;
            int unlock_code_full_2003; unlock_code_full_2003 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2003/param_idx_1.txt" ) ;
            Object output_1_2003 = F_FULL(input_full_2003, unlock_code_full_2003);
            int input_gold_2003; input_gold_2003 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2003/param_idx_0.txt" ) ;
            int unlock_code_gold_2003; unlock_code_gold_2003 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_2003/param_idx_1.txt" ) ;
            Object output_2_2003 = f_gold(input_gold_2003, unlock_code_gold_2003);
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
            int input_full_12; input_full_12 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_12/param_idx_0.txt" ) ;
            int unlock_code_full_12; unlock_code_full_12 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_12/param_idx_1.txt" ) ;
            Object output_1_12 = F_FULL(input_full_12, unlock_code_full_12);
            int input_gold_12; input_gold_12 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_12/param_idx_0.txt" ) ;
            int unlock_code_gold_12; unlock_code_gold_12 = readInt ( "../MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK/test_12/param_idx_1.txt" ) ;
            Object output_2_12 = f_gold(input_gold_12, unlock_code_gold_12);
            if (areEquivalent(output_1_12, output_2_12)) {
                pass_test_case_num++;
            } else {
                System.out.println("|FAIL| test_id=12 output1=" +
                                   serializeObj(output_1_12) +
                                   " output2=" + serializeObj(output_2_12));
            }
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=12 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
