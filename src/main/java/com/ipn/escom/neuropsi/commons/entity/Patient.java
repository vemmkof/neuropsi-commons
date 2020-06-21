package com.ipn.escom.neuropsi.commons.entity;

import com.ipn.escom.neuropsi.commons.entity.keys.PatientKey;
import com.ipn.escom.neuropsi.commons.entity.values.Laterality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient extends EntityTime implements Serializable {

    private static final long serialVersionUID = -1744235761499622948L;

    @EmbeddedId
    private PatientKey patientKey;

    @NotNull
    @OneToOne
    @MapsId("id_user")
    @JoinColumn(name = "id_user")
    private User user;

    @NotEmpty
    @Column(nullable = false)
    private String reasonForConsultation;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Laterality laterality;
}
