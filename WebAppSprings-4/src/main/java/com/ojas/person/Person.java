package com.ojas.person;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_table")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String email;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	@Column(name="age")
	private int age;
	
	
	public Person() {
		
		
	}


	public Person( String firstName, String lastName, String email, int age) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
	
	
	
	

}
