package lesson13;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {9, 11, 12, 13, 14, 15, 16};



        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Checking point 1");

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                for (int i : arr1) {
                    result += i;
                    System.out.println("t1: " + i);
                }
                return result;
            }
        };

        Future<Integer> f1 = executorService.submit(callable);
        System.out.println("Checking point 2");

        Future<?> f2 = executorService.submit(() -> {
            int result = 0;
            for (int i : arr2) {
                result += i;
                System.out.println("t2: " + i);
            }
            return result;
        });
        System.out.println("Checking point 3");

        System.out.println("Sum of arrays: " + f1.get() + " and " + f2.get());


    }
}
