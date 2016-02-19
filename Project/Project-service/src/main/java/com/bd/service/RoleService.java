package com.bd.service;


import com.bd.entities.Role;

public interface RoleService {

	public Role addOrUpdateRole(Role role);
	public Boolean deleteRole(Role role);
	public Role findRoleById(Integer id);
	public Iterable<Role> findAllRoles();
	//public List<User> findUsersByRole(String role);
}
