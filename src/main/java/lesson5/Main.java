package lesson5;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Timofei", 1500, 57, 9999);
        Player player2 = new Player("Ksenia");
        Player player3 = new Player("Vadim", 1750, 65, 11290);

//        player1.nickname = "Maksim";
//        player2.nickname = "Ksenia";

//        System.out.println(player1.nickname);
//        System.out.println(player2.nickname);
//        System.out.println(player3.nickname);

        System.out.println(Player.getCountPlayers());

//        player2.money = -3213424;
        player2.setMoney(15000);
        player2.setLevel(80);
        player2.setPoints(2350);

        player1.printInfo();
        player2.printInfo();
        player3.printInfo();

        System.out.println(player1);

        /*Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.printInfo();
        }*/

        Team team = new Team("Avenges");
        team.addPlayer(player1, player2, player3);

        team.printInfo();
    }
}
