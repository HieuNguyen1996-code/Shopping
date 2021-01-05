package com.ECommercial.ECommercial.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ECommercial.ECommercial.model.Address;
import com.ECommercial.ECommercial.service.AddressService;
@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addressService; 
	
	@PostMapping
	public void insertAddress(@RequestBody Address address) {
		
		addressService.insertAddress(address);
	}
	@PutMapping({"/{id}"})
	public void updateAddress(@PathVariable("id") int id, @RequestBody Address newAddress) { 
		addressService.updateAddress(id, newAddress);
	}
	
	@GetMapping
	public List<Address> getAllAddress(){ 
		return addressService.getAllAddress();
	}
	@GetMapping("/{id}")
	public Address getAddressById(@PathVariable("id") int id) {
		return addressService.getAddressById(id);
	}
}
