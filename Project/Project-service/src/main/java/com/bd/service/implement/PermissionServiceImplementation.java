package com.bd.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.dao.PermissionRepository;
import com.bd.entities.Permission;
import com.bd.service.PermissionService;

@Service("permissionService")
public class PermissionServiceImplementation implements PermissionService {

	@Autowired
	PermissionRepository repository;
	
	
	public PermissionServiceImplementation() {
		super();
	}

	@Transactional
	public Permission addOrUpdatePermission(Permission permission) {
		Permission p = new Permission();
		if (permission != null) {
			p = repository.save(permission);
		}
		return p;
	}

	@Transactional
	public Boolean deletePermission(Permission permission) {
		Boolean deleted = false;
		Permission p = findPermissionById(permission.getId());
		if (p != null) {
			repository.delete(permission);
			deleted = true;
		}
		return deleted;
	}

	@Transactional
	public Permission findPermissionById(Integer id) {
		return repository.findOne(id);
	}

	@Transactional
	public Iterable<Permission> findAllPermissions() {
		return repository.findAll();
	}

}
