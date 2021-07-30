package com.srtech.service;

import java.util.List;

import com.srtech.entities.StudentDetails;


public interface StudentMgmtService {
	
	public List<StudentDetails> getDeatilsByDept(String name);
	public String checkUserIsValid(String name,String pass);
}
