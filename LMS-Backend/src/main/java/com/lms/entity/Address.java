package com.lms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Double id;
	
	private String street;
	
	private String city;
	
	private String pinCode;
	
	private String state;
	
	private String country;
	
}
