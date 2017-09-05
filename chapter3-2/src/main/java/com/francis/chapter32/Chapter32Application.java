package com.francis.chapter32;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Chapter32Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		AsyncTaskService service = context.getBean(AsyncTaskService.class);
		for(int i=0;i<10;i++){
			service.executeAsyncTask(i);
			service.executeAsyncTaskPlus(i);
		}
		context.close();
	}
}
