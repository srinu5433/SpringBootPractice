package com.srtech.demo;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.DriverManagerDataSource;
import com.srtech.demo.controller.MainController;
import com.srtech.demo.vo.EmployeeVO;

@SpringBootApplication
public class Application {

	@Autowired
	Environment env;
	@Bean
	@Profile("prod")
	public DriverManagerDataSource getC3P0DataBase()
	{
		DriverManagerDataSource dataSource  =  new DriverManagerDataSource();
		dataSource.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		dataSource.setUser(env.getRequiredProperty("spring.datasource.username"));
		dataSource.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		dataSource.setPassword(env.getRequiredProperty("spring.datasource.password"));
		return dataSource;
	}
	
	@Bean
	@Profile("default")
	public DataSource getDataBase()
	{
		DataSource dataSource  =  new DataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/ntsp?createDatabaseIfNotExist=true");
		dataSource.setUsername("root");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setPassword("srinu5433");
		return dataSource;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		String desg[] = {"Dev", "Tester"};
		
		MainController controller = context.getBean("controller", MainController.class);
		
		try {
			List<EmployeeVO> employessByDesg = controller.getEmployessByDesg(desg);
			for(EmployeeVO empVo : employessByDesg)
			{
				System.out.println(empVo);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
