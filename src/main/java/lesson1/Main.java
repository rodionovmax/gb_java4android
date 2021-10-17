package lesson1;

public class Main {
    public static void main(String[] args) {
        printHelloWorld();
        
        testVars();

        testAppraisal();
    }

    static void printHelloWorld() {
        System.out.println("Hello world from method");
    }

    private static void testVars() {
        int appleCount;
        appleCount = 9;
        int orangeCount = 5;
        System.out.println(appleCount / orangeCount);
    }

    private static void testAppraisal() {
        int appraisal = 4;
        System.out.println("Student's appraisal: " + appraisal);

        if (appraisal == 5) {
            System.out.println("Good job! Keep it up!");
        } else if (appraisal == 4) {
            System.out.println("Good, but you can better");
        } else if (appraisal == 1 || appraisal == 2 || appraisal == 3) {
            System.out.println("Do homework better");
        } else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Do homework better");
        } else {
            System.out.println("Don't chit! Tell the truth!");
        }
        System.out.println("Checking dnevnik is finished");
    }
}
