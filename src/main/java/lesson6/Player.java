package lesson6;

public abstract class Player extends Object {
    private String nickname;
    private int point;
    private String russianProfession;

    public Player(String nickname, int point, String russianProfession) {
        this.nickname = nickname;
        this.point = point;
        this.russianProfession = russianProfession;
    }

    public String getRussianProfession() {
        return russianProfession;
    }

    public void setRussianProfession(String russianProfession) {
        this.russianProfession = russianProfession;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return String.format("%s %s has attributes: %d", russianProfession, nickname, point);
    }
//    public void doAction() {
//        System.out.println("Player acts");
//    }

    public abstract void doAction();
}
