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
		
	//studentMgmtService.fetchDetailsByDeptName("CSE").forEach((student)->{logger.info("{}===,== {}",student.getStudName(),student.getFee());});
	
	studentMgmtService.searchDetailsByState("AP").forEach((student)->{logger.info("{}===,== {}",student.getStudName(),student.getFee());});
	}
	

}
