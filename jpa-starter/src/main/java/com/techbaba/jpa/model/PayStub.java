package com.techbaba.jpa.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PayStub {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date payPeriodStartDate;

	private Date payPeriodEndDate;
	
	private float salary;
	
	@ManyToOne
	//@JoinColumn(name = "")
	private Employee stubOwner;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPayPeriodStartDate() {
		return payPeriodStartDate;
	}

	public void setPayPeriodStartDate(Date payPeriodStartDate) {
		this.payPeriodStartDate = payPeriodStartDate;
	}

	public Date getPayPeriodEndDate() {
		return payPeriodEndDate;
	}

	public void setPayPeriodEndDate(Date payPeriodEndDate) {
		this.payPeriodEndDate = payPeriodEndDate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee getStubOwner() {
		return stubOwner;
	}

	public void setStubOwner(Employee stubOwner) {
		this.stubOwner = stubOwner;
	}
	
	@Override
	public String toString() {
		return "PayStub [id=" + id + ", payPeriodStartDate=" + payPeriodStartDate + ", payPeriodEndDate="
				+ payPeriodEndDate + ", salary=" + salary + ", stubOwner=" + stubOwner + "]";
	}

}
