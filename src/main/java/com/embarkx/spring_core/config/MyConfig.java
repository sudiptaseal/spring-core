package com.embarkx.spring_core.config;

import com.embarkx.spring_core.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

    //Declaring the bean using @Bean
	@Bean("samosa1")
	@Primary
	public Samosa getSamosa1() {
		return new Samosa("Tanduri samosa");
	}

	@Bean("samosa2")
	public Samosa getSamosa2() {
		return new Samosa("Metha samosa");
	}
}
