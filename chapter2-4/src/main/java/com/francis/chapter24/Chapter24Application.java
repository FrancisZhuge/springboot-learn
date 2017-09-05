package com.francis.chapter24;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Chapter24Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("prod");
		context.register(Config.class);
		context.refresh();

		DemoBean bean = context.getBean(DemoBean.class);
		System.out.println(bean.getContext());
		context.close();
	}
}
