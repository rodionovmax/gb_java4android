package homeworks.practice2;

public class HomeworkTwo {

    public static void main(String[] args) {

        System.out.println(methodOne(3, -197));

        methodTwo(-12);

        System.out.println(methodThree(10));

        methodFour("See how many times I'll print this string", 3);

        System.out.println(isYearLeap(400));
    }

    // Task 1.
    private static boolean methodOne(int a, int b) {
        System.out.println("##### Output for Method One #####");
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        } else {
            return false;
        }
        //return (a + b >= 10) && (a + b <= 20);
    }

    // Task 2.
    private static void methodTwo(int a) {
        System.out.println("##### Output for Method Two #####");
//        if (a >= 0) {
//            return a + ": is positive";
//        } else {
//            return a + ": is negative";
//        }

        // Option 2. (condition) ? (true) : (false);
        String strPattern = "Number " + a;
        strPattern += (a >= 0) ? " positive" : " negative";
        System.out.println(strPattern);
    }

    // Task 3.
    private static boolean methodThree(int a) {
        System.out.println("##### Output for Method Three #####");
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Task 4.
    private static void methodFour(String str, int num) {
        System.out.println("##### Output for Method Four #####");
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    // Task 5.
    private static boolean isYearLeap(int year) {
        System.out.println("##### Output for Method Five #####");
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                return year % 400 == 0;
//            } else return true;
//        } else return false;

        // Option 2.
//        if (year % 400 == 0) {
//            return true;
//        }
//        if (year % 100 == 0) {
//            return false;
//        }
//        return year % 4 == 0;

        // Option 3.
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


}
