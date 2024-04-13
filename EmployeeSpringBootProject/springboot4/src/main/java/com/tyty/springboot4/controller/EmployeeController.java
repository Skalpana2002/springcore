package com.tyty.springboot4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyty.springboot4.entity.Employee;
import com.tyty.springboot4.service.EmployeeService;
import com.tyty.springboot4.util.ResponseStructure;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;




@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@Operation(description = "save employee",summary = "to save employee")
//	@ApiResponses(value= {@ApiResponse(description="success",responseCode = "200"),
			//@ApiResponse(description = "failure",responseCode = "404")})
	@ApiResponses(value= {@ApiResponse(description="success",responseCode="200"),@ApiResponse(description="failure",responseCode="404")})
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
		}
	
	@GetMapping("/getalldata")
	public ResponseEntity<ResponseStructure<List<Employee>>> getAll()
	{
		return employeeService.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public  ResponseEntity<ResponseStructure<Employee>> getEmployeeId(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
		
	}
	
	@GetMapping("/getbyname/{name}")
	public  ResponseEntity<ResponseStructure<List<Employee>>> getByName(@PathVariable String name)
	{
		return employeeService.findByName(name);
		
	}

	
	@DeleteMapping("/delete/{id}") 
	public ResponseEntity<ResponseStructure<Employee>> deleteEmployee(Employee employee,@PathVariable int id)
	{
		return employeeService.deleteEmployee(employee, id);
	}


    
    @PostMapping("/update")
	public ResponseEntity<ResponseStructure<Employee>> updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
}
