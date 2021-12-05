package com.microservices.Reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.Reservation.models.Guest;

import com.microservices.Reservation.repository.GuestRepo;


public class GuestServiceimpl implements GuestService{
	@Autowired
	GuestRepo guestRepo;

	@Override
	public Guest addGuest(Guest guest) {
		return guestRepo.save(guest);
	} 
	/*@Override
	public List<Guest> findAllGuest() {
		return guestRepo.findAll();
	}*/
	
}

