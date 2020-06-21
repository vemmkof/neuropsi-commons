package com.ipn.escom.neuropsi.commons.repository;

import com.ipn.escom.neuropsi.commons.entity.OauthRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OauthRefreshTokenRepository extends JpaRepository<OauthRefreshToken, String> {
}
