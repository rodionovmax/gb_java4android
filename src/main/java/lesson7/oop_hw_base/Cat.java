package lesson7.oop_hw_base;

import java.util.Random;

public class Cat {
    private String name;
    Random random = new Random();
    private final int MAX_SATIETY = random.nextInt(4) + 4;
    private int satiety;
    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        satiety = Math.max(satiety - random.nextInt(5), 0);
        int appetite = MAX_SATIETY - satiety;
        int foodCount = plate.getFoodCount();
        if (foodCount - appetite >= 0) {
            plate.descreaseFood(appetite);
            satiety = MAX_SATIETY;
        } else {
            plate.descreaseFood(foodCount);
            satiety += foodCount;
        }
    }

    public boolean isSatiety() {
        return satiety == MAX_SATIETY;
    }

    public String getName() {
        return name;
    }
}
