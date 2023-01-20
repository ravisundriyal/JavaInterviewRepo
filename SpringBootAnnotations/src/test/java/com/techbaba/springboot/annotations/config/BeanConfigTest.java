package com.techbaba.springboot.annotations.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.techbaba.springboot.annotations.TestBean;

@SpringBootTest
class BeanConfigTest{

	private static final String NAME = "John Smith";
	
	@Autowired
	private ApplicationContext applicationContext;
	
	
	  
		
	@Test
	public void givenSingletonScope_whenSetName_thenEqualNames() {
	   
		System.out.println("givenSingletonScope_whenSetName_thenEqualNames");
		TestBean testBeanA = (TestBean) applicationContext.getBean("testBean");
		TestBean testBeanB = (TestBean) applicationContext.getBean("testBean");

		testBeanA.setName(NAME);
	    assertEquals(NAME, testBeanB.getName());

	   // ((AbstractApplicationContext) applicationContext).close();
	}



}
