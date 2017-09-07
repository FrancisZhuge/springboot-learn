package com.francis.chapter82;

import com.francis.chapter82.domain.Person;
import com.francis.chapter82.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter82ApplicationTests {
	@Autowired
	private DemoService demoService;
	@Test
	public void contextLoads() {
//		demoService.savePersonWithRollBack(new Person("曹操",59,"龙城"));
		demoService.savePersonWithoutRollBack(new Person("曹操",59,"龙城"));
		List<Person> all = demoService.getAll();
		System.out.println(all);
	}

}
