package com.francis.chapter82.service;

import com.francis.chapter82.dao.PersonDao;
import com.francis.chapter82.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    private PersonDao personDao;
    @Override
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithRollBack(Person person) {
        Person save = personDao.save(person);
        if(person.getName().equals("曹操")){
            throw new IllegalArgumentException("回滚");
        }
        return save;
    }

    @Override
    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithoutRollBack(Person person) {
        Person save = personDao.save(person);
        if(person.getName().equals("曹操")){
            throw new IllegalArgumentException("不回滚");
        }
        return save;
    }

    @Override
    public List<Person> getAll() {
        List<Person> all = personDao.findAll();
        return all;
    }
}
