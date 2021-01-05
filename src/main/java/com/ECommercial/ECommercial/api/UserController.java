package com.ECommercial.ECommercial.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ECommercial.ECommercial.model.User;
import com.ECommercial.ECommercial.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public void insert(@RequestBody User user) { 
		
		userService.insert(user);
	}
	
	@GetMapping
	public List<User> getAll() { 
		return userService.findAll();
	}
	

	@GetMapping("/{id}")
	public List<User> getByID(@PathVariable("id") int id){

		return userService.findByID(id);
	}
	// 

}
