package com.bd.junitest.user;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bd.JavaConfig;
import com.bd.entities.Advancement;
import com.bd.entities.User;
import com.bd.service.AdvancementService;
import com.bd.service.UserService;

public class Crud_user {

	@Test
	public void test_Create() {
		ApplicationContext ctx1 = new AnnotationConfigApplicationContext( 	JavaConfig.class);
		UserService userService = (UserService) ctx1 .getBean("userServiceImplement");

		User user = new User();
		user.setId(7);
		user.setEmail("user@bd.tn");

		assertEquals(userService.CreateUser(user), true);

	}
//	@Test
//	public void test_Update() {
//		ApplicationContext ctx1 = new AnnotationConfigApplicationContext( 	JavaConfig.class);
//		UserService userService = (UserService) ctx1 .getBean("userServiceImplement");
//
//		User user = new User();
//	 
//		user.setEmail("user@bd.tn");
//
//		assertEquals(userService.updateUser(user), true);
//
//	}
//	

	@Test
	public void test_delete() {
		 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
			UserService userService = (UserService) ctx1 .getBean("userServiceImplement");
		
	     User user  = userService.findUserById(1) ;

		//Execution of method :delete advancement
	     assertEquals(userService.deleteUser(user), true);
	     
	}

}
