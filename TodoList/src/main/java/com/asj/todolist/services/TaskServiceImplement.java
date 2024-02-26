package com.asj.todolist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asj.todolist.models.Task;
import com.asj.todolist.respositories.TaskRepository;

@Service
public class TaskServiceImplement implements TaskService {
	
	//Conectamos con Repositorio
	@Autowired
	public TaskRepository taskRepository;

	@Override
	public List<Task> GetTaskAll() {
		//me devuelve todos los registros
		return taskRepository.findAll(); 
	}

	@Override
	public String PostTask(Task task) {
		//Guardamos la tarea
		taskRepository.save(task);
		return "Tarea insertada";
	}

	@Override
	public String DeleteTask(Long id) {
		// Elimino la tarea
		taskRepository.deleteById(id);
		return "Tarea eliminada";
		/*
		 * try{
		 * 		elimino
		 *  	return "Ok";
		 * }catch(Exception err){
		 * 		return err;
		 * }
		 * 
		 * */
	}

	@Override
	public List<Task> PutTask(Task task, Long id) {
		System.out.println(task);
		System.out.println(id);
		// Obtenemos la tarea con ID pasado por parametro
		Task taskPut = taskRepository.findById(id).get();
		if(taskPut != null) {
			taskPut.setNombre(task.getNombre());
			taskRepository.save(taskPut);
		}
		return taskRepository.findAll();
		
	}

}
