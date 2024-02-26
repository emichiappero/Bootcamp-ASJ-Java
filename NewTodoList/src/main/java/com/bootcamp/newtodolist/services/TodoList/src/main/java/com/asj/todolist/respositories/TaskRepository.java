package com.asj.todolist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asj.todolist.models.Task;

@Repository
// JpaRepository<Task, Long> es qué tipo de datos va a aceptar esta entidad. Por un lado Task, y por otro Long (el ID)
public interface TaskRepository extends JpaRepository<Task, Long> {
	

}



