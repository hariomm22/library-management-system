package com.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.Student;
import com.lms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public void saveStduent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		if(studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
		}
	}

}
