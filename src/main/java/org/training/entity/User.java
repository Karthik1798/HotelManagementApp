package org.training.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//Object relational Model of Customer entity

@Entity
@Table(name="customer")
public class User {

	
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	

	@Column(name="username")
	private String username;
	
	@Column(name="phoneno")
	private String phoneno;
	
	@Id
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="country")
	private String country;

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public User(int id, String name, String username, String phoneno, String email, String password, String country) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.phoneno = phoneno;
		this.email = email;
		this.password = password;
		this.country = country;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", phoneno=" + phoneno + ", email="
				+ email + ", password=" + password + ", country=" + country + "]";
	}
	
	
	
	
	
	
}
