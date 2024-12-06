package com.embarkx.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {

		Animal animal = new Cat();
		Person person= new Person(animal);
		person.playWith();
		SpringApplication.run(SpringCoreApplication.class, args);
	}

}
