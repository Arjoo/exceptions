package com.arjoo.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String msg) {
        super(msg);
    }

    public UserNotFoundException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
