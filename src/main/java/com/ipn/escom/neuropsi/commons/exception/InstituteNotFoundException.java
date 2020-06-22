package com.ipn.escom.neuropsi.commons.exception;

public class InstituteNotFoundException extends Exception {
    private static final long serialVersionUID = 1661478920435867460L;

    public InstituteNotFoundException() {
        super();
    }

    public InstituteNotFoundException(String message) {
        super(message);
    }

    public InstituteNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public InstituteNotFoundException(Throwable cause) {
        super(cause);
    }

    protected InstituteNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
