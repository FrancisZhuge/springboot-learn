package com.francis.chapter84.service;

import com.francis.chapter84.domain.Person;

public interface DemoService {
    Person save(Person person);
    void remove(Long id);
    Person findOne(Person person);
}
