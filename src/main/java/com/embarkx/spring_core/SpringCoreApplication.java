package com.embarkx.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringCoreApplication.class, args);
		Person person = applicationContext.getBean(Person.class);
		person.playWith();
	}

}
