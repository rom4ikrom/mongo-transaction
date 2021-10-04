package com.romanov.mongo_transaction.controller;

import com.romanov.mongo_transaction.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController implements PersonService {

    @Autowired
    private PersonService personService;

    @Override
    @PostMapping("/admin/person/{name}")
    public void create(@PathVariable(name = "name") String name) {
        personService.create(name);
    }
}
