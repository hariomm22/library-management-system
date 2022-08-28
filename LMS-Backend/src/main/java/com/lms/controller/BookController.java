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

import com.lms.entity.Book;
import com.lms.service.BookService;


@RestController
@RequestMapping("book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public void saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
	}
	
	@GetMapping("/{id}")
	public Book getBook(@PathVariable("id") Long id) {
		return bookService.getBookById(id);
	}
	
	@GetMapping()
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}
	
	@PutMapping
	public void updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}
	
}
