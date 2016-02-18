package com.bd.service;

import java.util.List;

import com.bd.entities.Advancement;
import com.bd.entities.Task;

public interface TaskService {
	 Boolean CreateUpdateTask(Task task);
	 Boolean deleteTask(Task task);
	 Task FindTaskById (Integer id);

	List<Task> findAll(); 
}