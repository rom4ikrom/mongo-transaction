package com.romanov.mongo_transaction.repository;

import com.romanov.mongo_transaction.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PersonRepository extends MongoRepository<Person, String> {
}
