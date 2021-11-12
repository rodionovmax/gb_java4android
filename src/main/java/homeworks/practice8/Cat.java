package homeworks.practice8;

public class Cat implements Participant{

    @Override
    public double jump() {
        return 1.9;
    }

    @Override
    public int run() {
        return 300;
    }

    @Override
    public String getName() {
        return "Cat";
    }
}
