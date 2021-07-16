package com.srtech.service;

import java.util.Optional;

import com.srtech.entities.StudentDetails;

public interface StudentMgmtService {
	public Iterable<StudentDetails> fetchDetails(boolean asc, String... properties);
	public Iterable<StudentDetails> fetchDetailsByPageNo(int pageNo,int pageSize,boolean asc, String... properties);
	public Iterable<StudentDetails> fetchDetailsbyPage(int size);
}
