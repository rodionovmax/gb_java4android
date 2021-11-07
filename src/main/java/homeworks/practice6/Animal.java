package homeworks.practice6;

public class Animal {

    private final int distance;
    private final int runLimit;
    private final int swimLimit;

    public Animal(int distance, int runLimit, int swimLimit) {
        this.distance = distance;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public boolean run() {
        if (distance <= runLimit) {
            System.out.printf("Distance (%d) is no more than running limit (%d): ", distance, runLimit);
        } else {
            System.out.printf("Distance (%d) is more than running limit (%d): ", distance, runLimit);
        }
        return distance <= runLimit;
    }

    public boolean swim() {
        if (distance <= swimLimit) {
            System.out.printf("Distance (%d) is no more than swimming limit (%d): ", distance, swimLimit);
        } else {
            System.out.printf("Distance (%d) is more than swimming limit (%d): ", distance, swimLimit);
        }
        return distance <= swimLimit;
    }

    public int getDistance() {
        return distance;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

}

// Variant 2 with Animal as an abstract class
/*public abstract class Animal {

    private int distance;

    public Animal(int distance) {
        this.distance = distance;

    }

    public int getDistance() {
        return distance;
    }

    public abstract boolean run();

    public abstract boolean swim();
}*/
