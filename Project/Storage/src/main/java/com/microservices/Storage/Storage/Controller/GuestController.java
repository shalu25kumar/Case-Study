package com.microservices.Storage.Storage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.Storage.Storage.Model.Guest;
import com.microservices.Storage.Storage.Service.GuestServiceimpl;


@RestController
public class GuestController {
	@Autowired
	private GuestServiceimpl impl;
	
	@GetMapping("/findAllGuest")
	public List<Guest> findAll() {
		return impl.findAll();
	}

}