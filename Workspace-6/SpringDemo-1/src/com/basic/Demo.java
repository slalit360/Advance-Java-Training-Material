package com.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
	   
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		//BeanFactory context = new ClassPathXmlApplicationContext("appConfig.xml");
		
		Customer c=(Customer)context.getBean("customer");
	    c.display();
	   
	}

}

 