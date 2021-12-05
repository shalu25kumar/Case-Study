
package com.microservices.Storage.Storage.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.Storage.Storage.Model.Employee;


@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String>{

}

