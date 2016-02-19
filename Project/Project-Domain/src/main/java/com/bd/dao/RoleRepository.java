package com.bd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bd.entities.Role;
import com.bd.entities.User;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	@Query("select u from User u where u.role.role = :role")
	public List<User> findUsersByRole(@Param("role") String role);
	
}
