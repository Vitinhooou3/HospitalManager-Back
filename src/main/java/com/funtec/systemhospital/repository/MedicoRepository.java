package com.funtec.systemhospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funtec.systemhospital.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {
    
}
