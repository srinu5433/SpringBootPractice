package com.srtech.service;

import java.util.List;
import java.util.Optional;

import com.srtech.entities.StudentDetails;

public interface StudentMgmtService {
	
	public List<StudentDetails> serachByCity(String city);
	public List<StudentDetails> serachStudentsBasedOnFee(double min, double max);
	public List<StudentDetails> serachByCityIn(String city1,String city2,String city3);

	public Object serachByName(String name);
	public StudentDetails serachByNameCols(String name);
	public int updateStudentDept(String deptName,Long id);
	public int removeStudentById(Long id);
	public int saveStudentDetails(Long studId,String city,String deptName, double fee, int pincode, String state, String studName);
	public int createTable();

}
