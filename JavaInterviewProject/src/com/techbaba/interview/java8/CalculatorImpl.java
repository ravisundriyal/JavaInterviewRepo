/**
 * 
 */
package com.techbaba.interview.java8;

/**
 * @author ravis
 *
 */
@FunctionalInterface
interface Calculator{
	//void swithchOn();
	//void sum(int n);
	int subtract(int i1, int i2);
}

public class CalculatorImpl{

//	@Override
//	public void swithchOn() {
//		System.out.println("SwitchOn");
//		
//	}
		
	public static void main(String[] args) {
		 Calculator cal = (num1, num2) -> num2-num1;
		 System.out.println(cal.subtract(22, 33));
		 
		 
	}

	
}
