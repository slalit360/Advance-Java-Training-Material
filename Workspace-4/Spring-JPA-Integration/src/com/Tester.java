package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
			EmployeeDAO employeeDao = (EmployeeDAO) context.getBean("employeeDAO");
			employeeDao.insertEmployeeRecord();
			//employeeDao.updateEmployeerecord();
		
		
		
	}

}
