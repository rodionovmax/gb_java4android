package lesson8.part1;

public class Duck extends Animal implements Runner, Flying {

//    public Duck(String duck) {
//        super();
//    }

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void run() {
        System.out.println("Duck running");
    }
}
