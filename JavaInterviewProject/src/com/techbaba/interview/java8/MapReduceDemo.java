package com.techbaba.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.techbaba.interview.java8.dao.EmployeeDAO;
import com.techbaba.interview.java8.entity.Employee;

public class MapReduceDemo {

	public static void main(String[] args){

		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
		
		List<String> words = Arrays.asList("coreJava", "spring", "Hibernate");
		
		List<Employee> employees = EmployeeDAO.getEmployees(); 
	
		int sum=0;
		for(int num: numbers) {
			
			sum = sum + num;
		}
		
		System.out.println(sum);
		
		
		int mappedSum = numbers.stream().mapToInt(i -> i).sum();

		System.out.println(mappedSum);
		

		int redusedSum = numbers.stream().reduce(0,(a,b) -> a+b);

		System.out.println(redusedSum);

		int redusedSumMwthodRef = numbers.stream().reduce(Integer::sum).get();
		System.out.println(redusedSumMwthodRef);
		
		int maxWithLambda = numbers.stream().reduce(0,(a,b) -> a > b?a:b);
		//int maxWithMethodRef = numbers.stream().reduce(Integer::max).get();
		System.out.println(maxWithLambda);
		
		Optional<String> longestWord = words.stream().reduce((word1, word2) -> word1.length() > word2.length()? word1:word2);
		System.out.println(longestWord.get());
		
		// 1. Get employees with Grade A  -> filter
		// 2. get Salary only   -> map
		double avgGradeASalary = employees.stream()
			.filter(e -> e.getGrade().equalsIgnoreCase("A"))
			.map(e -> e.getSalary())
			.mapToDouble(d -> d)
			.average().getAsDouble();
		
		System.out.println(avgGradeASalary);
		
		
		double sumGradeASalary = employees.stream()
				.filter(e -> e.getGrade().equalsIgnoreCase("A"))
				.map(e -> e.getSalary())
				.mapToDouble(d -> d)
				.sum();
		System.out.println(sumGradeASalary);
		
		
	}

}
