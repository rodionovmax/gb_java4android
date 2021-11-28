package lesson12;

public class TestSync {

    private static final int STEPS = 10000;
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        TestSync testSync1 = new TestSync();
        TestSync testSync2 = new TestSync();

        var t1 = new Thread(() -> testSync1.intCounter());
        var t2 = new Thread(() -> testSync2.decCounter());

//        testSync1.intCounter();
//        testSync2.decCounter();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(TestSync.counter);


    }

    public synchronized void intCounter() {
        for (int i = 0; i < STEPS; i++) {
            counter++;
        }
    }

    public synchronized void decCounter() {
        for (int i = 0; i < STEPS; i++) {
            counter--;
        }
    }

}
