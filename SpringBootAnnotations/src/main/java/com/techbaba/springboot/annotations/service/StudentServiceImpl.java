package com.techbaba.springboot.annotations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techbaba.springboot.annotations.entity.Student;
import com.techbaba.springboot.annotations.repository.StudentRepository;

@Service
//@Primary
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> getStudent(int id) {
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

}
