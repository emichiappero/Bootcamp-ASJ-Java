package com.bootcamp.relaciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.relaciones.models.PedidoModel;

public interface PedidoRepository extends JpaRepository<PedidoModel, Integer> {

}
