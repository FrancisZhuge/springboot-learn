package com.francis.chapter64;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter64ApplicationTests {
	@Autowired
	ConfigProperties configProperties;
	@Test
	public void contextLoads() {
		configProperties.outputProperties();
	}

}
