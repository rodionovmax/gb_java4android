package homeworks.practice7;

public class Plate {
    private int foodCount;

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

    public int getFoodCount() {
        return foodCount;
    }
}
