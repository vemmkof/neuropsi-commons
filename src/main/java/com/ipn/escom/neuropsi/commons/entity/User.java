package com.ipn.escom.neuropsi.commons.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import com.ipn.escom.neuropsi.commons.entity.values.Gender;
import com.ipn.escom.neuropsi.commons.entity.values.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.sql.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends EntityTime implements Serializable {

    private static final long serialVersionUID = 5084202603438255147L;

    @Id
    @Positive
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Email
    @NotBlank
    @Column(nullable = false)
    private String username;

    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(nullable = false)
    private String password;

    @NotEmpty
    @Column(nullable = false)
    private String name;

    @NotEmpty
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = true)
    private String secondLastName;

    @Past
    @Column(nullable = false)
    private Date dateOfBirth;

    @NotEmpty
    @Column(nullable = false)
    private String phone;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder.Default
    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean expiredAccount = false;

    @Builder.Default
    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean lockedAccount = false;

    @Builder.Default
    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean expiredCredentials = false;

    @Builder.Default
    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean enabled = false;

}

