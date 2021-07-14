package com.srtech.service;

import java.util.Optional;

import com.srtech.entities.StudentDetails;

public interface StudentMgmtService {
	
	public String saveStudent(StudentDetails stdDtls);
	
	public Iterable<StudentDetails> saveStudents(Iterable<StudentDetails> stdDtls);
	
	public long getCountRecords();
	
	public boolean isRecordExistWithGivenId(Long id);

	public Iterable<StudentDetails> fetchAllDetails();
	
	public Iterable<StudentDetails> fetchAllDetailsByIds(Iterable<Long> ids);
	
	public Optional<StudentDetails> fetchDetailsById(Long id);
	
	public String removeById(Long id);
	public String removeByEntity(StudentDetails stdDtls);
	public String removeByIds(Iterable<Long> ids);
	public String removeByEntities(Iterable<StudentDetails> stdDtls);
	public String removeAll();
	
}
