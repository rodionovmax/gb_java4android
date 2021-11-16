package homeworks.practice8;

public class Human implements Participant {

    @Override
    public double jump() {
        return 1.6;
    }

    @Override
    public int run() {
        return 1000;
    }


    @Override
    public String getName() {
        return "Human";
    }
}
