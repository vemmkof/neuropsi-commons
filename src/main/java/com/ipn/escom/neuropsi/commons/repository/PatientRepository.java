package com.ipn.escom.neuropsi.commons.repository;

import com.ipn.escom.neuropsi.commons.entity.PatientSpecialist;
import com.ipn.escom.neuropsi.commons.entity.keys.PatientSpecialistKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PatientRepository extends JpaRepository<PatientSpecialist, PatientSpecialistKey> {
}
