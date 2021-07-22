package com.srtech.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.srtech.service.StudentMgmtService;

@Component
public class StudentTestRunner implements CommandLineRunner {

	Logger logger  = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	StudentMgmtService studentMgmtService;
	
	@Override
	public void run(String... args) throws Exception {
		
	//	studentMgmtService.fetchDetailsByDeptName("CSE").forEach((student)->{logger.info("{}",student);});
		//studentMgmtService.fetchDetailsByCityAndState("KANIGIRI","AP").forEach((student)->{logger.info("{}",student);});
//		studentMgmtService.fetchDetailsByPriceGreaterThan(1000.00).forEach((student)->{logger.info("{}",student);});
		studentMgmtService.fetchDetailsByDptNameContains("S").forEach((student)->{logger.info("{}",student);});
	}
	

}
