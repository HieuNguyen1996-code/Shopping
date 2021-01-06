package com.ECommercial.ECommercial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommercial.ECommercial.dao.UserDao;
import com.ECommercial.ECommercial.model.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao; 
	
	
	public List<User> findByID(int id){
		
		return userDao.findById(id);
	}
	
	public void insert(User user) {
		
		userDao.save(user);
	}
	
	public List<User> findAll(){
		return userDao.findAll();
	}
	// checking the email and password to login 
	// if the email exist and password matched then login 
	
	public int loginUser(String email, String user, String password){ 
		return 1; 
	}

}
