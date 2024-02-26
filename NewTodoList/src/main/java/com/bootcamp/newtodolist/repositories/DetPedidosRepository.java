package com.bootcamp.newtodolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.newtodolist.models.DetPedidosModel;

@Repository
public interface DetPedidosRepository extends JpaRepository<DetPedidosModel, Integer> {

}
