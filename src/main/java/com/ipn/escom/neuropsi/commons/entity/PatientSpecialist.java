package com.ipn.escom.neuropsi.commons.entity;

import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import com.ipn.escom.neuropsi.commons.entity.keys.PatientSpecialistKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class PatientSpecialist extends EntityTime implements Serializable {

    private static final long serialVersionUID = 4522762479766168214L;

    @EmbeddedId
    private PatientSpecialistKey patientSpecialistKey;

    @NotNull
    @ManyToOne
    @MapsId("id_specialist")
    @JoinColumn(name = "id_specialist")
    private Specialist specialist;

    @NotNull
    @OneToOne
    @MapsId("id_patient")
    @JoinColumn(name = "id_patient")
    private Patient patient;

}
