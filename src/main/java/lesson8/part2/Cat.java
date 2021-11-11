package lesson8.part2;

import java.io.Serializable;

public class Cat {

    private String name;
    private Color color;
    private int age;

    static class StaticNestedClass {

    }

    class InnerClass implements Serializable {

    }

    public Cat(String name, Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
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
                "name='" + name + '\'' +
                ", color='" + color.getRussianColor() + '\'' +
                ", age=" + age +
                '}';
    }
}
