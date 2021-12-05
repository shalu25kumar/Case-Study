package com.microservices.Storage.Storage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservices.Storage.Storage.Model.Employee;
import com.microservices.Storage.Storage.Service.EmployeeServiceimpl;


public class EmployeeController {
	@Autowired
	private EmployeeServiceimpl obj;

	@PostMapping(value="/addEmployee")
	public Employee addEmployee(@RequestBody Employee  employee) {
		return obj.addEmployee(employee);
	}

}
