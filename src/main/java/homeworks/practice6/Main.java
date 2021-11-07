package homeworks.practice6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(300);
        Cat cat2 = new Cat(50);
        Dog dog1 = new Dog(510);
        Dog dog2 = new Dog(5);
        Dog dog3 = new Dog(15);

        cat1.run();
        cat1.swim();
        cat2.run();
        cat2.swim();
        dog1.run();
        dog1.swim();
        dog2.run();
        dog2.swim();
        dog3.run();
        dog3.swim();
    }
}
