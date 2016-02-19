package com.bd.service.implement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.dao.RoleRepository;
import com.bd.entities.Role;
import com.bd.service.RoleService;

@Service("roleService")
public class RoleServiceImplementation implements RoleService {

	@Autowired
	RoleRepository repository;
	
	
	public RoleServiceImplementation() {
		super();
	}

	@Transactional
	public Role addOrUpdateRole(Role role) {
		Role r = new Role();
		if (role != null) {
			r = repository.save(role);
		}
		return r;
	}

	@Transactional
	public Boolean deleteRole(Role role) {
		Boolean deleted = false;
		Role r = findRoleById(role.getId());
		if (r != null) {
			repository.delete(role);
			deleted = true;
		} 
		return deleted;
	}

	@Transactional
	public Role findRoleById(Integer id) {
		return repository.findOne(id);
	}

	@Transactional
	public Iterable<Role> findAllRoles() {
		return repository.findAll();
	}

	/*@Transactional
	public List<User> findUsersByRole(String role) {
		return repository.findUsersByRole(role);
	}*/

}
