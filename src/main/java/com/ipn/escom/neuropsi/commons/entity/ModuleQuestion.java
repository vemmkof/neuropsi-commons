package com.ipn.escom.neuropsi.commons.entity;

import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import com.ipn.escom.neuropsi.commons.entity.keys.ModuleQuestionKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ModuleQuestion extends EntityTime implements Serializable {

    private static final long serialVersionUID = -4775015962580782856L;

    @EmbeddedId
    private ModuleQuestionKey moduleQuestionKey;

    @NotNull
    @OneToOne
    @MapsId("id_module")
    @JoinColumn(name = "id_module")
    private Module module;

    @NotNull
    @OneToOne
    @MapsId("id_question")
    @JoinColumn(name = "id_question")
    private Question question;


}
