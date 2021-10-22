package lesson2;

public class WhileTest {
    public static void main(String[] args) {

        int countApple = 10;
        while(countApple > 0) {
            System.out.println("One more apple was eaten. There are " + --countApple + " left");
        }
        System.out.println(countApple);

        int a = 15;
        do {
            System.out.println("a = " + a);
        } while (a < 10);
    }
}
