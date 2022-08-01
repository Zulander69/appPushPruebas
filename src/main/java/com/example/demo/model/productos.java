package com.example.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EntityScan
@Data
@Tables(name="variedad")
@NoArgsConstructor
@AllArgsConstructor

public class productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@Column(name = "first_name", nullable = false)
	private String firstName;
	
	//@Column(name = "last_name")
	private String lastName;
	
	//@Column(name = "email")
	private String email;
}
