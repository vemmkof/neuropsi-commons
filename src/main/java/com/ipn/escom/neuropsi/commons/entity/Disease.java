package com.ipn.escom.neuropsi.commons.entity;

import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Data
@Entity
public class Disease extends EntityTime implements Serializable {

    private static final long serialVersionUID = -917187800315031744L;

    @Id
    @Positive
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDisease;

    @Column(nullable = false)
    private String description;
}
