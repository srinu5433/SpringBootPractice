package com.srtech.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.srtech.demo.controller.MainController;
import com.srtech.demo.vo.EmployeeVO;

@SpringBootApplication
public class Application {

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
