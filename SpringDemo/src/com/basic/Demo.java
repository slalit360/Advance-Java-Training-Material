package com.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("appConfig1.xml");
		
		/*Customer c=(Customer) context.getBean("customer");
		c.display();*/
		
		Customer c1=(Customer) context.getBean("cust");
		c1.display();
	}

}
