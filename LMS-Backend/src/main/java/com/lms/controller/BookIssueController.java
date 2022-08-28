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

import com.lms.entity.BookIssue;
import com.lms.service.BookIssueService;



@RestController
@RequestMapping("bookIssue") 
public class BookIssueController {
	
	@Autowired
	private BookIssueService bookIssueService;
	
	@PostMapping
	public void saveBookIssue(@RequestBody BookIssue bookIssue) {
		bookIssueService.saveBookIssue(bookIssue);
	}
	
	@GetMapping("/{id}")
	public BookIssue getBookIssue(@PathVariable("id") Long id) {
		return bookIssueService.getBookIssueById(id);
	}
	
	
	
	@GetMapping()
	public List<BookIssue> getAllBookIssue() {
		return bookIssueService.getAllBookIssue();
	}
	
	@GetMapping("student/{id}")
	public List<BookIssue> getBookByStudentById(@PathVariable("id") Long id) {
		return bookIssueService.getBookByStudentId(id);
	}
	
	@PutMapping
	public void updateBookIssue(@RequestBody BookIssue bookIssue) {
		bookIssueService.updateBookIssue(bookIssue);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBookIssue(@PathVariable("id") Long id) {
		bookIssueService.deleteBookIssue(id);
	}
	
}
