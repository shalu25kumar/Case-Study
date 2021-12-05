package com.microservices.Storage.Storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.microservices.Storage.Storage.Service.EmployeeServiceimpl;
import com.microservices.Storage.Storage.Service.GuestServiceimpl;

@SpringBootApplication
public class StorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorageApplication.class, args);
	}
	
	/*@Bean
	public GuestServiceimpl guestserviceimpl() {
		return new GuestServiceimpl();
	}*/
	@Bean
	public EmployeeServiceimpl employeeserviceimpl() {
		return new EmployeeServiceimpl();
	}
	@Bean
	public GuestServiceimpl guestserviceimpl() {
		return new GuestServiceimpl();
	}
}