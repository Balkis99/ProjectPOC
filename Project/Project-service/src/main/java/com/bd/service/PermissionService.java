package com.bd.service;

import com.bd.entities.Permission;

public interface PermissionService {

	public Permission addOrUpdatePermission(Permission permission);
	public Boolean deletePermission(Permission permission);
	public Permission findPermissionById(Integer id);
	public Iterable<Permission> findAllPermissions();
}
