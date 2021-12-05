package com.microservices.Storage.Storage.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

@Document(collection = "Employee")
public class Employee{
@Id
	public String eid;
@Id
	public String name;
    public char gender;
    public int     age;
    public String  designation;
	public String address;
	public int    salary;
	public Long phone_No;
	public String email;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", gender=" + gender + ", age=" + age + ", designation="
				+ designation + ", address=" + address + ", salary=" + salary + ", phone_No=" + phone_No + ", email="
				+ email + "]";
	}
	
	
	
  }
	

