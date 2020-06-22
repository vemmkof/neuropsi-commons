package com.ipn.escom.neuropsi.commons.dto.patient;

import com.ipn.escom.neuropsi.commons.entity.Disease;
import com.ipn.escom.neuropsi.commons.entity.Patient;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class UserRegistryDto implements Serializable {
    private static final long serialVersionUID = 5635623336428889234L;
    private Patient patient;
    private List<Disease> diseases;
}
