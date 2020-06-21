package com.ipn.escom.neuropsi.commons.entity;

import com.ipn.escom.neuropsi.commons.entity.keys.SpecialistKey;
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
public class Specialist extends EntityTime implements Serializable {

    private static final long serialVersionUID = -1027900055620607942L;

    @NotNull
    @EmbeddedId
    private SpecialistKey specialistKey;

    @NotNull
    @ManyToOne
    @MapsId("id_institute")
    @JoinColumn(name = "id_institute")
    private Institute institute;

    @NotNull
    @OneToOne
    @MapsId("id_user")
    @JoinColumn(name = "id_user")
    private User user;

    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String professionalId;

//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "specialist_patient",
//            joinColumns = {@JoinColumn(name = "id_specialist", nullable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "id_patient", nullable = false)})
//    private List<Patient> patients;

}
