package homeworks.practice8;

public class Treadmill implements Obstacle {
    int distance = 900;

    @Override
    public void getParticipant(Participant participant) {
        if (distance < participant.run()) {
            System.out.printf("%s overcame running obstacle%n", participant.getName());
        } else {
            System.out.printf(
                    "%s has limit at %s meters and couldn't overcome this distance %s%n",
                    participant.getName(), participant.run(), distance
            );
        }
    }

}
