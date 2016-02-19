package com.bd.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.dao.PrivilegeRepository;
import com.bd.entities.Privilege;
import com.bd.service.PrivilegeService;

@Service
public class PrivilegeServiceImplementation implements PrivilegeService {

	@Autowired
	PrivilegeRepository repository;
	
	
	public PrivilegeServiceImplementation() {
		super();
	}

	@Transactional
	public Privilege addOrUpdatePrivilege(Privilege privilege) {
		Privilege p = new Privilege();
		if (privilege != null) {
			p = repository.save(privilege);
		}
		return p;
	}

	@Transactional
	public Boolean deletePrivilege(Privilege privilege) {
		Boolean deleted = false;
		Privilege p = findPrivilegeById(privilege.getId());
		if (p != null) {
			repository.delete(privilege);
			deleted = true;
		}
		return deleted;
	}

	@Transactional
	public Privilege findPrivilegeById(Integer id) {
		return repository.findOne(id);
	}

	@Transactional
	public Iterable<Privilege> findAllPrivileges() {
		return repository.findAll();
	}

}
