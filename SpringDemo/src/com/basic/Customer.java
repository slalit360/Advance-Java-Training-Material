package com.basic;

public class Customer {
	
	private int customerId;
	private String customerName;
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	/*public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}*/
	
	public void display() 
	{	
		System.out.println(this.customerId+"  "+this.customerName);
	}
	

}
