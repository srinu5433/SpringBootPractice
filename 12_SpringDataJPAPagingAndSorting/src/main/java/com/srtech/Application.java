package com.srtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.srtech.dao.StudentDtlsRepo;
import com.srtech.entities.StudentDetails;
import com.srtech.service.StudentMgmtService;
import com.srtech.service.StudentMgmtServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
