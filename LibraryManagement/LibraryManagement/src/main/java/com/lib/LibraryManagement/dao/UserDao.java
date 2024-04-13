package com.lib.LibraryManagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


import com.lib.LibraryManagement.entity.UserEntity;
import com.lib.LibraryManagement.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	UserRepository userRepository;
	public UserEntity saveUserEntity(UserEntity userEntity)
	{
		return userRepository.save(userEntity);
		
	}
	
	public List<UserEntity> getAll()
	{
		return userRepository.findAll();
		}
	public Optional<UserEntity> getUserId(@PathVariable int id)
	{
		return userRepository.findById(id);
	}
	
	
	public List<UserEntity> getByUserName(String name)
	{
		return userRepository.findByName(name);
		}
	public String deleteUserEntity(UserEntity userEntity,int id)
	{
		userRepository.delete(userEntity);
		return "data is delete";
		
	}

	
	public UserEntity updateUserEntity(UserEntity userEntity)
	{
		return userRepository.save(userEntity);
	}

}
