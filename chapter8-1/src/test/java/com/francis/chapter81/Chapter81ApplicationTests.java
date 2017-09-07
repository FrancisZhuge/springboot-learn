package com.francis.chapter81;

import com.francis.chapter81.dao.PersonDao;
import com.francis.chapter81.domian.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter81ApplicationTests {
	@Autowired
	private PersonDao personDao;
	@Test
	public void contextLoads() {
		List<Person> byAddress = personDao.findByAddress("北京");
		System.out.println(byAddress);

		Person byNameAndAddress = personDao.findByNameAndAddress("yy", "上海");
		System.out.println(byNameAndAddress);
		Person person = personDao.withNameAndAddressQuery("yy", "上海");
		System.out.println(person);
		Person person1 = personDao.withNameAndAddressNamedQuery("yy", "上海");
		System.out.println(person1);
	}

}
