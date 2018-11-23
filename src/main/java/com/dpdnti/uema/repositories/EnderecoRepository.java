package com.dpdnti.uema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dpdnti.uema.domain.Endereco;

@Repository
public interface  EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
