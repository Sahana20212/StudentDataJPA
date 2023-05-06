package com.ecomm.studajp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomm.studajp.entity.Student;
import com.ecomm.studajp.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;
	
	public Student saveStudent(Student student) {
		return studentrepository.save(student);
	}
	
	 public List<Student> getstudent() {
	        return studentrepository.findAll();
	}

}
