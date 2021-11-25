package lesson8.homework.participant;

public class Person implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int maxRunLength;

    public Person(String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public int run() {
        System.out.printf("Person %s running distance %d%n", name, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Person %s jumping %d%n", name, jumpHeight);
        return jumpHeight;
    }
}
