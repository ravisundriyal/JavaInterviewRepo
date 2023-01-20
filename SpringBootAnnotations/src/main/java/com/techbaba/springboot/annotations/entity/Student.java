package com.techbaba.springboot.annotations.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="STUDENT_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@Column(name="STUDENT_ID")
	private int id;
	
	@Column(name="STUDENT_NAME")
	private String name;
	
	@Column(name="ROLL_NUM")
	private int rollNo;
	
	@Column(name="DEPT")
	private String dept;
}
