package com.francis.chapter21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Chapter21Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);
		System.out.println("singletonService1与singletonService2是否相等"+singletonService1.equals(singletonService2));
		DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);
		System.out.println("prototypeService1与prototypeService2是否相等"+prototypeService1.equals(prototypeService2));
		context.close();
	}
}
