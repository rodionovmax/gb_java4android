package lesson14.annotation.main;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setAge(1);
        System.out.println(cat);

        cat.doWork(null);

    }
}
