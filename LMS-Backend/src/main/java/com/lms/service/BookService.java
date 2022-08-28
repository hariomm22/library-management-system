package com.lms.service;

import java.util.List;

import com.lms.entity.Book;

public interface BookService {

	public Book getBookById(Long id);
	
	public List<Book> getAllBook();
	
	public void saveBook(Book book);
	
	public void updateBook(Book book);
	
	public void deleteBook(Long id);
}
