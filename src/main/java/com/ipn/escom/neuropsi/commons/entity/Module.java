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
@Entity
@EqualsAndHashCode(callSuper = false)
public class Module extends EntityTime implements Serializable {
    private static final long serialVersionUID = -4631923878101713817L;

    @Id
    @Positive
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModule;

    @NotEmpty
    @Column(nullable = false)
    private String description;
}
