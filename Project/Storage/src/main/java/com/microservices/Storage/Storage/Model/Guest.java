package com.microservices.Storage.Storage.Model;

import java.util.Date;

//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

@Document(collection = "Guest")
public class Guest{
@Id
	public String room_No;
	public String name;
	public String address;
	public char gender;
	public Long phone_No;
	public String email;
	public String No_of_guest;
	public Date checkin;
	public Date checkout;
	public String No_of_days;

@Override
public String toString() {
	return "Guest [room_No=" + room_No + ", name=" + name + ", address=" + address + ", gender=" + gender
			+ ", phone_No=" + phone_No + ", email=" + email + ", No_of_guest=" + No_of_guest + ", checkin=" + checkin
			+ ", checkout=" + checkout + ", No_of_days=" + No_of_days + "]";
	}
}
