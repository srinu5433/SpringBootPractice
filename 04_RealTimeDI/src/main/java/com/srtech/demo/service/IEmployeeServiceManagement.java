package com.srtech.demo.service;

import java.util.List;

import com.srtech.demo.dto.EmployeeDTO;

public interface IEmployeeServiceManagement {
	
	public List<EmployeeDTO> fetchEmployeeByDesg(String[] args) throws Exception;

}
