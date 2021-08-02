package com.srtech.demo.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.srtech.demo.entities.Customer;
import com.srtech.demo.service.ICustomerServiceMgmt;

@Component
public class CustomerTestRunner implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ICustomerServiceMgmt custService;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world");
		logger.info("==============Starting of the method===============");
		Customer cust = new Customer( "Srinivas", "Kanigiri", 
				LocalDateTime.of(2019, 10, 31, 12, 59),
				LocalTime.now(),
				LocalDate.now());
		/*		try {
				logger.info("Cstomer is savedor not {}",custService.registerCustomer(cust));
				}
				catch (Exception e) {
					e.printStackTrace();
					logger.info("{}",e.getMessage());
				}
		*/
		custService.getAllCustomer().forEach((customer)->logger.info("{}",customer));
	}

}
