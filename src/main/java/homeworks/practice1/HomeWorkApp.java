package homeworks.practice1;

public class HomeWorkApp {

    // Task 1. Create main method
    public static void main(String[] args) {
        System.out.println("##### Task 1 #####");
        System.out.println("--> Main method is here <--");

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();
    }

    // Task 2.
    private static void printThreeWords() {
        System.out.println("##### Task 2 #####");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Task 3.
    private static void checkSumSign() {
        System.out.println("##### Task 3 #####");
        int a = 10;
        int b = -19;
        int sum = a+b;
        if (sum > 0) {
            System.out.println("The sum of a = "+ a +" and b = "+ b +" is a positive number");
        } else {
            System.out.println("The sum of a = "+ a +" and b = "+ b +" is a negative number");
        }
    }

    // Task 4.
    private static void printColor() {
        System.out.println("##### Task 4 #####");
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        } else {
            System.out.println("something went wrong :-(");
        }
    }

    // Task 5.
    private static void compareNumbers() {
        System.out.println("##### Task 5 #####");
        int a = -13;
        int b = 209;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
