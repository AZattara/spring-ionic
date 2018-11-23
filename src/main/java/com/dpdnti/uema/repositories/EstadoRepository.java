package com.dpdnti.uema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dpdnti.uema.domain.Estado;

@Repository
public interface  EstadoRepository extends JpaRepository<Estado, Integer>{

}
