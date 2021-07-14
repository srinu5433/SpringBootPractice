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
		/*logger.info("=====================Starting the StudentTestRunner======================");
		StudentDetails stddtls = new StudentDetails("Srinivas","CSE","Kanigiri","AP",Double.valueOf(124567.00),Integer.valueOf(523230));
		logger.info("Saving the student results =====> {}",studentMgmtService.saveStudent(stddtls));
		
		logger.info("===============Batch records insertion is started=================");
		
		Iterable<StudentDetails> stdDtlsList = List.of(
				new StudentDetails("Govind","CSE","Srikakulam","AP",Double.valueOf(124567.00),Integer.valueOf(523230)),
				new StudentDetails("Veeru","CSE","Prakasam","AP",Double.valueOf(124567.00),Integer.valueOf(523230)),
				new StudentDetails("Gopi","CSE","Guntur","AP",Double.valueOf(124567.00),Integer.valueOf(523230))
				
				);
		Iterable<StudentDetails> saveStudents = studentMgmtService.saveStudents(stdDtlsList);
		
		logger.info("Students Registers with the following ids");
		//Java8 feature lamda expressions
		saveStudents.forEach(student->logger.info("{}",student.getStudId()));
		*/	
		
		/*	logger.info("================To get the count of students records===================");
			logger.info("No of records available in DB is {}",studentMgmtService.getCountRecords());
			
			logger.info("================To check wheather the given record is existed or not===================");
			logger.info("StudId with 5 is available in DB {}",studentMgmtService.isRecordExistWithGivenId(5L));
			logger.info("StudId with 50 is available in DB {}",studentMgmtService.isRecordExistWithGivenId(50L));
		*/
		/*
		logger.info("====================Find all method============================");
		studentMgmtService.fetchAllDetails().forEach(student->logger.info("{}",student));
		
		logger.info("====================Find all method using streams api============================");
		Arrays.asList(studentMgmtService.fetchAllDetails()).stream().forEach(student->logger.info("{}",student));
		
		logger.info("====================Find all method using map============================");
		Arrays.asList(studentMgmtService.fetchAllDetails()).stream().map(student->student).forEach(student->logger.info("{}",student));
		*/	
		
		/*logger.info("====================Find all By Using Id============================");
		studentMgmtService.fetchAllDetailsByIds(List.of(1L,2L,3L)).forEach(student->logger.info("{}",student));
		logger.info("====================Find all method using streams api============================");
		Arrays.asList(studentMgmtService.fetchAllDetailsByIds(List.of(1L,2L,3L))).stream().forEach(student->logger.info("{}",student));
		
		logger.info("====================Find all method using map============================");
		Arrays.asList(studentMgmtService.fetchAllDetailsByIds(List.of(1L,2L,3L))).stream().map(student->student).forEach(student->logger.info("{}",student));
		*/
		
		/*	logger.info("====================Find By Using Id============================");
			studentMgmtService.fetchDetailsById(1L).orElseThrow(() -> new IllegalArgumentException("Record not found"));
			logger.info("====================Find By Using Id============================");
			Optional<StudentDetails>  studentDetails = studentMgmtService.fetchDetailsById(1L);
			if(studentDetails.isPresent())
				logger.info("StdentDetails===== "+studentDetails.get());
			else
			{
				throw new IllegalArgumentException("Record not found");
			}
		*/	
		/*logger.info("====================== Delete methods ======================");
		logger.info("<==== Delete the record based on ID ============>");
		logger.info("{}",studentMgmtService.removeById(1L));
		
		logger.info("<==== Delete the record by entity ============>");
		StudentDetails details = new StudentDetails();
		details.setStudId(2L);
		logger.info("{}",studentMgmtService.removeByEntity(details));
		
		logger.info("<==== Delete the record based on ID's ============>");
		logger.info("{}",studentMgmtService.removeByIds(List.of(8L,10L)));
		
		logger.info("<==== Delete the record based on given entities ============>");
		StudentDetails stddetails = new StudentDetails();
		StudentDetails stddetails2 = new StudentDetails();
		stddetails.setStudId(3L);
		stddetails2.setStudId(4L);
		logger.info("{}",studentMgmtService.removeByEntities(List.of(stddetails,stddetails2)));
		
		logger.info("<==== Delete All records ============>");
		logger.info("{}",studentMgmtService.removeAll());
		*/
	}

}
