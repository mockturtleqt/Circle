package com.epam.training.first.exception;


public class NotCircleException extends Exception {
    public NotCircleException(String message) {
        super(message);
    }

    public NotCircleException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotCircleException(Throwable cause) {
        super(cause);
    }
}
