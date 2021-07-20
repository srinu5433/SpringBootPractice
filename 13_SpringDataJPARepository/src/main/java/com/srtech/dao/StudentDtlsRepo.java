package com.srtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtech.entities.StudentDetails;

public interface StudentDtlsRepo extends JpaRepository<StudentDetails, Long> {

}
