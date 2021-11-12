package homeworks.practice8;

public class Wall implements Obstacle {
    double height = 1.5;

    @Override
    public void getParticipant(Participant participant) {
        if (height < participant.jump()) {
            System.out.printf("%s overcame jumping obstacle%n", participant.getName());
        } else {
            System.out.printf(
                    "%s has limit at %s meters and couldn't jump over this wall %s%n",
                    participant.getName(), participant.jump(), height
            );
        }
    }
}
