package com.pojo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.validator.UserNameStart;

public class Login {
	
	@UserNameStart(message="User Name should start with 'S' ")
	private String userName;
	
	@NotBlank(message="password is Mandatory")
	@Size(min=5,max=15,message="Userid must have min 5 characters & max 15 Characters")
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
