package com.srtech.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.srtech.demo.dto.EmployeeDTO;
import com.srtech.demo.service.IEmployeeServiceManagement;
import com.srtech.demo.vo.EmployeeVO;

@Controller("controller")
public class MainController {

	@Autowired
	IEmployeeServiceManagement empService;

	public List<EmployeeVO> getEmployessByDesg(String[] desgs) throws Exception {
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		List<EmployeeDTO> employeeByDesg = empService.fetchEmployeeByDesg(desgs);
		EmployeeVO empVo = null;
		for(EmployeeDTO dto : employeeByDesg)
		{
			empVo = new EmployeeVO();
			BeanUtils.copyProperties(dto, empVo);
			empVo.setEmpId(String.valueOf(dto.getEmpId()));
			empVo.setEmpNetSal(String.valueOf(dto.getEmpNetSal()));
			list.add(empVo);			
		}
		
		return list;
	}

}
