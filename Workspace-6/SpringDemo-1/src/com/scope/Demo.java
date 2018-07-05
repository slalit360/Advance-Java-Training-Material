package com.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
	   
		ApplicationContext context = new ClassPathXmlApplicationContext("scopeConfig.xml");
	  
		Employee emp1=(Employee)context.getBean("emp");
	    System.out.println(emp1.hashCode());
	    
	    Employee emp2=(Employee)context.getBean("emp");
	    System.out.println(emp2.hashCode());
	   
	   
	}

}

 