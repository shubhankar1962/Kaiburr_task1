package com.example.springbootMongodb.repository;

import com.example.springbootMongodb.model.TodoDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<TodoDto, String> {
}
