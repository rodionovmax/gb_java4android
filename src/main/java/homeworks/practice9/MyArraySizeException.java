package homeworks.practice9;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(int arrayHeight, int arrayLength) {
        super(String.format("Dimensions of array [%s,%s] do not match expected [4,4]", arrayLength, arrayHeight));
    }
}
