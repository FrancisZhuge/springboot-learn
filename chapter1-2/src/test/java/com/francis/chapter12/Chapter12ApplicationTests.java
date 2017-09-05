package com.francis.chapter12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter12ApplicationTests {
	@Autowired
	private UseFunctionService useFunctionService;
	@Test
	public void contextLoads() {
		String s = useFunctionService.sayHello("world");
		System.out.println(s);
	}

}
