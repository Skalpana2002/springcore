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


import com.lib.LibraryManagement.entity.UserEntity;
import com.lib.LibraryManagement.service.UserService;
import com.lib.LibraryManagement.util.ResponseStructure;


@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/saveuser")
	public ResponseEntity<ResponseStructure<UserEntity>> saveUserEntity(@RequestBody UserEntity userEntity)
	{
		return userService.saveBookEntity(userEntity);
		}
	@GetMapping("/getalldatabyuser")
	public ResponseEntity<ResponseStructure<List<UserEntity>>> getAll()
	{
		return userService.getAll();
	}

	
	@GetMapping("/getbyuserid/{id}")
	public  ResponseEntity<ResponseStructure<UserEntity>> getUserId(@PathVariable int id)
	{
		return userService.getUserId(id);
		
	}
	
	@GetMapping("/getbyusername/{name}")
	public  ResponseEntity<ResponseStructure<List<UserEntity>>> getByUserName(@PathVariable String name)
	{
		return userService.getByUserName(name);
		
	}
	
	
	@DeleteMapping("/deleteuser/{id}") 
	public ResponseEntity<ResponseStructure<UserEntity>> deleteUserEntity(UserEntity userEntity,@PathVariable int id)
	{
		return userService.deleteUserEntity(userEntity, id);
	}
	
	@PostMapping("/updateuser")
	public ResponseEntity<ResponseStructure<UserEntity>> updateUserEntity(@RequestBody UserEntity userEntity)
	{
		return userService.updateUserEntity(userEntity);
	}
	
}
