package lesson8.part1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Plane plane = new Plane();

        test(plane);

        Runner kangaroo = new Runner() {
            @Override
            public void run() {
                System.out.println("Kagaroo running");
            }
        };

        Runner racoon = () -> System.out.println("Racoon running");

        Runner[] runners = {dog, cat, duck, kangaroo, racoon};
        for (Runner runner : runners) {
            runner.run();
        }

    }

    public static void test(Flying flying) {
        System.out.println("Flying instance : " + flying.getClass().getName());
        flying.fly();
    }
}
