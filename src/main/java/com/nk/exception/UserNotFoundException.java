package com.nk.exception;

public class UserNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3948438938493849384L;

    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }


}
