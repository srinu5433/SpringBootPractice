package com.srtech.demo.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-5)
public class CustomCammandLineRunner implements CommandLineRunner {

	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("CustomCammandLineRunner.run() arguments");
		for(String arg :args)
		{
			System.out.println(arg);
		}

	}

}
