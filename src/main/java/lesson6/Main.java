package lesson6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Alexey", 1000);
        Knight knight = new Knight("Timofey", 900, "Excalibur");
        Knight knight2 = new Knight("Maksim");
        Knight knight3 = new Knight();
        Bard bard = new Bard("Liytik", 0);
//        Player player1 = new Player("Name", 324, "NPC");
//        Player bard = new Bard("Liytik", 0);

        Player[] players = {wizard, knight, bard, knight2};

        bard.doAction();
        bard.sing();

        for (Player player : players) {
            player.doAction();
            System.out.println(player);

//            if (player instanceof Bard) {
//                Bard trueBard = (Bard)player;
//                trueBard.sing();
//            }

            if (player instanceof Bard trueBard) {
                trueBard.sing();
            }
        }
        Integer n = 1;
//        n = null;
        Object[] objects = {
                knight,
                new int[]{1,2,3,4},
                new Random(),
                new Scanner(System.in),
                Player.class,
                "Hello, world",
                new Integer(1),
                n
        };

        for (Object object : objects) {
            System.out.println(object.toString());
        }

//        wizard.doAction();
//        knight.doAction();
//        knight2.doAction();
//
//        System.out.println(wizard);
//        System.out.println(knight);
//        System.out.println(knight2);
//        System.out.println(knight3);
    }
}
