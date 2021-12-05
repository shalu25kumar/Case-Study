package com.microservices.Reservation.service;
import java.util.List;
import java.util.Optional;

import com.microservices.Reservation.models.Rooms;
import com.microservices.Reservation.repository.RoomRepo;

public interface RoomService {
	
	public Rooms addRoom(Rooms room);
	
	public Optional<Rooms> getRoomsById(String room_No);
	
	public String removeRoomsById(String room_No);

	public List<Rooms> findAll();
	
	//public boolean updateRoom(int room_No,Rooms room);

	public void saveOrUpdate(Rooms room);


}
