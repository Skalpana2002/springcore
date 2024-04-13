package com.tyty.springboot4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tyty.springboot4.dao.EmployeeDao;
import com.tyty.springboot4.entity.Employee;
import com.tyty.springboot4.util.ResponseStructure;


@Service
public class EmployeeService {
	@Autowired
	 private EmployeeDao employeeDao;
		public ResponseEntity<ResponseStructure<Employee>> saveEmployee(Employee employee)
		{
		employeeDao.saveEmployee(employee);
		ResponseStructure<Employee> structure=new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("Employee saved");
		structure.setData(employee);
		return new ResponseEntity<ResponseStructure<Employee>>(structure,HttpStatus.CREATED);
		}
		
		public ResponseEntity<ResponseStructure<List<Employee>>> getAll()
		{
			List<Employee> list=employeeDao.getAll();
			ResponseStructure<List<Employee>> structure=new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("data found");
			structure.setData(list);
			return new ResponseEntity<ResponseStructure<List<Employee>>>(structure,HttpStatus.CREATED);
		}
		
		public ResponseEntity<ResponseStructure<Employee>> getEmployeeById(@PathVariable int id)
		{
			Optional<Employee> op=employeeDao.getEmployeeId(id);
			ResponseStructure<Employee> structure=new ResponseStructure();
			if(op.isPresent())
			{
				structure.setStatusCode(HttpStatus.CREATED.value());
				structure.setMessage("employee found");
				structure.setData(op.get());
				return new ResponseEntity<ResponseStructure<Employee>>(structure,HttpStatus.CREATED);
				
			}
			else
			{
				structure.setStatusCode(HttpStatus.NOT_FOUND.value());
				structure.setMessage("employee not found");
				structure.setData(null);
				return new ResponseEntity<ResponseStructure<Employee>>(structure,HttpStatus.NOT_FOUND);
			}
			
		}
		
		
		public ResponseEntity<ResponseStructure<List<Employee>>> findByName(String name)
		{
			List<Employee> list =employeeDao.findByName(name);
			ResponseStructure<List<Employee>> structure=new ResponseStructure<>();
			
			if(list.isEmpty())
			{
				structure.setStatusCode(HttpStatus.NOT_FOUND.value());
				structure.setMessage("employee not  found ");
				structure.setData(list);
				return new ResponseEntity<ResponseStructure<List<Employee>>>(structure,HttpStatus.NOT_FOUND);
				
			}
			else
			{
				structure.setStatusCode(HttpStatus.ACCEPTED.value());
				structure.setMessage("employee  found");
				structure.setData(list);
				return new ResponseEntity<ResponseStructure<List<Employee>>>(structure,HttpStatus.ACCEPTED);
			}
			
			
		}
		
		
		
		
		public ResponseEntity<ResponseStructure<Employee>> deleteEmployee(Employee employee,int id)
		{
			employeeDao.deleteEmployee(employee,id);
			ResponseStructure<Employee> structure=new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Employee deleted");
			structure.setData(employee);
			return new ResponseEntity<ResponseStructure<Employee>>(structure,HttpStatus.CREATED);
		}
		
		
		public ResponseEntity<ResponseStructure<Employee>> updateEmployee(Employee employee)
		{
			employeeDao.updateEmployee(employee);
			ResponseStructure<Employee> structure=new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Employee update");
			structure.setData(employee);
			return new ResponseEntity<ResponseStructure<Employee>>(structure,HttpStatus.CREATED);
		}

		
		

}
