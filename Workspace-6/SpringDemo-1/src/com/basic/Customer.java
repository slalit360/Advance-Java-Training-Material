package com.basic;

public class Customer {
	
	private int customerId;
	private String customerName;
	
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void display(){
		System.out.println(this.customerId + "  -- "+ this.customerName);
	}
	
	

}
