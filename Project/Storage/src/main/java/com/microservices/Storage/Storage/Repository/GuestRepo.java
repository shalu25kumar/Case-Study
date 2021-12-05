
package com.microservices.Storage.Storage.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.Storage.Storage.Model.Guest;

@Repository
public interface GuestRepo extends MongoRepository<Guest, String>{

}

