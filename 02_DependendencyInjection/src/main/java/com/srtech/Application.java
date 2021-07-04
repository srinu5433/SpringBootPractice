package com.srtech;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.srtech.components.Student;


@SpringBootApplication
@ImportResource("com/srtech/cfgs/applicationProperties.xml")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Student student = context.getBean("student",Student.class);
		
		String msg = student.preparation("Java");
		
		System.out.println(msg);
		
		System.out.println(context.getBeanDefinitionCount());

		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}

	
}
