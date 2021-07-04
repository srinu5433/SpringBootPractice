package com.srtech.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srtech.demo.bo.EmployeeBO;

@Repository("empDao")
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String GET_EMP_DTLS_BY_DESG = "SELECT EMPID,EMPNAME,EMPSAL,EMPGROSSSAL,EMPNETSAL,EMPDESG FROM EMPLOYEE WHERE EMPDESG in ";


	@Autowired
	DataSource dataSource;

	@Override
	public List<EmployeeBO> getEmployeesByDesg(String cond) throws Exception {
		System.out.println("DataSource Object is "+dataSource.getClass());
		List<EmployeeBO> empList = null;
		try(Connection con = dataSource.getConnection())
		{
			Statement st =  con.createStatement();
			ResultSet rs = st.executeQuery(GET_EMP_DTLS_BY_DESG+cond);
			 empList = new ArrayList<EmployeeBO>();
			EmployeeBO empBo = null;

			while (rs.next()) {
				empBo = new EmployeeBO();
				empBo.setEmpId(rs.getInt(1));
				empBo.setEmpName(rs.getString("EMPNAME"));
				empBo.setEmpSal(rs.getFloat("EMPSAL"));
				empBo.setEmpGrossSal(rs.getFloat("EMPGROSSSAL"));
				empBo.setEmpNetSal(rs.getFloat("EMPNETSAL"));
				empBo.setEmpDesg(rs.getString("EMPDESG"));
				empList.add(empBo);

			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		/*
		 * PreparedStatement ps = con.prepareStatement(
		 * "SELECT EMPID,EMPNAME,EMPSAL,EMPGROSSSAL,EMPNETSAL,EMPDESG FROM EMPLOYEE WHERE EMPDESG in (?,?)"
		 * ); ps.setString(1, args[0]); ps.setString(2, args[1]);
		 * 
		 * ResultSet rs = ps.executeQuery();
		 */	
				
		return empList;
	}

}
