package com.siddhu.aop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SiddhuaopExampleApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//SpringApplication.run(SiddhuaopExampleApplication.class, args);
		// Annotation based spring context
		AnnotationConfigApplicationContext context	= new AnnotationConfigApplicationContext();
		context.scan("com.siddhu.aop");
		context.refresh();
		siddhucomponent objsiddhucomponent = context.getBean(siddhucomponent.class);
		objsiddhucomponent.showLog();
	}

}
