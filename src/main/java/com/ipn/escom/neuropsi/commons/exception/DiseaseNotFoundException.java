package com.ipn.escom.neuropsi.commons.exception;

public class DiseaseNotFoundException extends Exception {
    private static final long serialVersionUID = -3039547871168778649L;


    public DiseaseNotFoundException() {
        super();
    }

    public DiseaseNotFoundException(String message) {
        super(message);
    }

    public DiseaseNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiseaseNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DiseaseNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
