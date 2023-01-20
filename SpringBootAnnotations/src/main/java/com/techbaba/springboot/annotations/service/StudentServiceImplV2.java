package com.techbaba.springboot.annotations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;

import com.techbaba.springboot.annotations.entity.Student;

@Primary
public class StudentServiceImplV2 implements StudentService {

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Student> getStudent(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
