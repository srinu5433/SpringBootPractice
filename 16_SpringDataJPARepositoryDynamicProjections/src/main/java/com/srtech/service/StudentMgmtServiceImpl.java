package com.srtech.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtech.dao.StudentDtlsRepo;
import com.srtech.dao.View;
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
	public <T extends View> List<T> searchStudentsIn(List<Long> studIds, Class<T> clazz) {
		return stdRepo.findByStudIdIn(studIds, clazz);
	}

			
	
}
