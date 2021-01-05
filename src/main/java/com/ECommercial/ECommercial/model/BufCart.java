package com.ECommercial.ECommercial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buf_cart")
public class BufCart {

//bufcart_id INT
//date_added DATETIME email VARCHAR(255) order_id INT
//price DOUBLE
//product_id INT
//productname VARCHAR(255) quantity INT
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String date_added;
	
	@Column
	private String email;
	
	@Column 
	private int product_id; 
	
	@Column
	private String productName;

	@Column
	private int quantity; 
	
	@Column
	private int orderId; 
	
	@Column
	private double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "BufCart [id=" + id + ", date_added=" + date_added + ", email=" + email + ", product_id=" + product_id
				+ ", productName=" + productName + ", quantity=" + quantity + ", orderId=" + orderId + ", price="
				+ price + "]";
	} 
	
	
	
	
	
}
