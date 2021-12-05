package com.microservices.Reservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Reservation.models.Guest;
import com.microservices.Reservation.models.Rooms;
import com.microservices.Reservation.service.GuestServiceimpl;

@RestController
public class GuestController {

	@Autowired
	private GuestServiceimpl obj;

	@PostMapping(value="/addGuest")
	public Guest addGuest(@RequestBody Guest guest) {
		return obj.addGuest(guest);
	}

	/*@GetMapping("/findAllGuest")
	public List<Guest> findAllGuest() {
		return obj.findAllGuest();
	}*/
}
