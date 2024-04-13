package com.tyty.springboot4.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.tyty.springboot4.entity.Employee;
import com.tyty.springboot4.repository.EmployeeRepository;




@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository 	employeeRepository;

	public Employee saveEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
		
	}
	public List<Employee> getAll()
	{
		return employeeRepository.findAll();
		}

	
	public Optional<Employee> getEmployeeId(@PathVariable int id)
	{
		return employeeRepository.findById(id);
	}
	
	public List<Employee> findByName(String name)
	{
		return employeeRepository.findByName(name);
		}
	
	public String deleteEmployee(Employee employee,int id)
	{
		employeeRepository.delete(employee);
		return "data is delete";
		
	}
	
	public Employee updateEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
}
