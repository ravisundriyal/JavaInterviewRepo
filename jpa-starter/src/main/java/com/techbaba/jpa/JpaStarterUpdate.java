package com.techbaba.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.techbaba.jpa.model.EmailGroup;
import com.techbaba.jpa.model.Employee;

public class JpaStarterUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		
		Employee employee = entityManager.find(Employee.class, 2);
		EmailGroup group = entityManager.find(EmailGroup.class, 8);
		
		employee.addEmailGroup(group);
		group.addEmployee(employee);
		
		entityManager.persist(employee);
		entityManager.persist(group);
		
		txn.commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
