package com.act.util.exceptions;

public class InternalApplicationException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public InternalApplicationException() {
    	errorCode = "1000";
    }

    public InternalApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalApplicationException(String message) {
        super(message);
    }

    public InternalApplicationException(Throwable cause) {
        super(cause);
    }
}
