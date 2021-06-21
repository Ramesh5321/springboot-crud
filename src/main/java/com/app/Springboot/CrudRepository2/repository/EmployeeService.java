package com.app.Springboot.CrudRepository2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.app.Springboot.CrudRepository2.entity.Employee;



@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepository;

	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return ((CrudRepository<Employee,Long>) empRepository).save(employee);
	}
	
	
	/*public List getAllEmployees() {
		// TODO Auto-generated method stub
		return (List) empRepository.findAll();
	}*/


	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepository.save(employee);
	}

	public void deleteEmployee(Long empId) {
		// TODO Auto-generated method stub
		empRepository.deleteById(empId);
	}


	public antlr.collections.List getAllEmployees() {
		// TODO Auto-generated method stub
		return (antlr.collections.List) empRepository.findAll();
	}


	



	







	

}
