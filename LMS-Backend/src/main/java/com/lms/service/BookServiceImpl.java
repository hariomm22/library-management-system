package com.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.Book;
import com.lms.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book getBookById(Long id) {
		
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public List<Book> getAllBook() {
		
		return bookRepository.findAll();
	}

	@Override
	public void saveBook(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public void updateBook(Book book) {
		if(bookRepository.existsById(book.getId())) {
			bookRepository.save(book);
		}
		
	}

	@Override
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);	
	}

}
