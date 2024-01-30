package com.bootcamp.relaciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.relaciones.models.PagosModel;

public interface PagosRepository extends JpaRepository<PagosModel, Integer> {

}
