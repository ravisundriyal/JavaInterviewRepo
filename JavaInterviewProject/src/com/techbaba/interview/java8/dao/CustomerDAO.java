package com.techbaba.interview.java8.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.techbaba.interview.java8.entity.Customer;

public class CustomerDAO {

	public static List<Customer> getCustomers(){
		return Stream.of(new Customer(0, "Raj_0", "email_0", Arrays.asList("12345", "54321")),
				new Customer(1, "Raj_1", "email_1", Arrays.asList("12345", "54321")),
				new Customer(2, "Raj_2", "email_2", Arrays.asList("12345", "54321")),
				new Customer(3, "Raj_3", "email_3", Arrays.asList("12345", "54321"))).collect(Collectors.toList());
	}
}
