package com.srtech.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.srtech.entities.StudentDetails;

public interface StudentDtlsRepo extends PagingAndSortingRepository<StudentDetails, Long> {

}
