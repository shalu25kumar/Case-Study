package com.microservices.Reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import com.microservices.Reservation.service.GuestServiceimpl;
import com.microservices.Reservation.service.Roomserviceimpl;

@SpringBootApplication
public class ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}
	
	@Bean
	public Roomserviceimpl roomserviceimpl() {
		return new Roomserviceimpl();
	}
	@Bean
	public GuestServiceimpl guestserviceimpl() {
		return new GuestServiceimpl();
	}

}
