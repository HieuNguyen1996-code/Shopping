package com.ECommercial.ECommercial.util;

import com.ECommercial.ECommercial.model.Address;
import com.ECommercial.ECommercial.model.BufCart;
import com.ECommercial.ECommercial.model.PlaceOrder;
import com.ECommercial.ECommercial.model.Product;
import com.ECommercial.ECommercial.model.User;

// This class is to check neither the class is valid or not. 
public class Validator {
	
	

	public static boolean isUserValid(User user) {
		if(user.getName() == null || user.getName().equals("")) { 
			return true;
		}
		if(user.getAge() == 0 ) {
			return true; 
		}
		if(user.getEmail() == null || user.getEmail().equals("")) {
			return true; 
		}
		if(user.getUserType() == null || user.getUserType().equals("")) {
			return true;
		}
		if(user.getUserName() == null || user.getUserName().equals("")) {
			return true;
		}
		if(user.getPassword() == null || user.getPassword().equals("")) {
			return true;
		}
		return false; 	
	}
	
	public static boolean isProductValid(Product product) { 
		
		if(product.getProductName() == null || product.getProductName().equals("")) {
			return true;
		}
		
		if(product.getPrice() == 0) {
			return true; 
		}
		
		return false;
	}
	
	public static boolean isAddressValid(Address address) {
		if(address.getAddress() == null || address.getAddress().equals("")) {
			return true; 
			
		}
		if(address.getCity() == null || address.getCity().equals("")) {
			return true; 
		}
		if(address.getCountry() == null || address.getCountry().equals("")) { 
			return true; 
		}
		if(address.getState() == null || address.getState().equals("")) {
			return true;
		}
		return false; 
	}
	
	public static boolean isBufCart(BufCart cart) { 
		if(cart.getEmail() == null || cart.getEmail().equals("")) {
			return true;
		}
		if(cart.getProductName() == null || cart.getProductName().equals("")) {
			return true; 
		}
		return false;
	}
	
	public static boolean isPlaceOrder(PlaceOrder placeOrder) { 
		if(placeOrder.getEmail() == null || placeOrder.getEmail().equals("")) {
			return true;
		}
		return false;
	}

}
