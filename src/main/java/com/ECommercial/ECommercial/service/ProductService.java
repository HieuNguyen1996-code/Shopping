package com.ECommercial.ECommercial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommercial.ECommercial.dao.ProductDao;
import com.ECommercial.ECommercial.model.Product;
@Service
public class ProductService {
	@Autowired
	ProductDao productDao; 
	
	public void insert(Product product) {
		productDao.save(product);
	}
	
	public Product findById(int id) {
		return productDao.findById(id);
	}

}
