package com.harish.rentify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
    private String firstName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + "]";
	}
	public User(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
   }
