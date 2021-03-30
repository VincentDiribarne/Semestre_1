package pile;

public class PileVideException extends Exception {
    public String message;
    public PileVideException() {
        message = "La pile est vide";
    }
}