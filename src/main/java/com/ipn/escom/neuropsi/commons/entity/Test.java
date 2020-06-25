package com.ipn.escom.neuropsi.commons.entity;

import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Test extends EntityTime implements Serializable {

    private static final long serialVersionUID = 3777931019013175183L;

    @Id
    @Positive
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTest;

    @ManyToOne(optional = false)
    private Specialist specialist;


    @ManyToOne(optional = false)
    private Patient patient;

    @ManyToOne(optional = false)
    private Module module;

    private Long score;
}
