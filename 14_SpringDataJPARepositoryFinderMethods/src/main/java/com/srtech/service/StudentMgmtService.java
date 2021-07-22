package com.srtech.service;

import java.util.List;

import com.srtech.entities.StudentDetails;

public interface StudentMgmtService {
	
	public List<StudentDetails> fetchDetailsByDeptName(String name);
	public List<StudentDetails> fetchDetailsByCityAndState(String city,String state);
	public List<StudentDetails> fetchDetailsByPriceGreaterThan(double fee);
	public List<StudentDetails> fetchDetailsByDptNameContains(String deptName);
}
