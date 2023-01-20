package com.techbaba.jpa.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


public class Employee {
	@Id()
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column()
	private int age;

	@Column(length =  100)
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	@Column()
	private java.sql.Date doj;
	
	@Enumerated(EnumType.STRING)
	private EmployeeType employeeType;
	
	@Transient
	private String debugString;
	
	@OneToOne
	private AccessCard card;
	
	@OneToMany(mappedBy = "stubOwner", cascade = CascadeType.REMOVE)
	private List<PayStub> payStubs = new ArrayList<>(); 
	
	@ManyToMany
	@JoinTable(name = "EMAIL_GROUP_SUBSCRIPTIONS", joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), inverseJoinColumns = @JoinColumn(name = "SUBSCRIBED_GROUP_ID"))
	private List<EmailGroup> mailingGroups = new ArrayList<>(); 
	
//	public Employee() {
//	}


//	public Employee(String name) {
//		super();		
//		this.name = name;
//	}
	
	public List<EmailGroup> getMailingGroups() {
		return mailingGroups;
	}


	public void setMailingGroups(List<EmailGroup> mailingGroups) {
		this.mailingGroups = mailingGroups;
	}


	public void addPayStub(PayStub payStub) {
		payStubs.add(payStub);
	}
	
	public void addEmailGroup(EmailGroup emailGroup) {
		mailingGroups.add(emailGroup);
	}
	
	
	public List<PayStub> getPayStubs() {
		return payStubs;
	}


	public void setPayStubs(List<PayStub> payStubs) {
		this.payStubs = payStubs;
	}


	public AccessCard getCard() {
		return card;
	}
	public void setCard(AccessCard card) {
		this.card = card;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public String getDebugString() {
		return debugString;
	}

	public void setDebugString(String debugString) {
		this.debugString = debugString;
	}

	public java.sql.Date getDoj() {
		return doj;
	}

	public void setDoj(java.sql.Date doj) {
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", dob=" + dob + ", doj=" + doj
				+ ", employeeType=" + employeeType + ", debugString=" + debugString + ", card=" + card + "]";
	}

}
