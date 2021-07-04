package com.srtech.demo.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-1)
public class AlertCammandLineRunner implements CommandLineRunner {

	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("AlertCammandLineRunner.run() arguments");
		for(String arg :args)
		{
			System.out.println(arg);
		}

	}

}
