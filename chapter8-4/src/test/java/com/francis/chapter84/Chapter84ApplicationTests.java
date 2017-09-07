package com.francis.chapter84;

import com.francis.chapter84.domain.Person;
import com.francis.chapter84.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
/**
 * 如果不是在测试类上，在主类上，也要加上这条注解。否则缓存不起作用。
 * 默认使用ConcurrentHashMap作为缓存
 */
@EnableCaching
public class Chapter84ApplicationTests {
	@Autowired
	private DemoService  demoService;
	@Test
	public void contextLoads() {
		Person person = new Person();
		person.setId(7L);
		Person one = demoService.findOne(person);
		System.out.println(one);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Person one2 = demoService.findOne(person);
		System.out.println(one2);
	}

}
