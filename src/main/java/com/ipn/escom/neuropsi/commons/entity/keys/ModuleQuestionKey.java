package com.ipn.escom.neuropsi.commons.entity.keys;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ModuleQuestionKey implements Serializable {

    private static final long serialVersionUID = 3848189194892110752L;

    @Column(name = "id_module")
    private Long idModule;


    @Column(name = "id_question")
    private Long idQuestion;
}
