package com.srtech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.srtech.demo.model.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(Application.class, args);
		
		Student student = context.getBean("student",Student.class);
	
		System.out.println(student);
		((ConfigurableApplicationContext) context).close();
	}

}
