package com.francis.chapter82.service;

import com.francis.chapter82.domain.Person;

import java.util.List;

public interface DemoService {
    Person savePersonWithRollBack(Person person);
    Person savePersonWithoutRollBack(Person person);
    List<Person> getAll();
}
