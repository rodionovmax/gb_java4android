package homeworks.practice12;

import java.util.Arrays;

public class Test {

//    static final int SIZE = 10000000;
    static final int SIZE = 10;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        System.out.print("Time to perform the task in single thread: ");
        runInSingleThread();
        System.out.print("Time to perform the task in two threads: ");
        runInTwoThreads();
    }

    private static float[] createArray() {
        // Create an array
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        return arr;
    }

    private static void runInSingleThread() {
        // Perform the task in single thread
        float[] arr = createArray();

        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
        }
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(Arrays.toString(arr));
    }

    private static void runInTwoThreads() {
        // Perform the task in 2 threads
        float[] arr = createArray();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        long a = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
            }
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
            }
        }, "Thread 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);

        System.out.println(System.currentTimeMillis() - a);
        System.out.println(Arrays.toString(arr));

    }
}
