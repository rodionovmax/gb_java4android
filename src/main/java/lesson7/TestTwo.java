package lesson7;

public class TestTwo {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Martin Luter Cat");
        Plate plate = new Plate(10);

        plate.printInfo();

        while (plate.getFoodCount() > 0) {
            cat.eat(plate);
            plate.printInfo();
            Thread.sleep(3000);
        }

    }
}
