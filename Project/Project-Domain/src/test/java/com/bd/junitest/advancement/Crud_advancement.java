package com.bd.junitest.advancement;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bd.JavaConfig;
import com.bd.entities.Advancement;
import com.bd.service.AdvancementService;

public class Crud_advancement {

	
	@Test
	public void test_Create() {
   	 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
     AdvancementService advancementService = (AdvancementService) ctx1.getBean("advancementService");
		
		//Creation advancement
     Advancement advan = new Advancement();
     advan.setDescription("very well");
     advan.setTask(null);
     advan.setDate(null);
	
	//Execution method :creation advancement
     assertEquals(advancementService.createAdvancement(advan), true);
     
}

	@Test
	public void test_delete() {
		 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
		 AdvancementService advancementService = (AdvancementService) ctx1.getBean("advancementService");
		
	     Advancement advan =advancementService.FindAdvancementById(1);

		//Execution of method :delete advancement
	     assertEquals(advancementService.deleteAdvancement(advan), true);
	     
	}
	@Test
	public void test() {
		 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;

			
			//Recuperation bean Majeur a travers interface 
			
	     AdvancementService advancementService = (AdvancementService) ctx1.getBean("advancementService");
	  Advancement advan =advancementService.FindAdvancementById(3);
	
	     advan.setDescription("updated");
	     advan.setTask(null);
	     advan.setDate(null);
		
		//Execution of method :update advancement
	     assertEquals(advancementService.createAdvancement(advan), true);
		
		
	}
}