package com.srtech.service;

import java.util.List;

import com.srtech.entities.StudentDetails;

public interface StudentMgmtService {
	
	public List<StudentDetails> serachByCity(String city);
	public List<StudentDetails> serachStudentsBasedOnFee(double min, double max);
	public List<StudentDetails> serachByCityIn(String city1,String city2,String city3);
}
