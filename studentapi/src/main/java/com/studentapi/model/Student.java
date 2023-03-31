package com.studentapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
public class Student {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String std;
	private String subject;
	private String sname;
	
}
