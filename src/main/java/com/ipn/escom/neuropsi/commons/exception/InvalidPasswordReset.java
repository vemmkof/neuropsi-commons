package com.ipn.escom.neuropsi.commons.exception;

public class InvalidPasswordReset extends Exception {
    private static final long serialVersionUID = -750099163610792770L;

    public InvalidPasswordReset() {
        super();
    }

    public InvalidPasswordReset(String message) {
        super(message);
    }

    public InvalidPasswordReset(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPasswordReset(Throwable cause) {
        super(cause);
    }

    protected InvalidPasswordReset(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
