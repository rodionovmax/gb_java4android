package lesson8.part2;

import java.io.Serializable;

public class Cat {

    private Color color;
    private Male male;
    private CatAttributes catAttributes;

    private enum Male {
        MALE, FEMALE
    }

    private class CatAttributes {
        private String name;
        private final int age;
        private int weight;
        private boolean male;

        public CatAttributes(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "CatArguments{" +
                    Cat.this.male + male +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }

    static class StaticNestedClass {

    }

    class InnerClass implements Serializable {

    }

    public Cat(String name, Color color, int age) {
        this.color = color;
    }

    public Cat(String name, Color color, int age, int weight) {
        this.color = color;
        catAttributes = new CatAttributes(name, age, weight);
    }

    public Cat(Color color) {
        this.color = color;
    }

    public Color getColor() {
        class MethodLocalClass {

        }
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color=" + color + " " + catAttributes +
                '}';
    }
}
