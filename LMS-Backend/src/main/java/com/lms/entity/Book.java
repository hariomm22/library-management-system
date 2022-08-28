package com.lms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book implements Serializable {
	private static final long serialVersionUID = 4887904943282174032L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String  author;
	
	private String subject;
	
	private String course;
	
	private Integer stock;
	
}
