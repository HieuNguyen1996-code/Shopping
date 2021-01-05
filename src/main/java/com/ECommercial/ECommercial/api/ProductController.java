package com.ECommercial.ECommercial.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ECommercial.ECommercial.model.Product;
import com.ECommercial.ECommercial.service.ProductService;
@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	ProductService productService; 
	
	@PostMapping
	public void insert(@RequestBody Product product)	{
		productService.insert(product);
	}
}
