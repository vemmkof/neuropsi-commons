package com.ipn.escom.neuropsi.commons.dto.admin;

import com.ipn.escom.neuropsi.commons.entity.Specialist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecialistRegistryDto implements Serializable {
    private static final long serialVersionUID = -927900239085810743L;
    private Specialist specialist;
}
