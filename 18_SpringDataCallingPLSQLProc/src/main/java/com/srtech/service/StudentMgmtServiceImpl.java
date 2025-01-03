package com.srtech.service;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtech.entities.StudentDetails;

@Service("stdService")
public class StudentMgmtServiceImpl implements StudentMgmtService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager entityManager;

	public StudentMgmtServiceImpl() {
		logger.info("Instatinating the StudentMgmtServiceImpl service class object");
	}

	@Override
	public List<StudentDetails> getDeatilsByDept(String name) {
		// Create Stored Procedure Parameter
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("P_GET_STUDENT_DETAILS_BYDEPT",
				StudentDetails.class);
		// Register the parameters
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.setParameter(1, name);
		List<StudentDetails> list = query.getResultList();
		return list;
	}

	@Override
	public String checkUserIsValid(String name, String pass) {
		/*
		 CREATE DEFINER=`root`@`localhost` PROCEDURE `P_AUTHENTICATION`(IN UNAME VARCHAR(20),
		IN PASS VARCHAR(20),
		OUT RESULT VARCHAR(100))
		BEGIN
		DECLARE cnt int;
		
		SELECT COUNT(*) INTO cnt FROM USERSLIST WHERE USER_NAME=UNAME AND PASSWORD=PASS;
		IF cnt >= 1 THEN
		SET RESULT = 'VALID CREDENTIALS';
		ELSE
		SET RESULT = 'INVALID CREDENTIALS';
		END IF;
		
		END
		 */
		// Create Stored Procedure Parameter
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("P_AUTHENTICATION");
		// Register the parameters
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);

		query.setParameter(1, name);
		query.setParameter(2, pass);

		query.execute();

		String result = (String) query.getOutputParameterValue(3);

		return result;
	}

	@Override
	public Double AvgFeeByDept(String dept) {
		
		Session session = entityManager.unwrap(Session.class);
		Float fee;
		fee = session.doReturningWork((con)->{
			Float fees = null;
			//CallableStatement callableStatement = con.prepareCall(" {? = CALL FX_GET_DETAILS_BY_DEPT_NAME(?)}");
			CallableStatement callableStatement = con.prepareCall(" SELECT FX_GET_DETAILS_BY_DEPT_NAME(?)");
			//callableStatement.registerOutParameter(2, Types.FLOAT);
			callableStatement.setString(1, dept);
			
			ResultSet rs = callableStatement.executeQuery();
			
			//callableStatement.getFloat(2);
			//rs.next();
			System.out.println("BeforeResult set");
			while(rs.next())
			{
				
				fees = rs.getFloat(1);
			}
			return fees;
		});
		
		return Double.valueOf(fee);
	}

}
