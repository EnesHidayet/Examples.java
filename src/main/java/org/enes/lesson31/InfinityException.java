package org.enes.lesson31;

public class InfinityException extends RuntimeException{
    private String message;

    public InfinityException() {
        this.message="Default message";
    }

    public InfinityException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
