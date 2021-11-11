package lesson7.oop_hw_base;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("Amount of food in the plate: " + foodCount);
    }

    public void descreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFoodCount(int foodCount) {
        this.foodCount += foodCount;
    }
}
