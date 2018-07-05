package com;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Account {
	
	@Id
	//only works with oracle 
	//@GeneratedValue(generator="abc")
	//@SequenceGenerator(name="abc", sequenceName="Acc_Seq", allocationSize=1)
	private int accId=0;
	private char accType;
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public char getAccType() {
		return accType;
	}
	public void setAccType(char accType) {
		this.accType = accType;
	}
	
	
	
}
