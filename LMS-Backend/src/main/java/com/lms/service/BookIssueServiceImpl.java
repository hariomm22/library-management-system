package com.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.BookIssue;
import com.lms.repository.BookIssueRepository;

@Service
public class BookIssueServiceImpl implements BookIssueService{
	
	@Autowired
	private BookIssueRepository bookIssueRepository;

	@Override
	public BookIssue getBookIssueById(Long id) {
	
		return bookIssueRepository.findById(id).orElse(null);
	}

	@Override
	public List<BookIssue> getAllBookIssue() {
		return bookIssueRepository.findAll();
	}

	@Override
	public void saveBookIssue(BookIssue bookIssue) {
		bookIssueRepository.save(bookIssue);
		
	}

	@Override
	public void updateBookIssue(BookIssue bookIssue) {
		if(bookIssueRepository.existsById(bookIssue.getId())) {
			bookIssueRepository.save(bookIssue);
		}
		
	}

	@Override
	public void deleteBookIssue(Long id) {
		bookIssueRepository.deleteById(id);
		
	}

	@Override
	public List<BookIssue> getBookByStudentId(Long id) {
		return bookIssueRepository.getBookByStudentId(id);
	}

}
