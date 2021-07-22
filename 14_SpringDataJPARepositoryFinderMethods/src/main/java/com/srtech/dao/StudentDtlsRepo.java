package com.srtech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srtech.entities.StudentDetails;

public interface StudentDtlsRepo extends JpaRepository<StudentDetails, Long> {
	// select stud_id, city, dept_name,fee, pincode,state, stud_name from
	// student_details where dept_name=?
	public List<StudentDetails> findByDeptName(String deptName);

	public List<StudentDetails> findByDeptNameEquals(String deptName);

	public List<StudentDetails> findByDeptNameIs(String deptName);
	/*
	 above all three methods are equal
	 */
	
	//select stud_id, city, dept_name,fee, pincode,state, stud_name from
	// student_details where city=? and state=?
	public List<StudentDetails> findByCityAndState(String city,String state);
	
	//select stud_id, city, dept_name,fee, pincode,state, stud_name from
	// student_details where fee >= ?
	public List<StudentDetails> findByFeeGreaterThanEqual(double price);
	
	/*
	select stud_id, city, dept_name,fee, pincode,state, stud_name from
	student_details where dept_name like '% ? %'
	
	 */
	public List<StudentDetails> findByDeptNameContaining(String deptName);
	

}
