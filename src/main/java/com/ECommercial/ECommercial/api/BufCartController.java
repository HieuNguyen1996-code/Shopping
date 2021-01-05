package com.ECommercial.ECommercial.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ECommercial.ECommercial.model.BufCart;
import com.ECommercial.ECommercial.service.BufCartService;

@RestController
@RequestMapping("bufcart")
public class BufCartController {
	@Autowired
	BufCartService bufCartService; 
	
	@PostMapping
	public void insert(@RequestBody BufCart bufCart) { 
		bufCartService.insert(bufCart);
	}

}
