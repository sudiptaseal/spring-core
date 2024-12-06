package com.embarkx.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		Person person= new Person();
		person.playWith();
		SpringApplication.run(SpringCoreApplication.class, args);
	}

}
