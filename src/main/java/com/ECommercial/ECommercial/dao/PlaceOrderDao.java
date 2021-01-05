package com.ECommercial.ECommercial.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ECommercial.ECommercial.model.PlaceOrder;

public interface PlaceOrderDao extends JpaRepository<PlaceOrder, Integer>{
	
}
