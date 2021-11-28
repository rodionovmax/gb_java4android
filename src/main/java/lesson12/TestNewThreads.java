package lesson12;

public class TestNewThreads {

    public static void main(String[] args) {
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        }, "A");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }, "B");

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("The end!!!");
    }
}
