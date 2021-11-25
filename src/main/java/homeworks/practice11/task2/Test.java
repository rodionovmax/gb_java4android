package homeworks.practice11.task2;

public class Test {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add("Rodionov", "+1(347)593-0000");
        phonebook.add("Rodionov", "911");
        phonebook.add("Frolov", "02");
        phonebook.add("Frolov", "+7(909)299-0000");
        phonebook.add("Ivanov", "455");

        phonebook.get("Rodionov");
        phonebook.get("Frolov");
        phonebook.get("Ivanov");
        phonebook.get("Noname");
    }


}
