package com.act.util.exceptions;

public class DatabaseOperationException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public DatabaseOperationException() {
    	errorCode = "1008";
    }

    public DatabaseOperationException(String message, Throwable cause) {
        super(message, cause);
    	errorCode = "1008";
    }

    public DatabaseOperationException(String message) {
        super(message);
    	errorCode = "1008";
    }

    public DatabaseOperationException(Throwable cause) {
        super(cause);
    	errorCode = "1008";
    }
}
