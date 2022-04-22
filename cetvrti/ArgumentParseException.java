package hr.fer.oop;

public class ArgumentParseException extends Throwable {
    private String message;
    public ArgumentParseException(String message) {
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
