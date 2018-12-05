package com.dpdnti.uema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dpdnti.uema.domain.Pedido;

@Repository
public interface  PedidoRepository extends JpaRepository<Pedido, Integer>{

}
