package com.ECommercial.ECommercial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommercial.ECommercial.dao.PlaceOrderDao;
import com.ECommercial.ECommercial.model.PlaceOrder;

@Service
public class PlaceOrderService {
	@Autowired
	PlaceOrderDao placeOrderDao; 
	
	public int insert(PlaceOrder placeOrder) {
		
		return placeOrderDao.save(placeOrder).getId(); 
	}
}
