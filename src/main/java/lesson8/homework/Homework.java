package lesson8.homework;

import lesson8.homework.obstacle.Track;
import lesson8.homework.obstacle.Wall;
import lesson8.homework.participant.Cat;
import lesson8.homework.participant.Participant;
import lesson8.homework.participant.Person;
import lesson8.homework.participant.Robot;

import java.util.Random;

public class Homework {

    public static void main(String[] args) {
        System.out.println("Preparing...");

        Competition competition = createAndPrepareCompetition();

        System.out.println("Starting competition!");
        competition.startCompetition();

        System.out.println("Competition just finished! Winners:");
        for (Participant winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant person = new Person("Batman", 50, 500);
        Participant cat = new Cat("Martin", 200, 1500);
        Participant robot = new Robot("Boston Dynamic", 150, 5000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(200));
        Track track = new Track(random.nextInt(1500));

        Competition competition = new Competition("Infinity War");
        competition.setParticipants(person, cat, robot);
        competition.setObstacles(wall, track);
        return competition;
    }


}
