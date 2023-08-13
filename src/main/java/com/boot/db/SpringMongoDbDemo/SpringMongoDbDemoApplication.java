package com.boot.db.SpringMongoDbDemo;

import com.boot.db.SpringMongoDbDemo.entity.Employee;
import com.boot.db.SpringMongoDbDemo.exception.RecordExistsException;
import com.boot.db.SpringMongoDbDemo.exception.RecordNotFoundException;
import com.boot.db.SpringMongoDbDemo.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMongoDbDemoApplication {




	public static void main(String[] args) {

		//give access to spring context or spring container
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringMongoDbDemoApplication.class,args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
//		try {
//			System.out.println(employeeService.insertEmployee(
//					new Employee(1,"GregL",7777888.66,"Shanghai")));
//		} catch (RecordExistsException e) {
//			System.out.println(e.getMessage());;
//		}
		System.out.println(employeeService.getEmployeesCount());

//		try {
//			System.out.println(employeeService.getEmployeeId(2));
//		} catch (RecordNotFoundException e) {
//			System.out.println(e.getMessage());
//
//		}

		for (Employee employee:employeeService.getAllEmployeesByRegion("London"))
			System.out.println(employee);

	}

}
