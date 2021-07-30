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
		logger.info("==================Student details based on DEPT Name ===================");
		studentMgmtService.getDeatilsByDept("CSE").forEach(student->logger.info("{}",student));
		
		logger.info("==================Authentication Checking ===================");
		logger.info( "Result is {}",studentMgmtService.checkUserIsValid("raja", "Rani"));
		
	}
	

}
