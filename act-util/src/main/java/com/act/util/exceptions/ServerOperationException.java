package com.act.util.exceptions;

public class ServerOperationException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public ServerOperationException() {
    	errorCode = "1003";
    }

    public ServerOperationException(String message, Throwable cause) {
        super(message, cause);
    	errorCode = "1003";
    }

    public ServerOperationException(String message) {
        super(message);
    	errorCode = "1003";
    }

    public ServerOperationException(Throwable cause) {
        super(cause);
    	errorCode = "1003";
    }
}
