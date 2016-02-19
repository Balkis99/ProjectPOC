package com.bd.service;

import com.bd.entities.Privilege;

public interface PrivilegeService {

	public Privilege addOrUpdatePrivilege(Privilege privilege);
	public Boolean deletePrivilege(Privilege privilege);
	public Privilege findPrivilegeById(Integer id);
	public Iterable<Privilege> findAllPrivileges();
}
