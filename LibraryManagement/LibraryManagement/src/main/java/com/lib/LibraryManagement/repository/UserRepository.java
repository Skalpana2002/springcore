package com.lib.LibraryManagement.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.lib.LibraryManagement.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	public List<UserEntity> findByName(String name);

	


	

}
