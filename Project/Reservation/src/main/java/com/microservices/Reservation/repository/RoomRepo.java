package com.microservices.Reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.microservices.Reservation.models.Rooms;

public interface RoomRepo extends MongoRepository<Rooms, String>{

}
