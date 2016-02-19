package com.bd.service;

import java.util.List;

import com.bd.entities.Administration;

public interface AdministrationService {
	 
	     Boolean createAdministration(Administration administration);
	     Boolean updateAdministration(Administration administration);
		 Boolean deleteAdministration(Administration administration);
		 List<Administration> findAll(); 
		 Administration FindAdministrationById (Integer id); 
}