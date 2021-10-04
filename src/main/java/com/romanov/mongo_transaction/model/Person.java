package com.romanov.mongo_transaction.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "person")
@Data
public class Person {

    @Id
    private String id;

    @Field("name")
    private String name;

}
