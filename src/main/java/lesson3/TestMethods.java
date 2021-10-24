package lesson3;

import java.util.Arrays;

public class TestMethods {
    public static void main(String[] args) {
        multiply(3, 4);
        multiply(3.6, 4.2);
        multiply(7);
        multiply(new int[]{1,2,3,4,5,6,7,8,9,10});
//        multiply(1,2,3,4,5,6,7,8,9,10);
    }



    private static double multiply(double a, double b) {
        double multiple = a * b;
        System.out.printf("Multiplication of numbers %f and %f equals %f(fractional)%n", a, b, multiple);
        return multiple;
    }

//    private static void multiply(int a) {
//        int multiple = a * a;
//        System.out.printf("Square of number %d equals %d%n", a, multiple);
//    }

    static void multiply(int a) {
        multiply(a, a);
    }

    /*static void multiply(int[] arr) {
        int multiple = 1;
        for (int num: arr) {
            multiple *= num;
        }
        System.out.printf("Multiplication of all numbers equals %d(integer)%n", multiple);
    }*/

    static void multiply(int... arr) {
        int multiple = 1;
        for (int num: arr) {
            multiple *= num;
        }
        System.out.printf("Multiplication of all numbers equals %d(integer)%n", multiple);
    }

    static void multiply(int a, int b) {
        int multiple = a * b;
        System.out.printf("Multiplication of numbers %d and %d equals %d(integer)%n", a, b, multiple);
    }
}
