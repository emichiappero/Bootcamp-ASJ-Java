package com.asj.todolist.services;

import java.util.List;

import com.asj.todolist.models.Task;

public interface TaskService {
	List<Task> GetTaskAll();

	String PostTask(Task task);
	
	String DeleteTask(Long id);
	
	List<Task> PutTask(Task task, Long id);
}
