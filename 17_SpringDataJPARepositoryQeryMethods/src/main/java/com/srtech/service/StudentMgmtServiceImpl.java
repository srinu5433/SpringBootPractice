package com.srtech.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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

	@Override
	public Object serachByName(String name) {
		return stdRepo.serachByName(name);
	}

	@Override
	public StudentDetails serachByNameCols(String name) {
		return stdRepo.serachByNameCols(name);
	}

	@Override
	@Transactional
	public int updateStudentDept(String deptName, Long id) {
		return stdRepo.updateStudentDept(deptName, id);
	}

	@Override
	public int removeStudentById(Long id) {
		return stdRepo.deleteStudentById(id);
	}

	@Override
	public int saveStudentDetails(Long studId, String city, String deptName, double fee, int pincode, String state,
			String studName) {
		
		return stdRepo.saveStudent(studId, city, deptName, fee, pincode, state, studName);
	}

	@Override
	public int createTable() {
		return stdRepo.createTable();
	}

		
	
}
