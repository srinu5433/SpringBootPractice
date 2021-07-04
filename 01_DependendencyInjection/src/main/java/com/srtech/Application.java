package com.srtech;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.srtech.components.WishMessageGenerator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		WishMessageGenerator wishMessageGenerator = context.getBean("wmg", WishMessageGenerator.class);

		System.out.println(wishMessageGenerator.wish("Srinivas"));
	}

	@Bean("ldt")
	public LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}

}
