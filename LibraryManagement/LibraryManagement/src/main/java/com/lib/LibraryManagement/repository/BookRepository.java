package com.lib.LibraryManagement.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lib.LibraryManagement.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer>{

	public List<BookEntity> findByName(String name);
	







	

}
