package com.act.util.exceptions;

public class LoginValidationFailedException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public LoginValidationFailedException() {
    	errorCode = "1007";
    }

    public LoginValidationFailedException(String message, Throwable cause) {
        super(message, cause);
    	errorCode = "1007";
    }

    public LoginValidationFailedException(String message) {
        super(message);
    	errorCode = "1007";
    }

    public LoginValidationFailedException(Throwable cause) {
        super(cause);
    	errorCode = "1007";
    }
}
