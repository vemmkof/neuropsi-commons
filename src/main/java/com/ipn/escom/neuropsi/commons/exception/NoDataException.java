package com.ipn.escom.neuropsi.commons.exception;

/**
 *
 */
public class NoDataException extends Exception {

    private static final long serialVersionUID = 2825004267254495012L;

    /**
     *
     */
    public NoDataException() {
        super();
    }

    /**
     * @param message
     */
    public NoDataException(String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public NoDataException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param cause
     */
    public NoDataException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    protected NoDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
