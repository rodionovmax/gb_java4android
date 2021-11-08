package lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/main/java/resources/lib/input.txt");
        File output = new File("src/main/java/resources/lib/output.txt");

        Scanner scanner = new Scanner(input);
        PrintWriter pw = new PrintWriter(output);

        // for integers
        /*int a = scanner.nextInt();
        int b = scanner.nextInt();*/

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        pw.print(a.add(b));
        pw.close();
        scanner.close();
    }
}
