package com.ipn.escom.neuropsi.commons.entity.keys;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PatientDiseaseKey implements Serializable {

    private static final long serialVersionUID = 4123814962735905261L;

    @Column(name = "id_patient")
    private Long idPatient;


    @Column(name = "id_disease")
    private Long idDisease;
}
