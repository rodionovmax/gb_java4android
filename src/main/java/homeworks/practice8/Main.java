package homeworks.practice8;

public class Main {

    public static void main(String[] args) {

        Participant human = new Human();
        Participant cat = new Cat();
        Participant robot = new Robot();

        Obstacle treadmill = new Treadmill();
        Obstacle wall = new Wall();

        Obstacle[] obstacles = {treadmill, wall};

        for (Obstacle obstacle : obstacles) {
            obstacle.getParticipant(human);
            obstacle.getParticipant(cat);
            obstacle.getParticipant(robot);
        }
    }
}
