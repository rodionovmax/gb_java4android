package lesson9;

import lesson8.part1.Animal;
import lesson8.part1.Cat;
import lesson8.part1.Dog;
import lesson8.part1.Duck;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final String LIB = "src/main/resources/lib/";

    public static void main(String[] args) {
//        testException();
//        devideNumber();
//        testScanner();
        /*System.out.println(testFinally(5, 2));
        System.out.println(testFinally(3, 0));*/
//        readFile();
        /*String fileName = "text2";
        String extFile = "txt";
        try {
            readFile("text2", "txt");
        } catch (FileNotFoundException e) {
            File f = new File(LIB + fileName + "." + extFile);
            try {
                f.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }*/

        danceAnimal();
    }

    private static void danceAnimal() {
        Animal[] animals = {
//            new Dog("Hatiko"),
//            new Cat("Leopold"),
//            new Dog("white bim"),
//            new Cat("Garfild"),
            new Dog(),
            new Cat(),
            new Dog(),
            new Cat(),
        };

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getClass().getName() + "trying to go through face control");
            try {
                if (animals[i] instanceof Cat) {
                    throw new CatFoundException(i, animals[i].getClass().getName());
                }
                System.out.println(animals[i].getClass().getName() + "dancing");
            } catch (CatFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readFile() {
        File file = new File(LIB + "text.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("we're sorry");
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println(scanner.nextLine());
    }

    private static void readFile(String fileName, String extFile) throws FileNotFoundException {
        File file = new File(LIB + fileName + "." + extFile);
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }

    private static int testFinally(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        } finally {
            return -1;
        }
    }

    private static void testScanner() {
//        Scanner scanner;
//        try {
//            scanner = new Scanner(System.in);
//            int a = scanner.nextInt();
//            scanner.close();
//        } catch (InputMismatchException e) {
//            e.printStackTrace();
//        }
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    private static void devideNumber() {
        try {
            int a = 3 / 0;
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Error in deviding by zero");
            try {
                Thread.sleep(-5000);
            } catch (InterruptedException | IllegalArgumentException ex) {
                ex.printStackTrace();
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("runtime");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Finish");

    }

    private static void testException() {
//        System.out.println(3/0);
        RuntimeException e = new ArithmeticException("Ooops something broke");
//        System.out.println(e.getMessage());
//        throw e;
        Integer a = Integer.parseInt("123");
        System.out.println(a);
    }
}
