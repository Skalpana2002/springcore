package com.lib.LibraryManagement.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.lib.LibraryManagement.dao.BookDao;
import com.lib.LibraryManagement.entity.BookEntity;
import com.lib.LibraryManagement.util.ResponseStructure;







@Service
public class BookService {
	@Autowired
	private BookDao bookDao;
	public ResponseEntity<ResponseStructure<BookEntity>> saveBookEntity(BookEntity bookEntity)
	{
		bookDao.saveBookEntity(bookEntity);
		ResponseStructure<BookEntity> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("book entity class saved");
		structure.setData(bookEntity);
		return new ResponseEntity<ResponseStructure<BookEntity>>(structure,HttpStatus.CREATED);
	
	}
	
	
	public ResponseEntity<ResponseStructure<List<BookEntity>>> getAll()
	{
		List<BookEntity> list=bookDao.getAll();
		ResponseStructure<List<BookEntity>> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage(" book data found");
		structure.setData(list);
		return new ResponseEntity<ResponseStructure<List<BookEntity>>>(structure,HttpStatus.CREATED);
	}
	
	
	public ResponseEntity<ResponseStructure<BookEntity>> getBookId(@PathVariable int id)
	{
		Optional<BookEntity> op=bookDao.getBookId(id);
		ResponseStructure<BookEntity> structure=new ResponseStructure<BookEntity>();
		if(op.isPresent())
		{
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("book found");
			structure.setData(op.get());
			return new ResponseEntity<ResponseStructure<BookEntity>>(structure,HttpStatus.CREATED);
			
		}
		else
		{
			structure.setStatusCode(HttpStatus.NOT_FOUND.value());
			structure.setMessage("book not found");
			structure.setData(null);
			return new ResponseEntity<ResponseStructure<BookEntity>>(structure,HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	
	public ResponseEntity<ResponseStructure<List<BookEntity>>> getByBookName(String name)
	{
		List<BookEntity> list =bookDao.getByBookName(name);
		ResponseStructure<List<BookEntity>> structure=new ResponseStructure<>();
		
		if(list.isEmpty())
		{
			structure.setStatusCode(HttpStatus.NOT_FOUND.value());
			structure.setMessage("employee not  found ");
			structure.setData(list);
			return new ResponseEntity<ResponseStructure<List<BookEntity>>>(structure,HttpStatus.NOT_FOUND);
			
		}
		else
		{
			structure.setStatusCode(HttpStatus.ACCEPTED.value());
			structure.setMessage("employee  found");
			structure.setData(list);
			return new ResponseEntity<ResponseStructure<List<BookEntity>>>(structure,HttpStatus.ACCEPTED);
		}
		
		
	}
	
	
	
	public ResponseEntity<ResponseStructure<BookEntity>> deleteBookEntity(BookEntity bookEntity,int id)
	{
		bookDao.deleteBookEntity(bookEntity,id);
		ResponseStructure<BookEntity> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("book deleted");
		structure.setData(bookEntity);
		return new ResponseEntity<ResponseStructure<BookEntity>>(structure,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<BookEntity>> updateBookEntity(BookEntity bookEntity)
	{
		bookDao.updateBookEntity(bookEntity);
		ResponseStructure<BookEntity> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("book update");
		structure.setData(bookEntity);
		return new ResponseEntity<ResponseStructure<BookEntity>>(structure,HttpStatus.CREATED);
	}



}
