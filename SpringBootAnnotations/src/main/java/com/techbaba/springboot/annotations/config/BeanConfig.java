package com.techbaba.springboot.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.techbaba.springboot.annotations.TestBean;

@Configuration
public class BeanConfig {

	@Bean
	@Scope("singleton")
	public TestBean testBean() {
		return new TestBean();
	}
	
	/*
	 * @Bean public RestTemplate templatte() { return new RestTemplate(); }
	 */
}
