package com.techbaba.springboot.annotations.exception;

public class StudentNotFoundException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String message) {
	        super(message);
	    }
}
