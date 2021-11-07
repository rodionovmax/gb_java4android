package homeworks.practice6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(300);
        Cat cat2 = new Cat(200);
        Dog dog1 = new Dog(510);
        Dog dog2 = new Dog(5);
        Dog dog3 = new Dog(15);


        System.out.println(cat1.run());
        System.out.println(cat1.swim());
        System.out.println(cat2.run());
        System.out.println(cat2.swim());
        System.out.println(dog1.run());
        System.out.println(dog1.swim());
        System.out.println(dog2.run());
        System.out.println(dog2.swim());
        System.out.println(dog3.run());
        System.out.println(dog3.swim());
    }
}
