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
public class JpaStarterWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaApp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		
		
		Employee e1 = new Employee();
		e1.setName("Megha Nauriyal");
		e1.setAge(35);		
		e1.setDob(new Date());
		e1.setDoj(new java.sql.Date(System.currentTimeMillis()));
		e1.setEmployeeType(EmployeeType.CONTRACTOR);
		
		Employee e2 = new Employee();
		e1.setName("Ravi Sundriyal");
		e2.setAge(41);		
		e2.setDob(new Date());
		e2.setDoj(new java.sql.Date(System.currentTimeMillis()));
		e2.setEmployeeType(EmployeeType.CONTRACTOR);
		
		
		AccessCard card1 = new AccessCard();
		card1.setIssueDate(new Date());
		card1.setFirmwareVersion("1.0.0");
		card1.setActive(true);
		card1.setCardOwner(e1);
		e1.setCard(card1);
		
		AccessCard card2 = new AccessCard();
		card2.setIssueDate(new Date());
		card2.setFirmwareVersion("1.2.0");
		card2.setActive(false);
		card2.setCardOwner(e2);
		e2.setCard(card2);


		PayStub payStub1 = new PayStub();
		payStub1.setPayPeriodStartDate(new Date());
		payStub1.setPayPeriodEndDate(new Date());
		payStub1.setSalary(1000);
		payStub1.setStubOwner(e1);
		e1.addPayStub(payStub1);
				
		PayStub payStub2 = new PayStub();
		payStub2.setPayPeriodStartDate(new Date());
		payStub2.setPayPeriodEndDate(new Date());
		payStub2.setSalary(2000);
		payStub2.setStubOwner(e1);
		e1.addPayStub(payStub2);
		
		//e1.setStubs(List.of(payStub1,payStub2));
		
		EmailGroup group1 = new EmailGroup();
		group1.setName("Company Watercooler Discussions");
		group1.addEmployee(e1);
		group1.addEmployee(e2);
		e1.addEmailGroup(group1);
		e2.addEmailGroup(group1);
		
		EmailGroup group2 = new EmailGroup();
		group2.setName("Company Sports Discussions");
		group2.addEmployee(e1);
		e1.addEmailGroup(group2);
		
		entityManager.persist(e1);
		entityManager.persist(e2);
		entityManager.persist(card1);
		entityManager.persist(card2);
		entityManager.persist(payStub1);
		entityManager.persist(payStub2);
		entityManager.persist(group1);
		entityManager.persist(group2);
		
	
		txn.commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
