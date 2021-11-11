package lesson8.part1;

public class Cat extends Animal implements Runner {
    @Override
    public void run() {
        System.out.println("Cat running");
    }
}
