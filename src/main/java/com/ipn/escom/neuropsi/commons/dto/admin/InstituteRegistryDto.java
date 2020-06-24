package com.ipn.escom.neuropsi.commons.dto.admin;

import com.ipn.escom.neuropsi.commons.entity.Institute;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InstituteRegistryDto implements Serializable {
    private static final long serialVersionUID = 2494365421147078251L;
    private Institute institute;
}
