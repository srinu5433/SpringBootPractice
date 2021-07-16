package com.srtech.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
		/*studentMgmtService.fetchDetails(true, "studId","studName").forEach(student->{
			logger.info("{}",student);
		});
		*/
		/*logger.info("======Pagination================");
		studentMgmtService.fetchDetailsByPageNo(2, 3, true, "studId").forEach(student->{
			logger.info("{}",student);
		});*/
		studentMgmtService.fetchDetailsbyPage(3);
	}

}
