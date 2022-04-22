package hr.fer.oop;

public class InvalidNumberOfArgumentsException extends Throwable {
    private String message;

    public InvalidNumberOfArgumentsException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Exception occured!";
    }

    @Override
    public String toString() {
        return "Exception occured!";
    }
}
