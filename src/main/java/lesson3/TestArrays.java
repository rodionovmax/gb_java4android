package lesson3;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 7;

        int[] data = new int[ARRAY_SIZE];
        Arrays.fill(data, -1);

        data[0] = 3;
        data[3] = 5;
        data[data.length - 1] = 7;

        Arrays.sort(data);

//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + " ");
//        }

//        System.out.println(Arrays.toString(data));
        
        int[] arr = {0, 2, 5, 8, 6, 3, 6, 1, 4, 7};

        int[][] deepData = new int[ARRAY_SIZE][3];

        int n = 1;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = n++;
            }
        }

//        System.out.println(Arrays.deepToString(deepData));

        /*for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%3d", deepData[i][j]);
            }
            System.out.println();
        }*/

        for (int i = 0; i < deepData.length; i++) {
            int[] datum = deepData[i];
            for (int j = 0; j < datum.length; j++) {
                int num = datum[j];
                System.out.printf("%3d", num);
            }
            System.out.println();
        }

        //for-each
        for(int[] datum : deepData) {
            for(int num : datum) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }

        String str = "Hello, word";
        for (char c : str.toCharArray()) {
            System.out.print(c + "! ");
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "∆ ");
        }
        System.out.println();
        for (int i = 0; i < 10000; i++) {
            System.out.printf("Symbol %d => %c%n", i, i);
        }
    }
}
