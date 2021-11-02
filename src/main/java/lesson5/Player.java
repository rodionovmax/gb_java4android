package lesson5;

public class Player {
    private static int countPlayers;

    private String nickname;
    private int points;
    private int level;
    private int money;

    public Player(String nickname, int points, int level, int money) {
        this.nickname = nickname.toUpperCase();
        this.points = points;
        this.level = level;
//        this.money = money;
//        System.out.println(nickname + " called constructor with 4 arguments");
        setMoney(money);

        countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(String nickname) {
        this(nickname, 0, 0, 0);
//        System.out.println(nickname + " called constructor with 1 arguments");
    }

    void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Player %s(level: %d) has %d points and collected %d money",
                nickname, level, points, money);
    }

    public String getNickname() {
        return nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 999999 || money < 0) {
            System.out.println("The amount of money " + money + " is not possible!");
            return;
        }
        this.money = money;
    }
}
