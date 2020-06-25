package com.ipn.escom.neuropsi.commons.entity;

import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Institute extends EntityTime implements Serializable {

    private static final long serialVersionUID = 2087985402313143226L;

    @Id
    @Positive
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
