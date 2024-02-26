package com.bootcamp.newtodolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.newtodolist.models.PedidossModel;
@Repository
public interface PedidosRepository extends JpaRepository<PedidossModel, Integer> {

}
