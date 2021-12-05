package com.microservices.Reservation.Controller;
import java.util.List;
import java.util.Optional;

import org.apache.el.parser.AstString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.microservices.Reservation.models.Rooms;

import com.microservices.Reservation.service.Roomserviceimpl;

@RestController
public class RoomController {

	@Autowired
	private Roomserviceimpl obj;

	@PostMapping(value="/addRoom")
	public Rooms addRoom(@RequestBody Rooms rooms) {
		return obj.addRoom(rooms);
	}

	@GetMapping("/findAllRooms")
	public List<Rooms> getRooms() {
		return obj.findAll();
	}

	@GetMapping("/findRooms/{room_No}")
	public Optional<Rooms> getRoom(@PathVariable String room_No) {
		return obj.getRoomsById(room_No);
	}

	@DeleteMapping("/delete/{room_No}")
	public String deleteRoom(@PathVariable String room_No) {
		obj.removeRoomsById(room_No);
		return "Room deleted with id : " + room_No;
	}
	/*@PostMapping("/updateRoom/{room_No}{status}")
		public boolean updateRoom(@PathVariable int room_No,boolean status) {
			boolean st=obj.updateRoom(room_No, status);
			return st;
	
   }*/
	//creating put mapping that updates the room detail   
	
	@PutMapping("/updateroom")  
	private Rooms update(@RequestBody Rooms room)   
	{  
	obj.saveOrUpdate(room);  
	return room;  
	}  
}  




