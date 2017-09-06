package com.francis.chapter34;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Chapter34Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ListService listService = context.getBean(ListService.class);
		System.out.println(listService.showListCmd());
	}
}
