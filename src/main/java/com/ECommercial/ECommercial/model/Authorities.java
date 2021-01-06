package com.ECommercial.ECommercial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Authorities {
//	AUTHORITY_ID INT authority VARCHAR(255) username VARCHAR(255) user_id INT
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	
	@Column(name = "authority")
	private String authority;
	
	@Column (name = "user_name")
	private String username; 
	
	@Override
	public String toString() {
		return "Authorities [id=" + id + ", authority=" + authority + ", username=" + username + ", user=" + user + "]";
	}

	@ManyToOne
	@JoinColumn(name = "username", referencedColumnName = "username")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
	