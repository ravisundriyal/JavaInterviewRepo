package com.techbaba.jpa.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class EmailGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;

	@ManyToMany(mappedBy = "mailingGroups")
	private List<Employee> memberEmployees = new ArrayList<>(); 
	
	
	
	
	public List<Employee> getMemberEmployees() {
		return memberEmployees;
	}

	public void setMemberEmployees(List<Employee> memberEmployees) {
		this.memberEmployees = memberEmployees;
	}
	
	public void addEmployee(Employee employee) {
		memberEmployees.add(employee);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
