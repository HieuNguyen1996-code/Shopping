package com.ECommercial.ECommercial.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//
//id INT
//dateof_birth DATETIME(6) job VARCHAR(255)
//name VARCHAR(255) userid INT
//age INT
//email VARCHAR(255) is_enabled BIT(1) password VARCHAR(255) username VARCHAR(255) usertype VARCHAR(255) usercol VARCHAR(45)
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	

	
	@Column(name="name")
	private String name; 
	
	@Column(name="job")
	private String job; 
	
	@Column(name = "email")
	private String email; 
	
	@Column(name = "dateOfBirth")	
	private String dateOfBirth;
	
	@Column(name="age")
	private String age; 
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="usertype")
	private String userType; 
	
	@JsonManagedReference
	@OneToOne(mappedBy= "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Address address;
	
	
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", job=" + job + ", email=" + email + ", dateOfBirth="
				+ dateOfBirth + ", age=" + age + ", userName=" + userName + ", password=" + password + ", userType="
				+ userType + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
