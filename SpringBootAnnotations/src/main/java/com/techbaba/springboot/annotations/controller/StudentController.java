package com.techbaba.springboot.annotations.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techbaba.springboot.annotations.TestBean;
import com.techbaba.springboot.annotations.entity.Student;
import com.techbaba.springboot.annotations.exception.StudentNotFoundException;
import com.techbaba.springboot.annotations.service.StudentService;

@RestController
@RequestMapping("/students")
@PropertySource("classpath:custom.properties")
@Scope("prototype")
public class StudentController {

	public StudentController() {
		System.out.println("StudentController object Created");
	}

	@Autowired
	private TestBean testBean;
	
	@Autowired
	private StudentService studentService;
	
	@Value("${custom.mail.from}")
	private String from;
	
	@Value("${mail.host}")
	private String host;
	
	@Value("${mail.port}")
	private String port;
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Student>> getStudent_PV(@PathVariable int id) throws StudentNotFoundException {
		Optional<Student> student = studentService.getStudent(id);
		if(student.isPresent()) {
			return ResponseEntity.ok(student);
		}
		else {
			throw new StudentNotFoundException("student not found with id: " + id);
		}
	}
	
//	@GetMapping("/{studentId}")
//	public ResponseEntity<Optional<Student>> getStudent_RP(@RequestParam("id") int id) throws StudentNotFoundException {
//		Optional<Student> student = studentService.getStudent(id);
//		if(student.isPresent()) {
//			return ResponseEntity.ok(student);
//		}
//		else {
//			throw new StudentNotFoundException("student not found with id: " + id);
//		}
//	}
	
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getStudents(){
		System.out.println("properties loaded :" + from +" "+ host +" "+ port);
		testBean.method();  
		return ResponseEntity.ok(studentService.getStudents());
	}
	
}
