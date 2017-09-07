package com.francis.chapter85;

import com.francis.chapter85.dao.PersonDao;
import com.francis.chapter85.domain.Location;
import com.francis.chapter85.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.LinkedHashSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter85ApplicationTests {
	@Autowired
	private PersonDao personDao;
	@Test
	public void contextLoads() {
//		Person p = new Person("francis",20);
//		Collection<Location> locations = new LinkedHashSet<>();
//		Location location1 = new Location("上海","2009");
//		Location location2 = new Location("北京","2010");
//		Location location3 = new Location("广州","2011");
//		Location location4 = new Location("深圳","2012");
//		locations.add(location1);
//		locations.add(location2);
//		locations.add(location3);
//		locations.add(location4);
//		p.setLocations(locations);
//		Person save = personDao.save(p);
//		System.out.println(save);

//		System.out.println(personDao.findByName("francis"));

		System.out.println(personDao.withQueryFindByAge(20));
	}

}
