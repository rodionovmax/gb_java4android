package homeworks.practice9;

public class Main {

    public static void main(String[] args) {

        int arrLength = DoubleArray.enterNumber();
        int arrHeight = DoubleArray.enterNumber();

        try {
            DoubleArray.checkArraySize(arrHeight, arrLength);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        String[][] arr = new String[arrHeight][arrLength];
        String[][] filledArray = DoubleArray.buildArray(arr);

        try {
            int sum = DoubleArray.sumArray(filledArray);
            System.out.println("Sum of all digits in array equals: " + sum);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
