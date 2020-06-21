package com.ipn.escom.neuropsi.commons.repository;

import com.ipn.escom.neuropsi.commons.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface InstituteRepository extends JpaRepository<Institute, Long> {
}