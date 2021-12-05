package com.microservices.Storage.Storage.Service;
import java.util.List;


import com.microservices.Storage.Storage.Model.Guest;


	public interface GuestService {
		
		//public GuestRepo addGuest(GuestRepo guest);
		
		//public Optional<Guest> getGuestByName(String name);
		
	//	public String removeGuestByName(String name);

		public List<Guest> findAll();
		
		//public void saveOrUpdate(Guest guest);


}