package homeworks.practice6;

public class Dog extends Animal{

    private final int run_limit = 500;
    private final int swim_limit = 10;
    private final int distance = getDistance();

    public Dog(int distance) {
        super(distance);
    }

    @Override
    public boolean run() {
        if (distance > run_limit) {
            System.out.printf("The limit to run is %d. This dog cannot run %d distance%n", run_limit, distance);
            return false;
        } else {
            System.out.printf("The limit to run is %d. This dog can run %d distance%n", run_limit, distance);
            return true;
        }
    }

    @Override
    public boolean swim() {
        if (distance > run_limit) {
            System.out.printf("The limit to swim is set to %d. This dog will sink rather swim %d%n", run_limit, distance);
            return false;
        } else {
            System.out.printf("The limit to swim is set to %d. This dog can swim %d distance%n", run_limit, distance);
            return true;
        }
    }
}
