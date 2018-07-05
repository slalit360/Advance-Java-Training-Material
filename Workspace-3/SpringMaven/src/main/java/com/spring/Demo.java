package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Greeting greeting=(Greeting) context.getBean("greet");
	//	greeting.getMassage();
		System.out.println(greeting.getName());
		

	}

}
