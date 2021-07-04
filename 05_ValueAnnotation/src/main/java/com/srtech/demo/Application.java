package com.srtech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.srtech.demo.items.BillGenerator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		BillGenerator bg = context.getBean(BillGenerator.class);	
		System.out.println(bg);
		((ConfigurableApplicationContext) context).close();
	}

}
