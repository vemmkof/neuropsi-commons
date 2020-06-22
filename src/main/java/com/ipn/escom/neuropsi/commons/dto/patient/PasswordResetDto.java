package com.ipn.escom.neuropsi.commons.dto.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PasswordResetDto implements Serializable {
    private static final long serialVersionUID = -918083424751633009L;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
