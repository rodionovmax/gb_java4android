package lesson8.homework.obstacle;

import lesson8.homework.participant.Participant;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) { this.height = height; }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.jump() > height) {
            System.out.println("Participant " + participant + "successfully jumped over the wall");
            return true;
        } else {
            System.out.println("Participant " + participant + "could not jump over the wall " + height );
            return false;
        }
    }
}
