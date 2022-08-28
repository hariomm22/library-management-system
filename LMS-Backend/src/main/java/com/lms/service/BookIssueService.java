package com.lms.service;

import java.util.List;

import com.lms.entity.BookIssue;

public interface BookIssueService {
	
	public BookIssue getBookIssueById(Long id);
	
	public List<BookIssue> getAllBookIssue();
	
	public void saveBookIssue(BookIssue bookIssue);
	
	public void updateBookIssue(BookIssue bookIssue);
	
	public void deleteBookIssue(Long id);
	
	public List<BookIssue> getBookByStudentId(Long id);
}
