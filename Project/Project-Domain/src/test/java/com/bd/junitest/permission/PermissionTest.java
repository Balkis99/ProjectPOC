package com.bd.junitest.permission;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bd.JavaConfig;
import com.bd.entities.Permission;
import com.bd.service.PermissionService;

public class PermissionTest {

	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
	PermissionService permissionService = ctx.getBean(PermissionService.class);
	
	@Test
	public void testAddPermission() {
		
		Permission permissionToBeInserted = new Permission();
		Permission permissionInserted = permissionService.addOrUpdatePermission(permissionToBeInserted);
		
		assertEquals(permissionToBeInserted.getId(), permissionInserted.getId());	
	}
	
	@Test
	public void testUpdatePermission() {
		
		Permission permissionToBeInserted = new Permission();
		permissionToBeInserted.setAuthorize(true);
		
		Permission permissionInserted = permissionService.addOrUpdatePermission(permissionToBeInserted);
		
		Permission permissionToBeUpdated = permissionService.findPermissionById(permissionToBeInserted.getId());
		permissionToBeUpdated.setAuthorize(false);
		Permission permissionUpdated = permissionService.addOrUpdatePermission(permissionToBeUpdated);
		
		assertNotSame(permissionInserted.getAuthorize(), permissionUpdated.getAuthorize());
	}
	
	@Test
	public void testDeletePermission() {
		
		Permission permission = new Permission();
		Permission permissionToBeRemoved = permissionService.addOrUpdatePermission(permission);
		assertTrue(permissionService.deletePermission(permissionToBeRemoved));
	}
	
	@Test
	public void testFindPermissionById() {
		Permission permissionToBeInserted = new Permission();
		permissionService.addOrUpdatePermission(permissionToBeInserted);
		
		Permission permissionToBeFound = permissionService.findPermissionById(permissionToBeInserted.getId());
		
		assertEquals(permissionToBeFound.getId(), permissionToBeInserted.getId());
	}
	
	@Test
	public void testFindAllPermissions() {
		
		Permission permissionToBeInserted = new Permission();
		permissionService.addOrUpdatePermission(permissionToBeInserted);
		
		List<Permission> permissionList = new ArrayList<Permission>();
		
		Iterable<Permission> permissions = permissionService.findAllPermissions();
		Iterator<Permission> it = permissions.iterator();
		while (it.hasNext()) {
			Permission permission = it.next();
			permissionList.add(permission);
		}
		
		assertTrue(permissionList.size() > 1);
	}
	
}
