package lesson11;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        testArrayList();
//        testLinkedList();
//        testSet();
//        testMap();
    }

    private static void testArrayList() {
        ArrayList<String> arrayList = new ArrayList<>(4);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("S");
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add(3, "D");
        arrayList.remove("S");

        arrayList.trimToSize();

        Object[] objects = arrayList.toArray();
        String[] strings = arrayList.toArray(new String[0]);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (String string : strings) {
            System.out.println(string);
        }

        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            if (string.equals("D")) {
                continue;
            }
            System.out.print(string + " ");
        }

        Collections.sort(arrayList);
        Collections.shuffle(arrayList);
        Collections.reverse(arrayList);
        Collections.rotate(arrayList, -1);

        System.out.println(Collections.binarySearch(arrayList, "D"));
        System.out.println(Collections.replaceAll(arrayList, "D", "!!!"));
        System.out.println(arrayList.toString());

        //STREAM API

        ArrayList<Integer> numArray = new ArrayList<>();
        Collections.addAll(numArray, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10);
        System.out.println(numArray.stream().filter(e -> e % 2 == 0).count());
        System.out.println(numArray.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
    }

    private static void testLinkedList() {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void testSet() {
        Set<Integer> set = new HashSet<>();
        Integer[] integers = {1, 2, 3};
        Collections.addAll(set, integers);
        Collections.addAll(set, 1, 4, 5, 2, 3, 7, 8, 9, 1, 0, 5, 2, 4, 2, 6, 7, 7);
        System.out.println(set);

    }

    private static void testMap() {
//        Map<String, String> map = new HashMap<>();
//        Map<String, String> map = new LinkedHashMap<>();
        Map<String, String> map = new TreeMap<>();

        map.put("Russia", "Moscow");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Norway", "Oslo");

//        System.out.println(map);

//        for (String key : map.keySet()) {
//            System.out.printf("Country %s - capital %s%n", key, map.get(key));
//        }

//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.printf("Country %s - capital %s%n", entry.getKey(), entry.getValue());
//        }

//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String key, String value) {
//                System.out.printf("Country %s - capital %s%n", key, value);
//            }
//        });

        map.forEach((key, value) -> System.out.printf("Country %s - capital %s%n", key, value));
    }
}
