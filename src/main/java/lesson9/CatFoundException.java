package lesson9;

public class CatFoundException extends RuntimeException {
    public CatFoundException(String message) {
        super("Cats are not allowed");
    }

    public CatFoundException(int i, String name) {
        super(String.format("Cat with the name %s came to the dogs party", name, i ));
    }
}
