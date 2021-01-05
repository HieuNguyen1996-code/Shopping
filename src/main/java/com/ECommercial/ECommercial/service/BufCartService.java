package com.ECommercial.ECommercial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommercial.ECommercial.dao.BufCartDao;
import com.ECommercial.ECommercial.model.BufCart;
import com.ECommercial.ECommercial.model.PlaceOrder;
import com.ECommercial.ECommercial.model.Product;
@Service
public class BufCartService {
	@Autowired
	BufCartDao bufCartDao;
	
	@Autowired
	ProductService productService; 
	
	@Autowired
	PlaceOrderService placeOrderService;
	public void insert(BufCart bufCart) {
		System.out.println(bufCart);
		int product_id = bufCart.getProduct_id();
		System.out.println(product_id);
		Product product = productService.findById(product_id);
		
		System.out.println(product);

		double total_price = product.getPrice() * bufCart.getQuantity();
		PlaceOrder placeOrder = new PlaceOrder();
		placeOrder.setTotal_cost(total_price);
		placeOrder.setEmail(bufCart.getEmail());
		
		int orderId = placeOrderService.insert(placeOrder);
		
		bufCart.setOrderId(orderId);
		bufCart.setPrice(product.getPrice());
//		bufCart.setProductName(product.getProductName());
		bufCartDao.save(bufCart);

	}
}
