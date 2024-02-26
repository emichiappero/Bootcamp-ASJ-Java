package com.bootcamp.newtodolist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bootcamp.newtodolist.models.TareaModel;

@Repository
public interface TareaRepository extends JpaRepository<TareaModel, Integer>{
	
	@Query(value = "SELECT t.* FROM tareas t WHERE t.estado = :estado LIMIT 2", nativeQuery = true)
	List<TareaModel> findByEstado(@Param("estado") boolean estado);
	
	@Query(value = "SELECT t.* FROM tareas t WHERE t.estado = :estado OR nombre LIKE %:nombre% ORDER BY t.nombre", nativeQuery = true)
	List<TareaModel> miConsulta(@Param("estado") boolean estado, @Param("nombre") String nombre);
	
	@Query(value = "SELECT id, nombre, estado, descripcion FROM tareas WHERE descripcion LIKE %:texto% ORDER BY id DESC, nombre ASC", nativeQuery=true)
	List<TareaModel> myQuery(@Param("texto") String texto);
	
	List<TareaModel> findByNombreLike(String a); //SELECT * FROM tareas WHERE nombre LIKE a

}


// obtener todos los registro .findAll();