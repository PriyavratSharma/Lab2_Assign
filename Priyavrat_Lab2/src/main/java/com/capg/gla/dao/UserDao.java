package com.capg.gla.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.gla.model.User;



@Repository
public interface UserDao extends JpaRepository<User, String>{
	
	public User findByUsernameAndPassword(String username, String password);

}
