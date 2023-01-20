package com.techbaba.springboot.annotations.service;


import java.util.List;
import java.util.Optional;

import com.techbaba.springboot.annotations.entity.Student;


public interface StudentService {

    public Student addStudent(Student student);

    public Optional<Student> getStudent(int id);

    public List<Student> getStudents();

}
