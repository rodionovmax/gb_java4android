package homeworks.practice6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(300);
        Cat cat2 = new Cat(200);
        Dog dog1 = new Dog(510);
        Dog dog2 = new Dog(5);
        Dog dog3 = new Dog(15);

        // Task 1-2
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
        
        // Task 3
        Cat cat3 = new Cat(30);
        Dog dog4 = new Dog(30);
        System.out.println("### Task 3 ###");
        cat3.setRunLimit(450);
        cat3.setSwimLimit(50);
        System.out.println(cat3.run());
        System.out.println(cat3.swim());
        dog4.setRunLimit(450);
        dog4.setSwimLimit(50);
        System.out.println(dog4.run());
        System.out.println(dog4.swim());

        // Task 4
        System.out.println("### Task 4 ###");
        System.out.println("Cats: " + Cat.count);
        System.out.println("Dogs: " + Dog.count);
        System.out.println("Animals: " + Animal.count);

    }
}
