package com.techbaba.springboot.annotations.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.techbaba.springboot.annotations.TestBean;

//@Configuration
public class ContextConfig implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext");
		// this.applicationContext = applicationContext;

	}

	//@Bean 
	public ApplicationContext applicationContext() { 
		return applicationContext; 
	} 

	/*
	 * @Bean public RestTemplate templatte() { return new RestTemplate(); }
	 */
}
