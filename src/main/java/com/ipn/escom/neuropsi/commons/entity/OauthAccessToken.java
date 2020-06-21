package com.ipn.escom.neuropsi.commons.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ipn.escom.neuropsi.commons.entity.common.EntityTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oauth_access_token")
public class OauthAccessToken extends EntityTime implements Serializable {

    private static final long serialVersionUID = -715587613930346354L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "authentication_id")
    private String authenticationId;

    @Column(nullable = false, name = "token_id")
    private String tokenId;

    @Lob
    @JsonIgnore
    @Column(nullable = false, length = 254 * 4, name = "token")
    private byte[] token;

    @Column(nullable = false, name = "user_name")
    private String userName;

    @Column(nullable = false, name = "client_id")
    private String clientId;

    @Lob
    @JsonIgnore
    @Column(nullable = false, length = 254 * 4, name = "authentication")
    private byte[] authentication;

    @Column(nullable = false, name = "refresh_token")
    private String refreshToken;
}
