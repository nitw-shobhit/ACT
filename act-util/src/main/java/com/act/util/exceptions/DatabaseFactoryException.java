package com.act.util.exceptions;

public class DatabaseFactoryException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public DatabaseFactoryException() {
    	errorCode = "1006";
    }

    public DatabaseFactoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatabaseFactoryException(String message) {
        super(message);
    }

    public DatabaseFactoryException(Throwable cause) {
        super(cause);
    }
}
