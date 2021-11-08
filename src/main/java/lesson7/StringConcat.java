package lesson7;

import java.io.IOException;

public class StringConcat {

    public static void main(String[] args) throws IOException {
        String a1 = "Hello My ";
        String a2 = "Dear World";
        String a3 = a1 + a2;
//        a3 = a1.concat(a2);

        String b1 = "Number";
        int b2 = 10;
        String b3 = b1 + b2;
        b3 = b1.concat(String.valueOf(b2));

        String c = "(" + 2 + 3 + ")" + b3 + "!";

        System.out.println(a1.equals(a2));
        System.out.println(a1.compareTo(a2));

        final String spaces = "         \n \t           ";
//        final String spaces = "           hello                 ";
        System.out.println(spaces.trim());

        System.out.println(spaces == null); // "" - false
        System.out.println(spaces.isEmpty()); // "" - true, " " - false
        System.out.println(spaces.trim().isEmpty()); //"  \n" - true, " 6 " - false
        System.out.println(spaces.isBlank());

        for (char c1 : a1.toCharArray()) {
//            System.out.print(c1 + " ");
            System.out.print((char)(c1 + 1) + " ");
        }
        System.out.println();

        System.out.println(a3.substring(10));
        System.out.println(a3.substring(10, 16));

        for (String s : a3.split("\s+", 3)) {
            System.out.println("Word: " + s);
        }

        System.out.println(a3.charAt(10));
        System.out.println(a3.indexOf(' '));

        System.out.println(a3.replaceAll("My", "Our"));
        System.out.println(a3.startsWith("/msg"));

        System.out.println(String.join(", ", a1, a2, b1, b3));

        System.out.println(a3.toUpperCase());
        System.out.println(a3.trim().toUpperCase().replaceAll(" ", "_"));

    }

    private static String message(boolean b) {
        return "Your char had".concat(b ? " " : "n't ").concat("been found!");
    }
}
