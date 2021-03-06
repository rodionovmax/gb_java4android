package lesson8.homework.participant;

import lesson8.homework.obstacle.Obstacle;

public interface Participant extends Jumper, Runner {

    default boolean doIt(Obstacle obstacle) { return doAction(obstacle); }

    private boolean doAction(Obstacle obstacle) { return obstacle.passObstacleBy(this); }
}
