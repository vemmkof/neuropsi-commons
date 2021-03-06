package com.ipn.escom.neuropsi.commons.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RequestDto<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 155606696302466867L;
    private T entity;
}
