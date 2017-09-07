package com.francis.chapter83;

import com.francis.chapter83.dao.PersonDao;
import com.francis.chapter83.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter83ApplicationTests {
	@Autowired
	private PersonDao personDao;
	@Test
	public void contextLoads() {
		int insert = personDao.insert("刘备", 44, "成都");
		System.out.println(insert);
	}

}
