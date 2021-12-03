package homeworks.practice13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static homeworks.practice13.MainClass.cdlMain;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    static Car winner;
    private static final CountDownLatch cdl = new CountDownLatch(4);
    Lock lock = new ReentrantLock();

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");

            cdl.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Wait for all 4 cars before starting the race
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cdlMain.countDown();

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        // Lock threads to print the winner and then unlock it
        try {
            lock.lock();
            if (isWinner(this)) {
                System.out.println(getName() + " - WIN");
            }
        } finally {
            lock.unlock();
        }
    }

    public static boolean isWinner(Car car) {
        if (winner == null){
            winner = car;
            return true;
        }
        return false;
    }
}
