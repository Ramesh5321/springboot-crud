package com.app.Springboot.CrudRepository2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.Springboot.CrudRepository2.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {


}
