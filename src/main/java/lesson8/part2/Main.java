package lesson8.part2;

import lesson8.part1.Dog;

public class Main {

    public static void main(String[] args) {

//        testEnum();
        testInnerClasses();

//        testAnon();
    }

    private static void testEnum() {
        Cat cat1 = new Cat("Martin", Color.WHITE, 1);
        Cat cat2 = new Cat("Shava", Color.GREY, 3);

        System.out.println(cat1.getColor().equals(cat2.getColor()));
//        Cat cat2 = new Cat("Martin", ColorOLD.BLACK_old, 1);

//        switch (cat1.getColor()) {
//            case GREY ->
//        }

        System.out.println(cat1);

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

    private static void testInnerClasses() {
//        Cat cat = new Cat(Color.GREY);
//        Cat.CatAttributes catAttributes = cat.new CatAttributes("Martin", 2, 10);
//        System.out.println(catAttributes);
        Cat cat = new Cat("Martin", Color.WHITE, 2, 10);

        Cat.StaticNestedClass staticNestedClass = new Cat.StaticNestedClass();
        System.out.println(cat);
    }
}
