package com.lms.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 4887904943282174032L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String course;
	
	private String barnch;
	
	private String email;
	
	private String contact;
	
	private String username;
	
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL)
	
	@JoinColumn(name="address_id")
	private Address address;
}
