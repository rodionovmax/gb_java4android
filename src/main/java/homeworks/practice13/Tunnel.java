package homeworks.practice13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    // Set semaphore to 2 because only 50% of cars can enter the tunnel at the same time
    Semaphore semaphore = new Semaphore(2);

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {

        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);

                // entered the tunnel - took permission
                semaphore.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);

                // left the tunnel - released permission
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

