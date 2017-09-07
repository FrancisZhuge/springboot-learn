package com.francis.chapter81.web;

import com.francis.chapter81.dao.PersonDao;
import com.francis.chapter81.domian.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private PersonDao personDao;

    @RequestMapping("/getone")
    public Person getone(Long id){
        Person one = personDao.getOne(id);
        return one;
    }
}
