package homeworks.practice10;

public class Test {

    public static void main(String[] args) {

        // 1 - 3. Create boxes with apples and oranges
        Box<Apple> boxWithApples = new Box<>(new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange());
        Box<Apple> boxWithApples2 = new Box<>(new Apple());

        boxWithApples.add(new Apple());
        boxWithApples.add(new Apple());
        boxWithApples.add(new Apple());
        boxWithOranges.add(new Orange());

        System.out.println("\n##### Boxes with apples and oranges #####");
        boxWithApples.display();
        boxWithOranges.display();

        // ArrayStoreException will be thrown if user trying to add an orange into the box with apples
//        boxWithApples.add(new Orange());

        // 4. Get weight in boxes
        System.out.println("\n##### Get weight in boxes #####");
        System.out.println("Total weight of box with apples#1 is: " + boxWithApples.getWeight());
        System.out.println("Total weight of box with oranges#1 is: " + boxWithOranges.getWeight());

        // 5. Compare the box with apples#1 to the box with apples#2 and box with oranges#1
        System.out.println("\n##### Compare boxes #####");
        boxWithOranges.add(new Orange());
        boxWithApples2.add(new Apple());
        System.out.println("Are boxes apples#1 and apples#2 equal: " + boxWithApples.compare(boxWithApples2));
        System.out.println("Are boxes apples#1 and oranges#1 equal: " + boxWithApples.compare(boxWithOranges));

        // 6. Empty fruits to another boxes
        System.out.println("\n##### Empty apples from box apples#1 to apples#2 #####");
        boxWithApples.emptyFruitsToAnotherBox(boxWithApples2);
        boxWithApples.display();
        boxWithApples2.display();

        // ArrayStoreException will be thrown if user trying to empty box with apples to the box with oranges
//        boxWithApples2.emptyFruitsToAnotherBox(boxWithOranges);

        System.out.println("\n##### Empty apples from box apples#2 to apples#3 #####");
        Box<Apple> boxWithApples3 = new Box<>(new Apple());
        boxWithApples2.emptyFruitsToAnotherBox(boxWithApples3);
        boxWithApples3.display();

        System.out.println("\n##### Empty oranges from box oranges#1 to oranges#2 #####");
        Box<Orange> boxWithOranges2 = new Box<>(new Orange());
        boxWithOranges.emptyFruitsToAnotherBox(boxWithOranges2);
        boxWithOranges2.display();

        System.out.println("\n##### Empty apples from box apples#3 to apples#4 #####");
        Box<Apple> boxWithApples4 = new Box<>(new Apple());
        boxWithApples4.add(new Apple());
        boxWithApples4.add(new Apple());
        boxWithApples4.add(new Apple());
        boxWithApples4.add(new Apple());
        boxWithApples4.add(new Apple());
        boxWithApples4.add(new Apple());
        boxWithApples4.add(new Apple());
        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
//        boxWithApples4.add(new Apple());
        boxWithApples3.emptyFruitsToAnotherBox(boxWithApples4);
        boxWithApples4.display();
    }
}
