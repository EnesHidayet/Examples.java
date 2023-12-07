package org.enes.lesson32;

public class LimanException extends RuntimeException{
    private ErrorType errorType;

    public LimanException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public LimanException(ErrorType errorType,String message) {
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    @Override
    public String toString() {
        return "LimanException{" +
                "errorType=" + errorType +
                '}';
    }
}
