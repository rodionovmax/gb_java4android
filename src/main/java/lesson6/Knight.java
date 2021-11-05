package lesson6;

public class Knight extends Player {

    private String swordName;

    public Knight(String nickname, int point, String swordName) {
        super(nickname, point, "Rytsar'");
        this.swordName = swordName;
//        super.doAction();
    }

    public Knight(String nickname) {
        this(nickname, 10, "Ultra");
    }

    public Knight() {
        this("Default", 69, "Buster");
    }

    @Override
    public String toString() {
        return super.toString() + " and sword " + swordName;
    }

    @Override
    public void doAction() {
        System.out.println("Knight swinging his sword " + swordName);
//        super.doAction();
    }

    public String getSwordName() {
        return swordName;
    }

    public void setSwordName(String swordName) {
        this.swordName = swordName;
    }
}
