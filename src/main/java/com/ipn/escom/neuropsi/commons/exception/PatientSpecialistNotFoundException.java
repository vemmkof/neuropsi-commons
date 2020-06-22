package com.ipn.escom.neuropsi.commons.exception;

public class PatientSpecialistNotFoundException extends Exception {

    private static final long serialVersionUID = -767037574494625459L;

    public PatientSpecialistNotFoundException() {
        super();
    }

    public PatientSpecialistNotFoundException(String message) {
        super(message);
    }

    public PatientSpecialistNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PatientSpecialistNotFoundException(Throwable cause) {
        super(cause);
    }

    protected PatientSpecialistNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
