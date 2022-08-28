package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.Student;
import com.lms.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public void saveStudent(@RequestBody Student student) {
		studentService.saveStduent(student);
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping()
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	
	@PutMapping
	public void updateBook(@RequestBody Student student) {
		studentService.updateStudent(student);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable("id") Long id) {
		 studentService.deleteStudent(id);
	}
	
}
