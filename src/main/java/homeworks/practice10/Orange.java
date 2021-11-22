package homeworks.practice10;

public class Orange extends Fruit {

    private final String orange;

    public Orange(float weight) {
        super(weight);
        this.orange = "orange";
    }

    public Orange() {
        super(1.5f);
        this.orange = "orange";
    }

    @Override
    public String toString() {
        return "orange";
    }

}
