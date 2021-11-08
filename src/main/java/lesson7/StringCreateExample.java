package lesson7;

import java.nio.charset.StandardCharsets;

public class StringCreateExample {

    public static void main(String[] args) {
        String s1 = "Java";
        String s11 = null;
        String s2 = new String("Java");

        String s3 = new String(new char[] {'A', 'B', 'C'});
        String s4 = new String(String.valueOf(s11));

        String s7 = """
                string 1
                string 2
                string 3 \
                string 3 as well
                """;

        String s5 = new String(new byte[] {65, 66, 67});
        String s6 = new String(new byte[] {0, 65, 66}, StandardCharsets.UTF_16);

        System.out.printf(" s1 = %s%n s2 = %s%n s3 = %s%n s4 = %s%n s5 = %s%n s6 = %s%n s7 = %s",
                s1, s2, s3, s4, s5, s6, s7);
    }
}
