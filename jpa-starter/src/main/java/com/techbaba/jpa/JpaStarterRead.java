package com.techbaba.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.techbaba.jpa.model.EmailGroup;

public class JpaStarterRead {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		EmailGroup group1 = entityManager.find(EmailGroup.class, 7);
		
		System.out.println("Got Email group,......Getting Members");
		
		System.out.println("Employee stubs " + group1.getMemberEmployees());
		
		//System.out.println("Employee 1" + e1);
		//System.out.println("Employee 2" + e2);

	}

}
