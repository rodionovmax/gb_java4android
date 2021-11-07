package homeworks.practice6;

public class Cat extends Animal {

    public Cat(int distance) {
        super(distance, 200, 0);
    }

    @Override
    public boolean run() {
        System.out.print("Cat: ");
        return super.run();
    }

    @Override
    public boolean swim() {
        System.out.print("Cat: ");
        return super.swim();
    }
}

//Variant 2
/*
package homeworks.practice6;

public class Cat extends Animal{

    private final int runLimit = 200;
    private final int distance = getDistance();

    public Cat(int distance) {
        super(distance);
    }

    @Override
    public boolean run() {
        if (distance > runLimit) {
            System.out.printf("The limit to run is %d. This cat cannot run %d distance%n", runLimit, distance);
            return false;
        } else {
            System.out.printf("The limit to run is %d. This cat can run %d distance%n", runLimit, distance);
            return true;
        }
    }

    @Override
    public boolean swim() {
        System.out.println("Cats can't swim. Get it from water now!");
        return false;
    }
}
*/

