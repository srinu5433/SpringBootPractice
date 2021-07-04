package com.srtech.demo.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EmployeeBO {
	
	private int empId;
	private String empName;
	private float empSal;
	private float empGrossSal;
	private float empNetSal;
	private String empDesg;
	
}
