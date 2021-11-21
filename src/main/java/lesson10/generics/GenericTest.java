package lesson10.generics;

import lesson10.common.IntStorage;
import lesson10.common.ObjectStorage;
import lesson10.common.StringStorage;

public class GenericTest {

    public static void main(String[] args) {
//        intTest();

//        stringTest();

        objTest();
    }

    private static void stringTest() {
        StringStorage stringStorage = new StringStorage(20);

        stringStorage.add("a");
        stringStorage.add("b");
        stringStorage.add("c");

        stringStorage.display();

        System.out.println("Find b: " + stringStorage.find("b"));
        System.out.println("Find g: " + stringStorage.find("g"));

        String lastValue = stringStorage.get(stringStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue);
    }

    private static void intTest() {
        IntStorage intStorage = new IntStorage(20);

        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(0);
        intStorage.add(0);

        intStorage.display();

        System.out.println("Find 2: " + intStorage.find(2));
        System.out.println("Find 5: " + intStorage.find(5));

        int lastValue = intStorage.get(intStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue);
    }

    private static void objTest() {
        GenericStorage<Integer> intStorage = new GenericStorage<>(20);
//        ObjectStorage intStorage = new ObjectStorage(20);

        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(0);
        intStorage.add(0);
//        intStorage.add("e");

        intStorage.display();

        System.out.println("Find 2: " + intStorage.find(2));
        System.out.println("Find 5: " + intStorage.find(5));

        Integer lastValue = intStorage.get(intStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue);


        GenericStorage<String> stringStorage = new GenericStorage<>(20);

        stringStorage.add("a");
        stringStorage.add("b");
        stringStorage.add("c");

        stringStorage.display();

        System.out.println("Find b: " + stringStorage.find("b"));
        System.out.println("Find g: " + stringStorage.find("g"));

        String lastValue2 = stringStorage.get(stringStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue2);
    }
}
