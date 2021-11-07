package homeworks.practice6;

public abstract class Animal {

    private int distance;

    public Animal(int distance) {
        this.distance = distance;

    }

    public int getDistance() {
        return distance;
    }

    public abstract boolean run();

    public abstract boolean swim();
}
