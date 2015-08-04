package com.act.util.exceptions;

public class EmailServiceFailureException extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public EmailServiceFailureException() {
    	errorCode = "1004";
    }

    public EmailServiceFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailServiceFailureException(String message) {
        super(message);
    }

    public EmailServiceFailureException(Throwable cause) {
        super(cause);
    }
}
