package com.srtech.runners;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.srtech.entities.StudentDetails;
import com.srtech.service.StudentMgmtService;

@Component
public class StudentTestRunner implements CommandLineRunner {

	Logger logger  = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	StudentMgmtService studentMgmtService;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("======== Testing on Jpa Reepository findAll Method =============");
		StudentDetails stdDetails = new StudentDetails();
		stdDetails.setState("AP");
		stdDetails.setPincode(523230);
		studentMgmtService.searchDetailsByGivenData(stdDetails, true, "studId").forEach((std)->
				logger.info("{}",std));
		logger.info("======== Testing on Jpa Reepository getById Method =============");
		logger.info("{}",studentMgmtService.searchDetailsByGivenId(16L));
	
		logger.info("======== Testing on Jpa Reepository deleteAllByIdInBatch Method =============");
		logger.info("{}",studentMgmtService.deleteRecordsById(List.of(13L,16L,14L)));
	}
	

}
