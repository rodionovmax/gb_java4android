package homeworks.practice11.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    private final HashMap<String, ArrayList<String>> records = new HashMap<>();

    public void add(String lastname, String phoneNumber) {
        if (records.get(lastname) != null) {
            if (!records.get(lastname).contains(phoneNumber)) {
                records.get(lastname).add(phoneNumber);
            }
        } else {
            ArrayList<String> array = new ArrayList<>();
            array.add(phoneNumber);
            records.put(lastname, array);
        }
    }

    public void get(String lastname) {
        System.out.println(lastname + ": " +records.get(lastname));
    }
}

