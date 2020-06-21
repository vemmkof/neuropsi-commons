package com.ipn.escom.neuropsi.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Institute extends EntityTime implements Serializable {

    private static final long serialVersionUID = 2087985402313143226L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Positive
    private Long idInstitute;

    @NotEmpty
    @Column(nullable = false)
    private String name;

    @NotEmpty
    @Column(nullable = false)
    private String address;

    @NotEmpty
    @Column(nullable = false)
    private String phone;


}
