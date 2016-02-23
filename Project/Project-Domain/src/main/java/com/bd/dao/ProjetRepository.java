package com.bd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bd.entities.Projet;
@Repository
public interface ProjetRepository  extends JpaRepository<Projet, Integer> {
	
	@Query("select p from Projet p where p.name=:name")
	List<Projet> FindProjetByName(@Param("name")String name);
	

}
