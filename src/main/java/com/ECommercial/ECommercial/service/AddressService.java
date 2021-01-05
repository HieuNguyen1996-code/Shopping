package com.ECommercial.ECommercial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommercial.ECommercial.dao.AddressDao;
import com.ECommercial.ECommercial.model.Address;

@Service
public class AddressService {
	
	@Autowired
	AddressDao addressDao; 
	
	public void insertAddress(Address address){ 
		addressDao.save(address); 
	}
	
	public void updateAddress(int id, Address newAddress) { 
		if(addressDao.findById(id) != null) {
			
			Address address = addressDao.findById(id);
			newAddress.setUser(address.getUser());
			newAddress.setId(id);
			addressDao.save(newAddress);
		}
	}
	
	public List<Address> getAllAddress(){ 
		return addressDao.findAll(); 
	}
	
	public Address getAddressById(int id) { 
		return addressDao.findById(id); 
	}
	
	
	

	
	

}
