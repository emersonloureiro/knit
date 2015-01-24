package cf.janga.knit.runtime;

public class ParsingException extends RuntimeException {

    public ParsingException(String msg, Exception cause) {
        super(msg, cause);
    }
}
