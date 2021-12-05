
package com.microservices.Storage.Storage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.Storage.Storage.Model.Guest;
import com.microservices.Storage.Storage.Repository.GuestRepo;
import com.microservices.Storage.Storage.Service.GuestServiceimpl;

public class GuestServiceimpl implements GuestService{
	@Autowired
	GuestRepo guestRepo;

	
	@Override
	public List<Guest> findAll() {
		return guestRepo.findAll();
		
	}
	
}
