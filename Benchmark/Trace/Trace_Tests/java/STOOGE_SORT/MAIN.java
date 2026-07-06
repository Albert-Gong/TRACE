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
static void f_gold ( int arr [ ] , int l , int h ) {
  if ( l >= h ) return ;
  if ( arr [ l ] > arr [ h ] ) {
    int t = arr [ l ] ;
    arr [ l ] = arr [ h ] ;
    arr [ h ] = t ;
  }
  if ( h - l + 1 > 2 ) {
    int t = ( h - l + 1 ) / 3 ;
    f_gold ( arr , l , h - t ) ;
    f_gold ( arr , l + t , h ) ;
    f_gold ( arr , l , h - t ) ;
  }
}




  public static void start() {

    int total_test_case_num = 0;
    int pass_test_case_num = 0;
    int exception_test_case_num = 0;
  
  
    //TEST_SUITE_FILL
        try {
            total_test_case_num++;
            int[] arr_full_4001; arr_full_4001 = readIntArray ( "../STOOGE_SORT/test_4001/param_idx_0.txt" ) ;
            int l_full_4001; l_full_4001 = readInt ( "../STOOGE_SORT/test_4001/param_idx_1.txt" ) ;
            int h_full_4001; h_full_4001 = readInt ( "../STOOGE_SORT/test_4001/param_idx_2.txt" ) ;
            F_FULL (arr_full_4001, l_full_4001, h_full_4001);
            int[] arr_gold_4001; arr_gold_4001 = readIntArray ( "../STOOGE_SORT/test_4001/param_idx_0.txt" ) ;
            int l_gold_4001; l_gold_4001 = readInt ( "../STOOGE_SORT/test_4001/param_idx_1.txt" ) ;
            int h_gold_4001; h_gold_4001 = readInt ( "../STOOGE_SORT/test_4001/param_idx_2.txt" ) ;
            f_gold (arr_gold_4001, l_gold_4001, h_gold_4001);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4001 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3002; arr_full_3002 = readIntArray ( "../STOOGE_SORT/test_3002/param_idx_0.txt" ) ;
            int l_full_3002; l_full_3002 = readInt ( "../STOOGE_SORT/test_3002/param_idx_1.txt" ) ;
            int h_full_3002; h_full_3002 = readInt ( "../STOOGE_SORT/test_3002/param_idx_2.txt" ) ;
            F_FULL (arr_full_3002, l_full_3002, h_full_3002);
            int[] arr_gold_3002; arr_gold_3002 = readIntArray ( "../STOOGE_SORT/test_3002/param_idx_0.txt" ) ;
            int l_gold_3002; l_gold_3002 = readInt ( "../STOOGE_SORT/test_3002/param_idx_1.txt" ) ;
            int h_gold_3002; h_gold_3002 = readInt ( "../STOOGE_SORT/test_3002/param_idx_2.txt" ) ;
            f_gold (arr_gold_3002, l_gold_3002, h_gold_3002);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3004; arr_full_3004 = readIntArray ( "../STOOGE_SORT/test_3004/param_idx_0.txt" ) ;
            int l_full_3004; l_full_3004 = readInt ( "../STOOGE_SORT/test_3004/param_idx_1.txt" ) ;
            int h_full_3004; h_full_3004 = readInt ( "../STOOGE_SORT/test_3004/param_idx_2.txt" ) ;
            F_FULL (arr_full_3004, l_full_3004, h_full_3004);
            int[] arr_gold_3004; arr_gold_3004 = readIntArray ( "../STOOGE_SORT/test_3004/param_idx_0.txt" ) ;
            int l_gold_3004; l_gold_3004 = readInt ( "../STOOGE_SORT/test_3004/param_idx_1.txt" ) ;
            int h_gold_3004; h_gold_3004 = readInt ( "../STOOGE_SORT/test_3004/param_idx_2.txt" ) ;
            f_gold (arr_gold_3004, l_gold_3004, h_gold_3004);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3004 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_4002; arr_full_4002 = readIntArray ( "../STOOGE_SORT/test_4002/param_idx_0.txt" ) ;
            int l_full_4002; l_full_4002 = readInt ( "../STOOGE_SORT/test_4002/param_idx_1.txt" ) ;
            int h_full_4002; h_full_4002 = readInt ( "../STOOGE_SORT/test_4002/param_idx_2.txt" ) ;
            F_FULL (arr_full_4002, l_full_4002, h_full_4002);
            int[] arr_gold_4002; arr_gold_4002 = readIntArray ( "../STOOGE_SORT/test_4002/param_idx_0.txt" ) ;
            int l_gold_4002; l_gold_4002 = readInt ( "../STOOGE_SORT/test_4002/param_idx_1.txt" ) ;
            int h_gold_4002; h_gold_4002 = readInt ( "../STOOGE_SORT/test_4002/param_idx_2.txt" ) ;
            f_gold (arr_gold_4002, l_gold_4002, h_gold_4002);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=4002 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3007; arr_full_3007 = readIntArray ( "../STOOGE_SORT/test_3007/param_idx_0.txt" ) ;
            int l_full_3007; l_full_3007 = readInt ( "../STOOGE_SORT/test_3007/param_idx_1.txt" ) ;
            int h_full_3007; h_full_3007 = readInt ( "../STOOGE_SORT/test_3007/param_idx_2.txt" ) ;
            F_FULL (arr_full_3007, l_full_3007, h_full_3007);
            int[] arr_gold_3007; arr_gold_3007 = readIntArray ( "../STOOGE_SORT/test_3007/param_idx_0.txt" ) ;
            int l_gold_3007; l_gold_3007 = readInt ( "../STOOGE_SORT/test_3007/param_idx_1.txt" ) ;
            int h_gold_3007; h_gold_3007 = readInt ( "../STOOGE_SORT/test_3007/param_idx_2.txt" ) ;
            f_gold (arr_gold_3007, l_gold_3007, h_gold_3007);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3007 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2005; arr_full_2005 = readIntArray ( "../STOOGE_SORT/test_2005/param_idx_0.txt" ) ;
            int l_full_2005; l_full_2005 = readInt ( "../STOOGE_SORT/test_2005/param_idx_1.txt" ) ;
            int h_full_2005; h_full_2005 = readInt ( "../STOOGE_SORT/test_2005/param_idx_2.txt" ) ;
            F_FULL (arr_full_2005, l_full_2005, h_full_2005);
            int[] arr_gold_2005; arr_gold_2005 = readIntArray ( "../STOOGE_SORT/test_2005/param_idx_0.txt" ) ;
            int l_gold_2005; l_gold_2005 = readInt ( "../STOOGE_SORT/test_2005/param_idx_1.txt" ) ;
            int h_gold_2005; h_gold_2005 = readInt ( "../STOOGE_SORT/test_2005/param_idx_2.txt" ) ;
            f_gold (arr_gold_2005, l_gold_2005, h_gold_2005);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2005 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2000; arr_full_2000 = readIntArray ( "../STOOGE_SORT/test_2000/param_idx_0.txt" ) ;
            int l_full_2000; l_full_2000 = readInt ( "../STOOGE_SORT/test_2000/param_idx_1.txt" ) ;
            int h_full_2000; h_full_2000 = readInt ( "../STOOGE_SORT/test_2000/param_idx_2.txt" ) ;
            F_FULL (arr_full_2000, l_full_2000, h_full_2000);
            int[] arr_gold_2000; arr_gold_2000 = readIntArray ( "../STOOGE_SORT/test_2000/param_idx_0.txt" ) ;
            int l_gold_2000; l_gold_2000 = readInt ( "../STOOGE_SORT/test_2000/param_idx_1.txt" ) ;
            int h_gold_2000; h_gold_2000 = readInt ( "../STOOGE_SORT/test_2000/param_idx_2.txt" ) ;
            f_gold (arr_gold_2000, l_gold_2000, h_gold_2000);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2006; arr_full_2006 = readIntArray ( "../STOOGE_SORT/test_2006/param_idx_0.txt" ) ;
            int l_full_2006; l_full_2006 = readInt ( "../STOOGE_SORT/test_2006/param_idx_1.txt" ) ;
            int h_full_2006; h_full_2006 = readInt ( "../STOOGE_SORT/test_2006/param_idx_2.txt" ) ;
            F_FULL (arr_full_2006, l_full_2006, h_full_2006);
            int[] arr_gold_2006; arr_gold_2006 = readIntArray ( "../STOOGE_SORT/test_2006/param_idx_0.txt" ) ;
            int l_gold_2006; l_gold_2006 = readInt ( "../STOOGE_SORT/test_2006/param_idx_1.txt" ) ;
            int h_gold_2006; h_gold_2006 = readInt ( "../STOOGE_SORT/test_2006/param_idx_2.txt" ) ;
            f_gold (arr_gold_2006, l_gold_2006, h_gold_2006);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2006 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_3000; arr_full_3000 = readIntArray ( "../STOOGE_SORT/test_3000/param_idx_0.txt" ) ;
            int l_full_3000; l_full_3000 = readInt ( "../STOOGE_SORT/test_3000/param_idx_1.txt" ) ;
            int h_full_3000; h_full_3000 = readInt ( "../STOOGE_SORT/test_3000/param_idx_2.txt" ) ;
            F_FULL (arr_full_3000, l_full_3000, h_full_3000);
            int[] arr_gold_3000; arr_gold_3000 = readIntArray ( "../STOOGE_SORT/test_3000/param_idx_0.txt" ) ;
            int l_gold_3000; l_gold_3000 = readInt ( "../STOOGE_SORT/test_3000/param_idx_1.txt" ) ;
            int h_gold_3000; h_gold_3000 = readInt ( "../STOOGE_SORT/test_3000/param_idx_2.txt" ) ;
            f_gold (arr_gold_3000, l_gold_3000, h_gold_3000);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=3000 | error " + e.getMessage());
        }

        try {
            total_test_case_num++;
            int[] arr_full_2012; arr_full_2012 = readIntArray ( "../STOOGE_SORT/test_2012/param_idx_0.txt" ) ;
            int l_full_2012; l_full_2012 = readInt ( "../STOOGE_SORT/test_2012/param_idx_1.txt" ) ;
            int h_full_2012; h_full_2012 = readInt ( "../STOOGE_SORT/test_2012/param_idx_2.txt" ) ;
            F_FULL (arr_full_2012, l_full_2012, h_full_2012);
            int[] arr_gold_2012; arr_gold_2012 = readIntArray ( "../STOOGE_SORT/test_2012/param_idx_0.txt" ) ;
            int l_gold_2012; l_gold_2012 = readInt ( "../STOOGE_SORT/test_2012/param_idx_1.txt" ) ;
            int h_gold_2012; h_gold_2012 = readInt ( "../STOOGE_SORT/test_2012/param_idx_2.txt" ) ;
            f_gold (arr_gold_2012, l_gold_2012, h_gold_2012);
            pass_test_case_num++;
        } catch (Exception e) {
            exception_test_case_num++;
            System.out.println("|EXCEPTION| test_id=2012 | error " + e.getMessage());
        }



    System.out.println("|OUTPUT| total " + total_test_case_num +
            " | passed " + pass_test_case_num +
            " | exception " + exception_test_case_num);

  }

  public static void main(String[] args) {
    start();
  }
}
