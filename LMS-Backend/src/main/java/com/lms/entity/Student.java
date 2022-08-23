package com.lms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Double id;
	
	private String firstName;
	
	private String lastName;
	
	private String course;
	
	private String barnch;
	
	private String email;
	
	private String contact;
	
	private String username;
	
	private String password;
	
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
}
