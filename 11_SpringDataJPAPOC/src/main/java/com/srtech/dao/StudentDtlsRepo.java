package com.srtech.dao;

import org.springframework.data.repository.CrudRepository;

import com.srtech.entities.StudentDetails;

public interface StudentDtlsRepo extends CrudRepository<StudentDetails, Long> {

}
