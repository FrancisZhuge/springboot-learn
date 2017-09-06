package com.francis.chapter63;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter63ApplicationTests {
	@Autowired
	private AuthorSettings authorSettings;
	@Test
	public void contextLoads() {
		System.out.println(authorSettings.toString());
	}

}
