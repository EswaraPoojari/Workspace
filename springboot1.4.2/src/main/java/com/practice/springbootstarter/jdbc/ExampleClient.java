package com.practice.springbootstarter.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ExampleClient {
	
	@Autowired
	private PersonDao dao;
	public void run(){
		Person person = Person.create("Eswar", "Poojari", "Gowdanakunta");
		System.out.println("saving person: " + person);
		dao.save(person);
		person= Person.create("Esh", "P", "Gdk");
		System.out.println("saving person: " + person);
		dao.save(person);
		
		System.out.println("-- loading all --");
		List<Person> loadAll = dao.loadAll();
		loadAll.forEach(System.out::println);
	}
}
