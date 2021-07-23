package com.srtech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.srtech.entities.StudentDetails;

public interface StudentDtlsRepo extends JpaRepository<StudentDetails, Long> {
	// @Query("FROM com.srtech.entities.StudentDetails where city = ?1")
	// @Query("FROM StudentDetails where city = ?1")
	// @Query("FROM com.srtech.entities.StudentDetails where city = :city")
	// @Query("FROM StudentDetails where city = :city")
	// @Query("SELECT sd FROM StudentDetails sd where city = :city")
	// @Query("SELECT sd FROM StudentDetails sd where city = ?1")
	// @Query("SELECT sd FROM StudentDetails sd where sd.city = :city")
	// @Query("SELECT sd FROM StudentDetails sd where sd.city = ?1")
	// @Query("SELECT sd FROM StudentDetails sd where city = ?") // We will get the
	// following error ==> JDBC style parameters (?) are not supported for JPA
	// queries.

	// public List<StudentDetails> serachByCity(String city);

	@Query("FROM StudentDetails where city = :city")
	public List<StudentDetails> serachByCity(@Param("city") String cityName);

	 @Query("FROM StudentDetails where fee >= ?1 AND fee <=?2")
	// @Query("FROM StudentDetails where fee >= ?1 AND fee <=?3")
	/* Unexpected gap in ordinal parameter labels [1 -> 3] : [1,3] Ordinal
	 parameters must be in order starts with 1 and should continue in increment
	 sequence with out any gap */

	//@Query("FROM StudentDetails where fee >= ?1 AND fee <=:max")
	/*
	 We can't use mixed case parameters
	 parameter 'Optional[min]' not found in annotated query 'FROM StudentDetails
	 where fee >= ?1 AND fee <=:max'
	*/	 
	public List<StudentDetails> serachStudentsBasedOnFee(double min, double max);

	@Query("FROM StudentDetails where city in ( :city1, :city2, :city3)")
	public List<StudentDetails> serachByCityIn(String city1,String city2,String city3);


}
