package homeworks.practice11;

import java.util.HashMap;
import java.util.HashSet;

public class CountWordsInArray {

    public static void main(String[] args) {
        countUniqueWords();
    }

    private static void countUniqueWords() {

        String[] strArray = {
                "m", "b", "a", "b", "g", "a", "c", "d", "h", "j",
                "f", "f", "a", "j", "e", "h", "i", "l", "n", "m"
        };

        HashSet<String> uniqueKeys = new HashSet<>();
        HashMap<String, Integer> keyCounter = new HashMap<>();

        for (int i = 0; i < strArray.length; i++) {
            if (uniqueKeys.add(strArray[i])) {
                keyCounter.put(strArray[i], 1);  // if the string is unique - put 1 to the value
            } else {
                keyCounter.put(strArray[i], keyCounter.get(strArray[i]) + 1);  // if the string is not unique - add 1 to the value
            }
        }

        System.out.println("Unique words: " + uniqueKeys);
        System.out.println("Occurrence of each unique word: " + keyCounter);
    }


}
