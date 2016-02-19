package com.bd.junitest.administration;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bd.JavaConfig;
import com.bd.entities.Administration;
import com.bd.service.AdministrationService;

public class TestAdministration {

	@Test
	public void _1TestCreateAdministration() {
		ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
		
		//Recuperation bean Majeur a travers interface 
		
	 AdministrationService administrationService = (AdministrationService) ctx1.getBean("AdministrationServiceImpl");
		
		//Creation projet
     Administration administration = new Administration();
     administration.getId();
	
	//Execution method :creation advancement
    assertEquals(administrationService.createAdministration(administration),administration);
	}

	@Test
	public void _2TestUpdateadministration() {
	 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
		
		//Recuperation bean Majeur a travers interface 
		
	 AdministrationService administrationService = (AdministrationService) ctx1.getBean("AdministrationServiceImpl");	
  
	 Administration administration =administrationService.FindAdministrationById(1);

	 administration.getId();
	
	//Execution of method :update projet
  assertEquals(administrationService.updateAdministration(null), administration);
  }
	@Test
	public void _3TestDeleteAdministration(){
		ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
		AdministrationService administrationService = (AdministrationService) ctx1.getBean("AdministrationServiceImpl");
		
			
		Administration administration =administrationService.FindAdministrationById(1);
	    
		
		//Execution of method :delete projet
		 assertEquals(administrationService.deleteAdministration(administration), true);
		
	}
}