package com.srtech.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtech.dao.StudentDtlsRepo;
import com.srtech.entities.StudentDetails;

@Service("stdService")
public class StudentMgmtServiceImpl implements StudentMgmtService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentDtlsRepo stdRepo;

	public StudentMgmtServiceImpl() {
		logger.info("Instatinating the StudentMgmtServiceImpl service class object");
	}

	@Override
	public String saveStudent(StudentDetails stdDtls) {
		String results = null;
		logger.info("inside the save student method");
		StudentDetails studentDetails = null;
		if (stdDtls != null) {
			logger.info("Before saving the student details in repository");
			studentDetails = stdRepo.save(stdDtls);
		}
		results = studentDetails != null
				? "Student details saved SuccessFully with reg No  " + studentDetails.getStudId()
				: "Failed to save Student details";
		logger.info("end of the save method results ====>{}", results);
		return results;
	}

	@Override
	public Iterable<StudentDetails> saveStudents(Iterable<StudentDetails> stdDtls) {

		if (stdDtls != null)
			return stdRepo.saveAll(stdDtls);
		else
			throw new IllegalArgumentException("We can't insert the records");
	}

	@Override
	public long getCountRecords() {
		logger.info("Inside the getCount method To get the No of Student records");
		return stdRepo.count();
	}

	@Override
	public boolean isRecordExistWithGivenId(Long id) {
		logger.info(
				"Inside the isRecordExistWithGivenId method To Check wheather the given Student records is present or not");
		return stdRepo.existsById(id);
	}

	@Override
	public Iterable<StudentDetails> fetchAllDetails() {
		Iterable<StudentDetails> studentDetails = stdRepo.findAll();
		//return studentDetails!=null ? studentDetails :  new NotFoundException("Records deosn't exist");
		return studentDetails;
	}

	@Override
	public Iterable<StudentDetails> fetchAllDetailsByIds(Iterable<Long> ids) {
		return stdRepo.findAllById(ids);
	}

	@Override
	public Optional<StudentDetails> fetchDetailsById(Long id) {
		return stdRepo.findById(id);
	}

	@Override
	public String removeById(Long id) {
		Optional<StudentDetails> stdDetails = fetchDetailsById(id);
		if(stdDetails.isPresent())
		{
		stdRepo.deleteById(id);
		return "Deleted the Student Details";
		}
		return "Record is not existed with the given id";
	}

	@Override
	public String removeByEntity(StudentDetails stdDtls) {
		
		Optional<StudentDetails> stdDetails = fetchDetailsById(stdDtls.getStudId());
		if(stdDetails.isPresent())
		{
		stdRepo.delete(stdDtls);
		return "Deleted the Student Details";
		}
		return "Record is not existed with the given entity";
	}

	@Override
	public String removeByIds(Iterable<Long> ids) {
		Iterable<StudentDetails> listOfStudents = stdRepo.findAllById(ids);
		if(((List)listOfStudents).size() == ((List)ids).size()) {
			stdRepo.deleteAllById(ids);
			return ((List)listOfStudents).size() +" records are deleted ";
		}
		return "Failed to delete records beacuse few Id's are not available";
	}

	@Override
	public String removeByEntities(Iterable<StudentDetails> stdDtls) {
		Long count=0L;
		for(StudentDetails std : stdDtls)
		{
			Optional<StudentDetails> obj = stdRepo.findById(std.getStudId());
			if(obj.isPresent())
			{
			count++;	
			}
		}
		//if(count == ((List)stdDtls).size())
		//{
			stdRepo.deleteAll(stdDtls);
			//return count+ " No of records are deleted";
		//}
		return "Records are not deleted";
	}

	@Override
	public String removeAll() {
		Long count = stdRepo.count();
		if(count!=0)
		{
		stdRepo.deleteAll();
		return "No of records "+count+" deleted Succesfully";
		}
		return "Table is Empty, So No records are Deleted";
	}

}
