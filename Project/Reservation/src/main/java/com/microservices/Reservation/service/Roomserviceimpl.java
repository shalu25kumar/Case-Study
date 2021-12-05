package com.microservices.Reservation.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.Reservation.models.Rooms;
import com.microservices.Reservation.repository.RoomRepo;

public class Roomserviceimpl implements RoomService{
	@Autowired
	RoomRepo roomRepo;

	@Override
	public Rooms addRoom(Rooms rooms) {
		return roomRepo.save(rooms);
	}
	
	@Override
	public Optional<Rooms> getRoomsById(String room_No) {
		return roomRepo.findById(room_No);
	}
	
	@Override
	public List<Rooms> findAll() {
		return roomRepo.findAll();
	}
	
	
	@Override
	public String removeRoomsById(String room_No) {
		roomRepo.deleteById(room_No);
		return ("Room deleted");
	
	}
	
	/*@Override
	public boolean  updateRoom(int room_No,boolean status) {
		boolean result=false;
		Rooms room =new Rooms();
		try {
			room.findById(room_No);
			room.Status=status;
			return result;
		}
		catch(Exception ex){
			return result=false;
			
		}
	}*/

	//updating a room  
	/*@Override
	public void updateRoom(Rooms room, int room_No)   
	{  
	roomRepo.save(room);  
	}  */
	
	@Override
	public void saveOrUpdate(Rooms room)   
	{  
		roomRepo.save(room);  
	}  
}  



