/**
 * 
 */
package com.techbaba.interview.java8;

/**
 * @author ravis
 *
 */
@FunctionalInterface
public interface MyFunctionalInterface {
	
	void m1();
	
	default void m2() {
		System.out.println("Default method m2()");
	}
	default void m3() {
		System.out.println("Default method m3()");
	}
	
	static void m4() {
		System.out.println("Static method m4()");
	}
}
