package com.lms.service;

import java.util.List;

import com.lms.entity.Student;

public interface StudentService {
	
	public Student getStudentById(Long id);
	
	public List<Student> getAllStudent();
	
	public void saveStduent(Student student);
	
	public void updateStudent(Student student);
	
	public void deleteStudent(Long id);
		
}
