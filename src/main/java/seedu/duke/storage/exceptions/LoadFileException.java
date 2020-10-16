package seedu.duke.storage.exceptions;

public class LoadFileException extends Exception {
    private String errorMessage;

    public LoadFileException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
