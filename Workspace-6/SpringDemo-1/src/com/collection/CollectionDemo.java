package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
		Customer c=(Customer)context.getBean("CustomerBean");
		
		System.out.println(c.getLoanList());
		System.out.println(c.getLoanSets());
		System.out.println(c.getLoanMaps());
		
	}

}
