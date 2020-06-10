package exception;

public class InvalidInputException extends Exception {

    private static final Long serialVersionUID = 1L;

    public InvalidInputException( String message ) {
        super( message );
    }
}
