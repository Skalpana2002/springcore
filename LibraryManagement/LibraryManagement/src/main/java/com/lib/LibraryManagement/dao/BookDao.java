package com.lib.LibraryManagement.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.lib.LibraryManagement.entity.BookEntity;
import com.lib.LibraryManagement.repository.BookRepository;







@Repository
public class BookDao {
	
	@Autowired
	BookRepository bookRepository;
	public BookEntity saveBookEntity(BookEntity bookEntity)
	{
		return bookRepository.save(bookEntity);
		
	}
	
	public List<BookEntity> getAll()
	{
		return bookRepository.findAll();
		}
	
	
	
	public Optional<BookEntity> getBookId(@PathVariable int id)
	{
		return bookRepository.findById(id);
	}
	
	
	public List<BookEntity> getByBookName(String name)
	{
		return bookRepository.findByName(name);
		}
	
	public String deleteBookEntity(BookEntity bookEntity,int id)
	{
		bookRepository.delete(bookEntity);
		return "data is delete";
		
	}
	
	
	public BookEntity updateBookEntity(BookEntity bookEntity)
	{
		return bookRepository.save(bookEntity);
	}
	
	
	

}
