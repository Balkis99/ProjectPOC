package com.bd.service;

import java.util.List;

import com.bd.entities.Projet;
import com.bd.entities.User;

public interface UserService {
	Boolean CreateUser(User user);
	  List <User> findAllUsers() ; 
	  Boolean deleteUser(User user);
	  Boolean updateUser(User user);
	  public User findUserById(Integer id);
}
