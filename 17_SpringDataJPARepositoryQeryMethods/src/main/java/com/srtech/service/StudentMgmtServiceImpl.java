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
	public List<StudentDetails> serachByCity(String city) {
		return stdRepo.serachByCity(city);
	}

	@Override
	public List<StudentDetails> serachStudentsBasedOnFee(double min, double max) {
		return stdRepo.serachStudentsBasedOnFee(min, max);
	}

	@Override
	public List<StudentDetails> serachByCityIn(String city1, String city2, String city3) {
		return stdRepo.serachByCityIn(city1, city2, city3);
	}

		
	
}
