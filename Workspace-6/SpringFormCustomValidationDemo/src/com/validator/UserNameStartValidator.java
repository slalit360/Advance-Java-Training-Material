package com.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.pojo.Login;

public class UserNameStartValidator implements ConstraintValidator<UserNameStart, String>{

	@Override
	public void initialize(UserNameStart arg0) { //name of the annotation to use
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String  userName, ConstraintValidatorContext arg1) {
		if(!(userName.startsWith("S"))){
			return false;
		}else{
			return true;
		}
	}

}
