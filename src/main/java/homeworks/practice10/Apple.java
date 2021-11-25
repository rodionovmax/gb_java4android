package homeworks.practice10;

public class Apple extends Fruit {

    private final String apple;

    public Apple(float weight) {
        super(weight);
        this.apple = "apple";
    }

    public Apple() {
        super(1.0f);
        this.apple = "apple";
    }

    @Override
    public String toString() {
        return "apple";
    }


}
