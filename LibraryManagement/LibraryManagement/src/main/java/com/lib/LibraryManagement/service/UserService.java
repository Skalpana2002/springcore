package com.lib.LibraryManagement.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.lib.LibraryManagement.dao.UserDao;

import com.lib.LibraryManagement.entity.UserEntity;
import com.lib.LibraryManagement.util.ResponseStructure;


@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public ResponseEntity<ResponseStructure<UserEntity>> saveBookEntity(UserEntity userEntity)
	{
		userDao.saveUserEntity(userEntity);
		ResponseStructure<UserEntity> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("user entity class saved");
		structure.setData(userEntity);
		return new ResponseEntity<ResponseStructure<UserEntity>>(structure,HttpStatus.CREATED);
	
	}
	
	
	public ResponseEntity<ResponseStructure<List<UserEntity>>> getAll()
	{
		List<UserEntity> list=userDao.getAll();
		ResponseStructure<List<UserEntity>> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage(" user data found");
		structure.setData(list);
		return new ResponseEntity<ResponseStructure<List<UserEntity>>>(structure,HttpStatus.CREATED);
	}

	
	

	public ResponseEntity<ResponseStructure<UserEntity>> getUserId(@PathVariable int id)
	{
		Optional<UserEntity> op=userDao.getUserId(id);
		ResponseStructure<UserEntity> structure=new ResponseStructure<UserEntity>();
		if(op.isPresent())
		{
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("employee found");
			structure.setData(op.get());
			return new ResponseEntity<ResponseStructure<UserEntity>>(structure,HttpStatus.CREATED);
			
		}
		else
		{
			structure.setStatusCode(HttpStatus.NOT_FOUND.value());
			structure.setMessage("employee not found");
			structure.setData(null);
			return new ResponseEntity<ResponseStructure<UserEntity>>(structure,HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	public ResponseEntity<ResponseStructure<List<UserEntity>>> getByUserName(String name)
	{
		List<UserEntity> list =userDao.getByUserName(name);
		ResponseStructure<List<UserEntity>> structure=new ResponseStructure<>();
		
		if(list.isEmpty())
		{
			structure.setStatusCode(HttpStatus.NOT_FOUND.value());
			structure.setMessage("book not  found ");
			structure.setData(list);
			return new ResponseEntity<ResponseStructure<List<UserEntity>>>(structure,HttpStatus.NOT_FOUND);
			
		}
		else
		{
			structure.setStatusCode(HttpStatus.ACCEPTED.value());
			structure.setMessage("book found");
			structure.setData(list);
			return new ResponseEntity<ResponseStructure<List<UserEntity>>>(structure,HttpStatus.ACCEPTED);
		}
		
		
	}
	
	public ResponseEntity<ResponseStructure<UserEntity>> deleteUserEntity(UserEntity userEntity,int id)
	{
		userDao.deleteUserEntity(userEntity,id);
		ResponseStructure<UserEntity> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("book deleted");
		structure.setData(userEntity);
		return new ResponseEntity<ResponseStructure<UserEntity>>(structure,HttpStatus.CREATED);
	}
	
	
	public ResponseEntity<ResponseStructure<UserEntity>> updateUserEntity(UserEntity userEntity)
	{
		userDao.updateUserEntity(userEntity);
		ResponseStructure<UserEntity> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("book update");
		structure.setData(userEntity);
		return new ResponseEntity<ResponseStructure<UserEntity>>(structure,HttpStatus.CREATED);
	}
	
	
	
	
}
