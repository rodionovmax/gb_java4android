package lesson2;

public class TestMethods {

    public static void main(String[] args) {
        sumVarsAndPrint(3,5);
        sumVarsAndPrint(4,7);
        sumVarsAndPrint(13411324, 242412);

        int a = sumVarsAndReturn(10, 20);
        System.out.println("variable after return " + a);
    }

    private static void sumVarsAndPrint(int a, int b) {
        /*int a = 3;
        int b = 5;*/

        int result = a + b;
//        System.out.println("Sum numbers " + a + " and " + b + " equals " + result);
        System.out.printf("Sum of numbers %d and %d equals %d\n", a, b, result);
    }

    private static int sumVarsAndReturn(int a, int b) {
        int result = a + b;
        return result;
    }


}
