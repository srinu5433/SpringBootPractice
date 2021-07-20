package com.srtech.service;

import java.util.List;

import com.srtech.entities.StudentDetails;

public interface StudentMgmtService {

	public List<StudentDetails> searchDetailsByGivenData(StudentDetails dtls, boolean ascOrder,String... properties);
	
	public StudentDetails searchDetailsByGivenId(Long id);
	
	public String deleteRecordsById(List<Long> ids);

}
