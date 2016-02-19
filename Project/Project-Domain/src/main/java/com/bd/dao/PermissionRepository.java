package com.bd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.entities.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {

}
