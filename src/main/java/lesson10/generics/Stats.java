package lesson10.generics;

import lesson10.test.Main;

public class Stats<E extends Number> {

    private E[] nums;

    public Stats(E... nums) {
        this.nums = nums;
    }

    private double avg() {
        double sum = 0;
        for (E num : nums) {
            sum += num.doubleValue();
        }

        return sum / nums.length;
    }

    private boolean isAvg(Stats<?> eStats) {
        return Math.abs(eStats.avg() - avg()) < 0.000001;
    }

    public static void main(String[] args) {
        Stats<Integer> ints = new Stats<>(1,2,3,4,5,6);
        Stats<Double> doubles = new Stats<>(1.1, 1.9, 3.1, 4.1, 4.8);

        System.out.println("avg ints: " + ints.avg());
        System.out.println("avg doubles: " + doubles.avg());
        System.out.println("Avg vs avg: " + doubles.isAvg(ints));
    }
}
