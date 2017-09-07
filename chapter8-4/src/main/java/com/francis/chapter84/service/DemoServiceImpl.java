package com.francis.chapter84.service;

import com.francis.chapter84.dao.PersonDao;
import com.francis.chapter84.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    private PersonDao personDao;
    @Override
    @CachePut(value = "people",key = "#person.id")
    public Person save(Person person) {
        Person p = personDao.save(person);
        System.out.println("保存");
        return p;
    }

    @Override
    @CacheEvict(value = "people",key = "id")
    public void remove(Long id) {
        System.out.println("删除");
        personDao.delete(id);
    }

    @Override
    @Cacheable(value = "people",key = "#person.id")
    public Person findOne(Person person) {
        Person one = personDao.findOne(person.getId());
        System.out.println("查找");
        return one;
    }
}
