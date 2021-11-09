package homeworks.practice7;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        int SIZE = 5;
        int fedCatsCounter = 0;

        Cat[] cats = new Cat[SIZE];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Vasiliy");
        cats[2] = new Cat("Mashka");
        cats[3] = new Cat("Boris");
        cats[4] = new Cat("Bonifaziy");
        Plate plate = new Plate(10);

        plate.printInfo();

        while (plate.getFoodCount() > 0) {
            for (Cat cat : cats) {
                if (!cat.isFullness()) {
                    System.out.print(cat.getName());
                    fedCatsCounter += cat.eat(plate);

                    Thread.sleep(2000);
                }
            }

// Task 5. To have unfed cats uncomment this code and comment lines 35-40
//            if (fedCatsCounter == SIZE) {
//                System.out.println("All cats are fed");
//                break;
//            }

            // Task 6.
            if (fedCatsCounter != SIZE) {
                plate.addPortions();
            } else {
                System.out.println("All cats are fed");
                break;
            }
        }

        for (Cat cat : cats) {
            System.out.printf("is %s full: %s%n", cat.getName(), cat.isFullness());
        }

    }
}
