package com.bd.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.dao.ProjetRepository;
import com.bd.entities.Projet;
import com.bd.entities.User;
import com.bd.service.ProjetService;


@Service("ProjetServiceImp")
public class ProjetServiceImp implements ProjetService{
	
	@Autowired
	private   ProjetRepository projetRepository ;
	


	public Projet addProjet(Projet projet) {
		return projetRepository.save(projet);
	}

	public boolean DeleteProjet(Projet projet) {
		if(projetRepository.findOne(projet.getId()) != null){
		projetRepository.delete(projet);
		return true;
		}
		return false;
			
	}

	public boolean updateProjet(Integer idProjet) {
	    Projet projet=projetRepository.findOne(idProjet);
		if(projetRepository.save(projet) != null){
			return true;
		};
		return false;
	}

	public List<Projet> findAllProjets() {
		return projetRepository.findAll();
		
	}
	public Projet findProjetById(Integer idProjet) {
		return projetRepository.findOne(idProjet);
		 
	}

	public List<Projet> findAllProjetsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
