package com.ECommercial.ECommercial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECommercial.ECommercial.model.Address;
@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{
	public List<Address> findAll();
	public Address findById(int id);
//	public void set(int id, Address newAddress);
}
