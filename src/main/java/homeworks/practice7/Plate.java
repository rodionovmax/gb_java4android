package homeworks.practice7;

import java.util.Random;

public class Plate {
    private int foodCount;
    Random random = new Random();

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        if (foodCount > 0) {
            System.out.println("Portions on the plate: " + foodCount);
        }
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
        System.out.printf(
                " ate %d portion(s). Here is how much is left: %d%n",
                catEatFoodCount, foodCount
        );
    }

    public void printFoodIsNotEnough(int catEatFoodCount) {
        System.out.printf(" wanted to eat %d portion(s). This plate is not enough for this cat%n",
                catEatFoodCount
        );
    }

    public void addPortions() {
        int additionalPortions = random.nextInt(3) + 1;
        foodCount += additionalPortions;
        System.out.printf(
                "I added %d additional portion(s) to the plate. Here's how many portions we have now: %d%n",
                additionalPortions, foodCount
        );
    }

    public int getFoodCount() {
        return foodCount;
    }
}
