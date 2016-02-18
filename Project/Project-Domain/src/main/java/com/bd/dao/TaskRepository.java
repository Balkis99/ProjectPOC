package com.bd.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bd.entities.Advancement;
import com.bd.entities.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	
	
}
