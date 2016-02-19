package com.bd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.entities.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {

}
