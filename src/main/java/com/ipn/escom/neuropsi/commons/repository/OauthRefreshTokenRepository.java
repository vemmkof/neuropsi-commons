package com.ipn.escom.neuropsi.commons.repository;

import com.ipn.escom.neuropsi.commons.entity.OauthRefreshToken;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface OauthRefreshTokenRepository extends CrudRepository<OauthRefreshToken, String> {

    List<OauthRefreshToken> findAll(Example<OauthRefreshToken> example);

}
