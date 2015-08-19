package com.act.util.exceptions;

public class ServerFactoryException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public ServerFactoryException() {
    	errorCode = "1002";
    }

    public ServerFactoryException(String message, Throwable cause) {
        super(message, cause);
    	errorCode = "1002";
    }

    public ServerFactoryException(String message) {
        super(message);
    	errorCode = "1002";
    }

    public ServerFactoryException(Throwable cause) {
        super(cause);
    	errorCode = "1002";
    }
}
