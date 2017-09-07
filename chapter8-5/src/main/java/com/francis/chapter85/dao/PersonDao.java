package com.francis.chapter85.dao;


import com.francis.chapter85.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PersonDao extends MongoRepository<Person,String>{
    Person findByName(String name);
    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);
}
