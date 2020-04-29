package com.capg.gla.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.gla.dao.UserDao;
import com.capg.gla.model.User;



@Service
@Transactional
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User findByUsernameAndPassword(String username, String password) {
		return userDao.findByUsernameAndPassword(username, password);
	}

}
