package com.srtech.demo.components;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class EmailApplicationRunner implements ApplicationRunner {

	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("EmailApplicationRunner.run() arguments");
		System.out.println("Non optinal arguments "+args.getNonOptionArgs());
		System.out.println("Optinal keys / names "+args.getOptionNames());
		System.out.println("Optinal values "+args.getOptionValues("opt2"));
		System.out.println("Source Args List "+Arrays.toString(args.getSourceArgs()));
	}

}
