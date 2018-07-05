package com.spring;

public class Greeting 
{
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getMassage() {
		
		System.out.println("Hello "+name);

	}
}
