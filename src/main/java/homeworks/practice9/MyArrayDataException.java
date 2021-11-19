package homeworks.practice9;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        super(String.format("Cell [%s,%s] contains not numeric character", i, j));
    }
}
