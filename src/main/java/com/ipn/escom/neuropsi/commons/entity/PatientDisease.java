package com.ipn.escom.neuropsi.commons.entity;

import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import com.ipn.escom.neuropsi.commons.entity.keys.PatientDiseaseKey;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class PatientDisease extends EntityTime implements Serializable {

    private static final long serialVersionUID = 1110687128838812927L;

    @EmbeddedId
    private PatientDiseaseKey patientDiseaseKey;

    @ManyToOne
    @MapsId("id_patient")
    @JoinColumn(name = "id_patient")
    private Patient patient;

    @ManyToOne
    @MapsId("id_disease")
    @JoinColumn(name = "id_disease")
    private Disease disease;
}
