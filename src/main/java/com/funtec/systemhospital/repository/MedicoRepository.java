package com.funtec.systemhospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.funtec.systemhospital.model.Medico;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
