package com.bd.junitest.projet;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bd.JavaConfig;
import com.bd.entities.Projet;
import com.bd.service.ProjetService;

public class TestProjet {

	@Test
	public void _1TestAddProjet() {
		ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
		
		//Recuperation bean Majeur a travers interface 
		
	 ProjetService projetService = (ProjetService) ctx1.getBean("ProjetServiceImp");
		
		//Creation projet
     Projet projet = new Projet();
     projet.setName("pfe");
	
	//Execution method :creation advancement
    assertEquals(projetService.addProjet(projet), projet);
	}

	@Test
	public void _2TestUpdaterojet() {
	 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
		
		//Recuperation bean Majeur a travers interface 
		
	 ProjetService projetService = (ProjetService) ctx1.getBean("ProjetServiceImp");	
  
  Projet projet =projetService.findProjetById(1);

  projet.setName("pfe2");
	
	//Execution of method :update projet
  assertEquals(projetService.updateProjet(1), true);
  }
	@Test
	public void _3TestDeleteProjet(){
		ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
		ProjetService projetService = (ProjetService) ctx1.getBean("ProjetServiceImp");
		
			
		 Projet projet =projetService.findProjetById(1);
	    
		
		//Execution of method :delete projet
		 assertEquals(projetService.DeleteProjet(projet), true);
		
	}
	//@Test 
	//public void _4TestFindAllProjet(){
		//ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
		//ProjetService projetService = (ProjetService) ctx1.getBean("ProjetServiceImp");
		
	//}
}
