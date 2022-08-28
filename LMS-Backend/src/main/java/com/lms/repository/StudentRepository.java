package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entity.Student;

@Repository 
public interface StudentRepository extends JpaRepository<Student,Long>{

}
