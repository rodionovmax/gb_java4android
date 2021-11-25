package lesson9.homework;

import java.text.MessageFormat;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int column, int row) {
        super(MessageFormat.format("Неверные данные в ячейке: [{0}][{1}]", row, column));
    }
}
