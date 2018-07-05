package com.autowire;

public class Customer {
	
	private int customerId;
	private Account account;
	
	public Customer(Account account){
		this.account=account;
		
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	public void display(){
		System.out.println(this.customerId +"   "+ this.account.getAccountId() + "   "+ this.account.getBalance());
	}
	

}
