package com.bd;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bd.dao.AdvancementRepository;
import com.bd.entities.Advancement;
import com.bd.service.AdvancementService;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
       //ApplicationContext ctx= new  ClassPathXmlApplicationContext("applicationContext.xml");
  
   Advancement advan = new Advancement();
    
    advan.setId(2);
   advan.setDescription("nuhnuh ");
    advan.setDate(null);
   advan.setTask(null);
    
    AdvancementService advancementService = (AdvancementService) ctx1.getBean("advancementService");
    advancementService.createAdvancement(advan);
    
    
    List<Advancement> advancements = advancementService.findAll();
    for(Advancement advancement : advancements){
    	System.out.println(advancement.getDescription());
    }
    
    Advancement advancement12 = advancementService.FindAdvancementById(2);
    
  System.out.println(advancement12.getDescription());
   
  advancementService.deleteAdvancement(advancement12);
    }
}
