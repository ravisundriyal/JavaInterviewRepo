package com.techbaba.interview.java8.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.techbaba.interview.java8.entity.Employee;

public class EmployeeDAO {

	public static List<Employee> getEmployees(){
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "Roshan", "A", 100000));
		list.add(new Employee(1, "Bikash", "B", 900000));
		list.add(new Employee(1, "Bimal", "A", 500000));
		list.add(new Employee(1, "Saurabh", "A", 400000));
		list.add(new Employee(1, "Prakash", "C", 1200000));
		return list;
	}
	
	public static List<Employee> getThousandEmployees(){
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=0;i<1000;i++)
			list.add(new Employee(i, "Roshan"+i, "A", Double.valueOf(new Random().nextInt(1000*100))));
		
		return list;
	}
}
