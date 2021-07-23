package com.srtech.service;

import java.util.List;

import com.srtech.dao.ResultView;

public interface StudentMgmtService {
	
	public List<ResultView> fetchDetailsByDeptName(String name);
	
	public List<ResultView> searchDetailsByState(String state);
	
}
