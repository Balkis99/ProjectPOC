package com.bd.service.implement;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.dao.AdvancementRepository;
import com.bd.entities.Advancement;
import com.bd.service.AdvancementService;

@Service("advancementService")
public class AdvancementServiceImpl implements AdvancementService{

	@Autowired
	AdvancementRepository advancementRepository;

	public AdvancementServiceImpl() {
		super();
	}
	@Transactional
	public Boolean createAdvancement(Advancement advancement){
		advancementRepository.save(advancement);
		return true;
	}
	
	@Transactional
	public Boolean deleteAdvancement(Advancement advancement) {
		advancementRepository.delete(advancement);
		return true;
	}
	@Transactional
	public Advancement FindAdvancementById(Integer id) {
		return advancementRepository.findOne(id);
	}
	public List<Advancement> findAll() {
		
		return advancementRepository.findAll();
	}
	
	
	
}
