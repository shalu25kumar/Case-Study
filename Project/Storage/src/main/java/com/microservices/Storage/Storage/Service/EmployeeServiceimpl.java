package com.microservices.Storage.Storage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.Storage.Storage.Model.Employee;
import com.microservices.Storage.Storage.Repository.EmployeeRepo;



public class EmployeeServiceimpl implements EmployeeService{
	@Autowired
	EmployeeRepo employeeRepo;

	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	} 
	
}
