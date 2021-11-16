package homeworks.practice8;

public class Robot implements Participant {

    @Override
    public double jump() {
        return 0.6;
    }

    @Override
    public int run() {
        return 5000;
    }

    @Override
    public String getName() {
        return "Robot";
    }
}
