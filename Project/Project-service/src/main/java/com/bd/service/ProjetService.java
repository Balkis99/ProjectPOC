package com.bd.service;

import java.util.List;

import com.bd.entities.Projet;
import com.bd.entities.User;

public interface ProjetService {
	 Projet addProjet(Projet projet);
	 boolean DeleteProjet(Projet projet);
	 boolean updateProjet(Integer idProjet);
	 
     List<Projet> findAllProjets();
     Projet findProjetById(Integer idProjet);
     List<Projet> findAllProjetsByUser(User user);
}
