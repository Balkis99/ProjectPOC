package com.bd;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bd.entities.Task;
import com.bd.service.TaskService;

public class App2 {
	 public static void main( String[] args )
	    {
	    	 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
	       //ApplicationContext ctx= new  ClassPathXmlApplicationContext("applicationContext.xml");
	  
	   Task tsk = new Task();
	    
	    tsk.setId(1);
	   tsk.setDescription(" process 45");
	    tsk.setDuration(123);
	   tsk.setName("essay");
	   tsk.setState("tunis");
	   tsk.setProjet(null);
	    
	    TaskService taskService = (TaskService) ctx1.getBean("taskService");
	    taskService.CreateUpdateTask(tsk);
	    
	    
	   // List<Task> Tasks = taskService.findAll();
	  //  for(Task Task : Tasks){
	    //	System.out.println(Task.getName());
	   // }
	    
	   // Task Task12 = taskService.FindTaskById(2);
	    
	 // System.out.println(Task12.getDescription());
	   
	  //taskService.deleteTask(Task12);
	 
	    //System.out.println("FindByName =@Query Method");
	   // Task taskUsingQuery= taskService.findTaskByName("easy");
	    //System.out.println(taskUsingQuery.getState());
	    }
	}
