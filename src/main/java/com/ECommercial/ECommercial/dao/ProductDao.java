package com.ECommercial.ECommercial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECommercial.ECommercial.model.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	public Product findById(int id);

}
