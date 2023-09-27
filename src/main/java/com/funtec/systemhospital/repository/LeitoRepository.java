package com.funtec.systemhospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funtec.systemhospital.model.Leito;
import org.springframework.stereotype.Repository;

@Repository
public interface LeitoRepository extends JpaRepository<Leito,Long> {
}
