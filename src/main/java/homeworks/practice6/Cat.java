package homeworks.practice6;

public class Cat extends Animal{

    private final int run_limit = 200;
    private final int distance = getDistance();

    public Cat(int distance) {
        super(distance);
    }

    @Override
    public boolean run() {
        if (distance > run_limit) {
            System.out.printf("The limit to run is %d. This cat cannot run %d distance%n", run_limit, distance);
            return false;
        } else {
            System.out.printf("The limit to run is %d. This cat can run %d distance%n", run_limit, distance);
            return true;
        }
    }

    @Override
    public boolean swim() {
        System.out.println("Cats can't swim. Get it from water now!");
        return false;
    }
}
