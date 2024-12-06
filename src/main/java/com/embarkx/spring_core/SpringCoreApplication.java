package com.embarkx.spring_core;

import com.embarkx.spring_core.scope.Pepsi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.embarkx.spring_core","test"})
public class SpringCoreApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringCoreApplication.class, args);
//		Person person = applicationContext.getBean(Person.class);
//		person.playWith();
//		Test testBean = applicationContext.getBean(Test.class);
//		testBean.testing();
//		Cat catBean = applicationContext.getBean("cat", Cat.class);
//		catBean.Play();
//		Dog dogBean = applicationContext.getBean("dog",Dog.class);
//		dogBean.Play();

		//bean scope
		//First request for pepsi bean
		Pepsi pepsiBean = applicationContext.getBean(Pepsi.class);
		System.out.println(pepsiBean);
		//pepsiBean.drink();

		Pepsi pepsiBean1 = applicationContext.getBean(Pepsi.class);
		System.out.println(pepsiBean1);

		Pepsi pepsiBean2 = applicationContext.getBean(Pepsi.class);
		System.out.println(pepsiBean2);

	}

	//Declaring the bean using @Bean
//	@Bean("samosa1")
//	@Primary
//	public Samosa getSamosa1() {
//		return new Samosa("Tanduri samosa");
//	}
//
//	@Bean("samosa2")
//	public Samosa getSamosa2() {
//		return new Samosa("Metha samosa");
//	}

}
