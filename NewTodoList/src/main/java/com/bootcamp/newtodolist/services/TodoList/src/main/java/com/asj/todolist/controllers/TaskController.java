package com.asj.todolist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asj.todolist.models.Task;
import com.asj.todolist.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	public TaskService taskservice;
	
	@GetMapping("/prueba") 
	public ResponseEntity<String> holaMundo() {
		return new ResponseEntity<>("Hello World!", HttpStatus.NOT_FOUND);
	}

	@GetMapping()
	public ResponseEntity<List<Task>> GetTaskAll(){
		return ResponseEntity.ok(taskservice.GetTaskAll());
	}
	
	@PostMapping()
	public ResponseEntity<String> PostTask(@RequestBody Task task){
		return ResponseEntity.ok(taskservice.PostTask(task));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<List<Task>> PutTask(@RequestBody Task task, @PathVariable Long id){
		return ResponseEntity.ok(taskservice.PutTask(task, id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> DeleteTask(@PathVariable Long id){
		return ResponseEntity.ok(taskservice.DeleteTask(id));
	}
}
