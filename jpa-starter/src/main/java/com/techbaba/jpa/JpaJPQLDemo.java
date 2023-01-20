package com.techbaba.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.techbaba.jpa.model.Employee;

public class JpaJPQLDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

//		int minAge=20;
		
//		TypedQuery<Employee> query = entityManager.createQuery(
//				"select e from Employee e where e.age >" + minAge,
//				Employee.class
//		);
		
		TypedQuery<Employee> query = entityManager.createQuery(
				"select e from Employee e where e.age > :minAge",
				Employee.class
		);
		
		query.setParameter("minAge", 20);
		
		List<Employee> employeeList = query.getResultList();		
		employeeList.forEach(System.out::println);
		
//		TypedQuery<Employee> query = entityManager.createQuery(
//				"select e from Employee e where e.card.active = true",
//				Employee.class
//		);		
//		List<Employee> employeeList = query.getResultList();		
//		employeeList.forEach(System.out::println);
		
		
//		//Freeform query
//		TypedQuery<Object[]> query = entityManager.createQuery(
//				"select e.name, e.age from Employee e",
//				Object[].class
//		);		
//		List<Object[]> employeeList = query.getResultList();		
//		employeeList.forEach(e -> System.out.println(e[0] + " " + e[1]));
		
		entityManager.close();
		entityManagerFactory.close();
		

	}

}
