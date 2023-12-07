package org.enes.lesson31;

public class EksiDegerException extends Exception{
    private String message;

    public EksiDegerException(String string) {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
