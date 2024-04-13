package com.tyty.springboot4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyty.springboot4.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


	
		public List<Employee> findByName(String name);

		

		//public List<Employee> findByName(String name);

	}



