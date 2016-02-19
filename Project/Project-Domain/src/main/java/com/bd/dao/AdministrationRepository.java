package com.bd.dao;

import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import com.bd.entities.Administration;

public interface AdministrationRepository extends JpaRepository<Administration, Integer>{

	

}