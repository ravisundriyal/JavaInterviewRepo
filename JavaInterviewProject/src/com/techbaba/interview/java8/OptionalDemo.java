package com.techbaba.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import com.techbaba.interview.java8.dao.CustomerDAO;
import com.techbaba.interview.java8.entity.Customer;

public class OptionalDemo { 
	
	
	public static Customer getCustomerByEmail(String email) throws Exception {
		List<Customer> customers = CustomerDAO.getCustomers();
		return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElseThrow(() -> new Exception("No Customer Found with provided email :" +email));
	}

	public static void main(String[] args) throws Exception {
		Customer customer = new Customer(1, "john", null, Arrays.asList("12345","54321"));
		
//		Optional<Object> emptyOptional= Optional.empty();
//		System.out.println(emptyOptional);
		
		//Optional<String> emailOptional = Optional.of(customer.getEmail());                    // If you are sure the value will never be null use Optional.of
		//System.out.println(emailOptional);
		
		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());             // If the value may or may not be be null  use Optional.ofNullable
		System.out.println(emailOptional2);
		
//		if(emailOptional2.isPresent())
//			System.out.println(emailOptional2.get());
		
//		System.out.println(emailOptional2.orElse("default"));
		
//		System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));
		
//		System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "default"));
		
		
		System.out.println(getCustomerByEmail("email_1"));
	}

}
