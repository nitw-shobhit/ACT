package com.act.util.exceptions;

public class FileLoadError extends ApplicationException {

    private static final long serialVersionUID = 1L;

    public FileLoadError() {
    	errorCode = "1005";
    }

    public FileLoadError(String message, Throwable cause) {
        super(message, cause);
    	errorCode = "1005";
    }

    public FileLoadError(String message) {
        super(message);
    	errorCode = "1005";
    }

    public FileLoadError(Throwable cause) {
        super(cause);
    	errorCode = "1005";
    }
}
