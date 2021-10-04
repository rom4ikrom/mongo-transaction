package com.romanov.mongo_transaction.service;

import com.romanov.mongo_transaction.model.Person;
import com.romanov.mongo_transaction.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Primary
public class PersonApplicationService implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private MongoOperations mongoOperations;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    @Transactional
    public void create(String name) {

        Person person = new Person();
        person.setName(name);

       mongoTemplate.insert(person);

        if(name.startsWith("test")) {
            throw new RuntimeException("failed test");
        }

    }
}
