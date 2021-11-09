package homeworks.practice6;

public class Dog extends Animal {

    static int count;

    {
        count += 1;
    }

    public Dog(int distance) {
        super(distance, 500, 10);
    }

    @Override
    public boolean run() {
        System.out.print("Dog: ");
        return super.run();
    }

    @Override
    public boolean swim() {
        System.out.print("Dog: ");
        return super.swim();
    }
}

// Variant 2.
/*
package homeworks.practice6;

public class Dog extends Animal{

    private final int runLimit = 500;
    private final int swimLimit = 10;
    private final int distance = getDistance();

    public Dog(int distance) {
        super(distance);
    }

    @Override
    public boolean run() {
        if (distance > runLimit) {
            System.out.printf("The limit to run is %d. This dog cannot run %d distance%n", runLimit, distance);
            return false;
        } else {
            System.out.printf("The limit to run is %d. This dog can run %d distance%n", runLimit, distance);
            return true;
        }
    }

    @Override
    public boolean swim() {
        if (distance > runLimit) {
            System.out.printf("The limit to swim is set to %d. This dog will sink rather swim %d%n", runLimit, distance);
            return false;
        } else {
            System.out.printf("The limit to swim is set to %d. This dog can swim %d distance%n", runLimit, distance);
            return true;
        }
    }
}
*/
