package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.PersonDao;
import com.ojas.person.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao dao;
	public List<Person> findByLastName(String lastName){
		return dao.findByLastName(lastName);
	}
	public Iterable <Person> savePersonsData(List<Person> personList){
		return dao.saveAll(personList);
	}
	public List<Person> findByFirstNameOrLastName(String firstName,String lastName){
		
		return dao.findByFirstNameOrLastName(firstName,lastName);
	}
	
	}


