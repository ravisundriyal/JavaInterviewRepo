/**
 * 
 */
package com.techbaba.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.techbaba.jpa.model.AccessCard;
import com.techbaba.jpa.model.EmailGroup;
import com.techbaba.jpa.model.Employee;
import com.techbaba.jpa.model.EmployeeType;
import com.techbaba.jpa.model.PayStub;

/**
 * @author Ravi Sundriyal
 *
 */
public class JpaPersistenceContextDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("New Employee1");
		e1.setAge(21);		
		e1.setDob(new Date());
		e1.setDoj(new java.sql.Date(System.currentTimeMillis()));
		e1.setEmployeeType(EmployeeType.FULLTIME);
		System.out.println("Created Employee *******************************************************");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		System.out.println("Starting Txn *******************************************************");
		
		entityManager.persist(e1);
		System.out.println("After Persisting Employee *******************************************************");
		
		Employee employee = entityManager.find(Employee.class, 1);
		System.out.println(e1);
		System.out.println(employee);
		
		System.out.println("Committing *******************************************************");
		txn.commit();
		System.out.println("After txn commit *******************************************************");
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
