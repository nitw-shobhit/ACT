package com.act.util.exceptions;

public class ServerOperationException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public ServerOperationException() {
    	errorCode = "1003";
    }

    public ServerOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerOperationException(String message) {
        super(message);
    }

    public ServerOperationException(Throwable cause) {
        super(cause);
    }
}
