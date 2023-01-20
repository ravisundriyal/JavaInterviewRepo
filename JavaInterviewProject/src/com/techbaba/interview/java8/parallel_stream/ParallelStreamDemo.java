package com.techbaba.interview.java8.parallel_stream;

import java.util.List;
import java.util.stream.IntStream;

import com.techbaba.interview.java8.dao.EmployeeDAO;
import com.techbaba.interview.java8.entity.Employee;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		
//		long start = 0, end = 0;
//		
//		start = System.currentTimeMillis();
//		
//		IntStream.rangeClosed(1, 100).forEach(System.out::println);
//		
//		end = System.currentTimeMillis();
//		
//		System.out.println("Plain Stream took :" + (end-start) + " MS.");
//		
//		
//		System.out.println("**************************************");
//		
//		
//		start = System.currentTimeMillis();
//		
//		IntStream.rangeClosed(1, 100).parallel().forEach(System.out::println);
//		
//		end = System.currentTimeMillis();
//		
//		System.out.println("Plain Stream took :" + (end-start) + " MS.");
//
//		System.out.println("**************************************");
		

		
//		IntStream.range(1, 10).forEach(x ->{
//			System.out.println("Thread name :" +Thread.currentThread().getName() + " : " +x);
//		});
//		
//		IntStream.range(1, 10).parallel().forEach(x ->{
//			System.out.println("Thread name :" +Thread.currentThread().getName() + " : " +x);
//		});
		
		
		
		List<Employee> employees = EmployeeDAO.getThousandEmployees();
		
		
		long start = 0, end = 0;
		
		start = System.currentTimeMillis();
		
		double optionalSalaryWithStream = employees.stream().map(e -> e.getSalary()).mapToDouble(d -> d).average().getAsDouble();
		
		end = System.currentTimeMillis();
		System.out.println("Plain Stream took :" + (end-start) + " MS. Avg Salary is :" + optionalSalaryWithStream);
		
		
		
		start = System.currentTimeMillis();
		
		double optionalSalaryWithParallelStream = employees.stream().parallel().map(e -> e.getSalary()).mapToDouble(d -> d).average().getAsDouble();
		
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream took :" + (end-start) + " MS. Avg Salary is :" + optionalSalaryWithParallelStream);
	}

}
