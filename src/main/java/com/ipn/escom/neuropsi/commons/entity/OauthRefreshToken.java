package com.ipn.escom.neuropsi.commons.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "oauth_refresh_token")
public class OauthRefreshToken extends EntityTime implements Serializable {

    private static final long serialVersionUID = 8766191624805217983L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "token_id")
    private String tokenId;

    @Lob
    @JsonIgnore
    @Column(nullable = false, length = 254 * 4, name = "token")
    private byte[] token;

    @Lob
    @JsonIgnore
    @Column(nullable = false, length = 254 * 4, name = "authentication")
    private byte[] authentication;

}
