package lesson6;

public class Wizard extends Player {
    public Wizard(String nickname, int point) {
        super(nickname, point, "Volshebnik");
    }

    public Wizard(String nickname) {
        this(nickname, 0);
    }

    @Override
    public void doAction() {
        System.out.println("Wizard doing magic tricks");
    }
}
