package com.bd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.entities.Advancement;
@Repository
public interface AdvancementRepository extends JpaRepository<Advancement, Integer>{

}
