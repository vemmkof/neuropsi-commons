package com.ipn.escom.neuropsi.commons.exception;

public class UserNameNotAvailableException extends Exception {
    private static final long serialVersionUID = 7950656627689308591L;

    public UserNameNotAvailableException() {
        super();
    }

    public UserNameNotAvailableException(String message) {
        super(message);
    }

    public UserNameNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameNotAvailableException(Throwable cause) {
        super(cause);
    }

    protected UserNameNotAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
