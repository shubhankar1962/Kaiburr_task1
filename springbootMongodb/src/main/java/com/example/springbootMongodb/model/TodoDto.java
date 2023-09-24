package com.example.springbootMongodb.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.PrivateKey;
import java.util.Date;
import java.util.PrimitiveIterator;

@Setter
@Getter
@AllArgsConstructor@NoArgsConstructor
@Document(collection = "todos")
public class TodoDto {

    private String id;

    private String todo;
    private String description;
    private  Boolean completed;
    private Date CreatedAt;
    private  Date updatedAt;
}
