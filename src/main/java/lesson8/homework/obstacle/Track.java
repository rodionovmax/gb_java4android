package lesson8.homework.obstacle;

import lesson8.homework.participant.Participant;

public class Track implements Obstacle {
    private final int length;

    public Track(int length) { this.length = length; }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.run() > length) {
            System.out.println("Participant " + participant + "successfully ran the distance");
            return true;
        } else {
            System.out.println("Participant " + participant + "could not run the distance " + length);
            return false;
        }
    }
}
