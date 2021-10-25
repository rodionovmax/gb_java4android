package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        testConsoleInput();
        testRandom();
    }

    private static void testConsoleInput() {
        int a = getIntFromScanner();
        int b = getIntFromScanner();

        TestMethods.multiply(a, b);
    }

    private static int getIntFromScanner() {

        do {
            System.out.print("Enter a number: ");
            if (in.hasNextInt()) {
                return in.nextInt();
            } else {
                in.next();
            }
            System.out.println("It's not a number! Don't fuck with me");
        } while (true);
    }

    private static void testRandom() {
        int[] data = new int[40];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {

            // Option 1. Using Random
            data[i] = random.nextInt(); // -2147000000 -> +2147kk
            data[i] = random.nextInt(10); // 0-9
            data[i] = random.nextInt(8) + 3; // 3-10
            data[i] = random.nextInt(12) -5; // -5-6

            // Option 2. Using Math
            data[i] = (int)Math.random(); // 0-0
            data[i] = (int)(Math.random() * 10); // 0-9
            data[i] = (int)(Math.random() * 8) + 3; // 3-10
            data[i] = (int)(Math.random() * 12) - 5; // -5-6
        }
        System.out.println(Arrays.toString(data));
    }
}
