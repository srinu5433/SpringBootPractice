package com.srtech.runners;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.srtech.dao.ResultView1;
import com.srtech.dao.ResultView2;
import com.srtech.dao.ResultView3;
import com.srtech.service.StudentMgmtService;

@Component
public class StudentTestRunner implements CommandLineRunner {

	Logger logger  = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	StudentMgmtService studentMgmtService;
	
	@Override
	public void run(String... args) throws Exception {
		studentMgmtService.searchStudentsIn(List.of(15L,12L), ResultView1.class).forEach((student)->{logger.info("{}, {} ",student.getStudName(),student.getDeptName());});
		
		studentMgmtService.searchStudentsIn(List.of(15L,12L), ResultView2.class).forEach((student)->{logger.info("{}, {} ",student.getState(),student.getDeptName());});
		
		studentMgmtService.searchStudentsIn(List.of(15L,12L), ResultView3.class).forEach((student)->{logger.info("{}, {}, {} ",student.getStudName(),student.getDeptName(),student.getFee());});
		
		
	}
	

}
