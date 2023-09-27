package com.funtec.systemhospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.funtec.systemhospital.model.Paciente;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
}
