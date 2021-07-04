package com.srtech.demo.dao;

import java.util.List;

import com.srtech.demo.bo.EmployeeBO;

public interface IEmployeeDao {
	
	public List<EmployeeBO> getEmployeesByDesg(String cond) throws Exception;

}
