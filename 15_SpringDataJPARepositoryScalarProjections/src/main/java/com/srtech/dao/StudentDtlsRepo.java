package com.srtech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtech.entities.StudentDetails;

public interface StudentDtlsRepo extends JpaRepository<StudentDetails, Long> {
	
	public List<ResultView> findByDeptName(String deptName);
	
	public List<ResultView> findByState(String state);
}
