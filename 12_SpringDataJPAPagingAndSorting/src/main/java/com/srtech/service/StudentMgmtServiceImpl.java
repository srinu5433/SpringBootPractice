package com.srtech.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	public Iterable<StudentDetails> fetchDetails(boolean asc, String... properties) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		Iterable<StudentDetails> studDetails = stdRepo.findAll(sort);
		return studDetails;
	}

	@Override
	public Iterable<StudentDetails> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties) {
		Page<StudentDetails> findAll = stdRepo.findAll(PageRequest.of(pageNo, pageSize, asc?Direction.ASC:Direction.DESC, properties));
		return findAll.getContent();
	}

	@Override
	public Iterable<StudentDetails> fetchDetailsbyPage(int size) {
		int count = (int) stdRepo.count();
		int pageCount = count / size;
		
		pageCount = count / size == 0 ? pageCount : ++pageCount;
		
		for(int i=0; i<pageCount ;i++)
		{
			logger.info("Page No "+(i+1)+" out of "+pageCount);
			stdRepo.findAll(PageRequest.of(i, size)).getContent().forEach(student->{logger.info("{}",student);});
		}
		
		return null;
	}

	

}
