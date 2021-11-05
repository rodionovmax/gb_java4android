package lesson6;

public class Bard extends Player{

    public Bard(String nickname, int point) {
        super(nickname, point, "Bard");
    }

    public void sing() {
        System.out.println("Tooooooooooooooooooool'kaaaaaaaaaaaaaaaa .......");
    }

    @Override
    public void doAction() {
        System.out.println("Bard tuning guitar");
    }
}
