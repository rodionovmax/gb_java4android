package homeworks.practice7;

import java.util.Random;

public class Cat {
    private String name;
    private boolean fullness;
    Random random = new Random();
    public Cat(String name) {
        this.name = name;
        fullness = false;
    }

    public int eat(Plate plate) {
        int catEatFoodCount = random.nextInt(4) + 1;
        if (plate.getFoodCount() >= catEatFoodCount) {
            plate.decreaseFood(catEatFoodCount);
            fullness = true;
            return 1;
        } else {
            plate.printFoodIsNotEnough(catEatFoodCount);
            fullness = false;
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFullness() {
        return fullness;
    }
}
