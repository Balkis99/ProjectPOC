package com.bd;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bd.service.AdvancementService;
import com.bd.service.PermissionService;
import com.bd.service.ProjetService;
import com.bd.service.RoleService;
import com.bd.service.TaskService;
import com.bd.service.implement.AdvancementServiceImpl;
import com.bd.service.implement.ProjetServiceImp;
import com.bd.service.implement.TaskServiceImplement;
import com.bd.service.implement.RoleServiceImplementation;
import com.bd.service.implement.PermissionServiceImplementation;




@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {  "com.bd" })
@ComponentScan(basePackages = {  "com.bd" })


public class JavaConfig{
 
   @Bean
   public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
      LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
      em.setDataSource(dataSource());
      em.setPackagesToScan(new String[] { "org.baeldung.persistence.model" });
      em.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");
      em.setPersistenceUnitName("Project-Domain");
      JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
      em.setJpaVendorAdapter(vendorAdapter);
      em.setJpaProperties(additionalProperties());
 
      return em;
   }
 
   @Bean
   public DataSource dataSource(){
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://localhost:3306/dba");
      dataSource.setUsername( "root" );
      dataSource.setPassword( "root" );
      return dataSource;
   }
  
		  
   @Bean
   public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(emf);
 
      return transactionManager;
   }
   
   @Bean
   public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
      return new PersistenceExceptionTranslationPostProcessor();
   }
   @Bean
   public AdvancementService advancementService(){
      return new AdvancementServiceImpl();
   }
   @Bean
   public TaskService taskService(){
      return new TaskServiceImplement();
   }
   
   @Bean
   public ProjetService ProjetServiceImp(){
  	  return new ProjetServiceImp();}
   
   @Bean
   public RoleService roleService() {
	   return new RoleServiceImplementation();
   }
   
   @Bean
   public PermissionService permissionService() {
	   return new PermissionServiceImplementation();
   }
 
 
      Properties additionalProperties() {
      Properties properties = new Properties();
      properties.setProperty("hibernate.hbm2ddl.auto", "update");
      properties.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider") ;
      properties.setProperty("hibernate.current_session_context_class", "thread") ;
      properties.setProperty("hibernate.show_sql", "true") ;
      properties.setProperty("hibernate.format_sql", "false") ;
      properties.setProperty("hibernate.show_comments", "true") ;
      return properties;
   }
}