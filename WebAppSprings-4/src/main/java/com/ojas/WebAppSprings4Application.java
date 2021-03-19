package com.ojas;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ojas.person.Person;
import com.ojas.service.PersonService;

@SpringBootApplication
public class WebAppSprings4Application implements CommandLineRunner {
	@Autowired
	private PersonService service;

	public static void main(String[] args) {
		SpringApplication.run(WebAppSprings4Application.class, args);
	}
	@Override
	public void run (String...args)throws Exception{
		createPersons();
	}
	private void findByLastName() {
		List<Person> personList = service.findByLastName("anu");
		for(Person person : personList) {
			System.out.println(person.toString());
		}
	}
	private void findByFirstNameOrLastName() {
		List<Person> personList=service.findByFirstNameOrLastName("anu","reddy");
		for(Person person : personList) {
			System.out.println(person.toString());
		}
	}
	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("anusha","reddy","anusha@143",22),
				new Person("manasa","purnima","manasaa@123",21),
				new Person("anusha","reddy","anusha@143",22),
				new Person("mom","malleswari","malleswari@143",41),
				new Person("nirmala","reddy","nirmala@1999",34),
				new Person("ram","reddy","ram123@143",25));
		
		
		Iterable <Person> list = service.savePersonsData(personList);
		for(Person person : list) {
			System.out.println("person object"+person.toString());
		}
		
	}

}
