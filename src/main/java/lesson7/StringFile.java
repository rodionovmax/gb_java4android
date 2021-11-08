package lesson7;

import java.io.*;

public class StringFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/resources/lib/text.txt");

//        if (file.exists()) {
//            file.delete();
//        } else {
//            file.createNewFile();
//        }

        var is = new BufferedInputStream(new FileInputStream(file)); // byte stream
//        var is = new FileReader(file); // symbol stream
//        System.out.println(is.readAllBytes());

        int size = is.available();
        StringBuilder sb = new StringBuilder("!!!");

        for (int i = 0; i < size; i++) {
            sb.append((char)is.read());
        }

        System.out.println(sb);
    }
}
