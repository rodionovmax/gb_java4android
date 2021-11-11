package lesson8.part2;

import lesson8.part1.Dog;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Martin", Color.WHITE, 1);
        Cat cat2 = new Cat("Shava", Color.GREY, 3);
//        Cat cat2 = new Cat("Martin", ColorOLD.BLACK_old, 1);

        System.out.println(cat1.getColor().equals(cat2.getColor()));

//        switch (cat1.getColor()) {
//            case GREY ->
//        }

        System.out.println(cat1);
        testAnon();

    }

    private static void testAnon() {
        AbstractClassTemp baz = new AbstractClassTemp() {
            @Override
            void action() {
                System.out.println("baz11");
            }
        };

        AbstractClassTemp hello = new AbstractClassTemp() {
            @Override
            void action() {
                System.out.println("hello, world");
            }
        };

        lesson8.part1.Dog dog = new Dog() {
            @Override
            public void run() {
                super.run();
                System.out.println("Chihuahua running");
            }
        };

        dog.run();

        baz.action();
        hello.action();
    }
}
