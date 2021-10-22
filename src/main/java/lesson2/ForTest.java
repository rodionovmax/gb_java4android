package lesson2;

public class ForTest {
    public static void main(String[] args) {

        /*
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
         */

        /*
        int externalI = 0;
        for (; externalI < 10; externalI++) {
            System.out.println(externalI);
        }
        System.out.println("End I: " + externalI);
         */

        final int LIMIT = 10;
        for (int i = 0; i < LIMIT; i++) {
            for (int j = 0; j < LIMIT; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        String str = "";
        for (int i = 0; i < LIMIT; i++) {
            if (i % 2 == 0) {
                str += "†";
            } else {
                str += "£";
            }
            System.out.print(str);
            for (int j = 0; j < LIMIT - 1 -i; j++) {
                System.out.print("π");
            }
            System.out.println();
        }

        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                break;
            }
            if (i % 2 == 0 && i != 0) {
                continue;
            }
            System.out.println("i: " + i);
        }
        System.out.println("END!");
    }
}
