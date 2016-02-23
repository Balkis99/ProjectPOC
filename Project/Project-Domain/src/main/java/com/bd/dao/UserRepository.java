package com.bd.dao;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.bd.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {

}
