package com.srtech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtech.entities.StudentDetails;

public interface StudentDtlsRepo extends JpaRepository<StudentDetails, Long> {
	public <T extends View> List<T> findByStudIdIn(List<Long> studIds, Class<T> clazz);
}
