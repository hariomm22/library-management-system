package com.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lms.entity.BookIssue;

@Repository
public interface BookIssueRepository extends JpaRepository<BookIssue,Long>{
	
	@Query("SELECT u FROM BookIssue u WHERE u.student.id = ?1")
	public List<BookIssue> getBookByStudentId(Long id);
}
