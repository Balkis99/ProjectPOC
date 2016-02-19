package com.bd.service.implement;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.bd.dao.AdministrationRepository;
import com.bd.entities.Administration;
import com.bd.service.AdministrationService;

@Service("administrationService")



public class AdministrationServiceImpl implements AdministrationService{
	
	@Autowired
	AdministrationRepository administrationRepository;

	public AdministrationServiceImpl() {
		super();
	}
	@Transactional
	public Boolean createAdministration(Administration administration){
		administrationRepository.save(administration);
		return true;
	}
	
	@Transactional
	public Boolean updateAdministration(Administration administration){
		administrationRepository.save(administration);
		return true;
	}
	
	@Transactional
	public Boolean deleteAdministration(Administration administration){
		administrationRepository.delete(administration);
		return true;
	}
	@Transactional
	public List<Administration> findAll(){
		return administrationRepository.findAll();
	}
	@Transactional
	public Administration FindAdministrationById(Integer id) {
		return administrationRepository.findOne(id);
	}
	
	
}
