package com.bd.junitest.role;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bd.JavaConfig;
import com.bd.entities.Role;
import com.bd.service.RoleService;


public class RoleTest {
	
	/*@Autowired
	RoleService roleService;*/
	
	
	
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
	RoleService roleService = ctx.getBean(RoleService.class);
	

	@Test
	public void testAddRole() {
		Role roleToBeInserted = new Role();
		roleToBeInserted.setRole("Administrateur");
		
		Role roleInserted = roleService.addOrUpdateRole(roleToBeInserted);
		
		assertEquals(roleToBeInserted.getRole(), roleInserted.getRole());
	}
	
	@Test
	public void testUpdateRole() {
	
		Role roleToInsert = new Role();
		roleToInsert.setRole("Simple User");
		
		Role roleInserted = roleService.addOrUpdateRole(roleToInsert);
		
		Role roleToUpdate = roleService.findRoleById(roleToInsert.getId());
		roleToUpdate.setRole("Adminstrator");
		
		Role roleUpdated = roleService.addOrUpdateRole(roleToUpdate);
		
		assertNotSame(roleUpdated.getRole(), roleInserted.getRole());
		
	}
	
	@Test
	public void testDeleteRole() {
		
		Role role = new Role();
		
		Role roleToBeRemoved = roleService.addOrUpdateRole(role);
		
		assertTrue(roleService.deleteRole(roleToBeRemoved));
	}
	
	@Test
	public void testFindRoleById() {
		
		Role roleToBeInserted = new Role();
		
		roleService.addOrUpdateRole(roleToBeInserted);
		
		Role roleToBeFound = roleService.findRoleById(roleToBeInserted.getId());
		
		assertEquals(roleToBeInserted.getId(), roleToBeFound.getId());
		
	}
	
	@Test
	public void testFindAllRoles() {
		
		Role roleToBeInserted = new Role();
		
		roleService.addOrUpdateRole(roleToBeInserted);
		
		List<Role> roleList = new ArrayList<Role>();
		
		Iterable<Role> roles = roleService.findAllRoles();
		Iterator<Role> it = roles.iterator();
		while (it.hasNext()) {
			Role role = it.next();
			roleList.add(role);
		}
		
		assertTrue(roleList.size() > 1);
	}
	
}
