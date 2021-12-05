package com.microservices.Reservation.service;

import java.util.List;
import java.util.Optional;

import com.microservices.Reservation.models.Guest;
import com.microservices.Reservation.models.Rooms;


	public interface GuestService {
		
		public Guest addGuest(Guest guest);
		
		//public Optional<Guest> getGuestByName(String name);
		
		//public String removeGuestByName(String name);

		//public List<Guest> findAllGuest();
		
		//public void saveOrUpdate(Guest guest);


}
