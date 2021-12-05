package com.microservices.Reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.Reservation.models.Guest;

public interface GuestRepo extends MongoRepository<Guest,String>{

}
