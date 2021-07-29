package com.srtech.runners;

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
		
	//	studentMgmtService.fetchDetailsByDeptName("CSE").forEach((student)->{logger.info("{}",student);});
		//studentMgmtService.fetchDetailsByCityAndState("KANIGIRI","AP").forEach((student)->{logger.info("{}",student);});
//		studentMgmtService.fetchDetailsByPriceGreaterThan(1000.00).forEach((student)->{logger.info("{}",student);});
		//studentMgmtService.serachByCity("Guntur").forEach((student)->{logger.info("{}",student);});
	
		//studentMgmtService.serachStudentsBasedOnFee(700.0,1300.0).forEach((student)->{logger.info("{}",student);});
		
		//studentMgmtService.serachByCityIn("Kanigiri","Guntur","Srikakulam").forEach((student)->{logger.info("{}",student);});
		
		/*	Object stdDtls[] =(Object[])  studentMgmtService.serachByName("Srinivas");
			for(Object obj:stdDtls) {
				logger.info("{}",obj);
			}
		*/	
			
		//studentMgmtService.serachByNameCols("Gopi");
		
		/*int count = studentMgmtService.updateStudentDept("MECH", 15L);
		if(count==1)
		    logger.info("Studentdept updated succesfully");
		else
			logger.info("Studentdept updation is failed ");*/ 
		
		/*		int count = studentMgmtService.removeStudentById(15L);
				if(count==1)
		    logger.info("Student deleted succesfully");
				else
					logger.info("Student deletion has failed ");*/
		
		/*		int count = studentMgmtService.saveStudentDetails(1200L, "Vizag","MECH" , 1500.00, 525645, "AP", "Narendra");
				if(count==1)
				    logger.info("Student saved succesfully");
				else
					logger.info(" Saving Student details has failed ");
		*/	
		
		int count = studentMgmtService.createTable();
		logger.info("count value from create table {}",count);
		if(count==0)
		    logger.info("Table created succesfully");
		else
			logger.info(" Table creation has failed ");
		
	}
	

}
