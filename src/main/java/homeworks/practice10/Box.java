package homeworks.practice10;

public class Box<T extends Fruit> {


    private final T[] box;
    private final int STANDARD_BOX = 20;
    int currentSize;

    public Box(int boxSize) {
        this.box = (T[]) new Fruit[boxSize];
    }

    public Box() {
        this.box = (T[]) new Fruit[STANDARD_BOX];
    }

    public Box(Fruit fruit) {
        if (fruit instanceof Apple) {
            this.box = (T[]) new Apple[STANDARD_BOX];
        } else {
            this.box = (T[]) new Orange[STANDARD_BOX];
        }
    }

    public Box(Fruit fruit, int boxSize) {
        if (fruit instanceof Apple) {
            this.box = (T[]) new Apple[boxSize];
        } else {
            this.box = (T[]) new Orange[boxSize];
        }
    }

    public void display() {
        for (T fruit : box) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    public void add(Fruit fruit) {
        add(fruit, currentSize);
    }

    public void add(Fruit fruit, int index) {
        box[index] = (T) fruit;
        currentSize++;
    }

    public int countFruits() {
        int counter = 0;
        for (int i = 0; i < box.length; i++) {
            if (box[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public float getWeight() {
        float sumFruitWeight = 0.0f;
        for (Fruit fruit : box) {
            if (fruit != null) {
                sumFruitWeight += fruit.getWeight();
            }
        }
        return sumFruitWeight;
    }

    public boolean compare(Box<?> eBox) {
        return Math.abs(eBox.getWeight() - getWeight()) < 0.000001;
    }

    public void remove(int index) {
        box[index] = null;
        currentSize--;
    }

    public void emptyFruitsToAnotherBox(Box<?> anotherBox) throws BoxException{
        int fruitsInBox = countFruits();
        int fruitsInAnotherBox = anotherBox.countFruits();

        for (int i = 0; i < fruitsInBox; i++) {
            if ((fruitsInBox + fruitsInAnotherBox) < STANDARD_BOX) {
                anotherBox.add(box[i], i + fruitsInAnotherBox); // add fruits to the new box
                remove(i); // remove fruits from the old box
            } else {
                throw new BoxException("This box can't fit all fruits. Use another one");
            }

        }

    }





}
