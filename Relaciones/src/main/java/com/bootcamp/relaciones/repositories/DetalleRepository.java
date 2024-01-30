package com.bootcamp.relaciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.relaciones.models.DetalleModel;

public interface DetalleRepository extends JpaRepository<DetalleModel, Integer> {

}
