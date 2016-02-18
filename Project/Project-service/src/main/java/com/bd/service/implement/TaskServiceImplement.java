package com.bd.service.implement;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.dao.AdvancementRepository;
import com.bd.dao.TaskRepository;
import com.bd.entities.Advancement;
import com.bd.entities.Task;
import com.bd.service.TaskService;

@Service("taskService")
public class TaskServiceImplement implements TaskService {
	@Autowired
	TaskRepository taskRepository;

	public TaskServiceImplement() {
		super();
	}
	@Transactional
	public Boolean CreateUpdateTask(Task task) {
		taskRepository.save(task);
		return true;
	}
	@Transactional
	public Boolean deleteTask(Task task) {
		taskRepository.delete(task);
		return true;
	}
	@Transactional
	public Task FindTaskById(Integer id) {
		return taskRepository.findOne(id);
	}

	public List<Task> findAll() {
		return taskRepository.findAll();
	}
	
	
	
}
