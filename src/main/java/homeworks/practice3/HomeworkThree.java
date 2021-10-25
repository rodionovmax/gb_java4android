package homeworks.practice3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class HomeworkThree {
    public static void main(String[] args) {

        int[] arr = createBinaryArray();
        convertBinaryArray(arr);

        createOneHundredElementsArray();

        multiplyArrayElementsByTwo();

        fillOutDoubleArrayDiagonalsWithOnes();

        buildArray(10, 3);
        buildArray(4, 123);

        findMinAndMaxInRandomArray();

        checkBalance();
    }

    // Task 1.
    private static int[] createBinaryArray() {

        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println("Original binary array: " + Arrays.toString(arr));
        return arr;
    }


    private static void convertBinaryArray(int[] binaryArray) {
        for (int i = 0; i < binaryArray.length; i++) {
            if(binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }
        }
        System.out.println("Converted binary array: " + Arrays.toString(binaryArray));
    }

    // Task 2.
    private static void createOneHundredElementsArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Task 3.
    private static void multiplyArrayElementsByTwo() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Formatted array: " + Arrays.toString(arr));
    }

    // Task 4.
    private static void fillOutDoubleArrayDiagonalsWithOnes() {
        int ARRAY_SIZE = 5;
        int[][] doubleArr = new int[ARRAY_SIZE][ARRAY_SIZE];
        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                doubleArr[i][ARRAY_SIZE - i -1] = 1;
                doubleArr[i][i] = 1;
                // Option 2.
                /*if (i == j) {
                    doubleArr[i][j] = 1;
                }*/
                System.out.printf("%2d", doubleArr[i][j]);
            }
            System.out.println();
        }
    }

    // Task 5.
    private static int[] buildArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.printf("Array with size %d and initial values %d: %s%n", len, initialValue, Arrays.toString(arr));
        return arr;
    }

    // Task 6.
    private static void findMinAndMaxInRandomArray() {
        Random random = new Random();
        int ARRAY_SIZE = (int)(Math.random() * 10) + 1;
        int[] arr = new int[ARRAY_SIZE];

        // Create an array with size equals ARRAY_SIZE and each element randomly created in range from 1 to 100
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println("Array: " + Arrays.toString(arr));

        // Solution 1.
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 1; i < ARRAY_SIZE; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.printf("Min value in array = %d. Max value in array = %d%n", minValue, maxValue);

        // Solution 2. Alternative using sort method from Arrays library
        Arrays.sort(arr);
        System.out.printf("Alternative method#2: Min value in array %d. Max value in array = %d%n", arr[0], arr[arr.length - 1]);
    }

    // Task 7.
    private static void checkBalance() {
        Random random = new Random();
        // ARRAY_SIZE in range from 4 to 10
        int ARRAY_SIZE = (int)(Math.random() * 7) + 4;
        int[] arr = new int[ARRAY_SIZE];
        // create an array with elements in range 1 to 10 and size ARRAY_SIZE
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = random.nextInt(10) + 1;
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
