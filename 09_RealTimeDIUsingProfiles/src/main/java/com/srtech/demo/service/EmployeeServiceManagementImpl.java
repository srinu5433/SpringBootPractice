package com.srtech.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtech.demo.bo.EmployeeBO;
import com.srtech.demo.dao.IEmployeeDao;
import com.srtech.demo.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceManagementImpl implements IEmployeeServiceManagement {
	
	@Autowired
	IEmployeeDao empDao;

	@Override
	public List<EmployeeDTO> fetchEmployeeByDesg(String[] args) throws Exception {
		String conds= null;
		StringBuffer buffer =  new StringBuffer("(");
		for(int i=0;i<args.length;i++)
		{
			if(i==args.length-1)
			{
			buffer.append("'"+args[i]+"')");	
			}
			else

				buffer.append("'"+args[i]+"',");
		}
		
		conds = buffer.toString();
		//System.out.println(conds+" Condition is ");
		List<EmployeeDTO> empDtoList =  new ArrayList<EmployeeDTO>();
		EmployeeDTO dto = null;
		 List<EmployeeBO> employeesByDesg = empDao.getEmployeesByDesg(conds);
		for(EmployeeBO empBo : employeesByDesg)
		{
			dto = new EmployeeDTO();		
			BeanUtils.copyProperties(empBo, dto);
			empDtoList.add(dto);
			
		}
		return empDtoList;
	}

}
