package pile;

public class PilePleineException extends Exception {
    public String message;
    public PilePleineException() {
        message = "La pile est pleine";
    }
}