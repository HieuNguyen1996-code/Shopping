package com.ECommercial.ECommercial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "place_order")
public class PlaceOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	
	@Column
	private String email; 
	
	@Column
	private String order_date; 
	
	@Column
	private String order_status; 
	
	@Column
	private double total_cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}

	@Override
	public String toString() {
		return "PlaceOrder [id=" + id + ", email=" + email + ", total_cost=" + total_cost + "]";
	} 
	
	

}
