package com.microservices.Reservation.models;
//import org.springframework.context.annotation.Role;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

@Document(collection = "Rooms")
public class Rooms {
	@Id
	public String room_No;
	public String Type;
	public boolean Status;
	public int Price;
	public String name;

public Rooms() {
	
}
@Override
public String toString() {
	return "Rooms [Room No=" + room_No + ", Type=" + Type + ", Status=" + Status + ", Price=" + Price + ", name=" + name + "]";
}
}