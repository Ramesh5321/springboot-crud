package com.app.Springboot.CrudRepository2.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Springboot.CrudRepository2.entity.Employee;
import com.app.Springboot.CrudRepository2.repository.EmployeeService;

import antlr.collections.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	@PostMapping("/add")
	public Employee addEmployee(Employee employee)
	{
		return empservice.addEmployee(employee);
	}
	@GetMapping("/list")
	public List getAllEmployees()
	{
	return  (List)empservice.getAllEmployees();
	}
	@PutMapping("/update")
	public Employee updateEmployee(Employee employee)
	{
		return empservice.updateEmployee(employee);
	}
	@DeleteMapping("/delete/{empId}")
	public void Employee(@PathVariable Long empId)
	{
		 empservice.deleteEmployee(empId);
		
	}


}
