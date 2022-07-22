package Shape;

public class NotTriangleException extends Exception {

    public NotTriangleException(String message) {
        super(message);
    }
    public NotTriangleException() {
        super("Not a Triangle");
    }
}
