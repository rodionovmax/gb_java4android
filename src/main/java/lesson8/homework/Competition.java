package lesson8.homework;

import lesson8.homework.obstacle.Obstacle;
import lesson8.homework.participant.Participant;

import java.util.LinkedList;
import java.util.List;

public class Competition {

    private final String competitionTitle;

    private List<Participant> lastWinners = new LinkedList<>();
    private Obstacle[] obstacles;
    private Participant[] participants;

    public Competition(String competitionTitle) {this.competitionTitle = competitionTitle; }

    public void setObstacles(Obstacle... obstacles) {this.obstacles = obstacles; }

    public void setParticipants(Participant... participants) {this.participants = participants; }

    public void startCompetition() {
        System.out.println("Competition is starting " + competitionTitle);
        lastWinners.clear();

        for (Participant participant : participants) {
            boolean success = passAllObstacles(participant);
            if (!success) {
                System.out.println("Participant " + participant + " left the challenge");
            } else {
                lastWinners.add(participant);
            }
        }
    }

    public List<Participant> getLastWinners() {return lastWinners; }

    private boolean passAllObstacles(Participant participant) {
        for (Obstacle obstacle : obstacles) {
            if (!participant.doIt(obstacle)) {
                return false;
            }
            System.out.println();
        }
        return true;
    }
}
