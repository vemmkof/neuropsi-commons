package com.ipn.escom.neuropsi.commons.dto;

import java.io.Serializable;

public class ResponseDto<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = -3053279782730090800L;
    private T entity;
    private String message;
}
