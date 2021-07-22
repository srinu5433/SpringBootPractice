package com.srtech.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtech.dao.StudentDtlsRepo;
import com.srtech.entities.StudentDetails;

@Service("stdService")
public class StudentMgmtServiceImpl implements StudentMgmtService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentDtlsRepo stdRepo;

	public StudentMgmtServiceImpl() {
		logger.info("Instatinating the StudentMgmtServiceImpl service class object");
	}

	@Override
	public List<StudentDetails> fetchDetailsByDeptName(String name) {
		
		//return stdRepo.findByDeptName(name);
		return stdRepo.findByDeptNameEquals(name);
		//return stdRepo.findByDeptNameIs(name);
	}

	@Override
	public List<StudentDetails> fetchDetailsByCityAndState(String city, String state) {
		return stdRepo.findByCityAndState(city, state);
	}

	@Override
	public List<StudentDetails> fetchDetailsByPriceGreaterThan(double fee) {
		return stdRepo.findByFeeGreaterThanEqual(fee);
	}

	@Override
	public List<StudentDetails> fetchDetailsByDptNameContains(String deptName) {
		return stdRepo.findByDeptNameContaining(deptName);
	}
	

		
	
}
