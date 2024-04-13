package com.lib.LibraryManagement.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lib.LibraryManagement.entity.BookEntity;
import com.lib.LibraryManagement.service.BookService;
import com.lib.LibraryManagement.util.ResponseStructure;









@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	@GetMapping("/savebook")
	public ResponseEntity<ResponseStructure<BookEntity>> saveBookService(@RequestBody BookEntity bookEntity)
	{
		return bookService.saveBookEntity(bookEntity);
		}
	
	@GetMapping("/getalldatabybook")
	public ResponseEntity<ResponseStructure<List<BookEntity>>> getAll()
	{
		return bookService.getAll();
	}
	
	
	@GetMapping("/getbybookid/{id}")
	public  ResponseEntity<ResponseStructure<BookEntity>> getBookId(@PathVariable int id)
	{
		return bookService.getBookId(id);
		
	}
	
	@GetMapping("/getbybookname/{name}")
	public  ResponseEntity<ResponseStructure<List<BookEntity>>> getByBookName(@PathVariable String name)
{
	return bookService.getByBookName(name);
	
	}
	
	
	
	
	@DeleteMapping("/deletebook/{id}") 
	public ResponseEntity<ResponseStructure<BookEntity>> deleteBookEntity(BookEntity bookEntity,@PathVariable int id)
	{
		return bookService.deleteBookEntity(bookEntity, id);
	}
	
	@PostMapping("/updatebook")
	public ResponseEntity<ResponseStructure<BookEntity>> updateBookEntity(@RequestBody BookEntity bookEntity)
	{
		return bookService.updateBookEntity(bookEntity);
	}

}
