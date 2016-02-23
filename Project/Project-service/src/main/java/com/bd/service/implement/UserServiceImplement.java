package com.bd.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

 

import org.springframework.stereotype.Service;

import com.bd.dao.UserRepository;
import com.bd.entities.User;
import com.bd.service.UserService;
@Service
public class UserServiceImplement implements UserService {


@Autowired
UserRepository repository  ;

 
public List<User> findAllUsers()
    {

		    List<User> users = new ArrayList<User>() ;
            users=repository.findAll() ;
	        return users ;
	}
 
 
	public Boolean CreateUser(User user) 
	   {
		repository.save(user);
		User user1=repository.findOne(user.getId()) ;
		if(user1==null) return false ;
		return true	;
		}

	public Boolean deleteUser(User user) {
		repository.delete (user);
		User user1=repository.findOne(user.getId()) ;
		if(user1==null) return true ;
		return false	;
	}

	public Boolean updateUser(User user) {
		repository.save(user);
		return true;
	}
	
	
	
public User findUserById(Integer id)
{
	return repository.findOne(id);
}
}
