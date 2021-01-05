package com.ECommercial.ECommercial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECommercial.ECommercial.model.User;
@Repository
public interface UserDao  extends JpaRepository<User, Integer>{
	public List<User> findById(int id);
	public List<User> findAll();
}
