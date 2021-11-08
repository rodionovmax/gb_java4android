package lesson7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PrintPics {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/resources/lib/pics.txt");
        var pics = new String(new FileInputStream(file).readAllBytes()).split("&+");

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number of picture from 1 to " + pics.length);
            System.out.println(pics[in.nextInt() - 1]);
        }
    }
}
