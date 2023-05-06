package com.ecomm.studajp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.studajp.entity.Student;
import com.ecomm.studajp.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/student")
	public Student savestudent(@RequestBody Student student) {
		return studentservice.saveStudent(student);
		
		
	}
	
	 @GetMapping("/student")
	 public List<Student> findAllstudent() {
	        return studentservice.getstudent();
	    }

}
