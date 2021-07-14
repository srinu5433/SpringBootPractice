package com.srtech.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class StudentDetails {
	@Id
	@GeneratedValue
	private Long studId;
	@NonNull
	private String studName;
	@NonNull
	private String deptName;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private Double fee;
	@NonNull
	private Integer pincode;
	

}
