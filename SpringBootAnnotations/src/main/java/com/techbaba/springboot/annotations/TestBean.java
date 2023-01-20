package com.techbaba.springboot.annotations;

import lombok.Data;

@Data
public class TestBean {
	
	private String name;

	public void method() {
		System.out.println("TestBean method called");
	}
}
