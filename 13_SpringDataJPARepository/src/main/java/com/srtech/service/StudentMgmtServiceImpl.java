package com.srtech.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public List<StudentDetails> searchDetailsByGivenData(StudentDetails dtls, boolean ascOrder,String... properties) {
		Example example = Example.of(dtls);
		Sort sort = Sort.by(ascOrder?Direction.ASC:Direction.DESC,properties);
		return stdRepo.findAll(example, sort);
	}

	@Override
	public StudentDetails searchDetailsByGivenId(Long id) {
		
		return stdRepo.getById(id);
	}

	@Override
	public String deleteRecordsById(List<Long> ids) {
		List<StudentDetails> listEntities = stdRepo.findAllById(ids);
		if(listEntities.size()!=0) {
		stdRepo.deleteAllByIdInBatch(ids);
		return listEntities.size()+" Records are deleted Successfully";
		}
		
		return "No records found with the given id's";
	}
	
	
}
