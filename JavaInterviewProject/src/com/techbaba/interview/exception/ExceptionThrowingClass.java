package com.techbaba.interview.exception;

import java.io.IOException;

public class ExceptionThrowingClass {

	void method_NPE() {
		throw new NullPointerException();
	}
	
	void method_CCE() {
		throw new ClassCastException();
	}
	
	void method_IOE() throws IOException{
		localMethod();
	}
	
	void localMethod() throws IOException {
		throw new IOException();
	}
	
	void localMethod2() {
		System.out.println("ClassCastException from localMethod2");
		throw new ClassCastException();
	}
}
