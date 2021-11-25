package homeworks.practice10;

public class GenericElementsArraySwapper<E>{

    private final E[] elements;

    public GenericElementsArraySwapper(E... elements) {
        this.elements = elements;
    }

    private void swap(int indexOne, int indexTwo) {
        E e = elements[indexOne];
        elements[indexOne] = elements[indexTwo];
        elements[indexTwo] = e;
    }

    private void display() {
        for (E el: elements) {
            System.out.print(el);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        GenericElementsArraySwapper<String> stringList = new GenericElementsArraySwapper<>("h", "e", "l", "l", "o", " ", "w", "o", "r", "l", "d");
        GenericElementsArraySwapper<Integer> intList = new GenericElementsArraySwapper<>(1, 2, 3, 4, 5, 6);

        stringList.display();
        stringList.swap(1,3);
        stringList.display();

        intList.display();
        intList.swap(0, 5);
        intList.display();

    }




}
