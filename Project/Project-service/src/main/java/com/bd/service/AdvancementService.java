package com.bd.service;

import java.util.List;

import com.bd.entities.Advancement;

public interface AdvancementService {
	 Boolean createAdvancement(Advancement advancement);
	 Boolean deleteAdvancement(Advancement advancement);
	 Advancement FindAdvancementById (Integer id);
	List<Advancement> findAll(); 
}
