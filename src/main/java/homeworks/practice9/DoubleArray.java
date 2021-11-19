package homeworks.practice9;

import java.util.Random;
import java.util.Scanner;

public class DoubleArray {

    public DoubleArray(int arrayLength, int arrayHeight) {
    }

    static Scanner in = new Scanner(System.in);

    public static int enterNumber() {
        do {
            System.out.print("Enter an array dimension: ");
            if (in.hasNextInt()) {
                return in.nextInt();
            } else {
                in.next();
            }
            System.out.println("Please enter a number");
        } while (true);
    }

    public static String[][] checkArraySize(int arrayLength, int arrayHeight) throws MyArraySizeException{
        if ((arrayLength != 4) || (arrayHeight != 4)) {
            throw new MyArraySizeException(arrayLength, arrayHeight);
        } else {
            return new String[arrayLength][arrayHeight];
        }
    }

    public static String[][] buildArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Random random = new Random();
                String letters = "abcdefghijklmnopqrstuvwxyz";
                String numbers = "0123456789";
                String alphanumeric = letters + numbers;
                StringBuilder randomString = new StringBuilder();

                int randomIndex = random.nextInt(alphanumeric.length());
                String character = String.valueOf(randomString.append(alphanumeric.charAt(randomIndex)));
                arr[i][j] = character;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static int sumArray(String[][] arr) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isInteger(arr[i][j])) {
                    sum += Integer.parseInt(arr[i][j]);
                } else {
//                    throw new MyArrayDataException(i, j);
                    System.out.printf("Cell [%s,%s] contains not numeric character%n", i, j);  // using sout here because throw new exception throws exception just once in array
                }
            }
        }
        return sum;
    }

    public static boolean isInteger(String number){
        try {
            Integer.parseInt(number);
        } catch(NumberFormatException e){
//            e.printStackTrace();
            return false;
        }
        return true;
    }
}
